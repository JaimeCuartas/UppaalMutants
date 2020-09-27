/*
 [The "BSD licence"]
 Copyright (c) 2013 Terence Parr
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/** XML parser derived from ANTLR v4 ref guide book example */
parser grammar UppaalParser;


@parser::members { // add members to generated UppaalParser
    private int num=0;

    public int getNum(){
        return this.num;
    }
    public void setNum(int num){
        this.num = num;
    }
}
options { tokenVocab=UppaalLexer; }

//document    :   prolog? misc* element misc*;

model       :   prolog? misc* nta misc* ;

prolog      :   XMLDeclOpen attribute* SPECIAL_CLOSE ;

content     :   chardata?
                ((element | reference | CDATA | PI | COMMENT) chardata?)* ;

element     :   '<' Name attribute* '>' content '</' Name '>'
            |   '<' Name attribute* '/>'
            ;

reference   :   EntityRef | CharRef ;

attribute   :   Name EQUALS STRING ; // Our STRING is AttValue in spec

/** ``All text that is not markup constitutes the character data of
 *  the document.''
 */
chardata    :   TEXT | SEA_WS ;

misc        :   COMMENT | PI | SEA_WS ;

nta         :   '<' 'nta' '>' misc*
                declaration misc*
                (template misc*)+
                system misc*
                (queries misc*)?
                '</' 'nta' '>' ;

declaration :   '<' 'declaration' '>' anything '</' 'declaration' '>' ;

anything    :   chardata?
                ((reference | CDATA | PI | COMMENT) chardata?)* ;

template    :   '<' 'template' '>' misc* temp_content  '</' 'template' '>' ;

temp_content:   (name misc*)?
                (parameter misc*)?
                (declaration misc*)?
                (location misc*)+
                (init_loc misc*)
                (transition misc*)*;

parameter   :   '<' 'parameter' '>' anything '</' 'parameter' '>' ;

coordinate  :   'x' EQUALS STRING 'y' EQUALS STRING ;

init_loc    :   '<' 'init' 'ref' EQUALS STRING '/>' ;

location    :   '<' 'location' 'id' EQUALS STRING
                    coordinate? '>' misc* (name misc*)?
                    (label_loc misc*)*
                    ('<' ('urgent' | 'committed') '/>' misc*)?

                    '</' 'location' '>' ;

label_loc   :   '<' 'label' 'kind' EQUALS STRING coordinate?  '>' anything '</' 'label' '>' ;

name        :   '<' 'name'
                    coordinate?
                    '>' anything '</' 'name' '>' ;

transition  :   '<' 'transition' '>'
                misc* (source misc*) (target misc*)
                (label_trans misc*)*
                (nail misc*)*
                '</' 'transition' '>' ;


//Are equals to labels_loc but we can manipulate them differently
label_trans :   OPEN_GUARD guard_expr? CLOSE_GUARD # LabelTransGuard
            |   '<' 'label' 'kind' EQUALS STRING coordinate?  '>' anything '</' 'label' '>' # labelTrans;


guard_expr  :   IDENTIFIER  # IdentifierGuard
            |   NAT_GUARD   # NatGuard
            |   DOUBLE_GUARD    # DoubleGuard
            |   guard_expr '[' guard_expr ']'   # ArrayGuard
            |   guard_expr '\''     # StopWatchGuard
            |   '(' guard_expr ')'  # ParenthesisGuard
            |   guard_expr '++'     # GuardIncrement
            |   '++' guard_expr     # IncrementGuard
            |   guard_expr '--'     # GuardDecrement
            |   '--' guard_expr     # DecrementGuard
            |   guard_expr
                    //assign is '=' in guard channel
                    assign=(ASSIGN | ':=' | '+=' | '-=' | '*=' | '/=' | '%=' | '|=' | '&amp;=' | '^=' | '&lt;&lt;=' | '&gt;&gt;=')
                        guard_expr  # AssignGuard
            |   unary=('-' | '+' | '!' | 'not') guard_expr  # UnaryGuard
            |   guard_expr binary=( '&lt;' | '&lt;=' | '==' | '!=' | '&gt;=' | '&gt;' //LESS is '<' in guard channel. Greater is '>' in guard channel
                                   ) guard_expr
                {

                this.num++;
                System.out.println ($binary.text);
                }
                                   # ComparisonGuard
            |   guard_expr binary=( '+' | '-' | '*' | '/' | '%' | '&amp;'
                                    |  '|' | '^' | '&lt;&lt;' | '&gt;&gt;' | '&amp;&amp;' | '||'
                                    |  '&lt;?' | '&gt;?' | 'or' | 'and' | 'imply')
                                    guard_expr   #BinaryGuard
            |   guard_expr '?' guard_expr ':' guard_expr
                                    # IfGuard
            |   guard_expr '.' IDENTIFIER   # DotGuard
            |   guard_expr '(' arguments ')'# FuncGuard
            |   'forall' '(' IDENTIFIER ':' type ')' guard_expr     # ForallGuard
            |   'exists' '(' IDENTIFIER ':' type ')' guard_expr     # ExistsGuard
            |   'sum' '(' IDENTIFIER ':' type ')' guard_expr        # SumGuard
            |   'true'  # TrueGuard
            |   'false' # FalseGuard
            ;
arguments   :   (guard_expr  (',' guard_expr)*)? ;

type        :   ('meta' | 'const')? typeId ;

typeId      :   'int'                                       # TypeInt
            |   'int' '[' guard_expr ',' guard_expr ']'     # TypeIntDomain
            |   'scalar' '[' guard_expr ']'                 # TypeScalar
            ;

source      :   '<' 'source' 'ref' EQUALS STRING '/>' ;

target      :   '<' 'target' 'ref' EQUALS STRING '/>' ;

nail        :   '<' 'nail' coordinate? '/>' ;

system      :   '<' 'system' '>' anything '</' 'system' '>' ;

queries     :   '<' 'queries' '>' misc* (query misc*)* '</' 'queries' '>' ;

query       :   '<' 'query' '>' misc* (formula misc*)? (comment misc*)? '</' 'query' '>' ;

formula     :   '<' 'formula' '>' anything '</' 'formula' '>' ;

comment     :   '<' 'comment' '>' anything '</' 'comment' '>' ;


//guard_expr  :   IDENTIFIER misc*;
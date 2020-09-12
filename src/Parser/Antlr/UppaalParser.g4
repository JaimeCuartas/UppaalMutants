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


@parser::members { // add members to generated RowsParser
    private int num;
    /**
    public UppaalParser(TokenStream input) { // custom constructor
        this(input);
        this.num = 0;
    }*/

    public int getNum(){
        return this.num;
    }
}
options { tokenVocab=UppaalLexer; }

document    :   prolog? misc* element misc*;

prolog      :   XMLDeclOpen attribute* SPECIAL_CLOSE ;

content     :   chardata?
                ((element | reference | CDATA | PI | COMMENT) chardata?)* ;

element     :   '<' Name attribute* '>' content '</' Name '>'
            |   '<' Name attribute* '/>'
            ;

reference   :   EntityRef | CharRef ;

attribute   :   Name '=' STRING ; // Our STRING is AttValue in spec

/** ``All text that is not markup constitutes the character data of
 *  the document.''
 */
chardata    :   TEXT | SEA_WS ;

misc        :   COMMENT | PI | SEA_WS ;



model       :   prolog? misc* nta misc* ;

nta         :   '<' 'nta' '>' misc*
                declaration misc*
                (template misc*)+
                system misc*
                queries misc*
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

coordinate  :   'x' '=' STRING 'y' '=' STRING ;

init_loc    :   '<' 'init' 'ref' '=' STRING '/>' ;

location    :   '<' 'location' 'id' '=' STRING
                    coordinate? '>' misc* (name misc*)?
                    (label_loc misc*)*
                    ('<' ('urgent' | 'committed') '/>' misc*)?

                    '</' 'location' '>' ;

label_loc   :   '<' 'label' 'kind' '=' STRING coordinate?  '>' anything '</' 'label' '>' ;

name        :   '<' 'name'
                    coordinate?
                    '>' anything '</' 'name' '>' ;

transition  :   '<' 'transition' '>'
                misc* (source misc*) (target misc*)
                (label_trans misc*)+
                (nail misc*)*
                '</' 'transition' '>' ;


//Are equals to labels_loc but we can manipulate them differently
label_trans :
            (OPEN_GUARD IDENTIFIER '=' IDENTIFIER CLOSE_GUARD)



            |   '<' 'label' 'kind' '=' STRING coordinate?  '>' anything '</' 'label' '>' ;


source      :   '<' 'source' 'ref' '=' STRING '/>' ;

target      :   '<' 'target' 'ref' '=' STRING '/>' ;

nail        :   '<' 'nail' coordinate? '/>' ;

system      :   '<' 'system' '>' anything '</' 'system' '>' ;

queries     :   '<' 'queries' '>' content '</' 'queries' '>' ;

//query       :   '<' 'query' '>' content '<' 'query' '>' ;


//guard_expr  :   IDENTIFIER misc*;
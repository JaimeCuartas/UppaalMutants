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
//check 275 page

@parser::header {
    import java.util.HashMap;
    import java.util.HashSet;
}

@parser::members { // add members to generated UppaalParser
    private int num=0;


    //Number of controllable transitions (input actions <expr> "?")
    //The purpose is to know how many transitions can be removed, each one will be a mutant

    //TMI array will contain the number of transitions (in reading order)
    //that has controllable transitions (input actions <expr> "?")
    //TMI.get(0) will has the transition that should be removed, until TMI.get(n)
    private ArrayList<Integer> tmi = new ArrayList<Integer>();

    //Counter with the number of the current transition
    private int currentTransition = 0;

    //env will contain as key, "global" for global declaration and the name of each template
    //env will contain as value, and array of string
    //String[0] will contain the name of channel and String[1] will contain the dimensions of channel

    private HashMap<String, ArrayList<String[]>> env = new HashMap<String, ArrayList<String[]>>();
    private String currentEnv;
    private boolean isFunctionEnv;

    //transitionsTad is a <Key, Value> hashmap
    //                    <name_of_template_Key, <key, value>>
    //                    <name_of_template_key, <source_key, set_of_targets>
    //transitionsTad is a structure to save in each template the locations that does not have output actions (<expr> "!") synchro
    //these will be candidates to mutatants
    private HashMap<String, HashMap<String, HashSet<String>>> transitionsTad = new HashMap<String, HashMap<String, HashSet<String>>>();
    private String currentSource = "";
    private String currentTarget = "";

    //locationsSmi is a <Key, Value > hashmap
    //                  <name_of_template_Key, <value>>
    //                  <name_of_template_Key, <set_of_locations>>
    private HashMap<String, HashSet<String>> locationsSmi = new HashMap<String, HashSet<String>>();
    private String initLocationId = "";

    public UppaalParser(TokenStream input, int a){
        this(input);
        currentEnv = "Global";
        env.put(currentEnv, new ArrayList<String[]>());
        isFunctionEnv = false;
    }

    public int getNum(){
        return this.num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public HashMap<String, ArrayList<String[]>> getEnv (){
        return this.env;
    }
    public ArrayList<Integer> getTmi(){
        return this.tmi;
    }

    public HashMap<String, HashMap<String, HashSet<String>>> getTransitionsTad(){
        return this.transitionsTad;
    }

    public HashMap<String, HashSet<String>> getLocationsSmi(){
        return this.locationsSmi;
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

//declaration :   '<' 'declaration' '>' anything '</' 'declaration' '>' ;

declaration :   OPEN_DECLARATION decl_content CLOSE_DECLARATION;

decl_content:   declarations* ;

declarations:   variableDecl    # VariableDeclaration
            |   typeDecl        # typeDeclaration
            |   function        # FunctionDeclaration
            |   chanPriority    # ChanDeclaration
            ;

expr        :   IDENTIFIER  # IdentifierExpr
            |   NAT         # NatExpr
            |   POINT       # DoubleExpr
            |   expr '[' expr ']'   # ArrayExpr
            |   expr '\''     # StopWatchExpr
            |   '(' expr ')'  # ParenthesisExpr
            |   expr '++'     # ExprIncrement
            |   '++' expr     # IncrementExpr
            |   expr '--'     # ExprDecrement
            |   '--' expr     # DecrementExpr
            |   expr
                    //assign is '=' in guard channel
                    assign=(ASSIGN | ':=' | '+=' | '-=' | '*=' | '/=' | '%=' | '|=' | '&amp;=' | '^=' | '&lt;&lt;=' | '&gt;&gt;=')
                        expr  # AssignExpr
            |   unary=('-' | '+' | '!' | 'not') expr  # UnaryExpr
            |   expr binary=( '&lt;' | '&lt;=' | '==' | '!=' | '&gt;=' | '&gt;' //LESS is '<' in guard channel. Greater is '>' in guard channel
                                   ) expr     # ComparisonExpr
            |   expr binary=( '+' | '-' | '*' | '/' | '%' | '&amp;'
                                    |  '|' | '^' | '&lt;&lt;' | '&gt;&gt;' | '&amp;&amp;' | '||'
                                    |  '&lt;?' | '&gt;?' | 'or' | 'and' | 'imply')
                                    expr      #BinaryExpr
            |   expr '?' expr ':' expr
                                    # IfExpr
            |   expr '.' IDENTIFIER   # DotExpr
            |   expr '(' arguments ')'# FuncExpr
            |   'forall' '(' IDENTIFIER ':' type ')' expr     # ForallExpr
            |   'exists' '(' IDENTIFIER ':' type ')' expr     # ExistsExpr
            |   'sum' '(' IDENTIFIER ':' type ')' expr        # SumExpr
            |   'true'  # TrueExpr
            |   'false' # FalseExpr
            ;


arguments   :   (expr  (',' expr)*)? ;

variableDecl:   (type variableID (',' variableID)* ';')
                {
                    if(!this.isFunctionEnv){

                        String typeId = $ctx.type().typeId().getText();

                        if(typeId.equals("chan")){
                            List<UppaalParser.VariableIDContext> variablesId = $ctx.variableID();

                            for(UppaalParser.VariableIDContext variableId: variablesId){
                                String chanId = variableId.IDENTIFIER().getText();
                                String dimensions = Integer.toString(variableId.arrayDecl().size());
                                env.get(currentEnv).add(new String[]{chanId, dimensions});
                            }
                        }
                        //env.get(currentEnv).add();
                    }
                } ;

type        :   prefix? typeId ;

prefix      :   URGENT      # UrgentPrefix
            |   'broadcast' # BroadcastPrefix
            |   'meta'      # MetaPrefix
            |   'const'     # ConstPrefix
            ;

typeId      :   IDENTIFIER  # IdentifierType
            |   'int'       # IntType
            |   'double'    # DoubleType
            |   'clock'     # ClockType
            |   'chan'      # ChanType
            |   'bool'      # BoolType
            |   'int' '[' expr ',' expr ']'     # IntDomainType
            |   'scalar' '[' expr ']'           # ScalarType
            |   'struct' '{' (fieldDecl)+ '}'   # StructType
            ;

fieldDecl   :   type varFieldDecl (',' varFieldDecl)* ';' ;

varFieldDecl:   IDENTIFIER arrayDecl* ;

arrayDecl   :   '[' expr ']'    # ArrayDeclExpr
            |   '[' type ']'    # ArrayDeclType
            ;

variableID  :   IDENTIFIER (arrayDecl*) (ASSIGN initialiser )? ;

initialiser :   expr                                        # InitialiserExpr
            |   '{' initialiser (',' initialiser)* '}'      # InitialiserArray
            ;

//typeDecl    :   'typedef' type IDENTIFIER arrayDecl* (',' IDENTIFIER arrayDecl*)* ';' ;
typeDecl    :   'typedef' type varFieldDecl (',' varFieldDecl)* ';' ;

function    :   {
                    this.isFunctionEnv = true;
                }
                type IDENTIFIER '(' funcParameters ')' block
                {
                    this.isFunctionEnv = false;
                } ;

funcParameters: (funcParameter (',' funcParameter)*)? ;

//funcParameter:  type ('&amp;')? IDENTIFIER arrayDecl* ;
funcParameter:  type ('&amp;')? varFieldDecl ;

block       :   '{' decl_content statement* '}' ;

statement   :   block           # StatementBlock
            |   ';'             # StatementSemicolon
            |   expr ';'        # StatementExpr
            |   forLoop         # StatementFor
            |   iteration       # StatementIteration
            |   whileLoop       # StatementWhile
            |   doWhile         # StatementDoWhile
            |   ifStatement     # StatementIf
            |   returnStatement # StatementReturn
            ;

forLoop     :   'for' '(' expr ';' expr ';' expr ')' statement ;

iteration   :   'for' '(' IDENTIFIER ':' type ')' statement ;

whileLoop  :   'while' '(' expr ')' statement ;

doWhile    :   'do' statement 'while' '(' expr ')' ';' ;

ifStatement:   'if' '(' expr ')' statement ('else' statement)? ;

returnStatement: 'return' (expr)? ';' ;

chanPriority:  'chan' 'priority' chanOrDef (chanSeparator chanOrDef)* ';' ;

chanOrDef   :   (chanExpr | 'default' ) ;

chanSeparator:  (',' | '&lt;') ;

chanExpr    :   IDENTIFIER              # ChanIdentifier
            |   chanExpr '[' expr ']'   # ChanArray
            ;
////////////////////////////////////////////////////////////////////////////////
anything    :   chardata?
                ((reference | CDATA | PI | COMMENT) chardata?)* ;

template    :   '<' 'template' '>' misc* temp_content  '</' 'template' '>' ;

temp_content
locals[ArrayList<String> namesLocations = new ArrayList<String>()]
            :   ((name misc*)?)
                {
                    if($ctx.name()!=null){
                        currentEnv = $ctx.name().anything().getText();
                        env.put(currentEnv, new ArrayList<String[]>());
                        transitionsTad.put(currentEnv, new HashMap<String, HashSet<String>>());
                        locationsSmi.put(currentEnv, new HashSet<String>());
                    }
                }
                ((parameter misc*)?)
                {
                    if($ctx.parameter()!=null){
                        List<UppaalParser.FuncParameterContext> funcParameters = $ctx.parameter().funcParameters().funcParameter();
                        for(UppaalParser.FuncParameterContext funcParameter: funcParameters){
                            String typeId = funcParameter.type().typeId().getText();
                            if(typeId.equals("chan")){
                                String chanId = funcParameter.varFieldDecl().IDENTIFIER().getText();
                                String dimensions = Integer.toString(funcParameter.varFieldDecl().arrayDecl().size());
                                env.get(currentEnv).add(new String[]{chanId, dimensions});
                            }
                        }
                    }
                }
                (declaration misc*)?

                (((location misc*) | (branchpoint misc*))+)
                {
                    List<UppaalParser.LocationContext> locations = $ctx.location();
                    for(UppaalParser.LocationContext location: locations){
                        $namesLocations.add(location.STRING().getText());
                    }
                    for(String locationSource: $namesLocations){
                        HashSet<String> target = new HashSet<String>();
                        for(String locationTarget: $namesLocations){
                            target.add(locationTarget);
                        }
                        this.transitionsTad.get(this.currentEnv).put(locationSource, target);
                    }

                }
                (init_loc misc*)
                {
                    this.initLocationId=$ctx.init_loc().STRING().getText();
                }
                (transition misc*)*
                ;

parameter   :   OPEN_PARAMETER funcParameters CLOSE_PARAMETER ;

coordinate  :   'x' EQUALS STRING 'y' EQUALS STRING ;

init_loc    :   '<' 'init' 'ref' EQUALS STRING '/>' ;

branchpoint :   '<' 'branchpoint' 'id' EQUALS STRING
                    coordinate? '>' misc*
                    '</' 'branchpoint' '>';

location    :   '<' 'location' 'id' EQUALS STRING
                    coordinate? '>' misc* (name misc*)?
                    (label_loc misc*)*
                    ('<' (URGENT_LOC | 'committed') '/>' misc*)?

                    '</' 'location' '>' ;

label_loc   :   '<' 'label' 'kind' EQUALS STRING coordinate?  '>' anything '</' 'label' '>' ;

name        :   '<' 'name'
                    coordinate?
                    '>' anything '</' 'name' '>' ;

transition  :   '<' 'transition' '>'
                {
                    this.currentTransition++;
                }
                misc* (source misc*) (target misc*)
                (label_trans misc*)*
                (nail misc*)*
                '</' 'transition' '>' ;


//Are equals to labels_loc but we can manipulate them differently
label_trans :   OPEN_GUARD guard_expr? CLOSE_LABEL  # LabelTransGuard
            |   OPEN_SYNC (expr '?')? CLOSE_LABEL
                {
                    //Add to tmi array to remove transition on tmi mutants
                    this.tmi.add(this.currentTransition);

                    //If has a synchro input remove from possible transition to make an output on tad mutants
                    this.transitionsTad.get(currentEnv).get(currentSource).remove(currentTarget);

                    //if it has at least one incoming action, then a mutant will be created without the target location
                    if(!this.initLocationId.equals(this.currentTarget)){
                        this.locationsSmi.get(this.currentEnv).add(this.currentTarget);
                    }
                }                                   # LabelTransSyncInput
            |   OPEN_SYNC (expr '!')? CLOSE_LABEL
                {

                    //If has a synchro input remove from possible transition to make an output on tad mutants
                    this.transitionsTad.get(currentEnv).get(currentSource).remove(currentTarget);
                }                                   # LabelTransSyncOutput
            |   '<' 'label' 'kind' EQUALS STRING coordinate?  '>' anything '</' 'label' '>' # labelTrans;


guard_expr  :   IDENTIFIER  # IdentifierGuard
            |   NAT   # NatGuard
            |   POINT    # DoubleGuard
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

                }
                                   # ComparisonGuard
            |   guard_expr binary=( '+' | '-' | '*' | '/' | '%' | '&amp;'
                                    |  '|' | '^' | '&lt;&lt;' | '&gt;&gt;' | '&amp;&amp;' | '||'
                                    |  '&lt;?' | '&gt;?' | 'or' | 'and' | 'imply')
                                    guard_expr   #BinaryGuard
            |   guard_expr '?' guard_expr ':' guard_expr
                                    # IfGuard
            |   guard_expr '.' IDENTIFIER   # DotGuard
            |   guard_expr '(' guard_arguments ')'# FuncGuard
            |   'forall' '(' IDENTIFIER ':' guard_type ')' guard_expr     # ForallGuard
            |   'exists' '(' IDENTIFIER ':' guard_type ')' guard_expr     # ExistsGuard
            |   'sum' '(' IDENTIFIER ':' guard_type ')' guard_expr        # SumGuard
            |   'true'  # TrueGuard
            |   'false' # FalseGuard
            ;

guard_arguments   :   (guard_expr  (',' guard_expr)*)? ;

guard_type        :   ('meta' | 'const')? guard_typeId ;

guard_typeId
            :   'int'                                       # GuardTypeInt
            |   'int' '[' guard_expr ',' guard_expr ']'     # GuardTypeIntDomain
            |   'scalar' '[' guard_expr ']'                 # GuardTypeScalar
            ;

source      :   ('<' 'source' 'ref' EQUALS STRING '/>')
                {
                    this.currentSource = $ctx.STRING().getText();
                }
                ;

target      :   '<' 'target' 'ref' EQUALS STRING '/>'
                {
                    this.currentTarget = $ctx.STRING().getText();
                }
                ;

nail        :   '<' 'nail' coordinate? '/>' ;

system      :   '<' 'system' '>' anything '</' 'system' '>' ;

queries     :   '<' 'queries' '>' misc* (query misc*)* '</' 'queries' '>' ;

query       :   '<' 'query' '>' misc* (formula misc*)? (comment misc*)? '</' 'query' '>' ;

formula     :   '<' 'formula' '>' anything '</' 'formula' '>' ;

comment     :   '<' 'comment' '>' anything '</' 'comment' '>' ;


//guard_expr  :   IDENTIFIER misc*;
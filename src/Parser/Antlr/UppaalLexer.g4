lexer grammar UppaalLexer;

DTD         :   '<!' .*? '>';

//WHITE_SPACE :   [ \t\r\n]+  -> skip;

SEA_WS      :   [ \t\r\n]+              -> skip ;


//OPEN                : '<' ;
//SLASH               : '/' ;
//NTA_CLOSE           : '</' [ \t\r\n]* 'nta' [ \t\r\n]* '>';


//CLOSE               : '>' ;

PROLOG_OPEN              : '<?xml' PROLOG_WS       -> pushMode (PROLOG);
NTA_OPEN                 : '<' [ \t\r\n]* 'nta' [ \t\r\n]* '>'           ->pushMode (NTA);
//DECLARATION_OPEN         : '<' [ \t\r\n]* 'declaration' [ \t\r\n]* '>' ;

//TEXT        :   ~[<&]+ ;        // match any 16 bit char other than < and &

// ----------------- Everything inside PROLOG ---------------------
mode PROLOG;

PROLOG_CLOSE        :  '?>'                     -> popMode ; // close <?xml...?>

NAME_ATTRIBUTE      :   NameStartChar NameChar* ;

EQUALS              :   '=' ;

STRING              :   '"' ~[<"]* '"'
                    |   '\'' ~[<']* '\''
                    ;

PROLOG_WS           :   [ \t\r\n]               -> skip ;

fragment
DIGIT       :   [0-9] ;

fragment
NameChar    :   NameStartChar
            |   '-' | '.' | DIGIT
            |   '\u00B7'
            |   '\u0300'..'\u036F'
            |   '\u203F'..'\u2040'
            ;

fragment
NameStartChar
            :   [:a-zA-Z]
            |   '\u2070'..'\u218F'
            |   '\u2C00'..'\u2FEF'
            |   '\u3001'..'\uD7FF'
            |   '\uF900'..'\uFDCF'
            |   '\uFDF0'..'\uFFFD'
            ;

// ----------------- Everything inside NTA ---------------------

mode NTA;

NTA_CLOSE           : '</' [ \t\r\n]* 'nta' [ \t\r\n]* '>'          -> popMode ; //close NTA

DECLARATION_OPEN    : '<' [ \t\r\n]* 'declaration' [ \t\r\n]* '>'   -> pushMode (DECLARATION) ;
TEMPLATE_OPEN       : '<' [ \t\r\n]* 'template' [ \t\r\n]* '>'      -> pushMode (TEMPLATE) ;

WS_NTA :   [ \t\r\n]+  -> skip;

// ----------------- Everything inside DECLARATION ---------------------

mode DECLARATION;

DECLARATION_CLOSE   : '</' [ \t\r\n]* 'declaration' [ \t\r\n]* '>'  -> popMode ;


//DECLARATION_WS      :   (' '|'\t'|'\r'? '\n') ;
//DECLARATION_TEXT    :   ~[<&]+ ;

DECLARATION_TEXT    :   ~[<]+ ;


// ----------------- Everything inside TEMPLATE ---------------------

mode TEMPLATE;

TEMPLATE_CLOSE      :   '</' [ \t\r\n]* 'template' [ \t\r\n]* '>'     -> popMode ;


DECLARATION_TEMPLATE_OPEN    : '<' [ \t\r\n]* 'declaration' [ \t\r\n]* '>'   -> pushMode (DECLARATION) ;


X                   :   'x' ;

Y                   :   'y' ;

EQUALS_TEMPLATE     :   '=' ;

NUMBER              :   [-]?[0-9]+ ;

QUOTES              :   '"' ;

OPEN                :   '<' ;

NAME                :   'name' ;

LOCATION            :   'location' ;

ID                  :   'id' ;

TRANSITION          :   'transition' ;

URGENT              :   'urgent' ;

COMMITTED           :   'committed' ;

INIT                :   'init' ;

REF                 :   'ref' ;

SOURCE              :   'source' ;

TARGET              :   'target' ;

NAIL                :   'nail' ;

OPEN_SLASH          :   '</' ;

CLOSE               :   '>' ;

SLASH_CLOSE         :   '/>' ;

IDENTIFIER          :   [a-zA-Z_] [a-zA-Z0-9_]* ;

PARAMETER_OPEN       : '<' [ \t\r\n]* 'parameter' [ \t\r\n]* '>'      -> pushMode (PARAMETER) ;

//NAME_CLOSE          :   '</' 'name' '>' ;
/*
LOCATION_OPEN       :   '<' 'location' '>' ;

LOCATION_CLOSE      :   '</' 'location' '>' ;

TRANSITION_OPEN     :   '<' 'transition' '>' ;

TRANSITION_CLOSE    :   '</' 'transition' '>' ;
*/

/*
Label_comments is done separately to Label_kind and Label_edge_kind due to this fragment
has occurrences in tokens of transitions and locations
*/
fragment
Label_comments      :   '"comments"'
                    ;

fragment
Label_kind          :   '"invariant"'
                    |   '"exponentialrate"'
                    ;

fragment
Label_code          :   '"testcodeEnter"'
                    |   '"testcodeExit"'
                    ;


//			<label kind="invariant" x="425" y="127">12</label>
LABEL_OPEN          :   '<'[ \t\r\n]*'label'[ \t\r\n]+ 'kind'  [ \t\r\n]* EQUALS_TEMPLATE [ \t\r\n]*
                            (
                            Label_kind ( [ \t\r\n]* X [ \t\r\n]* EQUALS_TEMPLATE [ \t\r\n]* '"' NUMBER '"' [ \t\r\n]* Y [ \t\r\n]* EQUALS_TEMPLATE [ \t\r\n]* '"' NUMBER '"')?
                            |
                            Label_code
                            )
                            [ \t\r\n]* '>'                                             -> pushMode (LABEL);

//'<' [ \t\r\n]* 'label' [ \t\r\n]* 'kind' [ \t\r\n]* EQUALS_TEMPLATE [ \t\r\n]* Label_kind [ \t\r\n]* 'x' EQUALS_TEMPLATE '"' NUMBER '"' 'y' EQUALS_TEMPLATE '"' NUMBER '"' '>' ;


fragment
Label_edge_kind     :   '"select"'
                    |   '"synchronisation"'
                    |   '"assignment"'
                    ;

fragment
Label_guard         :   '"guard"'
                    ;

fragment
Label_edge_code     :   '"testcode"'
                    ;

LABEL_T_OPEN        :   '<'[ \t\r\n]*'label'[ \t\r\n]+ 'kind'  [ \t\r\n]* EQUALS_TEMPLATE [ \t\r\n]*
                            (
                            Label_edge_kind ( [ \t\r\n]* X [ \t\r\n]* EQUALS_TEMPLATE [ \t\r\n]* '"' NUMBER '"' [ \t\r\n]* Y [ \t\r\n]* EQUALS_TEMPLATE [ \t\r\n]* '"' NUMBER '"')?
                            |
                            Label_edge_code
                            )
                            [ \t\r\n]* '>'                                             -> pushMode (LABEL);


LABEL_COMMENTS_OPEN :   '<'[ \t\r\n]*'label'[ \t\r\n]+ 'kind'  [ \t\r\n]* EQUALS_TEMPLATE [ \t\r\n]*

                            Label_comments ( [ \t\r\n]* X [ \t\r\n]* EQUALS_TEMPLATE [ \t\r\n]* '"' NUMBER '"' [ \t\r\n]* Y [ \t\r\n]* EQUALS_TEMPLATE [ \t\r\n]* '"' NUMBER '"')?
                            [ \t\r\n]* '>'                                             -> pushMode (LABEL);


LABEL_G_OPEN        :   '<'[ \t\r\n]*'label'[ \t\r\n]+ 'kind'  [ \t\r\n]* EQUALS_TEMPLATE [ \t\r\n]*

                            Label_guard ( [ \t\r\n]* X [ \t\r\n]* EQUALS_TEMPLATE [ \t\r\n]* '"' NUMBER '"' [ \t\r\n]* Y [ \t\r\n]* EQUALS_TEMPLATE [ \t\r\n]* '"' NUMBER '"')?

                            [ \t\r\n]* '>'                                             -> pushMode (GUARD);



WS_TEMPLATE         :   [ \t\r\n]+  -> skip;

//ANYTHING            :   ~[<>]+ ;


// ----------------- Everything inside LABEL ---------------------
mode LABEL;

LABEL_CLOSE         :   '</' [ \t\r\n]* 'label' [ \t\r\n]* '>'     -> popMode ;

LABEL_TEXT          :   ~[<]+ ;

// ----------------- Everything inside PARAMETER ---------------------
mode PARAMETER;

PARAMETER_CLOSE         :   '</' [ \t\r\n]* 'parameter' [ \t\r\n]* '>'     -> popMode ;

PARAMETER_TEXT          :   ~[<]+ ;


// ----------------- Everything inside GUARD ---------------------
mode GUARD;

GUARD_CLOSE         :   '</' [ \t\r\n]* 'label' [ \t\r\n]* '>'    -> popMode ;


NAT_GUARD           :   [0-9]+ ;

LEFT_PARENTHESIS    :   '(' ;

RIGHT_PARENTHESIS   :   ')' ;

LEFT_BRACKET        :   '[' ;

RIGHT_BRACKET       :   ']' ;

COMMA               :   ',' ;

INCREMENT           :   '++' ;

DECREMENT           :   '--' ;

ASSIGN              :   '=' ;

ASSIGN_COLON        :   ':=' ;

ASSIGN_ADD          :   '+=' ;

ASSIGN_SUB          :   '-=' ;

ASSIGN_MUL          :   '*=' ;

ASSIGN_DIV          :   '/=' ;

ASSIGN_PERCENT      :   '%=' ;

ASSIGN_OR           :   '|=' ;

ASSIGN_AND          :   '&amp;=' ;

ASSIGN_XOR          :   '^=' ;

ASSIGN_LSHIFT       :   '&lt;&lt;=' ;

ASSIGN_RSHIFT       :   '&gt;&gt;=' ;


//Unary

ADD                 :   '+' ; //binary too

SUB                 :   '-' ; //binary too

EXCLAMATION         :   '!' ;

NOT                 :   'not' ;

//Binary

LESS                :   '&lt;' ;
LESSEQ              :   '&lt;=' ;
COMPARE             :   '==' ;
DIFFERENT           :   '!=' ;
GREATEREQ           :   '&gt;=' ;
GREATER             :   '&gt;' ;
MUL                 :   '*' ;
DIV                 :   '/' ;
PERCENT             :   '%' ;
BITAND              :   '&amp;' ;
BITOR               :   '|' ;
BITXOR              :   '^' ;
LSHIFT              :   '&lt;&lt;' ;
RSHIFT              :   '&gt;&gt;' ;
AND_SYMBOL          :   '&amp;&amp;' ;
OR_SYMBOL           :   '||' ;
MINIMUM             :   '&lt;?' ;
MAXIMUM             :   '&gt;?' ;
OR                  :   'or' ;
AND                 :   'and' ;
IMPLY               :   'imply' ;


//IF THEN ELSE

IF                  :   '?' ;
ELSE                :   ':' ;

//Infix lookup operator to access process or structure type scope

LOOKUP_OP           :   '.' ;

//Quantifiers

FORALL              :   'forall' ;
EXISTS              :   'exists' ;

//SUMMATION

SUM                 :   'sum' ;

//---TYPES---

//prefix
META                :   'meta' ;
CONST               :   'const' ;

//typeId
INT                 :   'int' ;
SCALAR              :   'scalar' ;

//Boolean
TRUE                :   'true' ;
FALSE               :   'false' ;

ID_GUARD            :   [a-zA-Z_] [a-zA-Z0-9_]* ;

WS_GUARD            :   [ \t\r\n]+  -> skip;

// ----------------- Everything inside SYSTEM ---------------------
mode SYSTEM;

SYSTEM_CLOSE         :   '</' [ \t\r\n]* 'system' [ \t\r\n]* '>'     -> popMode ;

SYSTEM_TEXT          :   ~[<]+ ;

// ----------------- Everything inside QUERIES ---------------------
mode QUERIES;

QUERIES_CLOSE         :   '</' [ \t\r\n]* 'queries' [ \t\r\n]* '>'     -> popMode ;

QUERIES_TEXT          :   ~[<]+ ;



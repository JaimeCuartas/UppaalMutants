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




X                   :   'x' ;

Y                   :   'y' ;

EQUALS_TEMPLATE     :   '=' ;

NUMBER              :   [-]?[0-9]+ ;

QUOTES              :   '"' ;

/*
NAME_OPEN           :   '<' [ \t\r\n]* 'name ' [ \t\r\n]* '>'
                    |   '<' [ \t\r\n]* 'name ' [ \t\r\n]* X [ \t\r\n]* Y [ \t\r\n]* '>'
                    ;
*/


OPEN                : '<' ;

NAME                :   'name' ;

OPEN_SLASH          : '</' ;

CLOSE               : '>' ;

IDENTIFIER          :   [a-zA-Z_] [a-zA-Z0-9_]* ;

//NAME_CLOSE          :   '</' 'name' '>' ;

LOCATION_OPEN       :   '<' 'location' '>' ;

LOCATION_CLOSE      :   '</' 'location' '>' ;

TRANSITION_OPEN     :   '<' 'transition' '>' ;

TRANSITION_CLOSE    :   '</' 'transition' '>' ;

WS_TEMPLATE         :   [ \t\r\n]+  -> skip;


//ANYTHING            :   ~[<>]+ ;
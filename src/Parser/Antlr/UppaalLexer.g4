lexer grammar UppaalLexer;

DTD         :   '<!' .*? '>';

//WHITE_SPACE :   [ \t\r\n]+  -> skip;

SEA_WS      :   [ \t\r\n]+              -> skip ;

OPEN                : '<' ;
SLASH               : '/' ;
NTA                 : '<' [ \t\r\n]* 'nta' [ \t\r\n]* '>';
NTA_CLOSE           : '</' [ \t\r\n]* 'nta' [ \t\r\n]* '>';
DECLARATION         : '<' [ \t\r\n]* 'declaration' [ \t\r\n]* '>' ;
TEMPLATE            : 'template' ;


CLOSE               : '>' ;

XMLDeclOpen :   '<?xml' PROLOG_WS       -> pushMode (PROLOG);

//TEXT        :   ~[<&]+ ;        // match any 16 bit char other than < and &

// ----------------- Everything inside PROLOG ---------------------
mode PROLOG;

PROLOG_CLOSE        :  '?>'                     -> popMode ; // close <?xml...?>

NAME                :   NameStartChar NameChar* ;

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




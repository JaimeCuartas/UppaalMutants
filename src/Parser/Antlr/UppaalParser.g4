parser grammar UppaalParser;
options { tokenVocab=UppaalLexer; }

document    :   prolog? DTD? nta;

prolog      :   PROLOG_OPEN attribute* PROLOG_CLOSE ;

nta         :   NTA_OPEN declaration template* NTA_CLOSE ; //template+ system queries ;
/*
declaration :   DECLARATION_OPEN decl_content? DECLARATION_CLOSE ;

decl_content:   DECLARATION_TEXT  ;
*/

declaration :   DECLARATION_OPEN DECLARATION_TEXT? DECLARATION_CLOSE ;

template    :   TEMPLATE_OPEN templ_content TEMPLATE_CLOSE ;

templ_content:  name locations+ init_loc transitions* ;
/*
name        :   '<' 'name'
                    ('x' EQUALS_TEMPLATE '"' NUMBER '"' 'y' EQUALS_TEMPLATE '"' NUMBER '"')?
                    '>' IDENTIFIER '</' 'name' '>' ;
*/

name        :   OPEN 'name'
                    coordinate?
                    CLOSE IDENTIFIER '</' 'name' CLOSE ;

locations   :   OPEN 'location' 'id' EQUALS_TEMPLATE '"' IDENTIFIER '"'
                    coordinate?
                    CLOSE name? labels* (OPEN ('urgent' | 'committed') '/>')? '</' 'location' CLOSE ;

coordinate  :   'x' EQUALS_TEMPLATE '"' NUMBER '"' 'y' EQUALS_TEMPLATE '"' NUMBER '"';

init_loc    :   OPEN 'init' 'ref' EQUALS_TEMPLATE '"' IDENTIFIER '"' '/>';

labels      :   (LABEL_OPEN | LABEL_COMMENTS_OPEN) LABEL_TEXT? LABEL_CLOSE ;


/*LABEL_OPEN          :   '<'[ \t\r\n]*'label'[ \t\r\n]+ 'kind'  [ \t\r\n]* EQUALS_TEMPLATE [ \t\r\n]* Label_kind
                              ('x' EQUALS_TEMPLATE '"' NUMBER '"' 'y' EQUALS_TEMPLATE '"' NUMBER '"')?*/
//(LABEL | LABEL_CODE) LABEL_TEXT LABEL_CLOSE;

transitions :   OPEN 'transition' CLOSE //OPEN is '<' in template channel, CLOSE is '>' in template channel
                    source
                    target
                    labels_t*
                    label_guard?
                    labels_t*
                    '</' 'transition' CLOSE ;

labels_t    :   (LABEL_T_OPEN | LABEL_COMMENTS_OPEN) LABEL_TEXT? LABEL_CLOSE ;

label_guard :   LABEL_G_OPEN guard_expr GUARD_CLOSE ;

guard_expr  :   ID_GUARD
            |   NAT_GUARD
            |   '(' guard_expr ')'
            |   guard_expr '++' | '++' guard_expr
            |   guard_expr '--' | '--' guard_expr
            |   guard_expr
                    assign=(ASSIGN | ':=' | '+=' | '-=' | '*=' | '/=' | '%=' | '|=' | '&=' | '^=' | '<<=' | '>>=')
                        guard_expr //assign is '=' in guard channel
            |   unary=('-' | '+' | '!' | 'not') guard_expr
            |   guard_expr binary=( LESS | '<=' | '==' | '!=' | '>=' | GREATER //LESS is '<' in guard channel. Greater is '>' in guard channel
                                               |  '+' | '-' | '*' | '/' | '%' | '&'
                                               |  '|' | '^' | '<<' | '>>' | '&&' | '||'
                                               |  '<?' | '>?' | 'or' | 'and' | 'imply') guard_expr

            ;

source      :   OPEN 'source' 'ref' EQUALS_TEMPLATE '"' IDENTIFIER '"' '/>' ; //OPEN is '<' in template channel

target      :   OPEN 'target' 'ref' EQUALS_TEMPLATE '"' IDENTIFIER '"' '/>' ; //OPEN is '<' in template channel

attribute   :   NAME_ATTRIBUTE EQUALS STRING ;


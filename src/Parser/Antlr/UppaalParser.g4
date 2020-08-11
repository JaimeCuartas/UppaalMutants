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

name        :   '<' 'name'
                    coordinate?
                    '>' IDENTIFIER '</' 'name' '>' ;

locations   :   '<' 'location' 'id' EQUALS_TEMPLATE '"' IDENTIFIER '"'
                    coordinate?
                    '>' name? labels* ('<' ('urgent' | 'committed') '/>')? '</' 'location' '>' ;

coordinate  :   'x' EQUALS_TEMPLATE '"' NUMBER '"' 'y' EQUALS_TEMPLATE '"' NUMBER '"';

init_loc    :   '<' 'init' 'ref' EQUALS_TEMPLATE '"' IDENTIFIER '"' '/>';

labels      :   (LABEL_OPEN | LABEL_COMMENTS_OPEN) LABEL_TEXT? LABEL_CLOSE ;


/*LABEL_OPEN          :   '<'[ \t\r\n]*'label'[ \t\r\n]+ 'kind'  [ \t\r\n]* EQUALS_TEMPLATE [ \t\r\n]* Label_kind
                              ('x' EQUALS_TEMPLATE '"' NUMBER '"' 'y' EQUALS_TEMPLATE '"' NUMBER '"')?*/
//(LABEL | LABEL_CODE) LABEL_TEXT LABEL_CLOSE;

transitions :   '<' 'transition' '>'
                    source
                    target
                    labels_t*
                    '</' 'transition' '>' ;

labels_t    :   (LABEL_T_OPEN | LABEL_COMMENTS_OPEN) LABEL_TEXT? LABEL_CLOSE ;

label_guard :   LABEL_G_OPEN LABEL_CLOSE ;

source      :   '<' 'source' 'ref' EQUALS_TEMPLATE '"' IDENTIFIER '"' '/>' ;

target      :   '<' 'target' 'ref' EQUALS_TEMPLATE '"' IDENTIFIER '"' '/>' ;

attribute   :   NAME_ATTRIBUTE EQUALS STRING ;


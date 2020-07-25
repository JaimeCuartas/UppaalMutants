parser grammar UppaalParser;
options { tokenVocab=UppaalLexer; }

document    :   prolog? DTD? nta;

prolog      :   PROLOG_OPEN attribute* PROLOG_CLOSE ;

nta         :   NTA_OPEN declaration template* NTA_CLOSE ; //template+ system queries ;

declaration :   DECLARATION_OPEN decl_content? DECLARATION_CLOSE ;

decl_content:   DECLARATION_TEXT /*| DECLARATION_WS*/ ;

template    :   TEMPLATE_OPEN templ_content TEMPLATE_CLOSE ;

templ_content:  name locations* init_loc transitions* ;

name        :   '<' 'name' '>' IDENTIFIER '</' 'name' '>'
            |   '<' 'name' 'x' EQUALS_TEMPLATE '"' NUMBER '"' 'y' EQUALS_TEMPLATE '"' NUMBER '"' '>' IDENTIFIER '</' 'name' '>' ;

locations   :   '<' 'location' 'id' EQUALS_TEMPLATE '"' IDENTIFIER '"' 'x' EQUALS_TEMPLATE '"' NUMBER '"' 'y' EQUALS_TEMPLATE '"' NUMBER '"' '>' name '</' 'location' '>' ;

init_loc    :   '<' 'init' 'ref' EQUALS_TEMPLATE '"' IDENTIFIER '"' '/>';

transitions :   '<' 'transition' '>' '</' 'transition' '>' ;

attribute   :   NAME_ATTRIBUTE EQUALS STRING ;


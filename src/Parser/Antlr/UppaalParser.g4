parser grammar UppaalParser;
options { tokenVocab=UppaalLexer; }

document    :   prolog? DTD? nta;

prolog      :   PROLOG_OPEN attribute* PROLOG_CLOSE ;

nta         :   NTA_OPEN declaration template* NTA_CLOSE ; //template+ system queries ;

declaration :   DECLARATION_OPEN decl_content? DECLARATION_CLOSE ;

decl_content:   DECLARATION_TEXT /*| DECLARATION_WS*/ ;

template    :   TEMPLATE_OPEN templ_content TEMPLATE_CLOSE ;

templ_content:  name locations* transitions* ;

name        :   '<' 'name' '>' IDENTIFIER '</' 'name' '>'
            |   '<' 'name' 'x' EQUALS_TEMPLATE '"' NUMBER '"' 'y' EQUALS_TEMPLATE '"' NUMBER '"' '>' IDENTIFIER '</' 'name' '>' ;

locations   :   LOCATION_OPEN ANYTHING LOCATION_CLOSE ;

transitions :   TRANSITION_OPEN TRANSITION_CLOSE ;

attribute   :   NAME_ATTRIBUTE EQUALS STRING ;


parser grammar UppaalParser;
options { tokenVocab=UppaalLexer; }

document    :   prolog? DTD? nta;

prolog      :   XMLDeclOpen attribute* PROLOG_CLOSE ;

nta         :   NTA   declaration NTA_CLOSE ; //template+ system queries ;

declaration :   DECLARATION ;
/*
content     :   chardata? chardata* ;

chardata    :   TEXT | SEA_WS ;
*/
attribute   :   NAME '=' STRING ;


// Generated from C:/Users/57310/Documents/Github/XMLGrammar/src/Parser/Antlr\UppaalParser.g4 by ANTLR 4.8
package Parser.Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UppaalParser}.
 */
public interface UppaalParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UppaalParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(UppaalParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(UppaalParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#prolog}.
	 * @param ctx the parse tree
	 */
	void enterProlog(UppaalParser.PrologContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#prolog}.
	 * @param ctx the parse tree
	 */
	void exitProlog(UppaalParser.PrologContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#nta}.
	 * @param ctx the parse tree
	 */
	void enterNta(UppaalParser.NtaContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#nta}.
	 * @param ctx the parse tree
	 */
	void exitNta(UppaalParser.NtaContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(UppaalParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(UppaalParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#decl_content}.
	 * @param ctx the parse tree
	 */
	void enterDecl_content(UppaalParser.Decl_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#decl_content}.
	 * @param ctx the parse tree
	 */
	void exitDecl_content(UppaalParser.Decl_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(UppaalParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(UppaalParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#templ_content}.
	 * @param ctx the parse tree
	 */
	void enterTempl_content(UppaalParser.Templ_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#templ_content}.
	 * @param ctx the parse tree
	 */
	void exitTempl_content(UppaalParser.Templ_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(UppaalParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(UppaalParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#locations}.
	 * @param ctx the parse tree
	 */
	void enterLocations(UppaalParser.LocationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#locations}.
	 * @param ctx the parse tree
	 */
	void exitLocations(UppaalParser.LocationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#init_loc}.
	 * @param ctx the parse tree
	 */
	void enterInit_loc(UppaalParser.Init_locContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#init_loc}.
	 * @param ctx the parse tree
	 */
	void exitInit_loc(UppaalParser.Init_locContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#transitions}.
	 * @param ctx the parse tree
	 */
	void enterTransitions(UppaalParser.TransitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#transitions}.
	 * @param ctx the parse tree
	 */
	void exitTransitions(UppaalParser.TransitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(UppaalParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(UppaalParser.AttributeContext ctx);
}
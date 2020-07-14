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
	 * Enter a parse tree produced by {@link UppaalParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(UppaalParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(UppaalParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#chardata}.
	 * @param ctx the parse tree
	 */
	void enterChardata(UppaalParser.ChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#chardata}.
	 * @param ctx the parse tree
	 */
	void exitChardata(UppaalParser.ChardataContext ctx);
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
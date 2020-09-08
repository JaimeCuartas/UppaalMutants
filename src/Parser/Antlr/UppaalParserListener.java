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
	 * Enter a parse tree produced by {@link UppaalParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(UppaalParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(UppaalParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(UppaalParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(UppaalParser.ReferenceContext ctx);
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
	 * Enter a parse tree produced by {@link UppaalParser#misc}.
	 * @param ctx the parse tree
	 */
	void enterMisc(UppaalParser.MiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#misc}.
	 * @param ctx the parse tree
	 */
	void exitMisc(UppaalParser.MiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(UppaalParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(UppaalParser.ModelContext ctx);
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
	 * Enter a parse tree produced by {@link UppaalParser#anything}.
	 * @param ctx the parse tree
	 */
	void enterAnything(UppaalParser.AnythingContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#anything}.
	 * @param ctx the parse tree
	 */
	void exitAnything(UppaalParser.AnythingContext ctx);
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
	 * Enter a parse tree produced by {@link UppaalParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(UppaalParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(UppaalParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#coordinate}.
	 * @param ctx the parse tree
	 */
	void enterCoordinate(UppaalParser.CoordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#coordinate}.
	 * @param ctx the parse tree
	 */
	void exitCoordinate(UppaalParser.CoordinateContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#temp_content}.
	 * @param ctx the parse tree
	 */
	void enterTemp_content(UppaalParser.Temp_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#temp_content}.
	 * @param ctx the parse tree
	 */
	void exitTemp_content(UppaalParser.Temp_contentContext ctx);
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
}
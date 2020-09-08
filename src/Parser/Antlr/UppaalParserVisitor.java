// Generated from C:/Users/57310/Documents/Github/XMLGrammar/src/Parser/Antlr\UppaalParser.g4 by ANTLR 4.8
package Parser.Antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UppaalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UppaalParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UppaalParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(UppaalParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#prolog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProlog(UppaalParser.PrologContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(UppaalParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(UppaalParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(UppaalParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(UppaalParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#chardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardata(UppaalParser.ChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#misc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMisc(UppaalParser.MiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(UppaalParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#nta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNta(UppaalParser.NtaContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(UppaalParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#anything}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnything(UppaalParser.AnythingContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(UppaalParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(UppaalParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(UppaalParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoordinate(UppaalParser.CoordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#temp_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemp_content(UppaalParser.Temp_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#locations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocations(UppaalParser.LocationsContext ctx);
}
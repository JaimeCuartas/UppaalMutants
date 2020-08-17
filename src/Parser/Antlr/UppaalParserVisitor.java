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
	 * Visit a parse tree produced by {@link UppaalParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(UppaalParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#templ_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempl_content(UppaalParser.Templ_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(UppaalParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#locations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocations(UppaalParser.LocationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoordinate(UppaalParser.CoordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#init_loc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_loc(UppaalParser.Init_locContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabels(UppaalParser.LabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#transitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitions(UppaalParser.TransitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#labels_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabels_t(UppaalParser.Labels_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#label_guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_guard(UppaalParser.Label_guardContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard_expr(UppaalParser.Guard_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(UppaalParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(UppaalParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(UppaalParser.AttributeContext ctx);
}
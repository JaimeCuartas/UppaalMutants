// Generated from C:/Users/57310/Documents/Github/XMLGrammar/src/Parser/Antlr\UppaalParser.g4 by ANTLR 4.8
package Parser.Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UppaalParser}.
 */
public interface UppaalParserListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link UppaalParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(UppaalParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(UppaalParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#label_loc}.
	 * @param ctx the parse tree
	 */
	void enterLabel_loc(UppaalParser.Label_locContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#label_loc}.
	 * @param ctx the parse tree
	 */
	void exitLabel_loc(UppaalParser.Label_locContext ctx);
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
	 * Enter a parse tree produced by {@link UppaalParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(UppaalParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(UppaalParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#label_trans}.
	 * @param ctx the parse tree
	 */
	void enterLabel_trans(UppaalParser.Label_transContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#label_trans}.
	 * @param ctx the parse tree
	 */
	void exitLabel_trans(UppaalParser.Label_transContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterSumGuard(UppaalParser.SumGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitSumGuard(UppaalParser.SumGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisGuard(UppaalParser.ParenthesisGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisGuard(UppaalParser.ParenthesisGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseGuard(UppaalParser.FalseGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseGuard(UppaalParser.FalseGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignGuard(UppaalParser.AssignGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignGuard(UppaalParser.AssignGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterDotGuard(UppaalParser.DotGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitDotGuard(UppaalParser.DotGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecrementGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterDecrementGuard(UppaalParser.DecrementGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecrementGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitDecrementGuard(UppaalParser.DecrementGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryGuard(UppaalParser.UnaryGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryGuard(UppaalParser.UnaryGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonGuard(UppaalParser.ComparisonGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonGuard(UppaalParser.ComparisonGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierGuard(UppaalParser.IdentifierGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierGuard(UppaalParser.IdentifierGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryGuard(UppaalParser.BinaryGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryGuard(UppaalParser.BinaryGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NatGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterNatGuard(UppaalParser.NatGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NatGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitNatGuard(UppaalParser.NatGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExistsGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterExistsGuard(UppaalParser.ExistsGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExistsGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitExistsGuard(UppaalParser.ExistsGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForallGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterForallGuard(UppaalParser.ForallGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForallGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitForallGuard(UppaalParser.ForallGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GuardDecrement}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterGuardDecrement(UppaalParser.GuardDecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GuardDecrement}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitGuardDecrement(UppaalParser.GuardDecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueGuard(UppaalParser.TrueGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueGuard(UppaalParser.TrueGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterIfGuard(UppaalParser.IfGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitIfGuard(UppaalParser.IfGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncGuard(UppaalParser.FuncGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncGuard(UppaalParser.FuncGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterIncrementGuard(UppaalParser.IncrementGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitIncrementGuard(UppaalParser.IncrementGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GuardIncrement}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterGuardIncrement(UppaalParser.GuardIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GuardIncrement}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitGuardIncrement(UppaalParser.GuardIncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(UppaalParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(UppaalParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(UppaalParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(UppaalParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#typeId}.
	 * @param ctx the parse tree
	 */
	void enterTypeId(UppaalParser.TypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#typeId}.
	 * @param ctx the parse tree
	 */
	void exitTypeId(UppaalParser.TypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(UppaalParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(UppaalParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(UppaalParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(UppaalParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#nail}.
	 * @param ctx the parse tree
	 */
	void enterNail(UppaalParser.NailContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#nail}.
	 * @param ctx the parse tree
	 */
	void exitNail(UppaalParser.NailContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#system}.
	 * @param ctx the parse tree
	 */
	void enterSystem(UppaalParser.SystemContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#system}.
	 * @param ctx the parse tree
	 */
	void exitSystem(UppaalParser.SystemContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#queries}.
	 * @param ctx the parse tree
	 */
	void enterQueries(UppaalParser.QueriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#queries}.
	 * @param ctx the parse tree
	 */
	void exitQueries(UppaalParser.QueriesContext ctx);
}
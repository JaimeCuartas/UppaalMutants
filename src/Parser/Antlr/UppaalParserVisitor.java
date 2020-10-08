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
	 * Visit a parse tree produced by {@link UppaalParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(UppaalParser.ModelContext ctx);
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
	 * Visit a parse tree produced by {@link UppaalParser#decl_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_content(UppaalParser.Decl_contentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(UppaalParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NatExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNatExpr(UppaalParser.NatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleExpr(UppaalParser.DoubleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(UppaalParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StopWatchExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopWatchExpr(UppaalParser.StopWatchExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpr(UppaalParser.ParenthesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIncrement}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIncrement(UppaalParser.ExprIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementExpr(UppaalParser.IncrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDecrement}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDecrement(UppaalParser.ExprDecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecrementExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementExpr(UppaalParser.DecrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(UppaalParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(UppaalParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(UppaalParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(UppaalParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(UppaalParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExpr(UppaalParser.DotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(UppaalParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForallExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForallExpr(UppaalParser.ForallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistsExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsExpr(UppaalParser.ExistsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpr(UppaalParser.SumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueGuarExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueGuarExpr(UppaalParser.TrueGuarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseGuardExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseGuardExpr(UppaalParser.FalseGuardExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(UppaalParser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(UppaalParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(UppaalParser.PrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#typeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeId(UppaalParser.TypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(UppaalParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#arrayDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecl(UppaalParser.ArrayDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#variableID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableID(UppaalParser.VariableIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#initialiser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialiser(UppaalParser.InitialiserContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#typeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDecl(UppaalParser.TypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(UppaalParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#funcParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParameters(UppaalParser.FuncParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#funcParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParameter(UppaalParser.FuncParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(UppaalParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(UppaalParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(UppaalParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(UppaalParser.IterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(UppaalParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(UppaalParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(UppaalParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(UppaalParser.Return_statementContext ctx);
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
	 * Visit a parse tree produced by {@link UppaalParser#temp_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemp_content(UppaalParser.Temp_contentContext ctx);
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
	 * Visit a parse tree produced by {@link UppaalParser#init_loc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_loc(UppaalParser.Init_locContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#branchpoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranchpoint(UppaalParser.BranchpointContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(UppaalParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#label_loc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_loc(UppaalParser.Label_locContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(UppaalParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(UppaalParser.TransitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LabelTransGuard}
	 * labeled alternative in {@link UppaalParser#label_trans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelTransGuard(UppaalParser.LabelTransGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelTrans}
	 * labeled alternative in {@link UppaalParser#label_trans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelTrans(UppaalParser.LabelTransContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumGuard(UppaalParser.SumGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisGuard(UppaalParser.ParenthesisGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseGuard(UppaalParser.FalseGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignGuard(UppaalParser.AssignGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotGuard(UppaalParser.DotGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecrementGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementGuard(UppaalParser.DecrementGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryGuard(UppaalParser.UnaryGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonGuard(UppaalParser.ComparisonGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierGuard(UppaalParser.IdentifierGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryGuard(UppaalParser.BinaryGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NatGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNatGuard(UppaalParser.NatGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistsGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsGuard(UppaalParser.ExistsGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StopWatchGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopWatchGuard(UppaalParser.StopWatchGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayGuard(UppaalParser.ArrayGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForallGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForallGuard(UppaalParser.ForallGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GuardDecrement}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardDecrement(UppaalParser.GuardDecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueGuard(UppaalParser.TrueGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfGuard(UppaalParser.IfGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncGuard(UppaalParser.FuncGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementGuard(UppaalParser.IncrementGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleGuard(UppaalParser.DoubleGuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GuardIncrement}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardIncrement(UppaalParser.GuardIncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#guard_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard_arguments(UppaalParser.Guard_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#guard_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard_type(UppaalParser.Guard_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GuardTypeInt}
	 * labeled alternative in {@link UppaalParser#guard_typeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardTypeInt(UppaalParser.GuardTypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GuardTypeIntDomain}
	 * labeled alternative in {@link UppaalParser#guard_typeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardTypeIntDomain(UppaalParser.GuardTypeIntDomainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GuardTypeScalar}
	 * labeled alternative in {@link UppaalParser#guard_typeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardTypeScalar(UppaalParser.GuardTypeScalarContext ctx);
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
	 * Visit a parse tree produced by {@link UppaalParser#nail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNail(UppaalParser.NailContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#system}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem(UppaalParser.SystemContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#queries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueries(UppaalParser.QueriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(UppaalParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(UppaalParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link UppaalParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(UppaalParser.CommentContext ctx);
}
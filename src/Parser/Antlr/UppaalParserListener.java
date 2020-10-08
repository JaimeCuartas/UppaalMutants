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
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(UppaalParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(UppaalParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NatExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNatExpr(UppaalParser.NatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NatExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNatExpr(UppaalParser.NatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDoubleExpr(UppaalParser.DoubleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDoubleExpr(UppaalParser.DoubleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(UppaalParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(UppaalParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StopWatchExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStopWatchExpr(UppaalParser.StopWatchExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StopWatchExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStopWatchExpr(UppaalParser.StopWatchExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpr(UppaalParser.ParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpr(UppaalParser.ParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIncrement}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIncrement(UppaalParser.ExprIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIncrement}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIncrement(UppaalParser.ExprIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpr(UppaalParser.IncrementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpr(UppaalParser.IncrementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDecrement}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDecrement(UppaalParser.ExprDecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDecrement}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDecrement(UppaalParser.ExprDecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecrementExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDecrementExpr(UppaalParser.DecrementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecrementExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDecrementExpr(UppaalParser.DecrementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(UppaalParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(UppaalParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(UppaalParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(UppaalParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(UppaalParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(UppaalParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(UppaalParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(UppaalParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(UppaalParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(UppaalParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDotExpr(UppaalParser.DotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDotExpr(UppaalParser.DotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(UppaalParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(UppaalParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForallExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterForallExpr(UppaalParser.ForallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForallExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitForallExpr(UppaalParser.ForallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExistsExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExistsExpr(UppaalParser.ExistsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExistsExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExistsExpr(UppaalParser.ExistsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSumExpr(UppaalParser.SumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSumExpr(UppaalParser.SumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueGuarExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueGuarExpr(UppaalParser.TrueGuarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueGuarExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueGuarExpr(UppaalParser.TrueGuarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseGuardExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseGuardExpr(UppaalParser.FalseGuardExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseGuardExpr}
	 * labeled alternative in {@link UppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseGuardExpr(UppaalParser.FalseGuardExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(UppaalParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(UppaalParser.VariableDeclContext ctx);
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
	 * Enter a parse tree produced by {@link UppaalParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(UppaalParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(UppaalParser.PrefixContext ctx);
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
	 * Enter a parse tree produced by {@link UppaalParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(UppaalParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(UppaalParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(UppaalParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(UppaalParser.ArrayDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#variableID}.
	 * @param ctx the parse tree
	 */
	void enterVariableID(UppaalParser.VariableIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#variableID}.
	 * @param ctx the parse tree
	 */
	void exitVariableID(UppaalParser.VariableIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#initialiser}.
	 * @param ctx the parse tree
	 */
	void enterInitialiser(UppaalParser.InitialiserContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#initialiser}.
	 * @param ctx the parse tree
	 */
	void exitInitialiser(UppaalParser.InitialiserContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecl(UppaalParser.TypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecl(UppaalParser.TypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(UppaalParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(UppaalParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#funcParameters}.
	 * @param ctx the parse tree
	 */
	void enterFuncParameters(UppaalParser.FuncParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#funcParameters}.
	 * @param ctx the parse tree
	 */
	void exitFuncParameters(UppaalParser.FuncParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#funcParameter}.
	 * @param ctx the parse tree
	 */
	void enterFuncParameter(UppaalParser.FuncParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#funcParameter}.
	 * @param ctx the parse tree
	 */
	void exitFuncParameter(UppaalParser.FuncParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(UppaalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(UppaalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(UppaalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(UppaalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(UppaalParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(UppaalParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#iteration}.
	 * @param ctx the parse tree
	 */
	void enterIteration(UppaalParser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#iteration}.
	 * @param ctx the parse tree
	 */
	void exitIteration(UppaalParser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(UppaalParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(UppaalParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(UppaalParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(UppaalParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(UppaalParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(UppaalParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(UppaalParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(UppaalParser.Return_statementContext ctx);
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
	 * Enter a parse tree produced by {@link UppaalParser#branchpoint}.
	 * @param ctx the parse tree
	 */
	void enterBranchpoint(UppaalParser.BranchpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#branchpoint}.
	 * @param ctx the parse tree
	 */
	void exitBranchpoint(UppaalParser.BranchpointContext ctx);
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
	 * Enter a parse tree produced by the {@code LabelTransGuard}
	 * labeled alternative in {@link UppaalParser#label_trans}.
	 * @param ctx the parse tree
	 */
	void enterLabelTransGuard(UppaalParser.LabelTransGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LabelTransGuard}
	 * labeled alternative in {@link UppaalParser#label_trans}.
	 * @param ctx the parse tree
	 */
	void exitLabelTransGuard(UppaalParser.LabelTransGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelTrans}
	 * labeled alternative in {@link UppaalParser#label_trans}.
	 * @param ctx the parse tree
	 */
	void enterLabelTrans(UppaalParser.LabelTransContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelTrans}
	 * labeled alternative in {@link UppaalParser#label_trans}.
	 * @param ctx the parse tree
	 */
	void exitLabelTrans(UppaalParser.LabelTransContext ctx);
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
	 * Enter a parse tree produced by the {@code StopWatchGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterStopWatchGuard(UppaalParser.StopWatchGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StopWatchGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitStopWatchGuard(UppaalParser.StopWatchGuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayGuard(UppaalParser.ArrayGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayGuard(UppaalParser.ArrayGuardContext ctx);
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
	 * Enter a parse tree produced by the {@code DoubleGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void enterDoubleGuard(UppaalParser.DoubleGuardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleGuard}
	 * labeled alternative in {@link UppaalParser#guard_expr}.
	 * @param ctx the parse tree
	 */
	void exitDoubleGuard(UppaalParser.DoubleGuardContext ctx);
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
	 * Enter a parse tree produced by {@link UppaalParser#guard_arguments}.
	 * @param ctx the parse tree
	 */
	void enterGuard_arguments(UppaalParser.Guard_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#guard_arguments}.
	 * @param ctx the parse tree
	 */
	void exitGuard_arguments(UppaalParser.Guard_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#guard_type}.
	 * @param ctx the parse tree
	 */
	void enterGuard_type(UppaalParser.Guard_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#guard_type}.
	 * @param ctx the parse tree
	 */
	void exitGuard_type(UppaalParser.Guard_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GuardTypeInt}
	 * labeled alternative in {@link UppaalParser#guard_typeId}.
	 * @param ctx the parse tree
	 */
	void enterGuardTypeInt(UppaalParser.GuardTypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GuardTypeInt}
	 * labeled alternative in {@link UppaalParser#guard_typeId}.
	 * @param ctx the parse tree
	 */
	void exitGuardTypeInt(UppaalParser.GuardTypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GuardTypeIntDomain}
	 * labeled alternative in {@link UppaalParser#guard_typeId}.
	 * @param ctx the parse tree
	 */
	void enterGuardTypeIntDomain(UppaalParser.GuardTypeIntDomainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GuardTypeIntDomain}
	 * labeled alternative in {@link UppaalParser#guard_typeId}.
	 * @param ctx the parse tree
	 */
	void exitGuardTypeIntDomain(UppaalParser.GuardTypeIntDomainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GuardTypeScalar}
	 * labeled alternative in {@link UppaalParser#guard_typeId}.
	 * @param ctx the parse tree
	 */
	void enterGuardTypeScalar(UppaalParser.GuardTypeScalarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GuardTypeScalar}
	 * labeled alternative in {@link UppaalParser#guard_typeId}.
	 * @param ctx the parse tree
	 */
	void exitGuardTypeScalar(UppaalParser.GuardTypeScalarContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link UppaalParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(UppaalParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(UppaalParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(UppaalParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(UppaalParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link UppaalParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(UppaalParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UppaalParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(UppaalParser.CommentContext ctx);
}
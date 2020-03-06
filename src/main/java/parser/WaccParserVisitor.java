// Generated from WaccParser.g4 by ANTLR 4.7.1

    package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WaccParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WaccParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WaccParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(WaccParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(WaccParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(WaccParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatPrintln}
	 * labeled alternative in {@link WaccParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatPrintln(WaccParser.StatPrintlnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatRead}
	 * labeled alternative in {@link WaccParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatRead(WaccParser.StatReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatCond}
	 * labeled alternative in {@link WaccParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatCond(WaccParser.StatCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatAssignVar}
	 * labeled alternative in {@link WaccParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAssignVar(WaccParser.StatAssignVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatExit}
	 * labeled alternative in {@link WaccParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatExit(WaccParser.StatExitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatReturn}
	 * labeled alternative in {@link WaccParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatReturn(WaccParser.StatReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatBegin}
	 * labeled alternative in {@link WaccParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatBegin(WaccParser.StatBeginContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatSkip}
	 * labeled alternative in {@link WaccParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatSkip(WaccParser.StatSkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatLoop}
	 * labeled alternative in {@link WaccParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatLoop(WaccParser.StatLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link WaccParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatPrint(WaccParser.StatPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatCompose}
	 * labeled alternative in {@link WaccParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatCompose(WaccParser.StatComposeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatInitVar}
	 * labeled alternative in {@link WaccParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatInitVar(WaccParser.StatInitVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatFree}
	 * labeled alternative in {@link WaccParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatFree(WaccParser.StatFreeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#assignLhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignLhs(WaccParser.AssignLhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#assignRhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignRhs(WaccParser.AssignRhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#arrayLiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiter(WaccParser.ArrayLiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(WaccParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#newpair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewpair(WaccParser.NewpairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnaryOp}
	 * labeled alternative in {@link WaccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnaryOp(WaccParser.ExprUnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMulDivMod}
	 * labeled alternative in {@link WaccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDivMod(WaccParser.ExprMulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCharLit}
	 * labeled alternative in {@link WaccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCharLit(WaccParser.ExprCharLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIntLit}
	 * labeled alternative in {@link WaccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIntLit(WaccParser.ExprIntLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBoolLit}
	 * labeled alternative in {@link WaccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolLit(WaccParser.ExprBoolLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link WaccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(WaccParser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCmp}
	 * labeled alternative in {@link WaccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCmp(WaccParser.ExprCmpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAndOr}
	 * labeled alternative in {@link WaccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAndOr(WaccParser.ExprAndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIdent}
	 * labeled alternative in {@link WaccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIdent(WaccParser.ExprIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprEq}
	 * labeled alternative in {@link WaccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEq(WaccParser.ExprEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link WaccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(WaccParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPairLit}
	 * labeled alternative in {@link WaccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPairLit(WaccParser.ExprPairLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprArrElem}
	 * labeled alternative in {@link WaccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArrElem(WaccParser.ExprArrElemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStrLit}
	 * labeled alternative in {@link WaccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStrLit(WaccParser.ExprStrLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(WaccParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(WaccParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(WaccParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#pairType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairType(WaccParser.PairTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#pairElemType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairElemType(WaccParser.PairElemTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#arrayElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElem(WaccParser.ArrayElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(WaccParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#pairFst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairFst(WaccParser.PairFstContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#pairSnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairSnd(WaccParser.PairSndContext ctx);
}
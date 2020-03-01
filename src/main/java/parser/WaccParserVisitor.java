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
	 * Visit a parse tree produced by {@link WaccParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(WaccParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#statSkip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatSkip(WaccParser.StatSkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#statInitVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatInitVar(WaccParser.StatInitVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#statAssignVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAssignVar(WaccParser.StatAssignVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#statRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatRead(WaccParser.StatReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#statFree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatFree(WaccParser.StatFreeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#statReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatReturn(WaccParser.StatReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#statExit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatExit(WaccParser.StatExitContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#statPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatPrint(WaccParser.StatPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#statPrintln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatPrintln(WaccParser.StatPrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#statCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatCond(WaccParser.StatCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#statLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatLoop(WaccParser.StatLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#statBegin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatBegin(WaccParser.StatBeginContext ctx);
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
	 * Visit a parse tree produced by {@link WaccParser#pairElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairElem(WaccParser.PairElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#pairElemFst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairElemFst(WaccParser.PairElemFstContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#pairElemSnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairElemSnd(WaccParser.PairElemSndContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(WaccParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#exprIntLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIntLit(WaccParser.ExprIntLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#exprBoolLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolLit(WaccParser.ExprBoolLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#exprCharLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCharLit(WaccParser.ExprCharLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#exprStrLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStrLit(WaccParser.ExprStrLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#exprPairLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPairLit(WaccParser.ExprPairLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#exprParen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(WaccParser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#exprUnop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnop(WaccParser.ExprUnopContext ctx);
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
	 * Visit a parse tree produced by {@link WaccParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(WaccParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#arrayElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElem(WaccParser.ArrayElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#intLiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiter(WaccParser.IntLiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#arrayLiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiter(WaccParser.ArrayLiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link WaccParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(WaccParser.IdentContext ctx);
}
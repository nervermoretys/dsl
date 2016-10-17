// Generated from /Users/yangyongli/Projects/dsl/src/main/java/com/avon/hr/expression/accounting/Accounting.g4 by ANTLR 4.5.3
package com.avon.hr.expression.accounting;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AccountingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AccountingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AccountingParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(AccountingParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AccountingParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(AccountingParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AccountingParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AccountingParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AccountingParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(AccountingParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelseStatement}
	 * labeled alternative in {@link AccountingParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelseStatement(AccountingParser.IfelseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link AccountingParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(AccountingParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link AccountingParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AccountingParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link AccountingParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(AccountingParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link AccountingParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(AccountingParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AccountingParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(AccountingParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AccountingParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(AccountingParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link AccountingParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(AccountingParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AccountingParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(AccountingParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AccountingParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(AccountingParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AccountingParser#judgeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgeExpression(AccountingParser.JudgeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignVariable}
	 * labeled alternative in {@link AccountingParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVariable(AccountingParser.AssignVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singlePlusOrMinus}
	 * labeled alternative in {@link AccountingParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglePlusOrMinus(AccountingParser.SinglePlusOrMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusOrMinus}
	 * labeled alternative in {@link AccountingParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOrMinus(AccountingParser.PlusOrMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleTimesOrDiv}
	 * labeled alternative in {@link AccountingParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTimesOrDiv(AccountingParser.SingleTimesOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timesOrDiv}
	 * labeled alternative in {@link AccountingParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesOrDiv(AccountingParser.TimesOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomNumber}
	 * labeled alternative in {@link AccountingParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumber(AccountingParser.AtomNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomVariable}
	 * labeled alternative in {@link AccountingParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomVariable(AccountingParser.AtomVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link AccountingParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(AccountingParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomFunction}
	 * labeled alternative in {@link AccountingParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomFunction(AccountingParser.AtomFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outerFunctionExpression}
	 * labeled alternative in {@link AccountingParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterFunctionExpression(AccountingParser.OuterFunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AccountingParser#funcExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpression(AccountingParser.FuncExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AccountingParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(AccountingParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AccountingParser#outerFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterFunction(AccountingParser.OuterFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AccountingParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AccountingParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AccountingParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(AccountingParser.IdentifierContext ctx);
}
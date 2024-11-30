// Generated from C:/Users/yunus/Desktop/my_files/ITMO/1_st_year/1_st_semester/Programming languages/ANTLR-grammar/src/main/antlr4/Baru.g4 by ANTLR 4.13.2

package org.example.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BaruParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BaruVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BaruParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BaruParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaruParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(BaruParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(BaruParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpr(BaruParser.LogicalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(BaruParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpr(BaruParser.PlusMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(BaruParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpr(BaruParser.ParenthesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(BaruParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(BaruParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(BaruParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaruParser#compOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOperator(BaruParser.CompOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaruParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(BaruParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaruParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(BaruParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaruParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(BaruParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaruParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(BaruParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaruParser#elifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifstmt(BaruParser.ElifstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaruParser#elsestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsestmt(BaruParser.ElsestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaruParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(BaruParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaruParser#forstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt(BaruParser.ForstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaruParser#varDeclFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclFor(BaruParser.VarDeclForContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaruParser#assignmentFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentFor(BaruParser.AssignmentForContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaruParser#blockstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockstmt(BaruParser.BlockstmtContext ctx);
}
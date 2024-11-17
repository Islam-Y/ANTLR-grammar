// Generated from C:/Users/yunus/Desktop/my_files/ITMO/1_st_year/1_st_semester/Programming languages/lab/ANTLR-grammar/src/main/antlr4/AntlrProject.g4 by ANTLR 4.13.2

package org.example.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AntlrProjectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AntlrProjectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AntlrProjectParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(AntlrProjectParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(AntlrProjectParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpr(AntlrProjectParser.LogicalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(AntlrProjectParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpr(AntlrProjectParser.PlusMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(AntlrProjectParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpr(AntlrProjectParser.ParenthesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(AntlrProjectParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(AntlrProjectParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(AntlrProjectParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#compOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOperator(AntlrProjectParser.CompOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(AntlrProjectParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AntlrProjectParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(AntlrProjectParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(AntlrProjectParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#elifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifstmt(AntlrProjectParser.ElifstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#elsestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsestmt(AntlrProjectParser.ElsestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(AntlrProjectParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#forstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt(AntlrProjectParser.ForstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#varDeclFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclFor(AntlrProjectParser.VarDeclForContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#assignmentFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentFor(AntlrProjectParser.AssignmentForContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrProjectParser#blockstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockstmt(AntlrProjectParser.BlockstmtContext ctx);
}
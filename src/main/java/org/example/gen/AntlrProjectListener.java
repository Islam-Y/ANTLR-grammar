// Generated from C:/Users/yunus/Desktop/my_files/ITMO/1_st_year/1_st_semester/Programming languages/lab/antlr/src/main/antlr4/AntlrProject.g4 by ANTLR 4.13.2

package org.example.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AntlrProjectParser}.
 */
public interface AntlrProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AntlrProjectParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AntlrProjectParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(AntlrProjectParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(AntlrProjectParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(AntlrProjectParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(AntlrProjectParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(AntlrProjectParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(AntlrProjectParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(AntlrProjectParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(AntlrProjectParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpr(AntlrProjectParser.PlusMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpr(AntlrProjectParser.PlusMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(AntlrProjectParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(AntlrProjectParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpr(AntlrProjectParser.ParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpr(AntlrProjectParser.ParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(AntlrProjectParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(AntlrProjectParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(AntlrProjectParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(AntlrProjectParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(AntlrProjectParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link AntlrProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(AntlrProjectParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#compOperator}.
	 * @param ctx the parse tree
	 */
	void enterCompOperator(AntlrProjectParser.CompOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#compOperator}.
	 * @param ctx the parse tree
	 */
	void exitCompOperator(AntlrProjectParser.CompOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(AntlrProjectParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(AntlrProjectParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AntlrProjectParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AntlrProjectParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(AntlrProjectParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(AntlrProjectParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(AntlrProjectParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(AntlrProjectParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#elifstmt}.
	 * @param ctx the parse tree
	 */
	void enterElifstmt(AntlrProjectParser.ElifstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#elifstmt}.
	 * @param ctx the parse tree
	 */
	void exitElifstmt(AntlrProjectParser.ElifstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void enterElsestmt(AntlrProjectParser.ElsestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void exitElsestmt(AntlrProjectParser.ElsestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(AntlrProjectParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(AntlrProjectParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(AntlrProjectParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(AntlrProjectParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrProjectParser#blockstmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockstmt(AntlrProjectParser.BlockstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrProjectParser#blockstmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockstmt(AntlrProjectParser.BlockstmtContext ctx);
}
// Generated from C:/Users/yunus/Desktop/my_files/ITMO/1_st_year/1_st_semester/Programming languages/ANTLR-grammar/src/main/antlr4/Baru.g4 by ANTLR 4.13.2

package org.example.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BaruParser}.
 */
public interface BaruListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BaruParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BaruParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaruParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BaruParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaruParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(BaruParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaruParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(BaruParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(BaruParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(BaruParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(BaruParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(BaruParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(BaruParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(BaruParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpr(BaruParser.PlusMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpr(BaruParser.PlusMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(BaruParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(BaruParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpr(BaruParser.ParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpr(BaruParser.ParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(BaruParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(BaruParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(BaruParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(BaruParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(BaruParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link BaruParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(BaruParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaruParser#compOperator}.
	 * @param ctx the parse tree
	 */
	void enterCompOperator(BaruParser.CompOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaruParser#compOperator}.
	 * @param ctx the parse tree
	 */
	void exitCompOperator(BaruParser.CompOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaruParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(BaruParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaruParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(BaruParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaruParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(BaruParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaruParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(BaruParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaruParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(BaruParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaruParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(BaruParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaruParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(BaruParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaruParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(BaruParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaruParser#elifstmt}.
	 * @param ctx the parse tree
	 */
	void enterElifstmt(BaruParser.ElifstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaruParser#elifstmt}.
	 * @param ctx the parse tree
	 */
	void exitElifstmt(BaruParser.ElifstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaruParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void enterElsestmt(BaruParser.ElsestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaruParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void exitElsestmt(BaruParser.ElsestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaruParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(BaruParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaruParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(BaruParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaruParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(BaruParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaruParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(BaruParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaruParser#varDeclFor}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclFor(BaruParser.VarDeclForContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaruParser#varDeclFor}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclFor(BaruParser.VarDeclForContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaruParser#assignmentFor}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentFor(BaruParser.AssignmentForContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaruParser#assignmentFor}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentFor(BaruParser.AssignmentForContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaruParser#blockstmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockstmt(BaruParser.BlockstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaruParser#blockstmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockstmt(BaruParser.BlockstmtContext ctx);
}
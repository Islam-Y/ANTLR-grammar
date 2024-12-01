package org.example.gen;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;


public class CodeGeneratorVisitor extends AbstractParseTreeVisitor<String> implements BaruVisitor<String> {
    private int tempCount = 0;
    private int labelCount = 0;

    // Генерация новой временной переменной
    private String newTemp() {
        return "t" + (tempCount++);
    }

    // Генерация новой метки
    private String newLabel() {
        return "L" + (labelCount++);
    }

    // Обработка программы
    @Override
    public String visitProgram(BaruParser.ProgramContext ctx) {
        StringBuilder code = new StringBuilder();
        for (BaruParser.StmtContext stmt : ctx.stmt()) {
            code.append(visit(stmt)).append("\n");
        }
        return code.toString();
    }

    // Обработка утверждений
    @Override
    public String visitStmt(BaruParser.StmtContext ctx) {
        if (ctx.varDecl() != null) return visit(ctx.varDecl());
        if (ctx.assignment() != null) return visit(ctx.assignment());
        if (ctx.print() != null) return visit(ctx.print());
        if (ctx.ifstmt() != null) return visit(ctx.ifstmt());
        if (ctx.whilestmt() != null) return visit(ctx.whilestmt());
        if (ctx.forstmt() != null) return visit(ctx.forstmt());
        if (ctx.blockstmt() != null) return visit(ctx.blockstmt());
        return "";
    }

    // Обработка выражений
    @Override
    public String visitPlusMinusExpr(BaruParser.PlusMinusExprContext ctx) {
        String left = visit(ctx.left);  // Обрабатываем левую часть выражения
        String right = visit(ctx.right);  // Обрабатываем правую часть выражения
        String temp = newTemp();  // Создаём новую временную переменную
        // Генерируем код для операции
        return temp + " = " + left + " " + ctx.op.getText() + " " + right;
    }

    @Override
    public String visitMulDivExpr(BaruParser.MulDivExprContext ctx) {
        String left = visit(ctx.left);
        String right = visit(ctx.right);
        String temp = newTemp();
        return temp + " = " + left + " " + ctx.op.getText() + " " + right;
    }

    @Override
    public String visitLogicalExpr(BaruParser.LogicalExprContext ctx) {
        String left = visit(ctx.left);
        String right = visit(ctx.right);
        String temp = newTemp();
        return temp + " = " + left + " " + ctx.op.getText() + " " + right;
    }

    @Override
    public String visitCompExpr(BaruParser.CompExprContext ctx) {
        String left = visit(ctx.left);
        String right = visit(ctx.right);
        String temp = newTemp();
        return temp + " = " + left + " " + ctx.compOperator().getText() + " " + right;
    }

    @Override
    public String visitBoolExpr(BaruParser.BoolExprContext ctx) {
        return ctx.BOOL().getText();  // Булевое значение
    }

    @Override
    public String visitStringExpr(BaruParser.StringExprContext ctx) {
        return ctx.STRING().getText();  // Строка
    }

    @Override
    public String visitParenthesisExpr(BaruParser.ParenthesisExprContext ctx) {
        return visit(ctx.expr());  // Просто возвращаем результат внутри скобок
    }

    @Override
    public String visitNumExpr(BaruParser.NumExprContext ctx) {
        return ctx.NUM().getText();  // Число в выражении
    }

    @Override
    public String visitIdExpr(BaruParser.IdExprContext ctx) {
        return ctx.ID().getText();  // Идентификатор в выражении
    }

    // Обработка оператора сравнения
    @Override
    public String visitCompOperator(BaruParser.CompOperatorContext ctx) {
        return ctx.op.getText();
    }

    // Обработка объявления переменной
    @Override
    public String visitVarDecl(BaruParser.VarDeclContext ctx) {
        String varName = ctx.ID().getText();
        String expr = ctx.expr() != null ? visit(ctx.expr()) : "null";
        return "var " + varName + " = " + expr;
    }

    // Обработка присваивания
    @Override
    public String visitAssignment(BaruParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        String expr = visit(ctx.expr());
        return id + " = " + expr;
    }

    // Обработка оператора печати
    @Override
    public String visitPrint(BaruParser.PrintContext ctx) {
        return "print " + visit(ctx.expr());
    }

    // Обработка условных операторов
    @Override
    public String visitIfstmt(BaruParser.IfstmtContext ctx) {
        String condition = visit(ctx.expr());
        String startLabel = newLabel();
        String endLabel = newLabel();

        StringBuilder code = new StringBuilder();
        code.append(startLabel).append(": ").append("if " + condition + " goto " + endLabel + "\n");
        code.append(visit(ctx.stmt()));
        if (ctx.elsestmt() != null) {
            code.append("goto " + newLabel() + "\n");
            code.append(endLabel).append(":");
        } else {
            code.append(endLabel).append(":");
        }
        return code.toString();
    }

    @Override
    public String visitElifstmt(BaruParser.ElifstmtContext ctx) {
        return visit(ctx.stmt());
    }

    @Override
    public String visitElsestmt(BaruParser.ElsestmtContext ctx) {
        return visit(ctx.stmt());
    }

    // Обработка оператора while
    @Override
    public String visitWhilestmt(BaruParser.WhilestmtContext ctx) {
        String condition = visit(ctx.expr());
        String startLabel = newLabel();
        String endLabel = newLabel();

        StringBuilder code = new StringBuilder();
        code.append(startLabel).append(": ");
        code.append("if " + condition + " goto " + endLabel + "\n");
        code.append(visit(ctx.stmt()));
        code.append("goto " + startLabel + "\n");
        code.append(endLabel).append(":");

        return code.toString();
    }

    // Обработка оператора for
    @Override
    public String visitForstmt(BaruParser.ForstmtContext ctx) {
        String condition = visit(ctx.expr());
        String startLabel = newLabel();
        String endLabel = newLabel();

        StringBuilder code = new StringBuilder();
        code.append(startLabel).append(": ");
        code.append("if " + condition + " goto " + endLabel + "\n");
        code.append(visit(ctx.stmt()));
        code.append("goto " + startLabel + "\n");
        code.append(endLabel).append(":");

        return code.toString();
    }

    @Override
    public String visitVarDeclFor(BaruParser.VarDeclForContext ctx) {
        String varName = ctx.ID().getText();  // Получаем имя переменной
        String expr = ctx.expr() != null ? visit(ctx.expr()) : "null";  // Если есть выражение, обрабатываем его
        return "var " + varName + " = " + expr;  // Возвращаем строку с трёхадресным кодом для объявления
    }


    @Override
    public String visitAssignmentFor(BaruParser.AssignmentForContext ctx) {
        String varName = ctx.ID().getText();  // Получаем имя переменной
        String expr = visit(ctx.expr());  // Обрабатываем выражение, которое будет присвоено
        return varName + " = " + expr;  // Возвращаем строку с трёхадресным кодом для присваивания
    }


    // Обработка блока
    @Override
    public String visitBlockstmt(BaruParser.BlockstmtContext ctx) {
        StringBuilder code = new StringBuilder();
        for (BaruParser.StmtContext stmt : ctx.stmt()) {
            code.append(visit(stmt)).append("\n");
        }
        return code.toString();
    }
}

//public class CodeGeneratorVisitor  {
//
//}
package org.example.gen;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;


public class CodeGeneratorVisitor extends AbstractParseTreeVisitor<String> implements BaruVisitor<String> {

    private int tempCount = 0;
    private int labelCount = 1;

    // Генерация новой временной переменной
    private String newTemp() {
        return "t" + (++tempCount);
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
        // Генерируем код для операции
        return left + " " + ctx.op.getText() + " " + right;
    }

    @Override
    public String visitMulDivExpr(BaruParser.MulDivExprContext ctx) {
        String left = visit(ctx.left);
        String right = visit(ctx.right);
        return left + " " + ctx.op.getText() + " " + right;
    }

    @Override
    public String visitLogicalExpr(BaruParser.LogicalExprContext ctx) {
        String left = visit(ctx.left);
        String right = visit(ctx.right);
        return left + " " + ctx.op.getText() + " " + right;
    }

    @Override
    public String visitCompExpr(BaruParser.CompExprContext ctx) {
        String left = visit(ctx.left);
        String right = visit(ctx.right);
        return left + " " + ctx.compOperator().getText() + " " + right;
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
//        return "print " + visit(ctx.expr());

        StringBuilder code = new StringBuilder();
        // Получаем выражение для печати
        BaruParser.ExprContext exprCtx = ctx.expr();

        if (exprCtx instanceof BaruParser.PlusMinusExprContext plusMinusCtx) {
            // Если это выражение с оператором +, обрабатываем левую и правую части

            // Обработка левой части
            String left = visit(plusMinusCtx.left); // Например, "Result is: "
            String tempLeft = newTemp();
            code.append(tempLeft).append(" = ").append(left).append("\n");

            // Обработка правой части
            String right = visit(plusMinusCtx.right); // Например, result
            String tempRight = newTemp();
            code.append(tempRight).append(" = ").append(tempLeft).append(" + ").append(right).append("\n");

            // Конкатенация
//            String tempConcat = newTemp();
//            code.append(tempConcat).append(" = ").append(tempLeft).append(" + ").append(tempRight).append("\n");

            // Печать результата
            code.append("print ").append(tempRight);
        } else {
            // Если это не бинарное выражение, просто выводим результат
            String expr = visit(exprCtx);
            code.append("print ").append(expr);
        }
        return code.toString();
    }

    // Обработка условных операторов
    @Override
    public String visitIfstmt(BaruParser.IfstmtContext ctx) {
        StringBuilder code = new StringBuilder();
        String condition = visit(ctx.expr()); // Генерация кода условия (включая t0 = x < y)
        String ifResult = visit(ctx.stmt());
        String elifResult = "";
        String elseResult;

        String label1 = newLabel();
        String label2 = newLabel();
        String label3 = newLabel();

        // Добавляем код условия
        code.append("t").append(tempCount).append(" = ").append(condition).append("\n");
        code.append("if ").append("t").append(tempCount).append(" goto ").append(label1).append("\n");

        for (BaruParser.ElifstmtContext elifCtx : ctx.elifstmt()) {
            String elifCondition = visit(elifCtx.expr()); // Получаем условие elif
            elifResult = visit(elifCtx.stmt());
            String tempElif = newTemp();
            code.append(tempElif).append(" = ").append(elifCondition).append("\n");

            // Генерация кода для условия elif
            code.append("if ").append("t").append(tempCount).append(" goto ").append(label2).append("\n");

            visit(elifCtx.stmt()); // Обрабатываем тело elif
        }

        // Обрабатываем else, если он есть
        if (ctx.elsestmt() != null) {
            elseResult = visit(ctx.elsestmt());
            code.append(elseResult);
            code.append("goto ").append(label3).append("\n");
        } else {
           code.append(label3).append(":").append("\n"); // Метка конца конструкции
        }

        code.append(label1).append(": ").append(ifResult);
        code.append("goto ").append(label3).append("\n");
        code.append(label2).append(": ").append(elifResult);
        code.append(label3).append(":");

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
        String temp1 = newTemp();

        return startLabel + ": " +
                temp1 + " = " + condition + "\n" +
                "if not " + temp1 + " goto " + endLabel + "\n" +
                visit(ctx.stmt()) +
                "goto " + startLabel + "\n" +
                endLabel + ":";
    }

    // Обработка оператора for
    @Override
    public String visitForstmt(BaruParser.ForstmtContext ctx) {
        StringBuilder code = new StringBuilder();

        // Обрабатываем инициализацию переменной (var i = 0)
        String initialization = visit(ctx.varDeclFor());
        code.append(initialization).append("\n");

        String startLabel = newLabel();
        String endLabel = newLabel();

        code.append(startLabel).append(": ");

        // Обрабатываем условие (i < 5)
        String condition = visit(ctx.expr()); // Условие (i < 5)
        String tempCondition = newTemp();    // Временная переменная для хранения результата условия
        code.append(tempCondition).append(" = ").append(condition).append("\n");
        code.append("if not ").append(tempCondition).append(" goto ").append(endLabel).append("\n");

        // Обрабатываем тело цикла (print("Loop iteration: " + i))
        code.append(visit(ctx.stmt()));

        // Обрабатываем шаг (i = i + 1)
        String update = visit(ctx.assignmentFor(0));
        code.append(update).append("\n");

        // Переход к началу цикла
        code.append("goto ").append(startLabel).append("\n");

        // Метка конца цикла
        code.append(endLabel).append(":\n");

        return code.toString();
    }

    @Override
    public String visitVarDeclFor(BaruParser.VarDeclForContext ctx) {
        String varName = ctx.ID().getText();  // Получаем имя переменной
        String expr = ctx.expr() != null ? visit(ctx.expr()) : "null";  // Если есть выражение, обрабатываем его
        return varName + " = " + expr;  // Возвращаем строку с трёхадресным кодом для объявления
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

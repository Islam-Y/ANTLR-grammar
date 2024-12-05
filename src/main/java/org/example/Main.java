package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.example.gen.BaruLexer;
import org.example.gen.BaruParser;
import org.example.gen.CodeGeneratorVisitor;

public class Main {
    public static void main(String[] args) {
        String code = """
                var x = 10;
                var y = 20;
                var result = 0;
                var bool = true;
                var string = "string";
                
                if (x < y) {
                    result = x + y;
                } elif (x == y) {
                    result = 0;
                } else {
                    result = x - y;
                }

                print("Result is: " + result);

                while (x > 0) {
                    print(x);
                    x = x - 1;
                }

                for (var i = 0; i < 5; i = i + 1) {
                    print("Loop iteration: " + i);
                }

                """;
//        BaruLexer lexer = new BaruLexer(CharStreams.fromString(code));
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        BaruParser parser = new BaruParser(tokens);
//        ParseTree tree = parser.program();
//        System.out.println(tree.toStringTree(parser));

        // Создаем CharStream
        CharStream input = CharStreams.fromString(code);


        BaruLexer lexer = new BaruLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Создаем парсер
        BaruParser parser = new BaruParser(tokens);

        // Начинаем парсинг с главной точки входа (например, program)
        BaruParser.ProgramContext tree = parser.program();

        // Создаем экземпляр визитора
        CodeGeneratorVisitor visitor = new CodeGeneratorVisitor();

        // Получаем трёхадресный код
        String threeAddressCode = visitor.visit(tree);

        // Выводим результат
        System.out.println(threeAddressCode);

    }
}
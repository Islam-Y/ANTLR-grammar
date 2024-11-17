package org.example;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.gen.AntlrProjectLexer;
import org.example.gen.AntlrProjectParser;

public class Main {
    public static void main(String[] args) {
        String code = """
                var x = 10;
                var y = 20;
                var result;

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
        AntlrProjectLexer lexer = new AntlrProjectLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AntlrProjectParser parser = new AntlrProjectParser(tokens);
        ParseTree tree = parser.program();
        System.out.println(tree.toStringTree(parser));

    }
}
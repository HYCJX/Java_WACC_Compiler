import errors_exceptions.error_handler.ErrorHandler_Recovery;
import main.front_end.Syntax_BuildAST_Visitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import parser.WaccLexer;
import parser.WaccParser;

import static org.junit.Assert.assertEquals;

public class BuildASTTest {

  @Test
  public void validExpression() {
    // Priority check:
    assertEquals(
        "Program: {\n"
            + "Functions: {\n"
            + "}\n"
            + "Statement: {\n"
            + "int x = 2;\n"
            + "int y = 4;\n"
            + "bool b = (x == y)}\n"
            + "}",
        getProgram("begin int x = 2 ; int y = 4 ; bool b = x == y end"));
    assertEquals(
        "Program: {\n"
            + "Functions: {\n"
            + "}\n"
            + "Statement: {\n"
            + "int x = (((1 + 2) + 3) - (((1 + 2) * (1 - (3 / 5))) / ((2 * (18 - 17)) + (((3 * 4) / 4) + 6))));\n"
            + "exit x}\n"
            + "}",
        getProgram(
            "begin int x = (1 + 2 + 3) - (1 + 2) * (1 - 3 / 5) / (2 * (18 - 17) + (3 * 4 / 4 + 6)); exit x end"));
    // Operator and sign:
    assertEquals(
        "Program: {\n" + "Functions: {\n" + "}\n" + "Statement: {\n" + "println (1 - -2)}\n" + "}",
        getProgram("begin println 1 - -2 end"));
    assertEquals(
        "Program: {\n" + "Functions: {\n" + "}\n" + "Statement: {\n" + "println (1 - 2)}\n" + "}",
        getProgram("begin println 1 - +2 end"));
    assertEquals(
        "Program: {\n"
            + "Functions: {\n"
            + "}\n"
            + "Statement: {\n"
            + "int x = -4;\n"
            + "int y = 2;\n"
            + "println (x / y)}\n"
            + "}",
        getProgram("begin int x = -4; int y = 2; println x / y end"));
  }

    private String getProgram(String prog) {
        WaccLexer lexer = new WaccLexer(CharStreams.fromString(prog));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WaccParser parser = new WaccParser(tokens);
        parser.setBuildParseTree(true);
        Syntax_BuildAST_Visitor visitor = new Syntax_BuildAST_Visitor(new ErrorHandler_Recovery(100));
        return (visitor.visitProg(parser.prog()).print());
    }

}

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
  public void validArray() {
    // Basic array declaration and assignment:
    assertEquals(
        "Program: {\n" + "Functions: {\n" + "}\n" + "Statement: {\n" + "int[] a = [0]}\n" + "}",
        getProgram("begin int[] a = [0] end"));
    // Empty array:
    assertEquals(
        "Program: {\n" + "Functions: {\n" + "}\n" + "Statement: {\n" + "int[] a = []}\n" + "}",
        getProgram("begin int[] a = [] end"));
    // Length:
    assertEquals(
        "Program: {\n"
            + "Functions: {\n"
            + "}\n"
            + "Statement: {\n"
            + "int[] a = [43,2,18,1];\n"
            + "println len a}\n"
            + "}",
        getProgram("begin int[] a = [43, 2, 18, 1] ; println len a end"));
    // Look up:
    assertEquals(
        "Program: {\n"
            + "Functions: {\n"
            + "}\n"
            + "Statement: {\n"
            + "int[] a = [43,2,18,1];\n"
            + "println a[0]}\n"
            + "}",
        getProgram("begin int[] a = [43, 2, 18, 1] ; println a[0] end"));
    // Nested:
    assertEquals(
        "Program: {\n"
            + "Functions: {\n"
            + "}\n"
            + "Statement: {\n"
            + "int[] a = [1,2,3];\n"
            + "int[] b = [3,4];\n"
            + "int[][] c = [a,b];\n"
            + "println c[0][2];\n"
            + "println c[1][0]}\n"
            + "}",
        getProgram(
            "begin\n int[] a = [1,2,3];\n int[] b = [3,4];\n int[][] c = [a,b];\n println c[0][2];\n println c[1][0]\nend"));
  }

  @Test
  public void validBasicExit() {
    assertEquals(
        "Program: {\n" + "Functions: {\n" + "}\n" + "Statement: {\n" + "exit -1}\n" + "}",
        getProgram("begin exit -1 end"));
  }

  @Test
  public void validBasicSkip() {
    // Comment:
    assertEquals(
        "Program: {\n" + "Functions: {\n" + "}\n" + "Statement: {\n" + "Skip}\n" + "}",
        getProgram("begin # I can write stuff on a comment line\n skip end"));
    // Skip:
    assertEquals(
        "Program: {\n" + "Functions: {\n" + "}\n" + "Statement: {\n" + "Skip}\n" + "}",
        getProgram("begin skip end"));
  }

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

  @Test
  public void validFunction() {
    assertEquals(
            "Program: {\n"
                    + "Functions: {\n"
                    + "int f()\n"
                    + "{return 0}\n"
                    + "}\n"
                    + "Statement: {\n"
                    + "Skip}\n"
                    + "}",
            getProgram("begin int f() is return 0 end skip end"));
    assertEquals(
            "Program: {\n"
                    + "Functions: {\n"
                    + "int f()\n"
                    + "{return 0}\n"
                    + "}\n"
                    + "Statement: {\n"
                    + "int x = call f();\n"
                    + "println x}\n"
                    + "}",
            getProgram("begin int f() is return 0 end int x = call f() ; println x end"));
  }

  @Test
  public void validCondition() {
    // Basic:
    assertEquals(
            "Program: {\n"
                    + "Functions: {\n"
                    + "}\n"
                    + "Statement: {\n"
                    + "if true then {\n"
                    + "Skip\n"
                    + "} else {\n"
                    + "Skip\n"
                    + "}}\n"
                    + "}",
            getProgram("begin if true then skip else skip fi end"));
    // White space:
    assertEquals(
            "Program: {\n"
                    + "Functions: {\n"
                    + "}\n"
                    + "Statement: {\n"
                    + "int a = 13;\n"
                    + "if (a == 13) then {\n"
                    + "a = 1\n"
                    + "} else {\n"
                    + "a = 0\n"
                    + "};\n"
                    + "println a}\n"
                    + "}",
            getProgram("begin int a=13; if a==13then a=1else a=0fi; println a end"));
  }

  @Test
  public void validIO() {
    // Print:
    assertEquals(
            "Program: {\n"
                    + "Functions: {\n"
                    + "}\n"
                    + "Statement: {\n"
                    + "print \"Hello World!\n"
                    + "\"}\n"
                    + "}",
            getProgram("begin print \"Hello World!\n\" end"));
    // Read:
    assertEquals(
            "Program: {\n"
                    + "Functions: {\n"
                    + "}\n"
                    + "Statement: {\n"
                    + "int x = 10;\n"
                    + "read x}\n"
                    + "}",
            getProgram("begin int x = 10; read x end"));
  }

  @Test
  public void validPairs() {
    // Basic:
    assertEquals(
            "Program: {\n"
                    + "Functions: {\n"
                    + "}\n"
                    + "Statement: {\n"
                    + "pair(int, int) p = newpair(10, 3)}\n"
                    + "}",
            getProgram("begin pair(int, int) p = newpair(10, 3) end"));
    // Nested:
    assertEquals(
            "Program: {\n"
                    + "Functions: {\n"
                    + "}\n"
                    + "Statement: {\n"
                    + "pair(int, int) p = newpair(10, 3);\n"
                    + "pair(int, pair(any, any)) q = newpair(1, p)}\n"
                    + "}",
            getProgram(
                    "begin pair(int, int) p = newpair(10, 3) ; pair(int, pair) q = newpair(1, p) end"));
  }

  @Test
  public void validRuntimeErr() {
    // Array index out of bounds:
    assertEquals(
            "Program: {\n"
                    + "Functions: {\n"
                    + "}\n"
                    + "Statement: {\n"
                    + "int[] a = [1,2,3];\n"
                    + "println a[3]}\n"
                    + "}",
            getProgram("begin int[] a = [1,2,3] ; println a[3] end"));
    // Null dereference:
    assertEquals(
            "Program: {\n"
                    + "Functions: {\n"
                    + "}\n"
                    + "Statement: {\n"
                    + "pair(pair(any, any), pair(any, any)) a = null;\n"
                    + "free a}\n"
                    + "}",
            getProgram("begin pair(pair, pair) a = null ; free a end"));
  }

  @Test
  public void validScope() {
    assertEquals(
            "Program: {\n"
                    + "Functions: {\n"
                    + "}\n"
                    + "Statement: {\n"
                    + "{\n"
                    + "{\n"
                    + "{\n"
                    + "{\n"
                    + "Skip\n"
                    + "}\n"
                    + "}\n"
                    + "}\n"
                    + "}}\n"
                    + "}",
            getProgram("begin begin begin begin begin skip end end end end end"));
  }

  @Test
  public void validSequence() {
    assertEquals(
            "Program: {\n"
                    + "Functions: {\n"
                    + "}\n"
                    + "Statement: {\n"
                    + "exit 42;\n"
                    + "println \"Should not print this.\"}\n"
                    + "}",
            getProgram("begin exit 42 ; println \"Should not print this.\" end"));
  }

  @Test
  public void validVariable() {
    // Leading zeros:
    assertEquals(
            "Program: {\n" + "Functions: {\n" + "}\n" + "Statement: {\n" + "int x = 5}\n" + "}",
            getProgram("begin int x = 000005 end"));
    // Empty string:
    assertEquals(
            "Program: {\n" + "Functions: {\n" + "}\n" + "Statement: {\n" + "string s = \"\"}\n" + "}",
            getProgram("begin string s = \"\" end"));
  }

  @Test
  public void validWhile() {
    assertEquals(
            "Program: {\n"
                    + "Functions: {\n"
                    + "}\n"
                    + "Statement: {\n"
                    + "while (false) {\n"
                    + "Skip\n"
                    + "};\n"
                    + "Skip}\n"
                    + "}",
            getProgram("begin while false do skip done ; skip end"));
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

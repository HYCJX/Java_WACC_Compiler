package ast.expression;

public final class StrlitExprLeaf implements ExprAST {

  private final String value;
  private final int line;
  private final int charPosition;

  public StrlitExprLeaf(String value, int line, int charPosition) {
    this.value = value;
    this.line = line;
    this.charPosition = charPosition;
  }

  public String getValue() {
    return value;
  }

  @Override
  public int getLine() {
    return line;
  }

  @Override
  public int getCharPosition() {
    return charPosition;
  }

  @Override
  public ExprToken getExprToken() {
    return ExprToken.STRLIT;
  }

  @Override
  public String print() {
    return "\"" + value + "\"";
  }
}

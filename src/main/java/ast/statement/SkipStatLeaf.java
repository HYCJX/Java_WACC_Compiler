package ast.statement;

public final class SkipStatLeaf implements StatAST {

  @Override
  public StatToken getStatToken() {
    return StatToken.SKIP;
  }

  @Override
  public String print() {
    return "Skip";
  }
}

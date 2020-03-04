package ast.statement;

import ast.expression.ExprAST;

public final class NormalStatAST implements StatAST {

  private final NormalStatToken normalStatType;
  private final ExprAST expression;

  public NormalStatAST(NormalStatToken normalStatType, ExprAST expression) {
    this.normalStatType = normalStatType;
    this.expression = expression;
  }

  public NormalStatToken getNormalStatType() {
    return normalStatType;
  }

  public ExprAST getExpression() {
    return expression;
  }

  @Override
  public StatToken getStatToken() {
    return StatToken.NORMAL;
  }

  @Override
  public String print() {
    return normalStatType + " " + expression.print();
  }
}

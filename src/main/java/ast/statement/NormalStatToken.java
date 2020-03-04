package ast.statement;

public enum NormalStatToken {
  FREE,
  RETURN,
  EXIT,
  PRINT,
  PRINTLINE;

  @Override
  public String toString() {
    return super.toString().toLowerCase();
  }
}

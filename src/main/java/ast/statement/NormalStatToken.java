package ast.statement;

public enum NormalStatToken {
  FREE,
  RETURN,
  EXIT,
  PRINT,
  PRINTLN;

  @Override
  public String toString() {
    return super.toString().toLowerCase();
  }
}

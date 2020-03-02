package ast.expression;

public final class BoollitExprLeaf implements ExprAST {

  private final boolean value;
  private final int line;
  private final int charPosition;

  public BoollitExprLeaf(boolean value, int line, int charPosition) {
    this.value = value;
    this.line = line;
    this.charPosition = charPosition;
  }

  public boolean isValue() {
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
    return ExprToken.BOOLLIT;
  }

  //  @Override
  //  public Type getExprType() {
  //    return new BoolType();
  //  }
  //
  //  @Override
  //  public void checkType(ErrorHandler errorHandler, SymbolTable symbolTable, Type type) {
  //    if (!type.getTypeToken().equals(TypeToken.BOOL) &&
  // !type.getTypeToken().equals(TypeToken.ANY)) {
  //      errorHandler.report(
  //          new IncompatibleTypeError(
  //              String.valueOf(value), line, charPosition, type.getTypeToken(), TypeToken.BOOL));
  //    }
  //  }

  //  @Override
  //  public Type exprToType(ErrorHandler errorHandler, SymbolTable symbolTable) {
  //    return new BoolType();
  //  }

  @Override
  public String print() {
    return String.valueOf(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

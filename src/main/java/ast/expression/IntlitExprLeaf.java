package ast.expression;

public final class IntlitExprLeaf implements ExprAST {

  private final int value;
  private final int line;
  private final int charPosition;

  public IntlitExprLeaf(int value, int line, int charPosition) {
    this.value = value;
    this.line = line;
    this.charPosition = charPosition;
  }

  public int getValue() {
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
    return ExprToken.INTLIT;
  }

  //    @Override
  //    public Type getExprType() {
  //        return new IntType();
  //    }
  //
  //    @Override
  //    public void checkType(ErrorHandler errorHandler, SymbolTable symbolTable, Type type) {
  //        if (!type.getTypeToken().equals(TypeToken.INT) &&
  // !type.getTypeToken().equals(TypeToken.ANY)) {
  //            errorHandler.report(
  //                    new IncompatibleTypeError(
  //                            String.valueOf(value), line, charPosition, type.getTypeToken(),
  // TypeToken.INT));
  //        }
  //    }
  //
  //    @Override
  //    public Type exprToType(ErrorHandler errorHandler, SymbolTable symbolTable) {
  //        return new IntType();
  //    }

  @Override
  public String print() {
    return String.valueOf(value);
  }
}

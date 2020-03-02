package ast.expression;

public final class CharlitExprLeaf implements ExprAST {

  private final char value;
  private final int line;
  private final int charPosition;

  public CharlitExprLeaf(char value, int line, int charPosition) {
    this.value = value;
    this.line = line;
    this.charPosition = charPosition;
  }

  public char getValue() {
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
    return ExprToken.CHARLIT;
  }

  //  @Override
  //  public Type getExprType() {
  //    return new CharType();
  //  }
  //
  //  @Override
  //  public void checkType(ErrorHandler errorHandler, SymbolTable symbolTable, Type type) {
  //    if (!type.getTypeToken().equals(TypeToken.CHAR) &&
  // !type.getTypeToken().equals(TypeToken.ANY)) {
  //      errorHandler.report(
  //          new IncompatibleTypeError(
  //              String.valueOf(value), line, charPosition, type.getTypeToken(), TypeToken.CHAR));
  //    }
  //  }
  //
  //  @Override
  //  public Type exprToType(ErrorHandler errorHandler, SymbolTable symbolTable) {
  //    return new CharType();
  //  }

  @Override
  public String print() {
    return String.valueOf(value);
  }
}

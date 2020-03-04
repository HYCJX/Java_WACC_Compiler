package ast.expression;

public final class UnopExprAST implements ExprAST {

  private final UnopToken operator;
  private final ExprAST expression;
  private final int line;
  private final int charPosition;
  //    private Type type;

  public UnopExprAST(UnopToken operator, ExprAST expression, int line, int charPosition) {
    this.operator = operator;
    this.expression = expression;
    this.line = line;
    this.charPosition = charPosition;
  }

  public UnopToken getOperator() {
    return operator;
  }

  //    private void setType(Type type) {
  //        this.type = type;
  //    }

  public ExprAST getExpression() {
    return expression;
  }

  @Override
  public int getLine() {
    return 0;
  }

  @Override
  public int getCharPosition() {
    return 0;
  }

  @Override
  public ExprToken getExprToken() {
    return ExprToken.UNOP;
  }

  //    @Override
  //    public Type getExprType() {
  //        return type;
  //    }
  //
  //    @Override
  //    public void checkType(ErrorHandler errorHandler, SymbolTable symbolTable, Type type) {
  //        Type unopType = exprToType(errorHandler, symbolTable);
  //        if (!type.equals(unopType)) {
  //            assert unopType != null;
  //            errorHandler.report(
  //                    new IncompatibleTypeError(
  //                            operator.toString(),
  //                            line,
  //                            charPosition,
  //                            type.getTypeToken(),
  //                            unopType.getTypeToken()));
  //        }
  //    }
  //
  //    @Override
  //    public Type exprToType(ErrorHandler errorHandler, SymbolTable symbolTable) {
  //        Type type = null;
  //        switch (operator) {
  //            case NOT:
  //                expression.checkType(errorHandler, symbolTable, new BoolType());
  //                type = new BoolType();
  //                break;
  //            case NEG:
  //                expression.checkType(errorHandler, symbolTable, new IntType());
  //                type = new IntType();
  //                break;
  //            case LEN:
  //                expression.checkType(errorHandler, symbolTable, new ArrayType(new AnyType()));
  //                type = new IntType();
  //                break;
  //            case ORD:
  //                expression.checkType(errorHandler, symbolTable, new CharType());
  //                type = new IntType();
  //                break;
  //            case CHR:
  //                expression.checkType(errorHandler, symbolTable, new IntType());
  //                type = new CharType();
  //                break;
  //        }
  //        setType(type);
  //        return type;
  //    }

  @Override
  public String print() {
    return operator + " " + expression.print();
  }
}

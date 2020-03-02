package ast.expression;

import types.Type;

public final class BinopExprAST implements ExprAST {

  private final BinopToken operator;
  private final ExprAST left;
  private final ExprAST right;
  private final int line;
  private final int charPosition;
  private Type type;

  public BinopExprAST(
      BinopToken operator, ExprAST left, ExprAST right, int line, int charPosition) {
    this.operator = operator;
    this.left = left;
    this.right = right;
    this.line = line;
    this.charPosition = charPosition;
  }

  public BinopToken getOperator() {
    return operator;
  }

  public ExprAST getLeft() {
    return left;
  }

  public ExprAST getRight() {
    return right;
  }

  private void setType(Type type) {
    this.type = type;
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
    return ExprToken.BINOP;
  }

  //    @Override
  //    public void checkType(ErrorHandler errorHandler, SymbolTable symbolTable, Type type) {
  //        Type resultType = exprToType(errorHandler, symbolTable);
  //        if (!type.equals(resultType)) {
  //            assert resultType != null;
  //            errorHandler.report(
  //                    new IncompatibleTypeError(
  //                            operator.toString(),
  //                            line,
  //                            charPosition,
  //                            type.getTypeToken(),
  //                            resultType.getTypeToken()));
  //        }
  //    }
  //
  //    @Override
  //    public Type exprToType(ErrorHandler errorHandler, SymbolTable symbolTable) {
  //        /* Check right operand type isn't refactored out for correct error message output. */
  //        // Check and get left operand type:
  //        Type leftType = left.exprToType(errorHandler, symbolTable);
  //        Type type = null;
  //        switch (operator) {
  //            case MUL:
  //            case Div:
  //            case MOD:
  //            case ADD:
  //            case SUB:
  //                // Check that left operand is of a compatible type:
  //                if (!leftType.getTypeToken().equals(TypeToken.INT)
  //                        && !leftType.getTypeToken().equals(TypeToken.ANY)) {
  //                    errorHandler.report(
  //                            new IncompatibleTypeError(
  //                                    operator.toString(), line, charPosition, TypeToken.INT,
  // leftType.getTypeToken()));
  //                }
  //                // Check that two operands have the same type:
  //                right.checkType(errorHandler, symbolTable, leftType);
  //                type = left.exprToType(errorHandler, symbolTable);
  //                break;
  //            case GT:
  //            case GTE:
  //            case LT:
  //            case LTE:
  //                // Check that left operand is of a compatible type:
  //                if (!leftType.getTypeToken().equals(TypeToken.INT)
  //                        && !leftType.getTypeToken().equals(TypeToken.CHAR)
  //                        && !leftType.getTypeToken().equals(TypeToken.ANY)) {
  //                    errorHandler.report(
  //                            new IncompatibleTypeError(
  //                                    operator.toString(), line, charPosition, TypeToken.INT,
  // leftType.getTypeToken()));
  //                }
  //                // Check that two operands have the same type:
  //                right.checkType(errorHandler, symbolTable, leftType);
  //                type = new BoolType();
  //                break;
  //            case EQ:
  //            case NEQ:
  //                // Check that two operands have the same type:
  //                right.checkType(errorHandler, symbolTable, leftType);
  //                type = new BoolType();
  //                break;
  //            case AND:
  //            case OR:
  //                // Check that left operand is of a compatible type:
  //                if (!leftType.getTypeToken().equals(TypeToken.BOOL)
  //                        && !leftType.getTypeToken().equals(TypeToken.ANY)) {
  //                    errorHandler.report(
  //                            new IncompatibleTypeError(
  //                                    operator.toString(),
  //                                    line,
  //                                    charPosition,
  //                                    TypeToken.BOOL,
  //                                    leftType.getTypeToken()));
  //                }
  //                // Check that two operands have the same type:
  //                right.checkType(errorHandler, symbolTable, leftType);
  //                type = new BoolType();
  //                break;
  //        }
  //        setType(type);
  //        return type;
  //    }

  @Override
  public String print() {
    return "(" + left.print() + " " + operator + " " + right.print() + ")";
  }
}

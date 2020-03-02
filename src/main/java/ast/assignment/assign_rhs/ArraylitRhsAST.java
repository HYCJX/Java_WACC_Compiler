package ast.assignment.assign_rhs;

import ast.expression.ExprAST;

import java.util.List;

public final class ArraylitRhsAST implements AssignRhsAST {

  private final int line;
  private final int charPosition;
  private List<ExprAST> expressions;
  //    private Type type;

  public ArraylitRhsAST(List<ExprAST> expressions, int line, int charPosition) {
    this.expressions = expressions;
    this.line = line;
    this.charPosition = charPosition;
  }

  //    private void setType(Type type) {
  //        this.type = type;
  //    }

  public List<ExprAST> getExpressions() {
    return expressions;
  }

  public int getLength() {
    return expressions.size();
  }

  //  public int getMemSize() {
  //    int memSize = 4;
  //    if (getLength() > 0) {
  //      int elemSize = expressions.get(0).getExprType().getOffset();
  //      memSize += elemSize * getLength();
  //    }
  //    return memSize;
  //  }

  @Override
  public int getLine() {
    return line;
  }

  @Override
  public int getCharPosition() {
    return charPosition;
  }

  @Override
  public AssignRhsToken getRhsToken() {
    return AssignRhsToken.ARRAY_LIT;
  }

  //    @Override
  //    public Type getRhsType() {
  //        return type;
  //    }
  //
  //    @Override
  //    public void checkType(ErrorHandler errorHandler, SymbolTable symbolTable, Type type) {
  //        TypeToken typeToken = type.getTypeToken();
  //        if (!typeToken.equals(TypeToken.ARRAY) && !typeToken.equals(TypeToken.ANY)) {
  //            errorHandler.report(
  //                    new IncompatibleTypeError("[", line, charPosition, type.getTypeToken(),
  // TypeToken.ARRAY));
  //            return;
  //        }
  //        ArrayType arrayType = (ArrayType) type;
  //        for (ExprAST exprAST : expressions) {
  //            exprAST.checkType(errorHandler, symbolTable, arrayType.getElemType());
  //        }
  //        setType(arrayType);
  //    }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();
    builder.append("[");
    String prefix = "";
    for (ExprAST expr : expressions) {
      builder.append(prefix);
      prefix = ",";
      builder.append(expr.print());
    }
    builder.append("]");
    return builder.toString();
  }
}

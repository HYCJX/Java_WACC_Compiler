package ast.assignment.assign_rhs;

import ast.expression.ExprAST;

public final class NewpairRhsAST implements AssignRhsAST {

  private final ExprAST first;
  private final ExprAST second;
  private final int line;
  private final int charPosition;
  //  private Type type;

  public NewpairRhsAST(ExprAST first, ExprAST second, int line, int charPosition) {
    this.first = first;
    this.second = second;
    this.line = line;
    this.charPosition = charPosition;
  }

  //  private void setType(Type type) {
  //    this.type = type;
  //  }

  public ExprAST getFirst() {
    return first;
  }

  public ExprAST getSecond() {
    return second;
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
  public AssignRhsToken getRhsToken() {
    return AssignRhsToken.NEWPAIR;
  }

  //    @Override
  //    public Type getRhsType() {
  //        return type;
  //    }
  //
  //    @Override
  //    public void checkType(ErrorHandler errorHandler, SymbolTable symbolTable, Type type) {
  //        if (!type.getTypeToken().equals(TypeToken.PAIR) &&
  // !type.getTypeToken().equals(TypeToken.ANY)) {
  //            errorHandler.report(
  //                    new IncompatibleTypeError(
  //                            "newpair", line, charPosition, type.getTypeToken(),
  // TypeToken.PAIR));
  //            return;
  //        }
  //        PairType pairType = (PairType) type;
  //        first.checkType(errorHandler, symbolTable, pairType.getFirst());
  //        second.checkType(errorHandler, symbolTable, pairType.getSecond());
  //        setType(type);
  //    }

  @Override
  public String print() {
    return "newpair(" + first.print() + ", " + second.print() + ")";
  }
}

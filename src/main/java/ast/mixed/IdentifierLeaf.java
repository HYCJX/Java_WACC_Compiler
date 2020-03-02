package ast.mixed;

import ast.assignment.assign_lhs.AssignLhsAST;
import ast.assignment.assign_lhs.AssignLhsToken;
import ast.expression.ExprAST;
import ast.expression.ExprToken;

public final class IdentifierLeaf implements AssignLhsAST, ExprAST {

  private final String identifier;
  private final int line;
  private final int charPosition;
  //  private Type type;

  public IdentifierLeaf(String identifier, int line, int charPosition) {
    this.identifier = identifier;
    this.line = line;
    this.charPosition = charPosition;
  }

  //  public void setType(Type type) {
  //    this.type = type;
  //  }

  public String getText() {
    return identifier;
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
    return ExprToken.IDENTIFIER;
  }

  @Override
  public AssignLhsToken getLhsToken() {
    return AssignLhsToken.IDENT;
  }

  //  @Override
  //  public Type getExprType() {
  //    return type;
  //  }

  //  @Override
  //  public Type getLhsType() {
  //    return type;
  //  }

  //  @Override
  //  public void checkType(ErrorHandler errorHandler, SymbolTable symbolTable, Type type) {
  //    Type identifierType = leftToType(errorHandler, symbolTable);
  //    if (identifierType == null || !identifierType.equals(type)) {
  //      assert identifierType != null;
  //      errorHandler.report(
  //          new IncompatibleTypeError(
  //              identifier, line, charPosition, type.getTypeToken(),
  // identifierType.getTypeToken()));
  //    }
  //  }
  //
  //  @Override
  //  public Type leftToType(ErrorHandler errorHandler, SymbolTable symbolTable) {
  //    Node node = symbolTable.lookupAll(identifier);
  //    if (node == null || node.getTypeToken().equals(TypeToken.FUNCTION)) {
  //      errorHandler.report(new UndeclaredVarError(identifier, line, charPosition));
  //      return null;
  //    }
  //    Type type = (Type) node;
  //    setType(type);
  //    return type;
  //  }

  //  @Override
  //  public Type exprToType(ErrorHandler errorHandler, SymbolTable symbolTable) {
  //    return leftToType(errorHandler, symbolTable);
  //  }

  @Override
  public String print() {
    return identifier;
  }
}

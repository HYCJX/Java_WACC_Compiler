package ast.assignment.assign_rhs;

import ast.expression.ExprAST;

import java.util.List;

public class CallRhsAST implements AssignRhsAST {

  private final IdentifierLeaf identifier;
  private final int line;
  private final int charPosition;
  private List<ExprAST> argumentList;
  //  private Type type;

  public CallRhsAST(
      IdentifierLeaf identifier, List<ExprAST> argumentList, int line, int charPosition) {
    this.identifier = identifier;
    this.argumentList = argumentList;
    this.line = line;
    this.charPosition = charPosition;
  }

  //  private void setType(Type type) {
  //    this.type = type;
  //  }
  //
  public IdentifierLeaf getIdentifier() {
    return identifier;
  }

  public List<ExprAST> getArgumentList() {
    return argumentList;
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
    return AssignRhsToken.CALL;
  }

  //  @Override
  //  public Type getRhsType() {
  //    return type;
  //  }
  //
  //  @Override
  //  public void checkType(ErrorHandler errorHandler, SymbolTable symbolTable, Type type) {
  //    // Save the original symbol table:
  //    SymbolTable origin = symbolTable;
  //    // Get to the outer-most scope and check the function:
  //    while (symbolTable.getEncSymTable() != null) {
  //      symbolTable = symbolTable.getEncSymTable();
  //    }
  //    Node node = symbolTable.lookup(identifier.getText());
  //    if (node == null || !node.getTypeToken().equals(TypeToken.FUNCTION)) {
  //      errorHandler.report(new FunctionUndefinedError(identifier.getText(), line, charPosition));
  //      return;
  //    }
  //    // Reset symbol table:
  //    symbolTable = origin;
  //    Function function = (Function) node;
  //    List<Type> parameters = function.getParamTypes();
  //    // Check argument size:
  //    if (this.argumentList.size() != parameters.size()) {
  //      errorHandler.report(new FunctionParamError(identifier.getText(), line, charPosition));
  //      return;
  //    }
  //    // Check argument type:
  //    for (int i = 0; i < parameters.size(); i++) {
  //      argumentList.get(i).checkType(errorHandler, symbolTable, parameters.get(i));
  //    }
  //    // Check return type:
  //    TypeToken typeToken = function.getType().getTypeToken();
  //    if (!type.getTypeToken().equals(typeToken) && !typeToken.equals(TypeToken.ANY)) {
  //      errorHandler.report(
  //          new IncompatibleTypeError(
  //              "call " + identifier.getText(), line, charPosition, type.getTypeToken(),
  // typeToken));
  //    }
  //    setType(type);
  //  }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();
    builder.append("call ").append(identifier.print()).append("(");
    String prefix = "";
    for (ExprAST expr : argumentList) {
      builder.append(prefix);
      prefix = ",";
      builder.append(expr.print());
    }
    builder.append(")");
    return builder.toString();
  }
}

package ast.assignment.assign_rhs;

import ast.AST;

public interface AssignRhsAST extends AST {

  AssignRhsToken getRhsToken();

  //    Type getRhsType();
  //
  //    void checkType(ErrorHandler errorHandler, SymbolTable symbolTable, Type type);

  int getLine();

  int getCharPosition();
}

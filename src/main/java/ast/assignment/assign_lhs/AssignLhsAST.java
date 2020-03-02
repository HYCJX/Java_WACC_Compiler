package ast.assignment.assign_lhs;

import ast.AST;

public interface AssignLhsAST extends AST {

  AssignLhsToken getLhsToken();

  //    Type getLhsType();
  //
  //    Type leftToType(ErrorHandler errorHandler, SymbolTable symbolTable);

  int getLine();

  int getCharPosition();
}

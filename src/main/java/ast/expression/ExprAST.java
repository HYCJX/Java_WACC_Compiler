package ast.expression;

import ast.assignment.assign_rhs.AssignRhsAST;
import ast.assignment.assign_rhs.AssignRhsToken;

public interface ExprAST extends AssignRhsAST {

  ExprToken getExprToken();

  @Override
  default AssignRhsToken getRhsToken() {
    return AssignRhsToken.EXPR;
  }
}

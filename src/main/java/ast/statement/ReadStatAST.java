package ast.statement;

import ast.assignment.assign_lhs.AssignLhsAST;

public final class ReadStatAST implements StatAST {

  private final AssignLhsAST content;

  public ReadStatAST(AssignLhsAST content) {
    this.content = content;
  }

  public AssignLhsAST getContent() {
    return content;
  }

  @Override
  public StatToken getStatToken() {
    return StatToken.READ;
  }

  @Override
  public String print() {
    return "read " + content.print();
  }
}

package ast.statement;

/* Intermediate representation of statements in the construction of AST */

import java.util.List;

public final class CompositionStatAST implements StatAST {

  private final List<StatAST> statements;

  public CompositionStatAST(List<StatAST> statements) {
    this.statements = statements;
  }

  public List<StatAST> getStatements() {
    return statements;
  }

  @Override
  public StatToken getStatToken() {
    return StatToken.COMPOSITION;
  }



  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();
    String prefix = "";
    for (StatAST statement : statements) {
      builder.append(prefix);
      prefix = ";\n";
      builder.append(statement.print());
    }
    return builder.toString();
  }
}

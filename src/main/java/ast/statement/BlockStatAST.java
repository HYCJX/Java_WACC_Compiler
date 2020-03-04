package ast.statement;

import symbol_table.SymbolTable;

import java.util.List;

public final class BlockStatAST implements StatAST {

  private final List<StatAST> statements;
  private final SymbolTable symbolTable;

  public BlockStatAST(List<StatAST> statements, SymbolTable symbolTable) {
    this.statements = statements;
    this.symbolTable = symbolTable;
  }

  public List<StatAST> getStatements() {
    return statements;
  }

  public SymbolTable getSymbolTable() {
    return symbolTable;
  }

  @Override
  public StatToken getStatType() {
    return StatToken.BLOCK;
  }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();
    builder.append("{\n");
    String prefix = "";
    for (StatAST statement : statements) {
      builder.append(prefix);
      prefix = ";\n";
      builder.append(statement.print());
    }
    builder.append("\n}");
    return builder.toString();
  }
}

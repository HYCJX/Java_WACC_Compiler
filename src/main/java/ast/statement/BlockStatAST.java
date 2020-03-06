package ast.statement;

import symbol_table.SymbolTable;

import java.util.List;

public final class BlockStatAST implements StatAST {

  private final List<StatAST> statements;
  private SymbolTable symbolTable;

  public BlockStatAST(List<StatAST> statements, SymbolTable symbolTable) {
    this.statements = statements;
    this.symbolTable = symbolTable;
  }

  public BlockStatAST(List<StatAST> statements) {
    this(statements, null);
  }

  public List<StatAST> getStatements() {
    return statements;
  }

  public SymbolTable getSymbolTable() {
    return symbolTable;
  }

  public void setSymbolTable(SymbolTable symbolTable) {
    if (this.symbolTable != null) {
      throw new RuntimeException("Symbol table is set more than once.");
    }
    this.symbolTable = symbolTable;
  }

  @Override
  public StatToken getStatToken() {
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

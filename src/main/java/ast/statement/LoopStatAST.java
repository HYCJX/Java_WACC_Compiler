package ast.statement;

import ast.expression.ExprAST;
import symbol_table.SymbolTable;

import java.util.List;

public final class LoopStatAST implements StatAST {

  private final ExprAST condition;
  private final List<StatAST> statements;
  private SymbolTable symbolTable;

  public LoopStatAST(ExprAST condition, List<StatAST> statements, SymbolTable symbolTable) {
    this.condition = condition;
    this.statements = statements;
    this.symbolTable = symbolTable;
  }

  public LoopStatAST(ExprAST condition, List<StatAST> statements) {
    this(condition, statements, null);
  }

  public ExprAST getCondition() {
    return condition;
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
    return StatToken.LOOP;
  }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();
    builder.append("while (");
    builder.append(condition.print());
    builder.append(") {\n");
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

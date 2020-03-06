package ast.statement;

import ast.expression.ExprAST;
import symbol_table.SymbolTable;

import java.util.List;

public final class ConditionStatAST implements StatAST {

  private final ExprAST condition;
  private final List<StatAST> trueBranch;
  private final List<StatAST> falseBranch;
  private SymbolTable trueBrSymbolTable;
  private SymbolTable falseBrSymbolTable;

  public ConditionStatAST(
      ExprAST condition,
      List<StatAST> trueBranch,
      List<StatAST> falseBranch,
      SymbolTable trueBrSymbolTable,
      SymbolTable falseBrSymbolTable) {
    this.condition = condition;
    this.trueBranch = trueBranch;
    this.falseBranch = falseBranch;
    this.trueBrSymbolTable = trueBrSymbolTable;
    this.falseBrSymbolTable = falseBrSymbolTable;
  }

  public ConditionStatAST(ExprAST condition, List<StatAST> trueBranch, List<StatAST> falseBranch) {
    this(condition, trueBranch, falseBranch, null, null);
  }

  public ExprAST getCondition() {
    return condition;
  }

  public List<StatAST> getTrueBranch() {
    return trueBranch;
  }

  public List<StatAST> getFalseBranch() {
    return falseBranch;
  }

  public SymbolTable getTrueBrSymbolTable() {
    return trueBrSymbolTable;
  }

  public void setTrueBrSymbolTable(SymbolTable symbolTable) {
    if (this.trueBrSymbolTable != null) {
      throw new RuntimeException("Symbol table is set more than once.");
    }
    this.trueBrSymbolTable = symbolTable;
  }

  public SymbolTable getFalseBrSymbolTable() {
    return falseBrSymbolTable;
  }

  public void setFalseBrSymbolTable(SymbolTable symbolTable) {
    if (this.falseBrSymbolTable != null) {
      throw new RuntimeException("Symbol table is set more than once.");
    }
    this.falseBrSymbolTable = symbolTable;
  }

  @Override
  public StatToken getStatToken() {
    return StatToken.CONDITION;
  }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();
    builder.append("if ");
    builder.append(condition.print());
    builder.append(" then {\n");
    String prefix = "";
    for (StatAST statement : trueBranch) {
      builder.append(prefix);
      prefix = ";\n";
      builder.append(statement.print());
    }
    builder.append("\n} else {\n");
    prefix = "";
    for (StatAST statement : falseBranch) {
      builder.append(prefix);
      prefix = ";\n";
      builder.append(statement.print());
    }
    builder.append("\n}");
    return builder.toString();
  }
}

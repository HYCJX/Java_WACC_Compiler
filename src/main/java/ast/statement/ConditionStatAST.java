package ast.statement;

import ast.expression.ExprAST;
import symbol_table.SymbolTable;

import java.util.List;

public final class ConditionStatAST implements StatAST {

  private final ExprAST condition;
  private final List<StatAST> trueBranch;
  private final List<StatAST> falseBranch;
  private final SymbolTable trueBrSymbolTable;
  private final SymbolTable falseBrSymbolTable;

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

  public SymbolTable getFalseBrSymbolTable() {
    return falseBrSymbolTable;
  }

  @Override
  public StatToken getStatType() {
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

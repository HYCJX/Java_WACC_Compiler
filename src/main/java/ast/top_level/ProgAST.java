package ast.top_level;

import ast.AST;
import ast.statement.StatAST;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public final class ProgAST implements AST {

  private final List<StatAST> statements;
  private List<FuncAST> functions = new ArrayList<>();
  private SymbolTable symbolTable;

  public ProgAST(List<StatAST> statements, List<FuncAST> functions, SymbolTable symbolTable) {
    this.statements = statements;
    this.functions.addAll(functions);
    this.symbolTable = symbolTable;
  }

  public List<StatAST> getStatement() {
    return statements;
  }

  public List<FuncAST> getFunctions() {
    return functions;
  }

  public SymbolTable getSymbolTable() {
    return symbolTable;
  }

  public boolean hasFunction() {
    return functions.size() > 0;
  }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();
    builder.append("Program: {\n");
    builder.append("Functions: {\n");
    String prefix = "";
    for (FuncAST function : functions) {
      builder.append(prefix);
      prefix = ",\n";
      builder.append(function.print());
    }
    builder.append("}\n");
    builder.append("Statement: {\n");
    prefix = "";
    for (StatAST statement : statements) {
      builder.append(prefix);
      prefix = ";\n";
      builder.append(statement.print());
    }
    builder.append("}\n}");
    return builder.toString();
  }
}

package ast.top_level;

import ast.AST;
import ast.statement.StatAST;
import symbol_table.SymbolTable;

import java.util.List;

public final class ProgAST implements AST {

  private final List<FuncAST> functions;
  private final List<StatAST> statements;
  private SymbolTable symbolTable;

  public ProgAST(List<FuncAST> functions, List<StatAST> statements, SymbolTable symbolTable) {
    this.functions = functions;
    this.statements = statements;
    this.symbolTable = symbolTable;
  }

  public ProgAST(List<FuncAST> functions, List<StatAST> statements) {
    this(functions, statements, null);
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

  public void setSymbolTable(SymbolTable symbolTable) {
    if (this.symbolTable != null) {
      throw new RuntimeException("Symbol table is set more than once.");
    }
    this.symbolTable = symbolTable;
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

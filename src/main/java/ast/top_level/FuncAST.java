package ast.top_level;

import ast.AST;
import ast.mixed.IdentifierLeaf;
import ast.statement.StatAST;
import symbol_table.SymbolTable;
import types.Type;

import java.util.List;

public final class FuncAST implements AST {

  private final Type returnType;
  private final IdentifierLeaf functionName;
  private final List<FuncParam> inputParams;
  private final List<StatAST> statements;
  private final int line;
  private final int charPosition;
  private SymbolTable symbolTable;

  public FuncAST(
      Type returnType,
      IdentifierLeaf functionName,
      List<FuncParam> inputParams,
      List<StatAST> statements,
      int line,
      int charPosition,
      SymbolTable symbolTable) {
    this.returnType = returnType;
    this.functionName = functionName;
    this.inputParams = inputParams;
    this.statements = statements;
    this.line = line;
    this.charPosition = charPosition;
    this.symbolTable = symbolTable;
  }

  public Type getReturnType() {
    return returnType;
  }

  public IdentifierLeaf getFunctionName() {
    return functionName;
  }

  public List<FuncParam> getInputParams() {
    return inputParams;
  }

  public List<StatAST> getStatement() {
    return statements;
  }

  public int getLine() {
    return line;
  }

  public int getCharPosition() {
    return charPosition;
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
  public String print() {
    StringBuilder builder = new StringBuilder();
    builder.append(returnType.print()).append(" ").append(functionName.print()).append("(");
    String prefix = "";
    for (FuncParam param : inputParams) {
      builder.append(prefix);
      prefix = ",";
      builder.append(param.getType().print());
      builder.append(" ");
      builder.append(param.getIdentifier().print());
    }
    builder.append(")\n{");
    prefix = "";
    for (StatAST statement : statements) {
      builder.append(prefix);
      prefix = ";\n";
      builder.append(statement.print());
    }
    builder.append("}\n");
    return builder.toString();
  }
}

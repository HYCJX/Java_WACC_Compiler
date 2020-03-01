package ast.top_level;

import ast.AST;
import ast.statement.StatAST;
import symbol_table.SymbolTable;
import types.Type;

import java.util.List;

public final class FuncAST implements AST {

  private final Type returnType;
  //    private final IdentifierLeaf functionName;
  //    private final List<FuncParamAST> inputParams;
  private final List<StatAST> statements;
  private final int line;
  private final int charPosition;
  private final SymbolTable symbolTable;

  public FuncAST(
      Type returnType,
      //            IdentifierLeaf functionName,
      //            List<FuncParamAST> inputParams,
      List<StatAST> statements,
      int line,
      int charPosition,
      SymbolTable symbolTable) {
    this.returnType = returnType;
    //        this.functionName = functionName;
    //        this.inputParams = inputParams;
    this.statements = statements;
    this.line = line;
    this.charPosition = charPosition;
    this.symbolTable = symbolTable;
  }

  public Type getReturnType() {
    return returnType;
  }

  //    public IdentifierLeaf getFunctionName() {
  //        return functionName;
  //    }
  //
  //    public List<FuncParamAST> getInputParams() {
  //        return inputParams;
  //    }

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

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();
    //        builder.append(returnType.print()).append("
    // ").append(functionName.print()).append("(");
    //        for (FuncParamAST param : inputParams) {
    //            builder.append(param.print());
    //        }
    //        builder.append(")\n{");
    //        String prefix = "";
    //        for (StatAST statement : statements) {
    //            builder.append(prefix);
    //            prefix = ";\n";
    //            builder.append(statement.print());
    //        }
    //        builder.append("}\n");
    return builder.toString();
  }
}

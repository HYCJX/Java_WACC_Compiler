package main.front_end;

import ast.AST;
import ast.statement.CompositionStatAST;
import ast.statement.StatAST;
import ast.statement.StatToken;
import ast.top_level.FuncAST;
import ast.top_level.ProgAST;
import errors_exceptions.error_handler.ErrorHandler;
import parser.WaccParser;
import parser.WaccParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class Syntax_BuildAST_Visitor extends WaccParserBaseVisitor<AST> {

  private final ErrorHandler errorHandler;

  public Syntax_BuildAST_Visitor(ErrorHandler errorHandler) {
    this.errorHandler = errorHandler;
  }

  @Override
  public AST visitProg(WaccParser.ProgContext ctx) {
    // Visit functions:
    List<FuncAST> functions = new ArrayList<>();
    for (WaccParser.FuncContext funcContext : ctx.func()) {
      FuncAST funcAST = visitFunc(funcContext);
      functions.add(funcAST);
    }
    // Visit statements:
    StatAST statAST = visitStat(ctx.stat());
    return new ProgAST(functions, extractList(statAST));
  }

  @Override
  public FuncAST visitFunc(WaccParser.FuncContext ctx) {
    return null;
  }

  private StatAST visitStat(WaccParser.StatContext ctx) {
    return null;
  }

  private List<StatAST> extractList(StatAST statAST) {
    if (statAST.getStatToken() == StatToken.COMPOSITION) {
      return ((CompositionStatAST) statAST).getStatements();
    }
    List<StatAST> statements = new ArrayList<>();
    statements.add(statAST);
    return statements;
  }
}

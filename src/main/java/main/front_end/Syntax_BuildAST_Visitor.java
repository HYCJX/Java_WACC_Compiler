package main.front_end;

import ast.AST;
import ast.assignment.PairelemFstAST;
import ast.assignment.PairelemSndAST;
import ast.assignment.assign_lhs.AssignLhsAST;
import ast.assignment.assign_rhs.ArraylitRhsAST;
import ast.assignment.assign_rhs.AssignRhsAST;
import ast.assignment.assign_rhs.CallRhsAST;
import ast.assignment.assign_rhs.NewpairRhsAST;
import ast.expression.*;
import ast.mixed.ArrayElemAST;
import ast.mixed.IdentifierLeaf;
import ast.statement.*;
import ast.top_level.FuncAST;
import ast.top_level.FuncParam;
import ast.top_level.ProgAST;
import errors_exceptions.error_handler.ErrorHandler;
import errors_exceptions.syntax_error.BadFormatError;
import errors_exceptions.syntax_error.BranchNoReturnError;
import errors_exceptions.syntax_error.MismatchedReturnError;
import parser.WaccParser;
import parser.WaccParserBaseVisitor;
import types.*;

import java.util.ArrayList;
import java.util.List;

public class Syntax_BuildAST_Visitor extends WaccParserBaseVisitor<AST> {

  private final ErrorHandler errorHandler;
  private boolean needReturn = false;

  public Syntax_BuildAST_Visitor(ErrorHandler errorHandler) {
    this.errorHandler = errorHandler;
  }

  @Override
  public AST visitProg(WaccParser.ProgContext ctx) {
    // Visit functions:
    List<FuncAST> functions = new ArrayList<>();
    for (WaccParser.FuncContext funcContext : ctx.func()) {
      needReturn = true;
      FuncAST funcAST = visitFunc(funcContext);
      if (needReturn) {
        errorHandler.addError(
            new MismatchedReturnError(
                funcContext.ident().getText(),
                funcContext.getStart().getLine(),
                funcContext.getStart().getCharPositionInLine()));
      }
      functions.add(funcAST);
    }
    // Visit statements:
    StatAST statAST = visitStat(ctx.stat());
    return new ProgAST(functions, extractList(statAST));
  }

  @Override
  public FuncAST visitFunc(WaccParser.FuncContext ctx) {
    // Build AST:
    Type returnType = visitType(ctx.type());
    IdentifierLeaf functionName = visitIdent(ctx.ident());
    List<FuncParam> inputParams = new ArrayList<>();
    for (WaccParser.ParamContext paramContext : ctx.param()) {
      Type type = visitType(paramContext.type());
      IdentifierLeaf id = visitIdent(paramContext.ident());
      inputParams.add(new FuncParam(type, id));
    }
    // Visit statement:
    StatAST statAST = visitStat(ctx.stat());
    List<StatAST> statements = extractList(statAST);
    // Set return type field back to null:
    return new FuncAST(
        returnType,
        functionName,
        inputParams,
        statements,
        ctx.getStart().getLine(),
        ctx.getStart().getCharPositionInLine());
  }

  private StatAST visitStat(WaccParser.StatContext ctx) {
    return (StatAST) visit(ctx);
  }

  @Override
  public SkipStatLeaf visitStatSkip(WaccParser.StatSkipContext ctx) {
    return new SkipStatLeaf();
  }

  @Override
  public DeclStatAST visitStatInitVar(WaccParser.StatInitVarContext ctx) {
    Type type = visitType(ctx.type());
    IdentifierLeaf identifier = visitIdent(ctx.ident());
    AssignRhsAST right = visitAssignRhs(ctx.assignRhs());
    return new DeclStatAST(type, identifier, right);
  }

  @Override
  public AssignStatAST visitStatAssignVar(WaccParser.StatAssignVarContext ctx) {
    AssignLhsAST left = visitAssignLhs(ctx.assignLhs());
    AssignRhsAST right = visitAssignRhs(ctx.assignRhs());
    return new AssignStatAST(left, right);
  }

  @Override
  public NormalStatAST visitStatExit(WaccParser.StatExitContext ctx) {
    ExprAST expression = visitExpr(ctx.expr());
    return new NormalStatAST(NormalStatToken.EXIT, expression);
  }

  @Override
  public NormalStatAST visitStatFree(WaccParser.StatFreeContext ctx) {
    ExprAST expression = visitExpr(ctx.expr());
    return new NormalStatAST(NormalStatToken.FREE, expression);
  }

  @Override
  public NormalStatAST visitStatPrint(WaccParser.StatPrintContext ctx) {
    ExprAST expression = visitExpr(ctx.expr());
    return new NormalStatAST(NormalStatToken.PRINT, expression);
  }

  @Override
  public NormalStatAST visitStatPrintln(WaccParser.StatPrintlnContext ctx) {
    ExprAST expression = visitExpr(ctx.expr());
    return new NormalStatAST(NormalStatToken.PRINTLINE, expression);
  }

  @Override
  public NormalStatAST visitStatReturn(WaccParser.StatReturnContext ctx) {
    needReturn = false;
    ExprAST expression = visitExpr(ctx.expr());
    return new NormalStatAST(NormalStatToken.RETURN, expression);
  }

  @Override
  public ReadStatAST visitStatRead(WaccParser.StatReadContext ctx) {
    AssignLhsAST assignLhsAST = visitAssignLhs(ctx.assignLhs());
    return new ReadStatAST(assignLhsAST);
  }

  @Override
  public BlockStatAST visitStatBegin(WaccParser.StatBeginContext ctx) {
    StatAST statement = visitStat(ctx.stat());
    List<StatAST> statements = extractList(statement);
    return new BlockStatAST(statements);
  }

  @Override
  public ConditionStatAST visitStatCond(WaccParser.StatCondContext ctx) {
    ExprAST expression = visitExpr(ctx.expr());
    needReturn = true;
    StatAST trueStatements = visitStat(ctx.stat(0));
    if (needReturn) {
      errorHandler.addError(
          new BranchNoReturnError(
              "if", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
    }
    needReturn = true;
    StatAST falseStatements = visitStat(ctx.stat(1));
    if (needReturn) {
      errorHandler.addError(
          new BranchNoReturnError(
              "if", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
    }
    List<StatAST> trueBranch = extractList(trueStatements);
    List<StatAST> falseBranch = extractList(falseStatements);
    return new ConditionStatAST(expression, trueBranch, falseBranch);
  }

  @Override
  public LoopStatAST visitStatLoop(WaccParser.StatLoopContext ctx) {
    ExprAST condition = visitExpr(ctx.expr());
    StatAST statement = visitStat(ctx.stat());
    List<StatAST> statements = extractList(statement);
    return new LoopStatAST(condition, statements);
  }

  @Override
  public CompositionStatAST visitStatCompose(WaccParser.StatComposeContext ctx) {
    StatAST first = visitStat(ctx.stat(0));
    List<StatAST> statements = extractList(first);
    StatAST second = visitStat(ctx.stat(1));
    statements.addAll(extractList(second));
    return new CompositionStatAST(statements);
  }

  @Override
  public AssignRhsAST visitAssignRhs(WaccParser.AssignRhsContext ctx) {
    if (ctx.arrayLiter() != null) {
      return visitArrayLiter(ctx.arrayLiter());
    } else if (ctx.call() != null) {
      return visitCall(ctx.call());
    } else if (ctx.expr() != null) {
      return visitExpr(ctx.expr());
    } else if (ctx.newpair() != null) {
      return visitNewpair(ctx.newpair());
    } else if (ctx.pairFst() != null) {
      return visitPairFst(ctx.pairFst());
    } else if (ctx.pairSnd() != null) {
      return visitPairSnd(ctx.pairSnd());
    }
    return null;
  }

  @Override
  public ArraylitRhsAST visitArrayLiter(WaccParser.ArrayLiterContext ctx) {
    List<ExprAST> expressions = new ArrayList<>();
    for (WaccParser.ExprContext exprContext : ctx.expr()) {
      expressions.add(visitExpr(exprContext));
    }
    return new ArraylitRhsAST(
        expressions, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
  }

  @Override
  public CallRhsAST visitCall(WaccParser.CallContext ctx) {
    IdentifierLeaf identifier = visitIdent(ctx.ident());
    List<ExprAST> expressions = new ArrayList<>();
    for (WaccParser.ExprContext exprContext : ctx.expr()) {
      expressions.add(visitExpr(exprContext));
    }
    return new CallRhsAST(
        identifier, expressions, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
  }

  @Override
  public NewpairRhsAST visitNewpair(WaccParser.NewpairContext ctx) {
    ExprAST first = visitExpr(ctx.expr(0));
    ExprAST second = visitExpr(ctx.expr(1));
    return new NewpairRhsAST(
        first, second, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
  }

  private ExprAST visitExpr(WaccParser.ExprContext ctx) {
    return (ExprAST) visit(ctx);
  }

  @Override
  public BoollitExprLeaf visitExprBoolLit(WaccParser.ExprBoolLitContext ctx) {
    String text = ctx.BOOL_LITER().getText();
    if (text.equals("true")) {
      return new BoollitExprLeaf(
          true, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
    }
    return new BoollitExprLeaf(
        false, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
  }

  @Override
  public CharlitExprLeaf visitExprCharLit(WaccParser.ExprCharLitContext ctx) {
    String string = ctx.CHAR_LITER().getText();
    string = string.replaceAll("\\\\0", "\0");
    string = string.replaceAll("\\\\b", "\b");
    string = string.replaceAll("\\\\t", "\t");
    string = string.replaceAll("\\\\n", "\n");
    string = string.replaceAll("\\\\f", "\f");
    string = string.replaceAll("\\\\r", "\r");
    string = string.replaceAll("\\\\'", "'");
    string = string.replaceAll("\\\\\\\\", "\\");
    string = string.replaceAll("\\\\\"", "\"");
    return new CharlitExprLeaf(
        string.charAt(1), ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
  }

  @Override
  public IntlitExprLeaf visitExprIntLit(WaccParser.ExprIntLitContext ctx) {
    try {
      Integer.parseInt(ctx.INT_LITER().getText());
    } catch (NumberFormatException e) {
      errorHandler.addError(
          new BadFormatError(
              ctx.INT_LITER().getText(),
              ctx.getStart().getLine(),
              ctx.getStart().getCharPositionInLine()));
      return null;
    }
    return new IntlitExprLeaf(
        Integer.parseInt(ctx.INT_LITER().getText()),
        ctx.getStart().getLine(),
        ctx.getStart().getCharPositionInLine());
  }

  @Override
  public StrlitExprLeaf visitExprStrLit(WaccParser.ExprStrLitContext ctx) {
    String text = ctx.STR_LITER().getText();
    text = text.substring(1, text.length() - 1);
    return new StrlitExprLeaf(
        text, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
  }

  @Override
  public PairlitExprLeaf visitExprPairLit(WaccParser.ExprPairLitContext ctx) {
    return new PairlitExprLeaf(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
  }

  @Override
  public ExprAST visitExprParen(WaccParser.ExprParenContext ctx) {
    return visitExpr(ctx.expr());
  }

  @Override
  public UnopExprAST visitExprUnaryOp(WaccParser.ExprUnaryOpContext ctx) {
    ExprAST expression = visitExpr(ctx.expr());
    if (ctx.NOT() != null) {
      return new UnopExprAST(
          UnopToken.NOT,
          expression,
          ctx.getStart().getLine(),
          ctx.getStart().getCharPositionInLine());
    } else if (ctx.NEG() != null) {
      return new UnopExprAST(
          UnopToken.NEG,
          expression,
          ctx.getStart().getLine(),
          ctx.getStart().getCharPositionInLine());
    } else if (ctx.LENGTH() != null) {
      return new UnopExprAST(
          UnopToken.LEN,
          expression,
          ctx.getStart().getLine(),
          ctx.getStart().getCharPositionInLine());
    } else if (ctx.ORD() != null) {
      return new UnopExprAST(
          UnopToken.ORD,
          expression,
          ctx.getStart().getLine(),
          ctx.getStart().getCharPositionInLine());
    } else if (ctx.CHR() != null) {
      return new UnopExprAST(
          UnopToken.CHR,
          expression,
          ctx.getStart().getLine(),
          ctx.getStart().getCharPositionInLine());
    }
    return null;
  }

  @Override
  public AssignLhsAST visitAssignLhs(WaccParser.AssignLhsContext ctx) {
    if (ctx.ident() != null) {
      return visitIdent(ctx.ident());
    } else if (ctx.arrayElem() != null) {
      return visitArrayElem(ctx.arrayElem());
    } else if (ctx.pairFst() != null) {
      return visitPairFst(ctx.pairFst());
    } else if (ctx.pairSnd() != null) {
      return visitPairSnd(ctx.pairSnd());
    }
    return null;
  }

  @Override
  public PairelemFstAST visitPairFst(WaccParser.PairFstContext ctx) {
    ExprAST expression = visitExpr(ctx.expr());
    return new PairelemFstAST(
        expression, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
  }

  @Override
  public PairelemSndAST visitPairSnd(WaccParser.PairSndContext ctx) {
    ExprAST expression = visitExpr(ctx.expr());
    return new PairelemSndAST(
        expression, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
  }

  @Override
  public ArrayElemAST visitArrayElem(WaccParser.ArrayElemContext ctx) {
    IdentifierLeaf identifier = visitIdent(ctx.ident());
    List<ExprAST> expressions = new ArrayList<>();
    for (WaccParser.ExprContext exprContext : ctx.expr()) {
      expressions.add(visitExpr(exprContext));
    }
    return new ArrayElemAST(
        identifier, expressions, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
  }

  @Override
  public IdentifierLeaf visitIdent(WaccParser.IdentContext ctx) {
    return new IdentifierLeaf(
        ctx.IDENT().getText(), ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
  }

  @Override
  public Type visitType(WaccParser.TypeContext ctx) {
    if (ctx.baseType() != null) {
      return visitBaseType(ctx.baseType());
    } else if (ctx.arrayType() != null) {
      return visitArrayType(ctx.arrayType());
    } else if (ctx.pairType() != null) {
      return visitPairType(ctx.pairType());
    }
    return null;
  }

  @Override
  public BaseType visitBaseType(WaccParser.BaseTypeContext ctx) {
    String text = ctx.BASE_TYPE().getText();
    switch (text) {
      case "int":
        return new IntType();
      case "bool":
        return new BoolType();
      case "char":
        return new CharType();
      case "string":
        return new StringType();
    }
    return null;
  }

  @Override
  public ArrayType visitArrayType(WaccParser.ArrayTypeContext ctx) {
    if (ctx.baseType() != null) {
      return new ArrayType(visitBaseType(ctx.baseType()));
    } else if (ctx.arrayType() != null) {
      return new ArrayType(visitArrayType(ctx.arrayType()));
    } else if (ctx.pairType() != null) {
      return new ArrayType(visitPairType(ctx.pairType()));
    }
    return null;
  }

  @Override
  public PairType visitPairType(WaccParser.PairTypeContext ctx) {
    Type first = null, second = null;
    if (ctx.pairElemType(0).PAIR() != null) {
      first = new PairType(new AnyType(), new AnyType());
    } else if (ctx.pairElemType(0).baseType() != null) {
      first = visitBaseType(ctx.pairElemType(0).baseType());
    } else if (ctx.pairElemType(0).arrayType() != null) {
      first = visitArrayType(ctx.pairElemType(0).arrayType());
    }
    if (ctx.pairElemType(1).PAIR() != null) {
      second = new PairType(new AnyType(), new AnyType());
    } else if (ctx.pairElemType(1).baseType() != null) {
      second = visitBaseType(ctx.pairElemType(1).baseType());
    } else if (ctx.pairElemType(1).arrayType() != null) {
      second = visitArrayType(ctx.pairElemType(1).arrayType());
    }
    return new PairType(first, second);
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

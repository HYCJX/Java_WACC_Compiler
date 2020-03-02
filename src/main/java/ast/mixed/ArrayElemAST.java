package ast.mixed;

import ast.assignment.assign_lhs.AssignLhsAST;
import ast.assignment.assign_lhs.AssignLhsToken;
import ast.expression.ExprAST;
import ast.expression.ExprToken;

import java.util.List;

public final class ArrayElemAST implements AssignLhsAST, ExprAST {
  private final IdentifierLeaf identifier;
  private final List<ExprAST> expressions;
  private final int line;
  private final int charPosition;
  //    private Type type;

  public ArrayElemAST(
      IdentifierLeaf identifier, List<ExprAST> expressions, int line, int charPosition) {
    this.identifier = identifier;
    this.expressions = expressions;
    this.line = line;
    this.charPosition = charPosition;
  }

  //    private void setType(Type type) {
  //        this.type = type;
  //    }

  public IdentifierLeaf getIdentifier() {
    return identifier;
  }

  public List<ExprAST> getExpressions() {
    return expressions;
  }

  @Override
  public int getLine() {
    return line;
  }

  @Override
  public int getCharPosition() {
    return charPosition;
  }

  @Override
  public ExprToken getExprToken() {
    return ExprToken.ARRAYELEM;
  }

  @Override
  public AssignLhsToken getLhsToken() {
    return AssignLhsToken.ARRAYELEM;
  }

  //    @Override
  //    public Type getExprType() {
  //        return type;
  //    }
  //
  //    @Override
  //    public Type getLhsType() {
  //        return type;
  //    }
  //
  //    @Override
  //    public void checkType(ErrorHandler errorHandler, SymbolTable symbolTable, Type type) {
  //        Type elemType = leftToType(errorHandler, symbolTable);
  //        if (!type.equals(elemType)) {
  //            errorHandler.report(
  //                    new IncompatibleTypeError(
  //                            "Array element of " + identifier.getText(),
  //                            line,
  //                            charPosition,
  //                            type.getTypeToken(),
  //                            elemType.getTypeToken()));
  //        }
  //    }
  //
  //    @Override
  //    public Type leftToType(ErrorHandler errorHandler, SymbolTable symbolTable) {
  //        // Check and get the array:
  //        Node node = symbolTable.lookupAll(identifier.getText());
  //        if (node == null || node.getTypeToken().equals(TypeToken.FUNCTION)) {
  //            errorHandler.report(new UndeclaredVarError(identifier.getText(), line,
  // charPosition));
  //        }
  //        // Check that the indices are integers:
  //        for (ExprAST expression : expressions) {
  //            expression.checkType(errorHandler, symbolTable, new IntType());
  //        }
  //        // Check and get the element type:
  //        assert node != null;
  //        TypeToken typeToken = node.getTypeToken();
  //        if (!typeToken.equals(TypeToken.ARRAY) && !typeToken.equals(TypeToken.ANY)) {
  //            errorHandler.report(
  //                    new IncompatibleTypeError(
  //                            identifier.getText(), line, charPosition, TypeToken.ARRAY,
  // node.getTypeToken()));
  //        }
  //        identifier.setType((Type) node);
  //        if (typeToken.equals(TypeToken.ARRAY)) {
  //            ArrayType arrayType = (ArrayType) node;
  //            Type type = arrayType;
  //            for (int i = expressions.size() - 1; i >= 0; i--) {
  //                type = ((ArrayType) type).getElemType();
  //            }
  //            setType(type);
  //            return arrayType.getElemType();
  //        }
  //        AnyType type = new AnyType();
  //        setType(type);
  //        return type;
  //    }
  //
  //    @Override
  //    public Type exprToType(ErrorHandler errorHandler, SymbolTable symbolTable) {
  //        return leftToType(errorHandler, symbolTable);
  //    }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();
    builder.append(identifier.print());
    for (ExprAST expr : expressions) {
      builder.append('[').append(expr.print()).append(']');
    }
    return builder.toString();
  }
}

package ast.assignment;

import ast.assignment.assign_lhs.AssignLhsAST;
import ast.assignment.assign_lhs.AssignLhsToken;
import ast.assignment.assign_rhs.AssignRhsAST;
import ast.assignment.assign_rhs.AssignRhsToken;
import ast.expression.ExprAST;

public final class PairelemFstAST implements AssignLhsAST, AssignRhsAST {

  private final ExprAST expression;
  private final int line;
  private final int charPosition;
  //    private Type type;

  public PairelemFstAST(ExprAST expression, int line, int charPosition) {
    this.expression = expression;
    this.line = line;
    this.charPosition = charPosition;
  }

  //    private void setType(Type type) {
  //        this.type = type;
  //    }

  public ExprAST getExpression() {
    return expression;
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
  public AssignLhsToken getLhsToken() {
    return AssignLhsToken.PAIRELEMFST;
  }

  @Override
  public AssignRhsToken getRhsToken() {
    return AssignRhsToken.PAIRELEMFST;
  }

  //    @Override
  //    public Type getLhsType() {
  //        return type;
  //    }
  //
  //    @Override
  //    public Type getRhsType() {
  //        return type;
  //    }
  //
  //    @Override
  //    public void checkType(ErrorHandler errorHandler, SymbolTable symbolTable, Type type) {
  //        Type fstElemType = leftToType(errorHandler, symbolTable);
  //        if (!type.equals(fstElemType)) {
  //            assert fstElemType != null;
  //            errorHandler.report(
  //                    new IncompatibleTypeError(
  //                            "Fst", line, charPosition, type.getTypeToken(),
  // fstElemType.getTypeToken()));
  //        }
  //    }
  //
  //    @Override
  //    public Type leftToType(ErrorHandler errorHandler, SymbolTable symbolTable) {
  //        // Check that the argument expression is an identifier and that it is a pair:
  //        if (!(expression instanceof IdentifierLeaf)) {
  //            errorHandler.report(new InvalidPairelemAccessError("Fst", line, charPosition));
  //            return null;
  //        }
  //        IdentifierLeaf identifierLeaf = (IdentifierLeaf) expression;
  //        Node node = symbolTable.lookupAll(identifierLeaf.getText());
  //        if (node == null || node.getTypeToken().equals(TypeToken.FUNCTION)) {
  //            errorHandler.report(new UndeclaredVarError(identifierLeaf.getText(), line,
  // charPosition));
  //            return null;
  //        }
  //        TypeToken typeToken = node.getTypeToken();
  //        if (!typeToken.equals(TypeToken.PAIR) && !typeToken.equals(TypeToken.ANY)) {
  //            errorHandler.report(
  //                    new IncompatibleTypeError(
  //                            identifierLeaf.getText(), line, charPosition, TypeToken.PAIR,
  // typeToken));
  //        }
  //        identifierLeaf.setType((Type) node);
  //        // Get the first pair element:
  //        if (typeToken.equals(TypeToken.PAIR)) {
  //            PairType pairType = (PairType) node;
  //            setType(pairType.getFirst());
  //            return pairType.getFirst();
  //        }
  //        AnyType anyType = new AnyType();
  //        setType(anyType);
  //        return anyType;
  //    }

  @Override
  public String print() {
    return "fst " + expression.print();
  }
}

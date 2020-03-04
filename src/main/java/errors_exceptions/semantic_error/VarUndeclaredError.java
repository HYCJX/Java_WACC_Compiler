package errors_exceptions.semantic_error;

public final class VarUndeclaredError extends SemanticError {

  public VarUndeclaredError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
  }

  @Override
  public String print() {
    return "SemanticError at "
        + getLine()
        + ":"
        + getPosition()
        + " -- Variable "
        + getOffendingToken()
        + " is not defined in this scope";
  }
}

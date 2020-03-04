package errors_exceptions.semantic_error;

public final class FunctionUndefinedError extends SemanticError {

  public FunctionUndefinedError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
  }

  @Override
  public String print() {
    return "SemanticError at "
        + getLine()
        + ":"
        + getPosition()
        + " -- Function "
        + getOffendingToken()
        + " is not defined in this scope.\n";
  }
}

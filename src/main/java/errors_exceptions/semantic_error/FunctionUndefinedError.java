package errors_exceptions.semantic_error;

public class FunctionUndefinedError extends SemanticError {

  public FunctionUndefinedError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
  }
}

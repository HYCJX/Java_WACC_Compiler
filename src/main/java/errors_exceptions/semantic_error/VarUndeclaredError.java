package errors_exceptions.semantic_error;

public class VarUndeclaredError extends SemanticError {

  public VarUndeclaredError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
  }
}

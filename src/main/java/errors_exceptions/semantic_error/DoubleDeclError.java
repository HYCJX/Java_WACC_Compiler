package errors_exceptions.semantic_error;

public class DoubleDeclError extends SemanticError {

  public DoubleDeclError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
  }
}

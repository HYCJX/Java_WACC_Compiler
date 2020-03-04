package errors_exceptions.semantic_error;

public class ReadError extends SemanticError {

  public ReadError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
  }
}

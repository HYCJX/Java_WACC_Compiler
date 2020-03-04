package errors_exceptions.syntax_error;

public class MismatchedReturnError extends SyntaxError {

  public MismatchedReturnError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
  }
}

package errors_exceptions.syntax_error;

public class BadFormatError extends SyntaxError {

  public BadFormatError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
  }
}

package errors_exceptions.syntax_error;

public final class MismatchedReturnError extends SyntaxError {

  public MismatchedReturnError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
  }

  @Override
  public String print() {
    return "Syntactic Error at "
        + getLine()
        + ":"
        + getPosition()
        + " -- Function "
        + getOffendingToken()
        + " is not ended with a return or an exit statement.\n";
  }
}

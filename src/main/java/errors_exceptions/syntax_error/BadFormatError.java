package errors_exceptions.syntax_error;

public class BadFormatError extends SyntaxError {

  public BadFormatError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
  }

  @Override
  public String print() {
    return "Syntactic Error at "
        + getLine()
        + ":"
        + getPosition()
        + " -- Integer value "
        + getOffendingToken()
        + " on line "
        + getLine()
        + " is badly formatted (either it has a badly defined sign or it is too large for a 32-bit signed integer).\n";
  }
}

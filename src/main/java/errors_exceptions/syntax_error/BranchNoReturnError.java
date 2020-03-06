package errors_exceptions.syntax_error;

public class BranchNoReturnError extends SyntaxError {

  public BranchNoReturnError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
  }

  @Override
  public String print() {
    return "Syntactic Error at "
        + getLine()
        + ":"
        + getPosition()
        + " -- Branch "
        + getOffendingToken()
        + " is not ended with a return or an exit statement.\n";
  }
}

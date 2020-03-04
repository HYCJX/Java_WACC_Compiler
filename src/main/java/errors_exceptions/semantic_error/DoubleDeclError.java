package errors_exceptions.semantic_error;

public class DoubleDeclError extends SemanticError {

  public DoubleDeclError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
  }

  @Override
  public String print() {
    return "Semantic Error at "
        + getLine()
        + ":"
        + getPosition()
        + " -- \""
        + getOffendingToken()
        + "\" is already defined in this scope.\n";
  }
}

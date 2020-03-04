package errors_exceptions.semantic_error;

public final class ReadError extends SemanticError {

  public ReadError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
  }

  @Override
  public String print() {
    return "Semantic Error at "
        + getLine()
        + ":"
        + getPosition()
        + " -- Read argument not an integer or a character.\n";
  }
}

package errors_exceptions.semantic_error;

public final class PairelemAccessError extends SemanticError {

  public PairelemAccessError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
  }

  @Override
  public String print() {
    return "Semantic Error at "
        + getLine()
        + ":"
        + getPosition()
        + " -- Accessing element of a none pair.\n";
  }
}

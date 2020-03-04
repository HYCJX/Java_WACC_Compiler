package errors_exceptions.semantic_error;

public class PairelemAccessError extends SemanticError {

  public PairelemAccessError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
  }
}

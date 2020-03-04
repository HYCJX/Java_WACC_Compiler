package errors_exceptions.semantic_error;

import errors_exceptions.Error;

public abstract class SemanticError implements Error {

  private final String offendingToken;
  private final int line;
  private final int position;

  protected SemanticError(String offendingToken, int line, int position) {
    this.offendingToken = offendingToken;
    this.line = line;
    this.position = position;
  }

  protected String getOffendingToken() {
    return offendingToken;
  }

  protected int getLine() {
    return line;
  }

  protected int getPosition() {
    return position;
  }
}

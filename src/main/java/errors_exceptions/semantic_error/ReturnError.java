package errors_exceptions.semantic_error;

import types.TypeToken;

public class ReturnError extends SemanticError {

  private final TypeToken expected;
  private final TypeToken actual;

  public ReturnError(String offendingToken, int line, int position) {
    super(offendingToken, line, position);
    this.expected = null;
    this.actual = null;
  }

  public ReturnError(
      String offendingToken, int line, int position, TypeToken expected, TypeToken actual) {
    super(offendingToken, line, position);
    this.expected = expected;
    this.actual = actual;
  }

  public TypeToken getExpected() {
    return expected;
  }

  public TypeToken getActual() {
    return actual;
  }

  @Override
  public String print() {
    if (expected == null) {
      return "Semantic Error at "
          + getLine()
          + ":"
          + getPosition()
          + " -- Cannot return from the global scope";
    }
    return "Semantic Error at "
        + getLine()
        + ":"
        + getPosition()
        + " -- Wrong return type. Expected: "
        + expected
        + ", Actual: "
        + actual
        + ".\n";
  }
}

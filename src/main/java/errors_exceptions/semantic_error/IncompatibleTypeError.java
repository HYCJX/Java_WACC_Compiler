package errors_exceptions.semantic_error;

import types.TypeToken;

public class IncompatibleTypeError extends SemanticError {

  private final TypeToken expected;
  private final TypeToken actual;

  public IncompatibleTypeError(
      String offendingToken, int line, int position, TypeToken expected, TypeToken actual) {
    super(offendingToken, line, position);
    this.expected = expected;
    this.actual = actual;
  }

  public IncompatibleTypeError(String offendingToken, int line, int position, TypeToken actual) {
    this(offendingToken, line, position, null, actual);
  }

  public TypeToken getExpected() {
    return expected;
  }

  public TypeToken getActual() {
    return actual;
  }
}

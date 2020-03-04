package errors_exceptions.semantic_error;

import types.TypeToken;

public class FunctionParamTypeError extends SemanticError {

  private final TypeToken expected;
  private final TypeToken actual;

  public FunctionParamTypeError(String offendingToken, int line, int position, TypeToken expected, TypeToken actual) {
    super(offendingToken, line, position);
    this.expected = expected;
    this.actual = actual;
  }
}

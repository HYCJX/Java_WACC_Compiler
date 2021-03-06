package errors_exceptions.semantic_error;

public final class FunctionParamNumError extends SemanticError {

  private final int expected;
  private final int actual;

  public FunctionParamNumError(
      String offendingToken, int line, int position, int expected, int actual) {
    super(offendingToken, line, position);
    this.expected = expected;
    this.actual = actual;
  }

  public int getExpected() {
    return expected;
  }

  public int getActual() {
    return actual;
  }

  @Override
  public String print() {
    return "Semantic Error at "
        + getLine()
        + ":"
        + getPosition()
        + " -- Function call on "
        + getOffendingToken()
        + "has wrong argument number. Expected: "
        + expected
        + ", Actual: "
        + actual
        + ".\n";
  }
}

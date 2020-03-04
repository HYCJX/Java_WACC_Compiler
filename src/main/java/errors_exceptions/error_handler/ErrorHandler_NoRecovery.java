package errors_exceptions.error_handler;

import errors_exceptions.Error;

public class ErrorHandler_NoRecovery implements ErrorHandler {

  private final int exitCode;

  public ErrorHandler_NoRecovery(int exitCode) {
    this.exitCode = exitCode;
  }

  @Override
  public void addError(Error error) {
    System.err.println("Errors detected during compilation! Exit code 200 returned.\n");
    System.err.println(error.print());
    System.exit(exitCode);
  }

  @Override
  public void handle() {}
}

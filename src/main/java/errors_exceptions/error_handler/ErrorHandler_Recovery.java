package errors_exceptions.error_handler;

import errors_exceptions.Error;

import java.util.ArrayList;
import java.util.List;

public class ErrorHandler_Recovery implements ErrorHandler {

  private final int exitCode;
  private List<Error> errorList;

  public ErrorHandler_Recovery(int exitCode) {
    errorList = new ArrayList<>();
    this.exitCode = exitCode;
  }

  @Override
  public void addError(Error error) {
    errorList.add(error);
  }

  @Override
  public void handle() {
    if (errorList != null) {
      System.err.println("Errors detected during compilation! Exit code 200 returned.\n");
      for (Error error : errorList) {
        System.err.println(error.print());
      }
      System.exit(exitCode);
    }
  }
}

package errors_exceptions.error_handler;

import errors_exceptions.Error;

public interface ErrorHandler {

  void addError(Error error);

  void handle();
}

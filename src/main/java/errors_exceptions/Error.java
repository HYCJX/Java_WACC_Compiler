package errors_exceptions;

public interface Error {

  String getOffendingToken();

  int getLine();

  int getPosition();
}

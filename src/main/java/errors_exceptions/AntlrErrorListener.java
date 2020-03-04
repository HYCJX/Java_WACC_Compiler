package errors_exceptions;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

public class AntlrErrorListener extends BaseErrorListener {

  public static final AntlrErrorListener INSTANCE = new AntlrErrorListener();

  private List<String> errorMsgList = new ArrayList<>();

  private AntlrErrorListener() {}

  public boolean errorDetected() {
    return !errorMsgList.isEmpty();
  }

  public void printErrorMessage() {
    StringBuilder builder = new StringBuilder();
    builder.append("Errors detected during compilation! Exit code 100 returned.\n");
    for (String message : errorMsgList) {
      builder.append(message);
    }
    builder
        .append(errorMsgList.size())
        .append(" parser error(s) detected, no further compilation attempted.");
    System.err.println(builder.toString());
  }

  @Override
  public void syntaxError(
      Recognizer<?, ?> recognizer,
      Object offendingSymbol,
      int line,
      int charPositionInLine,
      String msg,
      RecognitionException e) {
    errorMsgList.add(
        "Syntactic Error at " + line + ": " + charPositionInLine + " -- " + msg + "\n");
  }
}

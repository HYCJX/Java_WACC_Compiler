package arm11.data;

/* Represent each data in ARM .data section */

public class Data {

  private final String message;

  public Data(String message) {
    this.message = message;
  }

  public String printWordLength() {
    int length = message.length();
    // Escape characters have lengths 1.
    for (char c : message.toCharArray()) {
      if (c == '\\') {
        length--;
      }
    }
    return ".word " + length;
  }

  public String printMessage() {
    return ".ascii  \"" + message + "\"\n";
  }
}

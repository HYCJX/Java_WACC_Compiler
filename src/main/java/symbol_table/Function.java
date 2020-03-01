package symbol_table;

import static symbol_table.FunctionToken.FUNCTION;

public class Function implements Node {

  public Function() {}

  @Override
  public NodeToken getNodeToken() {
    return FUNCTION;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    return obj instanceof Function;
  }

  @Override
  public int hashCode() {
    return 0;
  }
}

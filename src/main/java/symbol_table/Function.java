package symbol_table;

import types.TypeToken;

import static types.TypeToken.FUNCTION;

public final class Function implements Node {

  public Function() {}

  @Override
  public TypeToken getTypeToken() {
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

package types;

import symbol_table.NodeToken;

import static types.TypeToken.STRING;

public class StringType implements Type {

  public StringType() {}

  @Override
  public NodeToken getNodeToken() {
    return STRING;
  }

  @Override
  public int getOffset() {
    return 4;
  }

  @Override
  public String toString() {
    return "String type";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    return obj instanceof StringType || obj instanceof AnyType;
  }

  @Override
  public int hashCode() {
    return STRING.ordinal();
  }
}

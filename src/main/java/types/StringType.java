package types;

import static types.TypeToken.STRING;

public final class StringType extends BaseType {

  public StringType() {
    super(STRING);
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

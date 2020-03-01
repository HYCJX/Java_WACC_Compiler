package types;

/* Pair literals: 'null' */

public class NullType extends BaseType {

  public NullType() {
    super(TypeToken.NULL);
  }

  @Override
  public int getOffset() {
    return 4;
  }

  @Override
  public String toString() {
    return "Null Type";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    return obj instanceof NullType || obj instanceof AnyType;
  }

  @Override
  public int hashCode() {
    return TypeToken.NULL.ordinal();
  }
}

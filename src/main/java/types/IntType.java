package types;

public class IntType extends BaseType {

  public IntType() {
    super(TypeToken.INT);
  }

  @Override
  public int getOffset() {
    return 4;
  }

  @Override
  public String toString() {
    return "Int Type";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    return obj instanceof IntType || obj instanceof AnyType;
  }

  @Override
  public int hashCode() {
    return TypeToken.INT.ordinal();
  }
}

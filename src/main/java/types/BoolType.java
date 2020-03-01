package types;

public final class BoolType extends BaseType {

  public BoolType() {
    super(TypeToken.BOOL);
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public String toString() {
    return "Bool Type";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    return obj instanceof BoolType || obj instanceof AnyType;
  }

  @Override
  public int hashCode() {
    return TypeToken.BOOL.ordinal();
  }
}

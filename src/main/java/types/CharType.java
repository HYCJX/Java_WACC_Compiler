package types;

public class CharType extends BaseType {

  public CharType() {
    super(TypeToken.CHAR);
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public String toString() {
    return "Char Type";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    return obj instanceof CharType || obj instanceof AnyType;
  }

  @Override
  public int hashCode() {
    return TypeToken.CHAR.ordinal();
  }
}

package types;

/* Generic type for nested pair elements: 'pair' */

public final class AnyType extends BaseType {

  public AnyType() {
    super(TypeToken.ANY);
  }

  // Should not be called for this type:
  @Override
  public int getOffset() {
    throw new RuntimeException();
  }

  @Override
  public String toString() {
    return "Any Type";
  }

  // Matches every type:
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    return obj instanceof Type;
  }

  @Override
  public int hashCode() {
    return 0;
  }
}

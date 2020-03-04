package types;

/* Abstraction of types: Any, Bool, Char, Int and Null */

public abstract class BaseType implements Type {

  private final TypeToken type;

  public BaseType(TypeToken type) {
    this.type = type;
  }

  @Override
  public TypeToken getTypeToken() {
    return type;
  }

  @Override
  public String print() {
    return String.valueOf(type);
  }
}

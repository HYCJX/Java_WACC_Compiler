package types;

/* Abstraction of types: Any, Bool, Char, Int, Null and String */

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

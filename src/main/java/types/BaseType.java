package types;

/* Abstraction of types: Any, Bool, Char, Int and Null */

import symbol_table.NodeToken;

public abstract class BaseType implements Type {

  private final TypeToken type;

  public BaseType(TypeToken type) {
    this.type = type;
  }

  @Override
  public NodeToken getNodeToken() {
    return type;
  }
}

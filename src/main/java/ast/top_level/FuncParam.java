package ast.top_level;

import ast.mixed.IdentifierLeaf;
import types.Type;

public class FuncParam {

  private final Type type;
  private final IdentifierLeaf identifier;

  public FuncParam(Type type, IdentifierLeaf identifier) {
    this.type = type;
    this.identifier = identifier;
  }

  public Type getType() {
    return type;
  }

  public IdentifierLeaf getIdentifier() {
    return identifier;
  }
}

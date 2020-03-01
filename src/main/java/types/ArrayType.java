package types;

import static types.TypeToken.ARRAY;

public final class ArrayType implements Type {

  private final Type elemType;

  public ArrayType(Type elemType) {
    this.elemType = elemType;
  }

  public Type getElemType() {
    return elemType;
  }

  public int getDimension() {
    Type typeAST = elemType;
    int dimension = 1;
    while (typeAST instanceof ArrayType) {
      dimension++;
      typeAST = ((ArrayType) typeAST).getElemType();
    }
    return dimension;
  }

  @Override
  public TypeToken getTypeToken() {
    return ARRAY;
  }

  @Override
  public int getOffset() {
    return 4;
  }

  @Override
  public String toString() {
    if (elemType == null) {
      return "Some Array Type";
    }
    return elemType + "[]";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj instanceof ArrayType) {
      ArrayType arrayType = (ArrayType) obj;
      return this.elemType.equals(arrayType.getElemType());
    }
    return obj instanceof AnyType;
  }

  @Override
  public int hashCode() {
    return ARRAY.ordinal() + elemType.hashCode();
  }
}

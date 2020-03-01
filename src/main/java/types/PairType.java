package types;

public class PairType implements Type {

  private final Type first;
  private final Type second;

  public PairType(Type first, Type second) {
    this.first = first;
    this.second = second;
  }

  public Type getFirst() {
    return first;
  }

  public Type getSecond() {
    return second;
  }

  @Override
  public int getOffset() {
    return 4;
  }

  @Override
  public String toString() {
    return "Pair(" + (first == null ? "" : first) + " " + (second == null ? "" : second) + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj instanceof PairType) {
      PairType pairType = (PairType) obj;
      return this.first.equals(pairType.getFirst()) && this.second.equals(pairType.getSecond());
    }
    return obj instanceof AnyType;
  }

  @Override
  public int hashCode() {
    return TypeToken.PAIR.ordinal() + first.hashCode() + second.hashCode();
  }
}

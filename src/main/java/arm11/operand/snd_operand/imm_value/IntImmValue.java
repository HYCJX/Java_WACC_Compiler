package arm11.operand.snd_operand.imm_value;

public final class IntImmValue implements ImmValue {

  private final int val;

  public IntImmValue(int val) {
    this.val = val;
  }

  public int getVal() {
    return val;
  }

  @Override
  public String print() {
    return "#" + val;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof IntImmValue) {
      return ((IntImmValue) obj).getVal() == val;
    }
    return false;
  }
}

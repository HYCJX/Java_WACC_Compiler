package arm11.operand.address;

import arm11.operand.snd_operand.imm_value.ImmValue;
import arm11.operand.snd_operand.imm_value.IntImmValue;
import arm11.operand.snd_operand.register.Register;
import arm11.operand.snd_operand.register.shifted_register.ShiftType;

public class PostIndex extends AbstractAddress {

  public PostIndex(Register first) {
    super(first);
  }

  public PostIndex(Register first, ImmValue immValue) {
    super(first, immValue);
  }

  public PostIndex(Register first, IntImmValue intImmValue) {
    super(first, intImmValue);
  }

  public PostIndex(Register first, Register second) {
    super(first, second);
  }

  public PostIndex(Register first, ImmValue immValue, boolean change) {
    super(first, immValue, change);
  }

  public PostIndex(Register first, Register second, boolean change) {
    super(first, second, change);
  }

  public PostIndex(Register first, Register second, ImmValue immValue, ShiftType shiftType) {
    super(first, second, immValue, shiftType);
  }

  public PostIndex(
      Register first, Register second, ImmValue immValue, ShiftType shiftType, boolean change) {
    super(first, second, immValue, shiftType, change);
  }

  // Print in post index form. Example: [R0], #4.
  @Override
  public String print() {
    String prefix = "[";
    String suffix = "]";
    StringBuilder sb = new StringBuilder("[" + getFirst().print() + "]");
    if (getImmValue() != null && getSecond() == null && getShiftType() == null) {
      sb.append(", ").append(getImmValue().print());
    } else if (getImmValue() == null && getSecond() != null) {
      sb.append(", ").append(getSecond().print());
    } else if (getImmValue() != null && getSecond() != null && getShiftType() != null) {
      sb.append(", ")
          .append(getSecond().print())
          .append(", ")
          .append(getShiftType().toString())
          .append(" ")
          .append(getImmValue().print());
    }
    return sb.toString();
  }
}

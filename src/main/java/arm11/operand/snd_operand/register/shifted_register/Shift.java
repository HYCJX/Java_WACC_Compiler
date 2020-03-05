package arm11.operand.snd_operand.register.shifted_register;

/* A shift includes a shift type and either a int immediate value or a register Rs. */

import arm11.operand.snd_operand.imm_value.IntImmValue;
import arm11.operand.snd_operand.register.Register;

public final class Shift {

  private final ShiftType shiftType;
  private final IntImmValue offsetIntImmValue;
  private final Register rs;

  public Shift(ShiftType shiftType, IntImmValue offsetIntImmValue) {
    this.shiftType = shiftType;
    this.offsetIntImmValue = offsetIntImmValue;
    this.rs = null;
  }

  public Shift(ShiftType shiftType, Register rs) {
    this.shiftType = shiftType;
    this.offsetIntImmValue = null;
    this.rs = rs;
  }

  public String print() {
    String start = shiftType.toString();
    assert offsetIntImmValue != null || rs != null;
    if (offsetIntImmValue != null) {
      return start + " " + offsetIntImmValue.print();
    } else {
      return start + " " + rs.print();
    }
  }
}

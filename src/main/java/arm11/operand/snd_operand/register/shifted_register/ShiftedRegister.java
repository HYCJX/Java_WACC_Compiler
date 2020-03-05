package arm11.operand.snd_operand.register.shifted_register;

import arm11.operand.snd_operand.SndOperand;
import arm11.operand.snd_operand.register.Register;

public class ShiftedRegister implements SndOperand {

  private final Register rm;
  private final Shift shift;

  public ShiftedRegister(Register rm, Shift shift) {
    this.rm = rm;
    this.shift = shift;
  }

  public String print() {
    return rm.print() + ", " + shift.print();
  }
}

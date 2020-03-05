package arm11.instruction.data_processing;

/* Instruction in the form RSB{S}{cond} {Rd}, Rn, Operand2 */

import arm11.instruction.ConditionToken;
import arm11.operand.snd_operand.SndOperand;
import arm11.operand.snd_operand.register.Register;

public class RsbInstruction extends AbstractDPInstruction {

  public RsbInstruction(
      ConditionToken condition, boolean flag, Register rd, Register rn, SndOperand secondOP) {
    super(DPToken.RSB, condition, flag, rd, rn, secondOP);
  }

  public RsbInstruction(boolean flag, Register rd, Register rn, SndOperand secondOP) {
    this(null, flag, rd, rn, secondOP);
  }

  public RsbInstruction(ConditionToken condition, Register rd, Register rn, SndOperand secondOP) {
    this(condition, false, rd, rn, secondOP);
  }

  public RsbInstruction(Register rd, Register rn, SndOperand secondOp) {
    this(null, false, rd, rn, secondOp);
  }
}

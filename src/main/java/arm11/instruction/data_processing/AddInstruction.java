package arm11.instruction.data_processing;

/* Instruction in the form ADD{S}{cond} {Rd}, Rn, Operand2 */

import arm11.instruction.ConditionToken;
import arm11.operand.snd_operand.SndOperand;
import arm11.operand.snd_operand.register.Register;

public final class AddInstruction extends AbstractDPInstruction {

  public AddInstruction(
      ConditionToken condition, boolean flag, Register rd, Register rn, SndOperand secondOP) {
    super(DPToken.ADD, condition, flag, rd, rn, secondOP);
  }

  public AddInstruction(boolean flag, Register rd, Register rn, SndOperand secondOP) {
    this(null, flag, rd, rn, secondOP);
  }

  public AddInstruction(ConditionToken condition, Register rd, Register rn, SndOperand secondOP) {
    this(condition, false, rd, rn, secondOP);
  }

  public AddInstruction(Register rd, Register rn, SndOperand secondOp) {
    this(null, false, rd, rn, secondOp);
  }
}

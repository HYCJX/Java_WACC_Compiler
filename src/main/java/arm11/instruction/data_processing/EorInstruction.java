package arm11.instruction.data_processing;

/* Instruction in the form EOR{S}{cond} {Rd}, Rn, Operand2 */

import arm11.instruction.ConditionToken;
import arm11.operand.snd_operand.SndOperand;
import arm11.operand.snd_operand.register.Register;

public final class EorInstruction extends AbstractDPInstruction {

  public EorInstruction(
      ConditionToken condition, boolean flag, Register rd, Register rn, SndOperand secondOP) {
    super(DPToken.EOR, condition, flag, rd, rn, secondOP);
  }

  public EorInstruction(boolean flag, Register rd, Register rn, SndOperand secondOP) {
    this(null, flag, rd, rn, secondOP);
  }

  public EorInstruction(ConditionToken condition, Register rd, Register rn, SndOperand secondOP) {
    this(condition, false, rd, rn, secondOP);
  }

  public EorInstruction(Register rd, Register rn, SndOperand secondOp) {
    this(null, false, rd, rn, secondOp);
  }
}

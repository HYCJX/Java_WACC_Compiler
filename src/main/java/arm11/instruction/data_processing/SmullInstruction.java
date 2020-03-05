package arm11.instruction.data_processing;

/* SMULL{S}{cond} RdLo, RdHi, Rm, Rs*/

import arm11.instruction.ConditionToken;
import arm11.operand.snd_operand.SndOperand;
import arm11.operand.snd_operand.register.Register;

public class SmullInstruction extends AbstractDPInstruction {

  public SmullInstruction(
      ConditionToken condition, boolean flag, Register rd, Register rn, SndOperand secondOP) {
    super(DPToken.SMULL, condition, flag, rd, rn, secondOP);
  }

  public SmullInstruction(boolean flag, Register rd, Register rn, SndOperand secondOP) {
    this(null, flag, rd, rn, secondOP);
  }

  public SmullInstruction(ConditionToken condition, Register rd, Register rn, SndOperand secondOP) {
    this(condition, false, rd, rn, secondOP);
  }

  public SmullInstruction(Register rd, Register rn, SndOperand secondOp) {
    this(null, false, rd, rn, secondOp);
  }
}

package arm11.instruction.data_processing;

/* Instruction in the form ORR{S}{cond} {Rd}, Rn, Operand2 */

import arm11.instruction.ConditionToken;
import arm11.operand.snd_operand.SndOperand;
import arm11.operand.snd_operand.register.Register;

public class OrrInstruction extends AbstractDPInstruction {

  public OrrInstruction(
      ConditionToken condition, boolean flag, Register rd, Register rn, SndOperand secondOP) {
    super(DPToken.ORR, condition, flag, rd, rn, secondOP);
  }

  public OrrInstruction(boolean flag, Register rd, Register rn, SndOperand secondOP) {
    this(null, flag, rd, rn, secondOP);
  }

  public OrrInstruction(ConditionToken condition, Register rd, Register rn, SndOperand secondOP) {
    this(condition, false, rd, rn, secondOP);
  }

  public OrrInstruction(Register rd, Register rn, SndOperand secondOp) {
    this(null, false, rd, rn, secondOp);
  }
}

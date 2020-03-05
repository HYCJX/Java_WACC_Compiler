package arm11.instruction.data_processing;

/* CMP{cond} Rn, Operand2 */

import arm11.instruction.ConditionToken;
import arm11.instruction.Instruction;
import arm11.operand.snd_operand.SndOperand;
import arm11.operand.snd_operand.register.Register;

public final class CmpInstruction implements Instruction {

  // Conditional strings, including GT, LT, EQ and so on.
  private final ConditionToken condition;
  private final Register rn;
  private final SndOperand secondOp;

  public CmpInstruction(ConditionToken condition, Register rn, SndOperand secondOp) {
    this.condition = condition;
    this.rn = rn;
    this.secondOp = secondOp;
  }

  public CmpInstruction(Register rn, SndOperand secondOp) {
    this(null, rn, secondOp);
  }

  @Override
  public String print() {
    return "CMP " + (condition != null ? condition : "") + rn.print() + ", " + secondOp.print();
  }
}

package arm11.instruction.data_processing;

/* Extract similarities across the definitions of different data processing instructions */

import arm11.instruction.ConditionToken;
import arm11.instruction.Instruction;
import arm11.operand.snd_operand.SndOperand;
import arm11.operand.snd_operand.register.Register;

public abstract class AbstractDPInstruction implements Instruction {

  private final DPToken dpToken;
  private final ConditionToken condition; // Conditional strings, including GT, LT, EQ and so on.
  private final boolean flag; // Decide whether an "S" is added after "S".
  private final Register rd;
  private final Register rn;
  private final SndOperand secondOP;

  public AbstractDPInstruction(
      DPToken dpToken,
      ConditionToken condition,
      boolean flag,
      Register rd,
      Register rn,
      SndOperand secondOP) {
    this.dpToken = dpToken;
    this.condition = condition;
    this.flag = flag;
    this.rd = rd;
    this.rn = rn;
    this.secondOP = secondOP;
  }

  @Override
  public String print() {
    return String.valueOf(dpToken)
        + (condition != null ? condition : "")
        + (flag ? "S " : " ")
        + rd.print()
        + ", "
        + rn.print()
        + ", "
        + secondOP.print();
  }
}

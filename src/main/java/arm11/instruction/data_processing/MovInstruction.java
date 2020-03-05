package arm11.instruction.data_processing;

/* MOV{cond}{S} Rd, Operand2 */

import arm11.instruction.ConditionToken;
import arm11.instruction.Instruction;
import arm11.operand.snd_operand.SndOperand;
import arm11.operand.snd_operand.register.Register;

public final class MovInstruction implements Instruction {

  private final ConditionToken condition; // Conditional strings, including GT, LT, EQ and so on.
  private final boolean flag; // Decide whether an "S" is added after "S".
  private final Register rd;
  private final SndOperand secondOp;

  public MovInstruction(ConditionToken condition, boolean flag, Register rd, SndOperand secondOp) {
    this.condition = condition;
    this.flag = flag;
    this.rd = rd;
    this.secondOp = secondOp;
  }

  public MovInstruction(Register rd, SndOperand secondOp, boolean flag) {
    this(null, flag, rd, secondOp);
  }

  public MovInstruction(Register rd, SndOperand secondOp) {
    this(null, false, rd, secondOp);
  }

  @Override
  public String print() {
    return "MOV"
        + (condition != null ? condition : "")
        + (flag ? "S " : " ")
        + rd.print()
        + ", "
        + secondOp.print();
  }
}

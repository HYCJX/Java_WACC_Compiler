package arm11.instruction;

/* B{L}{cond} <expression>, expression can only be label. */

public final class BranchInstruction implements Instruction {

  private final String label;
  private final boolean flag; // The flag that indicates whether "L" is present.
  private final ConditionToken condition; // Conditional strings, including GT, LT, EQ and so on.

  public BranchInstruction(boolean flag, ConditionToken condition, String label) {
    this.flag = flag;
    this.condition = condition;
    this.label = label;
  }

  public BranchInstruction(ConditionToken condition, String label) {
    this(false, condition, label);
  }

  public BranchInstruction(boolean flag, String label) {
    this(flag, null, label);
  }

  public BranchInstruction(String label) {
    this(false, null, label);
  }

  @Override
  public String print() {
    return "B" + (flag ? "L" : "") + (condition != null ? condition : "") + " " + label;
  }
}

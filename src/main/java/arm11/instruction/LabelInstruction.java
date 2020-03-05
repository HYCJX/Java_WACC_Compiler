package arm11.instruction;

/* For convenience, define function labels as instructions. */

public final class LabelInstruction implements Instruction {

  private final String label;

  public LabelInstruction(String label) {
    this.label = label;
  }

  @Override
  public String print() {
    return label + ":";
  }
}

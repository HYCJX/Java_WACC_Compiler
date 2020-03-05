package arm11.instruction;

public final class DirectiveInstruction implements Instruction {

  private final String directive;

  public DirectiveInstruction(String directive) {
    this.directive = directive;
  }

  @Override
  public String print() {
    return "." + directive;
  }
}

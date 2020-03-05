package arm11.instruction.block_data_transfer;

import arm11.instruction.Instruction;
import arm11.operand.snd_operand.register.Register;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PushInstruction implements Instruction {

  private List<Register> registers; // The list of registers to push.

  public PushInstruction(Register... rs) {
    registers = new ArrayList<>();
    registers.addAll(Arrays.asList(rs));
  }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();
    builder.append("PUSH {");
    String prefix = "";
    for (Register operand : registers) {
      builder.append(prefix);
      prefix = ", ";
      builder.append(operand.print());
    }
    builder.append("}");
    return builder.toString();
  }
}

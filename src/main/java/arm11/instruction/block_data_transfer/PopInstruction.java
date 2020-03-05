package arm11.instruction.block_data_transfer;

import arm11.instruction.Instruction;
import arm11.operand.snd_operand.register.Register;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PopInstruction implements Instruction {

  private List<Register> registers; // The list of registers to pop.

  public PopInstruction(Register... rs) {
    this.registers = new ArrayList<>();
    this.registers.addAll(Arrays.asList(rs));
  }

  @Override
  public String print() {
    StringBuilder builder = new StringBuilder();
    builder.append("POP {");
    String prefix = "";
    for (Register register : registers) {
      builder.append(prefix);
      prefix = ", ";
      builder.append(register.print());
    }
    builder.append("}");
    return builder.toString();
  }
}

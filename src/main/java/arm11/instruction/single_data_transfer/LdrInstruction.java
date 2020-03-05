package arm11.instruction.single_data_transfer;

/* LDR{type}{cond} Rd, <Address> */

import arm11.instruction.ConditionToken;
import arm11.instruction.Instruction;
import arm11.operand.address.Address;
import arm11.operand.snd_operand.register.Register;

public final class LdrInstruction implements Instruction {

  private final LoadStoreType type; // Type may be B or SB.
  private final ConditionToken condition; // Conditional strings, including GT, LT, EQ and so on.
  private final Register rd;
  private final Address address;

  public LdrInstruction(
      LoadStoreType type, ConditionToken condition, Register rd, Address address) {
    this.type = type;
    this.condition = condition;
    this.rd = rd;
    this.address = address;
  }

  public LdrInstruction(ConditionToken condition, Register rd, Address address) {
    this(null, condition, rd, address);
  }

  public LdrInstruction(LoadStoreType type, Register rd, Address address) {
    this(type, null, rd, address);
  }

  public LdrInstruction(Register rd, Address address) {
    this(null, null, rd, address);
  }

  @Override
  public String print() {
    return "LDR"
        + (type != null ? type.toString() : "")
        + (condition != null ? String.valueOf(condition) : "")
        + " "
        + rd.print()
        + ", "
        + address.print();
  }
}

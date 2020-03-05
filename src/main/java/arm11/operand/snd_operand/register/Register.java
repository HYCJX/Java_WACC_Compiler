package arm11.operand.snd_operand.register;

import arm11.operand.snd_operand.SndOperand;

public class Register implements SndOperand {

  private final int num;

  public Register(int num) {
    this.num = num;
  }

  public int getNum() {
    return num;
  }

  @Override
  public String print() {
    return "r" + num;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Register)) {
      return false;
    }
    Register register = (Register) obj;
    return this.num == register.getNum();
  }

  @Override
  public int hashCode() {
    return num;
  }
}

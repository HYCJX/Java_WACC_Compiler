package arm11.operand.address.expression;

import arm11.operand.address.Address;

public class IntExpression implements Address {

  private final int num;

  public IntExpression(int num) {
    this.num = num;
  }

  @Override
  public String print() {
    return "=" + num;
  }
}

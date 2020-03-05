package arm11.operand.address.expression;

import arm11.operand.address.Address;

public final class StringExpression implements Address {

  private final String label;

  public StringExpression(String label) {
    this.label = label;
  }

  @Override
  public String print() {
    return "=" + label;
  }
}

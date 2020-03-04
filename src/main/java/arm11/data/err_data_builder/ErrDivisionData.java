package arm11.data.err_data_builder;

import arm11.data.Data;

public final class ErrDivisionData extends Data {

  public static final ErrDivisionData ERR_DIVISION_DATA = new ErrDivisionData();

  private ErrDivisionData() {
    super("DivideByZeroError: divide or modulo by zero\\n\\0");
  }
}

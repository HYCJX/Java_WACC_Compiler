package arm11.data.err_data_builder;

import arm11.data.Data;

public final class ErrOverflowData extends Data {

  public static final ErrOverflowData ERR_OVERFLOW_DATA = new ErrOverflowData();

  private ErrOverflowData() {
    super("OverflowError: the result is too small/large to store in a 4-byte signed-integer.\\n");
  }
}

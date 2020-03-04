package arm11.data.err_data_builder;

import arm11.data.Data;

public final class ErrArrNegIndexData extends Data {

  public static final ErrArrNegIndexData ERR_ARR_NEG_INDEX_DATA = new ErrArrNegIndexData();

  private ErrArrNegIndexData() {
    super("ArrayIndexOutOfBoundsError: negative index\\n\\0");
  }
}

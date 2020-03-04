package arm11.data.err_data_builder;

import arm11.data.Data;

public final class ErrNullRefData extends Data {

  public static final ErrNullRefData ERR_NULL_REF_DATA = new ErrNullRefData();

  private ErrNullRefData() {
    super("NullReferenceError: dereference a null reference\\n\\0");
  }
}

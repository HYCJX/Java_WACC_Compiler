package arm11.data.io_data_builder;

import arm11.data.Data;

public final class IOIntData extends Data {

  public static final IOIntData IO_INT_DATA = new IOIntData();

  private IOIntData() {
    super("%d\\0");
  }
}

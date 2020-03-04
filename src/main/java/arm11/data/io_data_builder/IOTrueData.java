package arm11.data.io_data_builder;

import arm11.data.Data;

public final class IOTrueData extends Data {

  public static final IOTrueData IO_TRUE_DATA = new IOTrueData();

  private IOTrueData() {
    super("true\\0");
  }
}

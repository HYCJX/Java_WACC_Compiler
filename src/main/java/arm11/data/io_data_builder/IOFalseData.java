package arm11.data.io_data_builder;

import arm11.data.Data;

public final class IOFalseData extends Data {

  public static final IOFalseData IO_FALSE_DATA = new IOFalseData();

  private IOFalseData() {
    super("false\\0");
  }
}

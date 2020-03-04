package arm11.data.io_data_builder;

import arm11.data.Data;

public final class IOLineData extends Data {

  public static final IOLineData IO_LINE_DATA = new IOLineData();

  private IOLineData() {
    super("\\0");
  }
}

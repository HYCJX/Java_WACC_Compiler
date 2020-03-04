package arm11.data.io_data_builder;

import arm11.data.Data;

public final class IOCharData extends Data {

  public static final IOCharData IO_CHAR_DATA = new IOCharData();

  private IOCharData() {
    super(" %c\\0");
  }
}

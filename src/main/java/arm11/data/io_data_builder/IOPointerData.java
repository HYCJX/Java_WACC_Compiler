package arm11.data.io_data_builder;

import arm11.data.Data;

public final class IOPointerData extends Data {

  public static final IOPointerData IO_POINTER_DATA = new IOPointerData();

  private IOPointerData() {
    super("%p\\0");
  }
}

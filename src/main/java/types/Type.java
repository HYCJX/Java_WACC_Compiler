package types;

import symbol_table.Node;

public interface Type extends Node {

  int getOffset(); // The byte offset for each type.
}

package types;

import ast.AST;
import symbol_table.Node;

public interface Type extends AST, Node {

  int getOffset(); // The byte offset for each type.
}

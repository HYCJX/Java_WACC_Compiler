package symbol_table;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

  private Map<String, Node> dictionary;
  private SymbolTable encSymTable;

  public SymbolTable(SymbolTable encSymTable) {
    dictionary = new HashMap<>();
    this.encSymTable = encSymTable;
  }

  public Map<String, Node> getDictionary() {
    return dictionary;
  }

  public SymbolTable getEncSymTable() {
    return encSymTable;
  }

  public void insert(String name, Node node) {
    dictionary.put(name, node);
  }

  // Look up the node with the given name in the local scope:
  public Node lookup(String name) {
    return dictionary.get(name);
  }

  // Look up the node with the given name in all larger scopes:
  // Used to handle multiple declarations of names:
  public Node lookupAll(String name) {
    SymbolTable current;
    for (current = this; current != null; current = current.getEncSymTable()) {
      Node result = current.getDictionary().get(name);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  // Get total offset of all variables in the local scope:
  public int getTotalOffset() {
    int result = 0;
    for (Node node : dictionary.values()) {
      result += getTypeOffset(node);
    }
    return result;
  }

  // Define variable offset:
  private int getTypeOffset(Node node) {
    switch (node.getTypeToken()) {
      case BOOL:
      case CHAR:
        return 1;
      case ARRAY:
      case INT:
      case NULL:
      case STRING:
      case PAIR:
        return 4;
      default:
        return 0;
    }
  }
}

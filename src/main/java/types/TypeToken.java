package types;

/* Identify type classes */

import symbol_table.NodeToken;

public enum TypeToken implements NodeToken {
  ANY,
  ARRAY,
  BOOL,
  CHAR,
  INT,
  NULL,
  PAIR,
  STRING;

  @Override
  public String toString() {
    return super.toString().toLowerCase();
  }
}

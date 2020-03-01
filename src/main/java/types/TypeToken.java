package types;

/* Identify type classes */

public enum TypeToken {
  FUNCTION,
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

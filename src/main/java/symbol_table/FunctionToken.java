package symbol_table;

public enum FunctionToken implements NodeToken {
  FUNCTION {
    @Override
    public String toString() {
      return super.toString().toLowerCase();
    }
  }
}

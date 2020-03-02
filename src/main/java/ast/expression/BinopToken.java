package ast.expression;

public enum BinopToken {
  MUL {
    @Override
    public String toString() {
      return "*";
    }
  },
  Div {
    @Override
    public String toString() {
      return "/";
    }
  },
  MOD {
    @Override
    public String toString() {
      return "%";
    }
  },
  ADD {
    @Override
    public String toString() {
      return "+";
    }
  },
  SUB {
    @Override
    public String toString() {
      return "-";
    }
  },
  GT {
    @Override
    public String toString() {
      return ">";
    }
  },
  GTE {
    @Override
    public String toString() {
      return ">=";
    }
  },
  LT {
    @Override
    public String toString() {
      return "<";
    }
  },
  LTE {
    @Override
    public String toString() {
      return "<=";
    }
  },
  EQ {
    @Override
    public String toString() {
      return "==";
    }
  },
  NEQ {
    @Override
    public String toString() {
      return "!=";
    }
  },
  AND {
    @Override
    public String toString() {
      return "&&";
    }
  },
  OR {
    @Override
    public String toString() {
      return "||";
    }
  }
}

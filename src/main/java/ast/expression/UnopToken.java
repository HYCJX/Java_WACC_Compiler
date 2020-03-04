package ast.expression;

public enum UnopToken {
  NOT {
    @Override
    public String toString() {
      return "!";
    }
  },
  NEG {
    @Override
    public String toString() {
      return "neg";
    }
  },
  LEN {
    @Override
    public String toString() {
      return "len";
    }
  },
  ORD {
    @Override
    public String toString() {
      return "ord";
    }
  },
  CHR {
    @Override
    public String toString() {
      return "chr";
    }
  }
}

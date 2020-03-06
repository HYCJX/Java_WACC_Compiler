package ast.statement;

/* Statement types */

public enum StatToken {
  ASSIGN,
  BLOCK,
  CONDITION,
  DECLARATION,
  LOOP,
  NORMAL,
  READ,
  SKIP,
  COMPOSITION // Only in construction
}

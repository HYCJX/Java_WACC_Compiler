import org.junit.Test;
import symbol_table.Function;
import symbol_table.Node;
import symbol_table.SymbolTable;
import types.*;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SymbolTableTest {

  private SymbolTable symbolTable = new SymbolTable(null);
  private Map<String, Node> map;

  @Test
  public void intVarTest() {
    symbolTable.insert("x", new IntType());
    map = symbolTable.getDictionary();
    assertTrue(map.containsKey("x"));
    assertEquals(map.get("x").getTypeToken(), TypeToken.INT);
  }

  @Test
  public void stringVarTest() {
    symbolTable.insert("string", new StringType());
    map = symbolTable.getDictionary();
    assertTrue(map.containsKey("string"));
    assertEquals(map.get("string").getTypeToken(), TypeToken.STRING);
  }

  @Test
  public void arrIntVarTest() {
    ArrayType array = new ArrayType(new IntType());
    symbolTable.insert("array", array);
    map = symbolTable.getDictionary();
    assertTrue(map.containsKey("array"));
    assertEquals(map.get("array").getTypeToken(), TypeToken.ARRAY);
    assertEquals(((ArrayType) map.get("array")).getElemType().getTypeToken(), TypeToken.INT);
  }

  @Test
  public void pairIntCharVarTest() {
    Type intType = new IntType();
    Type charType = new CharType();
    PairType pair = new PairType(intType, charType);
    symbolTable.insert("intCharPair", pair);
    map = symbolTable.getDictionary();
    assertTrue(map.containsKey("intCharPair"));
    assertEquals(((PairType) map.get("intCharPair")).getFirst(), intType);
    assertEquals(((PairType) map.get("intCharPair")).getSecond(), charType);
  }

  @Test
  public void pairIntIntVarTest() {
    Type intType = new IntType();
    PairType pair = new PairType(intType, intType);
    symbolTable.insert("pair", pair);
    map = symbolTable.getDictionary();
    assertTrue(map.containsKey("pair"));
    assertEquals(((PairType) map.get("pair")).getFirst(), intType);
    assertEquals(((PairType) map.get("pair")).getSecond(), intType);
  }

  @Test
  public void functionTest() {
    Function function = new Function();
    symbolTable.insert("test", function);
    map = symbolTable.getDictionary();
    assertTrue(map.containsKey("test"));
  }
}

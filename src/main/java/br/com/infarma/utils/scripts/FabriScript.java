package br.com.infarma.utils.scripts;

public class FabriScript {

  private static FabriScript INSTANCE = new FabriScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static FabriScript getInstance() {
    return INSTANCE;
  }

  private FabriScript() {
    // INSERT
    insert.append("INSERT INTO FABRI (");
    insert.append(" Cod_Fabric, Des_Fabric, Num_Cnpj) ");
    insert.append(" VALUES (?,?,?);");

    //SELECT
    select.append("SELECT * FROM FABRI WHERE Cod_Fabric = ?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }


}

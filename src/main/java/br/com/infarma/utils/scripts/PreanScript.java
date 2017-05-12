package br.com.infarma.utils.scripts;

public class PreanScript {

  private static PreanScript INSTANCE = new PreanScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static PreanScript getInstance() {
    return INSTANCE;
  }

  private PreanScript() {
    // INSERT
    insert.append("INSERT INTO PREAN (");
    insert.append(" Cod_Produt, Cod_Ean, Qtd_FraVen) ");
    insert.append(" VALUES (?,?,?);");

    //SELECT
    select.append("SELECT * FROM PREAN WHERE Cod_Produt = ? AND Cod_Ean = ?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }


}

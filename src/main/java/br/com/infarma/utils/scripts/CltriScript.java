package br.com.infarma.utils.scripts;

public class CltriScript {

  private static CltriScript INSTANCE = new CltriScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static CltriScript getInstance() {
    return INSTANCE;
  }

  private CltriScript() {
    // INSERT
    insert.append("INSERT INTO CLTRI (");
    insert.append(" Cod_ClaTri, Des_ClaTri, Des_Observ) ");
    insert.append(" VALUES (?,?,?);");

    //SELECT
    select.append("SELECT * FROM CLTRI WHERE Cod_ClaTri=?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }

}

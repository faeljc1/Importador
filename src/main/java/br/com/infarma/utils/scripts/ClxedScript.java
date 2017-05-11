package br.com.infarma.utils.scripts;

public class ClxedScript {

  private static ClxedScript INSTANCE = new ClxedScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static ClxedScript getInstance() {
    return INSTANCE;
  }

  private ClxedScript() {
    // INSERT
    insert.append("INSERT INTO CLXED (");
    insert.append(" Cod_Client, Cod_EndFon) ");
    insert.append(" VALUES (?,?)");

    //SELECT
    select.append("SELECT * FROM CLXED WHERE Cod_Client=? AND Cod_EndFon=?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }

}

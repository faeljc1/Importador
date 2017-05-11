package br.com.infarma.utils.scripts;

public class SbbasScript {

  private static SbbasScript INSTANCE = new SbbasScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static SbbasScript getInstance() {
    return INSTANCE;
  }

  private SbbasScript() {
    // INSERT
    insert.append("INSERT INTO SBBAS (");
    insert.append(" Cod_SubBas, Des_SubBas, Cod_DCB) ");
    insert.append(" VALUES (?,?,?);");

    //SELECT
    select.append("SELECT * FROM SBBAS WHERE Cod_SubBas = ?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }


}

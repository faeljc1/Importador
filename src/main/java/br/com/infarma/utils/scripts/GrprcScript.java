package br.com.infarma.utils.scripts;

public class GrprcScript {

  private static GrprcScript INSTANCE = new GrprcScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static GrprcScript getInstance() {
    return INSTANCE;
  }

  private GrprcScript() {
    // INSERT
    insert.append("INSERT INTO GRPRC (");
    insert.append(" Cod_GrpPrc, Des_GrpPrc) ");
    insert.append(" VALUES (?,?);");

    //SELECT
    select.append("SELECT * FROM GRPRC WHERE Cod_GrpPrc = ?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }


}

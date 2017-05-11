package br.com.infarma.utils.scripts;

public class GrcliScript {

  private static GrcliScript INSTANCE = new GrcliScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static GrcliScript getInstance() {
    return INSTANCE;
  }

  private GrcliScript() {
    // INSERT
    insert.append("INSERT INTO GRCLI (");
    insert.append(" Cod_GrpCli, Des_GrpCli, Per_DscVct) ");
    insert.append(" VALUES (?,?,?);");

    //SELECT
    select.append("SELECT * FROM GRCLI WHERE Cod_GrpCli = ?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }
}

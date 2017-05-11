package br.com.infarma.utils.scripts;

public class FpgcbScript {

  private static FpgcbScript INSTANCE = new FpgcbScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static FpgcbScript getInstance() {
    return INSTANCE;
  }

  private FpgcbScript() {
    // INSERT
    insert.append("INSERT INTO FPGCB (");
    insert.append(" Cod_ForPag, Des_ForPag, Tip_ForPag, Cod_Finali) ");
    insert.append(" VALUES (?,?,'R',?);");

    //SELECT
    select.append("SELECT * FROM FPGCB WHERE Cod_ForPag = ?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }


}

package br.com.infarma.utils.scripts;

public class TbsecScript {

  private static TbsecScript INSTANCE = new TbsecScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static TbsecScript getInstance() {
    return INSTANCE;
  }

  private TbsecScript() {
    // INSERT
    insert.append("INSERT INTO TBSEC (");
    insert.append(" Cod_Seccao, Des_Seccao) ");
    insert.append(" VALUES (?,?);");

    //SELECT
    select.append("SELECT * FROM TBSEC WHERE Cod_Seccao = ?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }


}

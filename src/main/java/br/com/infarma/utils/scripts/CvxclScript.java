package br.com.infarma.utils.scripts;

public class CvxclScript {

  private static CvxclScript INSTANCE = new CvxclScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static CvxclScript getInstance() {
    return INSTANCE;
  }

  private CvxclScript() {
    // INSERT
    insert.append("INSERT INTO CVXCL (");
    insert.append(" Cod_Conven, Cod_Client, Num_Matric, Dat_UltCpr, Flg_Bloque, Val_LimCre) ");
    insert.append(" VALUES (?,?,?,?,?,?);");

    //SELECT
    select.append("SELECT * FROM CVXCL WHERE Cod_Conven=? AND Cod_Client=?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }

}

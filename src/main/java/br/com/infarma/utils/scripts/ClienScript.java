package br.com.infarma.utils.scripts;

public class ClienScript {

  private static ClienScript INSTANCE = new ClienScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static ClienScript getInstance() {
    return INSTANCE;
  }

  private ClienScript() {
    // INSERT
    insert.append("INSERT INTO CLIEN (");
    insert.append(" Cod_Client, Nom_Client, Dat_Cadast, Cod_GrpCli, Sex_Client, Num_CpfCgc, Num_RgCgf, Dia_Nascim, Mes_Nascim, Ano_Nascim, Num_FonCel, ");
    insert.append(" Ctr_Vencim, Des_Observ, Flg_Bloque, Cod_EndRes, Cod_RegTri, Val_LimCre, Des_Email) ");
    insert.append(" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

    //SELECT
    select.append("SELECT * FROM CLIEN WHERE Cod_Client=?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }

}

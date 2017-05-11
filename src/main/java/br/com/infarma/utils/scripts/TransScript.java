package br.com.infarma.utils.scripts;

public class TransScript {

  private static TransScript INSTANCE = new TransScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static TransScript getInstance() {
    return INSTANCE;
  }

  private TransScript() {
    // INSERT
    insert.append("INSERT INTO TRANS (");
    insert.append(" Cod_Transp, Des_RazSoc, Des_Fantas, Num_CgcCpf, Num_CgfRg, Des_Endere, Des_Bairro, Des_Cidade, Des_Estado, ");
    insert.append(" Num_Cep, Num_Fone, Num_Fax, Nom_Contat, Cod_RegTri, Flg_Bloque, Cod_IBGE, Num_Inscri, Num_RG) ");
    insert.append(" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");

    //SELECT
    select.append("SELECT * FROM TRANS WHERE Cod_Transp = ?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }

}

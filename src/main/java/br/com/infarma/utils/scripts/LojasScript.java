package br.com.infarma.utils.scripts;

public class LojasScript {

  private static LojasScript INSTANCE = new LojasScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static LojasScript getInstance() {
    return INSTANCE;
  }

  private LojasScript() {
    // INSERT
    insert.append("SET DATEFORMAT YMD INSERT INTO LOJAS (Cod_Loja, Des_Loja, Des_RazSoc, Cod_GrpLoj, Cod_RegTri, Num_Cnpj, ");
    insert.append(" Num_Inscri, Des_Endere, Num_Endere, Des_Bairro, Num_Cep, Des_Cidade, Des_Estado, Num_Fone, Nom_Farmac, ");
    insert.append(" Dat_Cadast, Per_AlqIcm, Cod_Munici, Tip_TriLuc, Cod_IBGE, Par_DatUltFecDia) ");
    insert.append(" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

    //SELECT
    select.append("SELECT * FROM LOJAS WHERE Cod_Loja = ?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }

}

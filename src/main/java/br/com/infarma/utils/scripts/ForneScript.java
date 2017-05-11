package br.com.infarma.utils.scripts;

public class ForneScript {

  private static ForneScript INSTANCE = new ForneScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder insertAll = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static ForneScript getInstance() {
    return INSTANCE;
  }

  private ForneScript() {
    // INSERT
    insert.append("INSERT INTO FORNE (");
    insert.append(" Cod_Fornec, Des_RazSoc, Des_Fantas, Num_CgcCpf, Num_CgfRg, Des_Endere, Des_Cidade, Des_Estado, Cod_RegTri, ");
    insert.append(" Des_Bairro, Num_Cep, Num_Fone, Num_Fax, Des_Observ, Cod_IBGE, Flg_Bloque) ");
    insert.append(" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");

    insertAll.append("INSERT INTO FORNE (");
    insertAll.append(" Cod_Fornec, Des_RazSoc, Des_Fantas, Num_CgcCpf, Num_CgfRg, Des_Endere, Des_Bairro, Des_Cidade, Des_Estado, ");
    insertAll.append(" Cod_RegTri, Num_Cep, Num_Fone, Num_Fax, Nom_Contat, Per_Markup, Per_AcrCus, Tip_Descon, Per_Descon, ");
    insertAll.append(" Des_Observ, Flg_Bloque, Qtd_DiaPrz, Flg_NaoRepIcm, Cod_IBGE, Des_Token, Isn_PlcFin) ");
    insertAll.append(" VALUES (?,?,?,?,?,?,?);");

    //SELECT
    select.append("SELECT * FROM FORNE WHERE Cod_Fornec = ?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getInsertAll() {
    return insertAll.toString();
  }

  public String getSelect() {
    return select.toString();
  }
}

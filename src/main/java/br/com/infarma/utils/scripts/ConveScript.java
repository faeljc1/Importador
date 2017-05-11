package br.com.infarma.utils.scripts;

public class ConveScript {

  private static ConveScript INSTANCE = new ConveScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static ConveScript getInstance() {
    return INSTANCE;
  }

  private ConveScript() {
    // INSERT
    insert.append("INSERT INTO CONVE (");
    insert.append(" Cod_Conven, Des_Conven, Tip_Conven, Qtd_DiaFec, Qtd_DiaVct, Num_CgcCpf, Des_RazSoc, Des_Endere, Des_Bairro, Des_Cidade, ");
    insert.append(" Des_Estado, Num_Cep, Num_Fone, Nom_Contat, Cod_AgeCob, Num_SeqFec, Qtd_MaxPcl, Flg_Bloque, Dia_Fecha1) ");
    insert.append(" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

    //SELECT
    select.append("SELECT * FROM CONVE WHERE Cod_Conven=?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }

}

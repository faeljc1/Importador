package br.com.infarma.utils.scripts;

public class EnderScript {

  private static EnderScript INSTANCE = new EnderScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder insertAll = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static EnderScript getInstance() {
    return INSTANCE;
  }

  private EnderScript() {
    // INSERT
    insert.append("IF NOT EXISTS(SELECT 1 FROM ENDER WHERE Cod_EndFon = ?) ");
    insert.append(" INSERT INTO ENDER (Cod_EndFon, Des_Endere, Des_Bairro, ");
    insert.append("  Num_Cep, Des_Cidade, Des_Estado, Nom_Contat, Dat_Cadast, Cod_LojOri) ");
    insert.append(" VALUES (?,?,?,?,?,?,?,?,?);");

    //SELECT
    select.append("SELECT * FROM ENDER WHERE Cod_EndFon = ?");
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

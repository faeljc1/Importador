package br.com.infarma.utils.scripts;

public class VendeScript {

  private static VendeScript INSTANCE = new VendeScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static VendeScript getInstance() {
    return INSTANCE;
  }

  private VendeScript() {
    // INSERT
    insert.append("INSERT INTO VENDE (");
    insert.append(" Cod_Vended, Nom_Vended, Cod_TabCom, Flg_Bloque, Num_Cpf) ");
    insert.append(" VALUES (?,?,?,?,?,?,?);");

    //SELECT
    select.append("SELECT * FROM VENDE WHERE Cod_Vended = ?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }









}

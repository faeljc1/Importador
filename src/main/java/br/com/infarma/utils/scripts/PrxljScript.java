package br.com.infarma.utils.scripts;

public class PrxljScript {

  private static PrxljScript INSTANCE = new PrxljScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder update = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static PrxljScript getInstance() {
    return INSTANCE;
  }

  private PrxljScript() {
    // INSERT
    insert.append("INSERT INTO PRXLJ (");
    insert.append(" Cod_Loja, Cod_Produt, Prc_VenAtu, Prc_CusLiq, Prc_CusLiqMed, Prc_CusEnt, Dat_PrcVenAtu, Flg_BlqCom, ");
    insert.append(" Flg_BlqVen, Flg_BlqDsc)  VALUES (?,?,?,?,?,?,?,?,?,?)");

    update.append("UPDATE PRXLJ SET");
    update.append(" Prc_VenAtu = ?, Prc_CusLiq = ?, Prc_CusLiqMed = ?, Prc_CusEnt = ?, Dat_PrcVenAtu = ?, Flg_BlqCom = ?, ");
    update.append(" Flg_BlqVen = ?, Flg_BlqDsc = ? WHERE Cod_Loja = ? AND Cod_Produt = ?");

    //SELECT
    select.append("SELECT * FROM PRXLJ WHERE Cod_Loja = ? AND Cod_Produt = ?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getUpdate() {
    return update.toString();
  }

  public String getSelect() {
    return select.toString();
  }
}

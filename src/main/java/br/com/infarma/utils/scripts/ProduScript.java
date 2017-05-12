package br.com.infarma.utils.scripts;

public class ProduScript {

  private static ProduScript INSTANCE = new ProduScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static ProduScript getInstance() {
    return INSTANCE;
  }

  private ProduScript() {
    // INSERT
    insert.append("INSERT INTO PRODU (");
    insert.append(" Cod_Produt, Des_Produt, Des_Resumi, Des_Comple, Dat_Implan, Des_UniVen, Des_UniCom, Qtd_FraVen, Cod_Fabric,");
    insert.append(" Cod_Ean, Ctr_Preco, Ctr_Lista, Ctr_Venda, Ctr_Origem, Cod_ClaTri, Cod_Classi, Cod_Clafis, Qtd_EmbVen, NUM_REGMS,) ");
    insert.append(" Cod_Ncm, Cod_TipIte, Cod_Seccao, Cod_GrpPrc, Cod_SubBas, Cod_CEST) ");
    insert.append(" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

    //SELECT
    select.append("SELECT * FROM PRODU WHERE Cod_Produt=?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }

}

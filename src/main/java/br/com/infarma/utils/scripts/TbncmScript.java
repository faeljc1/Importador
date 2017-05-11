package br.com.infarma.utils.scripts;

public class TbncmScript {

  private static TbncmScript INSTANCE = new TbncmScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static TbncmScript getInstance() {
    return INSTANCE;
  }

  private TbncmScript() {
    // INSERT
    insert.append("INSERT INTO TBNCM (");
    insert.append(" Cod_Ncm, Des_Ncm, Cst_PisEntTri, Cst_PisSaiTri, Cst_PisEntNaoTri, Cst_PisSaiNaoTri, Cst_CofEntTri, ");
    insert.append(" Cst_CofSaiTri, Cst_CofEntNaoTri, Cst_CofSaiNaoTri, Cod_SeqNat, Alq_IbptNac, Alq_IbptImp) ");
    insert.append(" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");

    //SELECT
    select.append("SELECT * FROM TBNCM WHERE Cod_Ncm = ?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }


}

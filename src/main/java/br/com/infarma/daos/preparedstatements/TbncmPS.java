package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Tbncm;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TbncmPS {

  private static TbncmPS INSTANCE = new TbncmPS();

  public static TbncmPS getInstance() {
    return INSTANCE;
  }

  private TbncmPS() {
  }

  public void insert(PreparedStatement ps, Tbncm tbncm) throws SQLException {
    ps.setString(1, tbncm.getCodNcm());
    ps.setString(2, tbncm.getDesNcm());
    ps.setString(3, tbncm.getCstPisEntTri());
    ps.setString(4, tbncm.getCstPisSaiTri());
    ps.setString(5, tbncm.getCstPisEntNaoTri());
    ps.setString(6, tbncm.getCstPisSaiNaoTri());
    ps.setString(7, tbncm.getCstCofEntTri());
    ps.setString(8, tbncm.getCstCofSaiTri());
    ps.setString(9, tbncm.getCstCofEntNaoTri());
    ps.setString(10, tbncm.getCstCofSaiNaoTri());
    ps.setInt(11, tbncm.getCodSeqNat());
    ps.setBigDecimal(12, tbncm.getAlqIbptNac());
    ps.setBigDecimal(13, tbncm.getAlqIbptImp());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param tbncm
   * @throws SQLException
   */
}

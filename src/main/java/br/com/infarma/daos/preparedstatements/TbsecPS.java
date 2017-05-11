package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Tbsec;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TbsecPS {

  private static TbsecPS INSTANCE = new TbsecPS();

  public static TbsecPS getInstance() {
    return INSTANCE;
  }

  private TbsecPS() {
  }

  public void insert(PreparedStatement ps, Tbsec tbsec) throws SQLException {
    ps.setInt(1, tbsec.getCodSeccao());
    ps.setString(2, tbsec.getDesSeccao());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param tbsec
   * @throws SQLException
   */
}

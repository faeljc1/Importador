package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Fpgcb;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FpgcbPS {

  private static FpgcbPS INSTANCE = new FpgcbPS();

  public static FpgcbPS getInstance() {
    return INSTANCE;
  }

  private FpgcbPS() {
  }

  public void insert(PreparedStatement ps, Fpgcb fpgcb) throws SQLException {
    ps.setInt(1, fpgcb.getCodForPag());
    ps.setString(2, fpgcb.getDesForPag());
    ps.setString(3, fpgcb.getTipForPag());
    ps.setString(4, fpgcb.getCodFinali());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param fpgcb
   * @throws SQLException
   */
}

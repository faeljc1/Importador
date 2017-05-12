package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Prean;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreanPS {

  private static PreanPS INSTANCE = new PreanPS();

  public static PreanPS getInstance() {
    return INSTANCE;
  }

  private PreanPS() {
  }

  public void insert(PreparedStatement ps, Prean prean) throws SQLException {
    ps.setInt(1, prean.getCodProdut());
    ps.setString(2, prean.getCodEan());
    ps.setInt(3, prean.getQtdFraVen());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param prean
   * @throws SQLException
   */
}

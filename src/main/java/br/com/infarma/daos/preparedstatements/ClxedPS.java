package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Clxed;
import br.com.infarma.models.Fabri;
import br.com.infarma.models.Trans;
import br.com.infarma.models.Vende;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClxedPS {

  private static ClxedPS INSTANCE = new ClxedPS();

  public static ClxedPS getInstance() {
    return INSTANCE;
  }

  private ClxedPS() {
  }

  public void insert(PreparedStatement ps, Clxed clxed) throws SQLException {
    ps.setInt(1, clxed.getCodClient());
    ps.setString(2, clxed.getCodEndFon());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param clxed
   * @throws SQLException
   */
}

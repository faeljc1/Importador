package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Fabri;
import br.com.infarma.models.Trans;
import br.com.infarma.models.Vende;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FabriPS {

  private static FabriPS INSTANCE = new FabriPS();

  public static FabriPS getInstance() {
    return INSTANCE;
  }

  private FabriPS() {
  }

  public void insert(PreparedStatement ps, Fabri fabri) throws SQLException {
    ps.setInt(1, fabri.getCodFabric());
    ps.setString(2, fabri.getDesFabric());
    ps.setString(3, fabri.getNumCnpj());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param fabri
   * @throws SQLException
   */
}

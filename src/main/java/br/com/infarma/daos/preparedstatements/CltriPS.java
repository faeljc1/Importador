package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Cltri;
import br.com.infarma.models.Fabri;
import br.com.infarma.models.Trans;
import br.com.infarma.models.Vende;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CltriPS {

  private static CltriPS INSTANCE = new CltriPS();

  public static CltriPS getInstance() {
    return INSTANCE;
  }

  private CltriPS() {
  }

  public void insert(PreparedStatement ps, Cltri cltri) throws SQLException {
    ps.setString(1, cltri.getCodClaTri());
    ps.setString(2, cltri.getDesClaTri());
    ps.setString(3, cltri.getDesObserv());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param cltri
   * @throws SQLException
   */
}

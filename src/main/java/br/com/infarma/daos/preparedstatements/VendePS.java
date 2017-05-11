package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Trans;
import br.com.infarma.models.Vende;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendePS {

  private static VendePS INSTANCE = new VendePS();

  public static VendePS getInstance() {
    return INSTANCE;
  }

  private VendePS() {
  }

  public void insert(PreparedStatement ps, Vende vende) throws SQLException {
    ps.setInt(1, vende.getCodVended());
    ps.setString(2, vende.getNomVended());
    ps.setInt(3, vende.getCodTabCom());
    ps.setBoolean(4, vende.getFlgBloque());
    ps.setString(5, vende.getNumCpf());
  }

  public void insertAll(PreparedStatement ps, Vende vende) throws SQLException {
    ps.setInt(1, vende.getCodVended());
    ps.setString(2, vende.getNomVended());
    ps.setInt(3, vende.getCodTabCom());
    ps.setBoolean(4, vende.getFlgBloque());
    ps.setString(5, vende.getSnhVended());
    ps.setString(6, vende.getSnhHash());
    ps.setString(7, vende.getNumCpf());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param vende
   * @throws SQLException
   */
}

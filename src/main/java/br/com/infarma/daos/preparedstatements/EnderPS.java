package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Ender;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnderPS {

  private static EnderPS INSTANCE = new EnderPS();

  public static EnderPS getInstance() {
    return INSTANCE;
  }

  private EnderPS() {
  }

  public void insert(PreparedStatement ps, Ender ender) throws SQLException {
    ps.setString(1, ender.getCodEndFon());
    ps.setString(2, ender.getCodEndFon());
    ps.setString(3, ender.getDesEndere());
    ps.setString(4, ender.getDesBairro());
    ps.setString(5, ender.getNumCep());
    ps.setString(6, ender.getDesCidade());
    ps.setString(7, ender.getDesEstado());
    ps.setString(8, ender.getNomContat());
    ps.setTimestamp(9, ender.getDatCadast());
    ps.setInt(10, ender.getCodLojOri());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param ender
   * @throws SQLException
   */
}

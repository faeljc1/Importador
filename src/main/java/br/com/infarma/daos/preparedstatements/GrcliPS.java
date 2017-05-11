package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Grcli;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GrcliPS {

  private static GrcliPS INSTANCE = new GrcliPS();

  public static GrcliPS getInstance() {
    return INSTANCE;
  }

  private GrcliPS() {
  }

  public void insert(PreparedStatement ps, Grcli grcli) throws SQLException {
    ps.setInt(1, grcli.getCodGrpCli());
    ps.setString(2, grcli.getDesGrpCli());
    ps.setBigDecimal(3, grcli.getPprDscVct());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param grcli
   * @throws SQLException
   */
}

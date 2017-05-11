package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Sbbas;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SbbasPS {

  private static SbbasPS INSTANCE = new SbbasPS();

  public static SbbasPS getInstance() {
    return INSTANCE;
  }

  private SbbasPS() {
  }

  public void insert(PreparedStatement ps, Sbbas sbbas) throws SQLException {
    ps.setInt(1, sbbas.getCodSubBas());
    ps.setString(2, sbbas.getDesSubBas());
    ps.setString(2, sbbas.getCodDCB());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param grprc
   * @throws SQLException
   */
}

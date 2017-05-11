package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Class;
import br.com.infarma.models.Fabri;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClassPS {

  private static ClassPS INSTANCE = new ClassPS();

  public static ClassPS getInstance() {
    return INSTANCE;
  }

  private ClassPS() {
  }

  public void insert(PreparedStatement ps, Class aClass) throws SQLException {
    ps.setString(1, aClass.getCodClassi());
    ps.setString(2, aClass.getDesClassi());
    ps.setInt(3, aClass.getNumNivel());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param fabri
   * @throws SQLException
   */
}

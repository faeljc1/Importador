package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Grprc;
import br.com.infarma.models.Tbsec;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GrprcPS {

  private static GrprcPS INSTANCE = new GrprcPS();

  public static GrprcPS getInstance() {
    return INSTANCE;
  }

  private GrprcPS() {
  }

  public void insert(PreparedStatement ps, Grprc grprc) throws SQLException {
    ps.setString(1, grprc.getCodGrpPrc());
    ps.setString(2, grprc.getDesGrpPrc());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param grprc
   * @throws SQLException
   */
}

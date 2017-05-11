package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Cvxcl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CvxclPS {

  private static CvxclPS INSTANCE = new CvxclPS();

  public static CvxclPS getInstance() {
    return INSTANCE;
  }

  private CvxclPS() {
  }

  public void insert(PreparedStatement ps, Cvxcl cvxcl) throws SQLException {
    ps.setInt(1, cvxcl.getCodConven());
    ps.setInt(2, cvxcl.getCodClient());
    ps.setString(3, cvxcl.getNumMatric());
    ps.setTimestamp(4, cvxcl.getDatUltCpr());
    ps.setBoolean(5, cvxcl.getFlgBloque());
    ps.setBigDecimal(6, cvxcl.getValLimCre());
  }

  public void insertAll(PreparedStatement ps, Cvxcl cvxcl) throws SQLException {
    ps.setInt(1, cvxcl.getCodConven());
    ps.setInt(2, cvxcl.getCodClient());
    ps.setString(3, cvxcl.getNumMatric());
    ps.setBigDecimal(4, cvxcl.getValLimCre());
    ps.setBigDecimal(5, cvxcl.getValCprPer());
    ps.setInt(6, cvxcl.getQtdCprPer());
    ps.setInt(7, cvxcl.getQtdItePer());
    ps.setInt(8, cvxcl.getQtdVolPer());
    ps.setTimestamp(9, cvxcl.getDatUltCpr());
    ps.setBoolean(10, cvxcl.getFlgBloque());
    ps.setInt(11, cvxcl.getIsnCliCvn());
    ps.setInt(12, cvxcl.getCodIdent1());
    ps.setString(13, cvxcl.getSnhHasAceWeb());
    ps.setString(14, cvxcl.getTokAceWeb());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param cvxcl
   * @throws SQLException
   */
}

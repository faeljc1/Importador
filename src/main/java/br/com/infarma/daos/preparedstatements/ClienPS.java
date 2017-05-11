package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Clien;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienPS {

  private static ClienPS INSTANCE = new ClienPS();

  public static ClienPS getInstance() {
    return INSTANCE;
  }

  private ClienPS() {
  }

  public void insert(PreparedStatement ps, Clien clien) throws SQLException {
    ps.setInt(1, clien.getCodClient());
    ps.setString(2, clien.getNomClient());
    ps.setTimestamp(3, clien.getDatCadast());
    ps.setInt(4, clien.getCodGrpCli());
    ps.setString(5, clien.getSexClient());
    ps.setString(6, clien.getNumCpfCgc());
    ps.setString(7, clien.getNumRGCgf());
    ps.setString(8, clien.getDiaNascim());
    ps.setString(9, clien.getMesNascim());
    ps.setString(10, clien.getAnoNascim());
    ps.setString(11, clien.getNumFonCel());
    ps.setString(12, clien.getCtrVencim());
    ps.setString(13, clien.getDesObserv());
    ps.setBoolean(14, clien.getFlgBloque());
    ps.setString(15, clien.getCodEndRes());
    ps.setInt(16, clien.getCodRegTri());
    ps.setBigDecimal(17, clien.getValLimCre());
    ps.setString(18, clien.getDesEmail());
  }

  public void insertAll(PreparedStatement ps, Clien clien) throws SQLException {
    ps.setInt(1, clien.getCodClient());
    ps.setString(2, clien.getNomClient());
    ps.setTimestamp(3, clien.getDatCadast());
    ps.setInt(4, clien.getCodGrpCli());
    ps.setString(5, clien.getSexClient());
    ps.setString(6, clien.getNumCpfCgc());
    ps.setString(7, clien.getNumRGCgf());
    ps.setString(8, clien.getNumFonCel());
    ps.setString(9, clien.getDesEmail());
    ps.setString(10, clien.getDiaNascim());
    ps.setString(11, clien.getMesNascim());
    ps.setString(12, clien.getAnoNascim());
    ps.setString(13, clien.getCtrVencim());
    ps.setInt(14, clien.getQtdDiaVct());
    ps.setInt(15, clien.getDiaVenci1());
    ps.setInt(16, clien.getDiaVenci2());
    ps.setBigDecimal(17, clien.getValLimCre());
    ps.setBigDecimal(18, clien.getValCprPer());
    ps.setInt(19, clien.getQtdCprPer());
    ps.setTimestamp(20, clien.getDatUltCpr());
    ps.setString(21, clien.getDesObserv());
    ps.setBoolean(22, clien.getFlgBloque());
    ps.setBigDecimal(23, clien.getValAtraso());
    ps.setString(24, clien.getCodEndRes());
    ps.setString(25, clien.getNomPaiCli());
    ps.setString(26, clien.getNomMaeCli());
    ps.setString(27, clien.getCodEndCob());
    ps.setBoolean(28, clien.getFlgNaoJur());
    ps.setInt(29, clien.getCodRegTri());
    ps.setInt(30, clien.getIsnPlcFin());
    ps.setString(31, clien.getSnhHash());
    ps.setBoolean(32, clien.getFlgAutEml());
    ps.setString(33, clien.getNumInscri());
    ps.setString(34, clien.getNumRG());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param clien
   * @throws SQLException
   */
}

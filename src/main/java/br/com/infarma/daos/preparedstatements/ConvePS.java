package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Conve;
import br.com.infarma.models.Forne;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConvePS {

  private static ConvePS INSTANCE = new ConvePS();

  public static ConvePS getInstance() {
    return INSTANCE;
  }

  private ConvePS() {
  }

  public void insert(PreparedStatement ps, Conve conve) throws SQLException {
    ps.setInt(1, conve.getCodConven());
    ps.setString(2, conve.getDesConven());
    ps.setString(3, conve.getTipConven());
    ps.setInt(4, conve.getQtdDiaFec());
    ps.setInt(5, conve.getQtdDiaVct());
    ps.setString(6, conve.getNumCgcCpf());
    ps.setString(7, conve.getDesRazSoc());
    ps.setString(8, conve.getDesEndere());
    ps.setString(9, conve.getDesBairro());
    ps.setString(10, conve.getDesCidade());
    ps.setString(11, conve.getDesEstado());
    ps.setString(12, conve.getNumCep());
    ps.setString(13, conve.getNumFone());
    ps.setString(14, conve.getNomContat());
    ps.setInt(15, conve.getCodAgeCob());
    ps.setInt(16, conve.getNumSeqFec());
    ps.setInt(17, conve.getQtdMaxPcl());
    ps.setBoolean(18, conve.getFlgBloque());
    ps.setInt(19, conve.getDiaFecha1());
  }

  public void insertAll(PreparedStatement ps, Conve conve) throws SQLException {
    ps.setInt(1, conve.getCodConven());
    ps.setString(2, conve.getDesConven());
    ps.setString(3, conve.getTipConven());
    ps.setInt(4, conve.getQtdDiaFec());
    ps.setInt(5, conve.getQtdDiaVct());
    ps.setTimestamp(6, conve.getDatUltFec());
    ps.setTimestamp(7, conve.getDatPrxFec());
    ps.setString(8, conve.getNumCgcCpf());
    ps.setString(9, conve.getNumCgfRG());
    ps.setString(10, conve.getDesRazSoc());
    ps.setString(11, conve.getDesEndere());
    ps.setString(12, conve.getDesBairro());
    ps.setString(13, conve.getDesCidade());
    ps.setString(14, conve.getDesEstado());
    ps.setString(15, conve.getNumCep());
    ps.setString(16, conve.getNumFone());
    ps.setString(17, conve.getNumFax());
    ps.setString(18, conve.getNomContat());
    ps.setInt(19, conve.getCodAgeCob());
    ps.setString(20, conve.getDesObserv());
    ps.setBigDecimal(21, conve.getValLimCrePad());
    ps.setInt(22, conve.getNumSeqFec());
    ps.setBigDecimal(23, conve.getPerDesCvn());
    ps.setBigDecimal(24, conve.getPerDesCli());
    ps.setInt(25, conve.getDiaFecha1());
    ps.setInt(26, conve.getDiaFecha2());
    ps.setInt(27, conve.getQtdMaxPcl());
    ps.setBigDecimal(28, conve.getValMinPcl());
    ps.setBoolean(29, conve.getFlgDscPcl());
    ps.setBoolean(30, conve.getFlgCpvOrc());
    ps.setBoolean(31, conve.getFlgCpvEcf());
    ps.setBoolean(32, conve.getFlgBloque());
    ps.setInt(33, conve.getIsnCvnWeb());
    ps.setInt(34, conve.getIsnPlcFin());
    ps.setBoolean(35, conve.getFlgAceWeb());
    ps.setString(36, conve.getSnhHasAceWeb());
    ps.setString(37, conve.getEmail());
    ps.setBoolean(38, conve.getFlgAceWebCon());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param conve
   * @throws SQLException
   */
}

package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Forne;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FornePS {

  private static FornePS INSTANCE = new FornePS();

  public static FornePS getInstance() {
    return INSTANCE;
  }

  private FornePS() {
  }

  public void insert(PreparedStatement ps, Forne forne) throws SQLException {
    ps.setInt(1, forne.getCodFornec());
    ps.setString(2, forne.getDesRazSoc());
    ps.setString(3, forne.getDesFantas());
    ps.setString(4, forne.getNumCgcCpf());
    ps.setString(5, forne.getNumCgfRg());
    ps.setString(6, forne.getDesEndere());
    ps.setString(8, forne.getDesCidade());
    ps.setString(9, forne.getDesEstado());
    ps.setInt(10, forne.getCodRegTri());
    ps.setString(7, forne.getDesBairro());
    ps.setString(11, forne.getNumCep());
    ps.setString(12, forne.getNumFone());
    ps.setString(13, forne.getNumFax());
    ps.setString(19, forne.getDesObserv());
    ps.setInt(23, forne.getCodIBGE());
    ps.setBoolean(20, forne.getFlgBloque());
  }

  public void insertAll(PreparedStatement ps, Forne forne) throws SQLException {
    ps.setInt(1, forne.getCodFornec());
    ps.setString(2, forne.getDesRazSoc());
    ps.setString(3, forne.getDesFantas());
    ps.setString(4, forne.getNumCgcCpf());
    ps.setString(5, forne.getNumCgfRg());
    ps.setString(6, forne.getDesEndere());
    ps.setString(7, forne.getDesBairro());
    ps.setString(8, forne.getDesCidade());
    ps.setString(9, forne.getDesEstado());
    ps.setInt(10, forne.getCodRegTri());
    ps.setString(11, forne.getNumCep());
    ps.setString(12, forne.getNumFone());
    ps.setString(13, forne.getNumFax());
    ps.setString(14, forne.getNomContat());
    ps.setBigDecimal(15, forne.getPerMarkup());
    ps.setBigDecimal(16, forne.getPerAcrCus());
    ps.setString(17, forne.getTipDescon());
    ps.setBigDecimal(18, forne.getPerDescon());
    ps.setString(19, forne.getDesObserv());
    ps.setBoolean(20, forne.getFlgBloque());
    ps.setInt(21, forne.getQtdDiaPrz());
    ps.setBoolean(22, forne.getFlgNaoRepIcm());
    ps.setInt(23, forne.getCodIBGE());
    ps.setString(24, forne.getDesToken());
    ps.setInt(25, forne.getIsnPlcFin());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param forne
   * @throws SQLException
   */
}

package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Trans;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransPS {

  private static TransPS INSTANCE = new TransPS();

  public static TransPS getInstance() {
    return INSTANCE;
  }

  private TransPS() {
  }

  public void insert(PreparedStatement ps, Trans trans) throws SQLException {
    ps.setInt(1, trans.getCodTransp());
    ps.setString(2, trans.getDesRazSoc());
    ps.setString(3, trans.getDesFantas());
    ps.setString(4, trans.getNumCgcCpf());
    ps.setString(5, trans.getNumCgfRg());
    ps.setString(6, trans.getDesEndere());
    ps.setString(7, trans.getDesBairro());
    ps.setString(8, trans.getDesCidade());
    ps.setString(9, trans.getDesEstado());
    ps.setString(10, trans.getNumCep());
    ps.setString(11, trans.getNumFone());
    ps.setString(12, trans.getNumFax());
    ps.setString(13, trans.getNomContat());
    ps.setInt(14, trans.getCodRegTri());
    ps.setBoolean(15, trans.getFlgBloque());
    ps.setInt(16, trans.getCodIBGE());
    ps.setString(17, trans.getNumInscri());
    ps.setString(18, trans.getNumRG());

  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param trans
   * @throws SQLException
   */
}

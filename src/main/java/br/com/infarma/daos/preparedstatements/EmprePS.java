package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Empre;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmprePS {

  private static EmprePS INSTANCE = new EmprePS();

  public static EmprePS getInstance() {
    return INSTANCE;
  }

  private EmprePS() {
  }

  public void insert(PreparedStatement ps, Empre empre) throws SQLException {
    ps.setString(1, empre.getRazaoSocial());
    ps.setString(2, empre.getFantasia());
    ps.setString(3, empre.getEndereco());
    ps.setString(4, empre.getNumero());
    ps.setString(5, empre.getComplemento());
    ps.setString(6, empre.getBairro());
    ps.setString(7, empre.getCep());
    ps.setString(8, empre.getCidade());
    ps.setString(9, empre.getEstado());
    ps.setString(10, empre.getCgc());
    ps.setString(11, empre.getCgf());
    ps.setString(12, empre.getFone());
    ps.setString(13, empre.getFax());
    ps.setString(14, empre.getEmail());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param empre
   * @throws SQLException
   */
}

package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Empre;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpreRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Empre empre = new Empre();
    empre.setRazaoSocial(rs.getString("Razao_Social"));
    empre.setFantasia(rs.getString("Fantasia"));
    empre.setEndereco(rs.getString("Endereco"));
    empre.setNumero(rs.getString("Numero"));
    empre.setComplemento(rs.getString("Complemento"));
    empre.setBairro(rs.getString("Bairro"));
    empre.setCep(rs.getString("CEP"));
    empre.setCidade(rs.getString("Cidade"));
    empre.setEstado(rs.getString("Estado"));
    empre.setCgc(rs.getString("CGC"));
    empre.setCgf(rs.getString("CGF"));
    empre.setFone(rs.getString("Fone"));
    empre.setFax(rs.getString("Fax"));
    empre.setEmail(rs.getString("Email"));
    return empre;
  }
}

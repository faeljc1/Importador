package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Prean;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PreanRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Prean prean = new Prean();
    prean.setCodProdut(rs.getInt("Cod_Produt"));
    prean.setCodEan(rs.getString("Cod_Ean"));
    prean.setQtdFraVen(rs.getInt("Qtd_FraVen"));
    return prean;
  }
}

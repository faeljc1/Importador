package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Fabri;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FabriRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Fabri fabri = new Fabri();
    fabri.setCodFabric(rs.getInt("Cod_Fabric"));
    fabri.setDesFabric(rs.getString("Des_Fabric"));
    fabri.setNumCnpj(rs.getString("Num_Cnpj"));
    return fabri;
  }
}

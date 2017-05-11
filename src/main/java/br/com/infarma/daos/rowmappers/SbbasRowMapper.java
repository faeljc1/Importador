package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Sbbas;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SbbasRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Sbbas sbbas = new Sbbas();
    sbbas.setCodSubBas(rs.getInt("Cod_SubBas"));
    sbbas.setDesSubBas(rs.getString("Des_SubBas"));
    sbbas.setCodDCB(rs.getString("Cod_DCB"));
    return sbbas;
  }
}

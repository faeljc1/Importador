package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Cltri;
import br.com.infarma.models.Fabri;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CltriRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Cltri cltri = new Cltri();
    cltri.setCodClaTri(rs.getString("Cod_ClaTri"));
    cltri.setDesClaTri(rs.getString("Des_ClaTri"));
    cltri.setDesObserv(rs.getString("Des_Observ"));
    return cltri;
  }
}

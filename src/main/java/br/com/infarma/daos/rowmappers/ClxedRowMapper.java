package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Clxed;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClxedRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Clxed clxed = new Clxed();
    clxed.setCodClient(rs.getInt("Cod_Client"));
    clxed.setCodEndFon(rs.getString("Cod_EndFon"));
    return clxed;
  }
}

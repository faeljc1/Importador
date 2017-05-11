package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Grprc;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GrprcRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Grprc grprc = new Grprc();
    grprc.setCodGrpPrc(rs.getString("Cod_GrpPrc"));
    grprc.setDesGrpPrc(rs.getString("Des_GrpPrc"));
    return grprc;
  }
}

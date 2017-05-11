package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Grcli;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GrcliRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Grcli grcli = new Grcli();
    grcli.setCodGrpCli(rs.getInt("Cod_GrpCli"));
    grcli.setDesGrpCli(rs.getString("Des_GrpCli"));
    grcli.setPprDscVct(rs.getBigDecimal("Per_DscVct"));
    return grcli;
  }
}

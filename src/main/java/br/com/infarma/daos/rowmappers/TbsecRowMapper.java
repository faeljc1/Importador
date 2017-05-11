package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Tbsec;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TbsecRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Tbsec tbsec = new Tbsec();
    tbsec.setCodSeccao(rs.getInt("Cod_Seccao"));
    tbsec.setDesSeccao(rs.getString("Des_Seccao"));
    return tbsec;
  }
}

package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Fpgcb;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FpgcbRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Fpgcb fpgcb = new Fpgcb();
    fpgcb.setCodForPag(rs.getInt("Cod_ForPag"));
    fpgcb.setDesForPag(rs.getString("Des_ForPag"));
    fpgcb.setTipForPag(rs.getString("Tip_ForPag"));
    fpgcb.setCodFinali(rs.getString("Cod_Finali"));
    return fpgcb;
  }
}

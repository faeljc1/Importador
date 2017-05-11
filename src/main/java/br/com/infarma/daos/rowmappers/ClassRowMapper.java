package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Class;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClassRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Class aClass = new Class();
    aClass.setCodClassi(rs.getString("Cod_Classi"));
    aClass.setDesClassi(rs.getString("Des_Classi"));
    aClass.setNumNivel(rs.getInt("Num_Nivel"));
    return aClass;
  }
}

package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Vende;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VendeRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Vende vende = new Vende();
    vende.setCodVended(rs.getInt("Cod_Vended"));
    vende.setNomVended(rs.getString("Nom_Vended"));
    vende.setCodTabCom(rs.getInt("Cod_TabCom"));
    vende.setFlgBloque(rs.getBoolean("Flg_Bloque"));
    vende.setSnhVended(rs.getString("Snh_Vended"));
    vende.setSnhHash(rs.getString("Snh_Hash"));
    vende.setNumCpf(rs.getString("Num_Cpf"));
    return vende;
  }
}

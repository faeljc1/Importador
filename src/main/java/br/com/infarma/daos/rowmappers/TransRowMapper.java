package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Trans;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TransRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Trans trans = new Trans();
    trans.setCodTransp(rs.getInt("Cod_Transp"));
    trans.setDesRazSoc(rs.getString("Des_RazSoc"));
    trans.setDesFantas(rs.getString("Des_Fantas"));
    trans.setNumCgcCpf(rs.getString("Num_CgcCpf"));
    trans.setNumCgfRg(rs.getString("Num_CgfRg"));
    trans.setDesEndere(rs.getString("Des_Endere"));
    trans.setDesBairro(rs.getString("Des_Bairro"));
    trans.setDesCidade(rs.getString("Des_Cidade"));
    trans.setDesEstado(rs.getString("Des_Estado"));
    trans.setNumCep(rs.getString("Num_Cep"));
    trans.setNumFone(rs.getString("Num_Fone"));
    trans.setNumFax(rs.getString("Num_Fax"));
    trans.setNomContat(rs.getString("Nom_Contat"));
    trans.setCodRegTri(rs.getInt("Cod_RegTri"));
    trans.setFlgBloque(rs.getBoolean("Flg_Bloque"));
    trans.setCodIBGE(rs.getInt("Cod_IBGE"));
    trans.setNumInscri(rs.getString("Num_Inscri"));
    trans.setNumRG(rs.getString("Num_RG"));
    return trans;
  }
}

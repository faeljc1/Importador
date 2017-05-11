package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Cvxcl;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CvxclRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Cvxcl cvxcl = new Cvxcl();
    cvxcl.setCodConven(rs.getInt("Cod_Conven"));
    cvxcl.setCodClient(rs.getInt("Cod_Client"));
    cvxcl.setNumMatric(rs.getString("Num_Matric"));
    cvxcl.setValLimCre(rs.getBigDecimal("Val_LimCre"));
    cvxcl.setValCprPer(rs.getBigDecimal("Val_CprPer"));
    cvxcl.setQtdCprPer(rs.getInt("Qtd_CprPer"));
    cvxcl.setQtdItePer(rs.getInt("Qtd_ItePer"));
    cvxcl.setQtdVolPer(rs.getInt("Qtd_VolPer"));
    cvxcl.setDatUltCpr(rs.getTimestamp("Dat_UltCpr"));
    cvxcl.setFlgBloque(rs.getBoolean("Flg_Bloque"));
    cvxcl.setIsnCliCvn(rs.getInt("Isn_CliCvn"));
    cvxcl.setCodIdent1(rs.getInt("Cod_Ident1"));
    cvxcl.setSnhHasAceWeb(rs.getString("Snh_HasAceWeb"));
    cvxcl.setTokAceWeb(rs.getString("Tok_AceWeb"));
    return cvxcl;
  }
}

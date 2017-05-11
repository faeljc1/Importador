package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Tbncm;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TbncmRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Tbncm tbncm = new Tbncm();
    tbncm.setCodNcm(rs.getString("Cod_Ncm"));
    tbncm.setDesNcm(rs.getString("Des_Ncm"));
    tbncm.setCstPisEntTri(rs.getString("Cst_PisEntTri"));
    tbncm.setCstPisSaiTri(rs.getString("Cst_PisSaiTri"));
    tbncm.setCstPisEntNaoTri(rs.getString("Cst_PisEntNaoTri"));
    tbncm.setCstPisSaiNaoTri(rs.getString("Cst_PisSaiNaoTri"));
    tbncm.setCstCofEntTri(rs.getString("Cst_CofEntTri"));
    tbncm.setCstCofSaiTri(rs.getString("Cst_CofSaiTri"));
    tbncm.setCstCofEntNaoTri(rs.getString("Cst_CofEntNaoTri"));
    tbncm.setCstCofSaiNaoTri(rs.getString("Cst_CofSaiNaoTri"));
    tbncm.setCodSeqNat(rs.getInt("Cod_SeqNat"));
    tbncm.setAlqIbptNac(rs.getBigDecimal("Alq_IbptNac"));
    tbncm.setAlqIbptImp(rs.getBigDecimal("Alq_IbptImp"));
    return tbncm;
  }
}

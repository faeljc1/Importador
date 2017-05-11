package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Conve;
import br.com.infarma.models.Forne;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConveRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Conve conve = new Conve();
    conve.setCodConven(rs.getInt("Cod_Conven"));
    conve.setDesConven(rs.getString("Des_Conven"));
    conve.setTipConven(rs.getString("Tip_Conven"));
    conve.setQtdDiaFec(rs.getInt("Qtd_DiaFec"));
    conve.setQtdDiaVct(rs.getInt("Qtd_DiaVct"));
    conve.setDatUltFec(rs.getTimestamp("Dat_UltFec"));
    conve.setDatPrxFec(rs.getTimestamp("Dat_PrxFec"));
    conve.setNumCgcCpf(rs.getString("Num_CgcCpf"));
    conve.setNumCgfRG(rs.getString("Num_CgfRG"));
    conve.setDesRazSoc(rs.getString("Des_RazSoc"));
    conve.setDesEndere(rs.getString("Des_Endere"));
    conve.setDesBairro(rs.getString("Des_Bairro"));
    conve.setDesCidade(rs.getString("Des_Cidade"));
    conve.setDesEstado(rs.getString("Des_Estado"));
    conve.setNumCep(rs.getString("Num_Cep"));
    conve.setNumFone(rs.getString("Num_Fone"));
    conve.setNumFax(rs.getString("Num_Fax"));
    conve.setNomContat(rs.getString("Nom_Contat"));
    conve.setCodAgeCob(rs.getInt("Cod_AgeCob"));
    conve.setDesObserv(rs.getString("Des_Observ"));
    conve.setValLimCrePad(rs.getBigDecimal("Val_LimCrePad"));
    conve.setNumSeqFec(rs.getInt("Num_SeqFec"));
    conve.setPerDesCvn(rs.getBigDecimal("Per_DesCvn"));
    conve.setPerDesCli(rs.getBigDecimal("Per_DesCli"));
    conve.setDiaFecha1(rs.getInt("Dia_Fecha1"));
    conve.setDiaFecha2(rs.getInt("Dia_Fecha2"));
    conve.setQtdMaxPcl(rs.getInt("Qtd_MaxPcl"));
    conve.setValMinPcl(rs.getBigDecimal("Val_MinPcl"));
    conve.setFlgDscPcl(rs.getBoolean("Flg_DscPcl"));
    conve.setFlgCpvOrc(rs.getBoolean("Flg_CpvOrc"));
    conve.setFlgCpvEcf(rs.getBoolean("Flg_CpvEcf"));
    conve.setFlgBloque(rs.getBoolean("Flg_Bloque"));
    conve.setIsnCvnWeb(rs.getInt("Isn_CvnWeb"));
    conve.setIsnPlcFin(rs.getInt("Isn_PlcFin"));
    conve.setFlgAceWeb(rs.getBoolean("Flg_AceWeb"));
    conve.setSnhHasAceWeb(rs.getString("Snh_HasAceWeb"));
    conve.setEmail(rs.getString("Email"));
    conve.setFlgAceWebCon(rs.getBoolean("Flg_AceWebCon"));
    return conve;
  }
}

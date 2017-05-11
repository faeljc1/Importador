package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Clien;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Clien clien = new Clien();
    clien.setCodClient(rs.getInt("Cod_Client"));
    clien.setNomClient(rs.getString("Nom_Client"));
    clien.setDatCadast(rs.getTimestamp("Dat_Cadast"));
    clien.setCodGrpCli(rs.getInt("Cod_GrpCli"));
    clien.setSexClient(rs.getString("Sex_Client"));
    clien.setNumCpfCgc(rs.getString("Num_CpfCgc"));
    clien.setNumRGCgf(rs.getString("Num_RGCgf"));
    clien.setNumFonCel(rs.getString("Num_FonCel"));
    clien.setDesEmail(rs.getString("Des_Email"));
    clien.setDiaNascim(rs.getString("Dia_Nascim"));
    clien.setMesNascim(rs.getString("Mes_Nascim"));
    clien.setAnoNascim(rs.getString("Ano_Nascim"));
    clien.setCtrVencim(rs.getString("Ctr_Vencim"));
    clien.setQtdDiaVct(rs.getInt("Qtd_DiaVct"));
    clien.setDiaVenci1(rs.getInt("Dia_Venci1"));
    clien.setDiaVenci2(rs.getInt("Dia_Venci2"));
    clien.setValLimCre(rs.getBigDecimal("Val_LimCre"));
    clien.setValCprPer(rs.getBigDecimal("Val_CprPer"));
    clien.setQtdCprPer(rs.getInt("Qtd_CprPer"));
    clien.setDatUltCpr(rs.getTimestamp("Dat_UltCpr"));
    clien.setDesObserv(rs.getString("Des_Observ"));
    clien.setFlgBloque(rs.getBoolean("Flg_Bloque"));
    clien.setValAtraso(rs.getBigDecimal("Val_Atraso"));
    clien.setCodEndRes(rs.getString("Cod_EndRes"));
    clien.setNomPaiCli(rs.getString("Nom_PaiCli"));
    clien.setNomMaeCli(rs.getString("Nom_MaeCli"));
    clien.setCodEndCob(rs.getString("Cod_EndCob"));
    clien.setFlgNaoJur(rs.getBoolean("Flg_NaoJur"));
    clien.setCodRegTri(rs.getInt("Cod_RegTri"));
    clien.setIsnPlcFin(rs.getInt("Isn_PlcFin"));
    clien.setSnhHash(rs.getString("Snh_Hash"));
    clien.setFlgAutEml(rs.getBoolean("Flg_AutEml"));
    clien.setNumInscri(rs.getString("Num_Inscri"));
    clien.setNumRG(rs.getString("Num_RG"));
    return clien;
  }
}

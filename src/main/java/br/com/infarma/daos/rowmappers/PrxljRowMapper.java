package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Prxlj;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PrxljRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Prxlj prxlj = new Prxlj();
    prxlj.setCodLoja(rs.getInt("Cod_Loja"));
    prxlj.setCodProdut(rs.getInt("Cod_Produt"));
    prxlj.setCodPrmAtv(rs.getInt("Cod_PrmAtv"));
    prxlj.setLocFisica(rs.getString("Loc_Fisica"));
    prxlj.setClaAbcVal(rs.getString("Cla_AbcVal"));
    prxlj.setPosAbcVal(rs.getInt("Pos_AbcVal"));
    prxlj.setClaAbcVol(rs.getString("Cla_AbcVol"));
    prxlj.setPosAbcVol(rs.getInt("Pos_AbcVol"));
    prxlj.setQtdMinCal(rs.getInt("Qtd_MinCal"));
    prxlj.setQtdMinCfg(rs.getInt("Qtd_MinCfg"));
    prxlj.setQtdMaxCal(rs.getInt("Qtd_MaxCal"));
    prxlj.setQtdMaxCfg(rs.getInt("Qtd_MaxCfg"));
    prxlj.setQtdVenMedSem(rs.getBigDecimal("Qtd_VenMedSem"));
    prxlj.setQtdTrnDep(rs.getInt("Qtd_TrnDep"));
    prxlj.setQtdTransi(rs.getInt("Qtd_Transi"));
    prxlj.setQtdFisico(rs.getInt("Qtd_Fisico"));
    prxlj.setQtdAvaria(rs.getInt("Qtd_Avaria"));
    prxlj.setQtdSolici(rs.getInt("Qtd_Solici"));
    prxlj.setQtdEntPen(rs.getInt("Qtd_EntPen"));
    prxlj.setQtdSaiPen(rs.getInt("Qtd_SaiPen"));
    prxlj.setQtdSaldo(rs.getInt("Qtd_Saldo"));
    prxlj.setPrcCusEnt(rs.getBigDecimal("Prc_CusEnt"));
    prxlj.setPrcCusLiq(rs.getBigDecimal("Prc_CusLiq"));
    prxlj.setPrcCusLiqMed(rs.getBigDecimal("Prc_CusLiqMed"));
    prxlj.setPrcVenAtu(rs.getBigDecimal("Prc_VenAtu"));
    prxlj.setDatPrcVenAtu(rs.getTimestamp("Dat_PrcVenAtu"));
    prxlj.setDatUltCom(rs.getTimestamp("Dat_UltCom"));
    prxlj.setDatUltVen(rs.getTimestamp("Dat_UltVen"));
    prxlj.setFlgBlqCom(rs.getBoolean("Flg_BlqCom"));
    prxlj.setFlgBlqVen(rs.getBoolean("Flg_BlqVen"));
    prxlj.setFlgBlqDsc(rs.getBoolean("Flg_BlqDsc"));
    prxlj.setDatPrcUltBal(rs.getTimestamp("Dat_PrcUltBal"));
    prxlj.setQtdSldAntBal(rs.getInt("Qtd_SldAntBal"));
    prxlj.setQtdSldPosBal(rs.getInt("Qtd_SldPosBal"));
    prxlj.setNomUsuari(rs.getString("Nom_Usuari"));
    prxlj.setQtdConsig(rs.getInt("Qtd_Consig"));
    prxlj.setNumEsteir(rs.getInt("Num_Esteir"));
    prxlj.setCodLocali(rs.getString("Cod_Locali"));
    prxlj.setQtdReserv(rs.getInt("Qtd_Reserv"));
    prxlj.setQtdSldAnt(rs.getInt("Qtd_SldAnt"));
    prxlj.setDatSldAnt(rs.getTimestamp("Dat_SldAnt"));
    prxlj.setSnhHash(rs.getString("Snh_Hash"));
    prxlj.setPrcFabric(rs.getBigDecimal("Prc_Fabric"));
    prxlj.setPrcMaxCon(rs.getBigDecimal("Prc_MaxCon"));
    return prxlj;
  }
}

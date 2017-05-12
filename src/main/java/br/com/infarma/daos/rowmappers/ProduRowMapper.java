package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Produ;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProduRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Produ produ = new Produ();
    produ.setCodProdut(rs.getInt("Cod_Produt"));
    produ.setDesProdut(rs.getString("Des_Produt"));
    produ.setDesResumi(rs.getString("Des_Resumi"));
    produ.setDesComple(rs.getString("Des_Comple"));
    produ.setDatImplan(rs.getTimestamp("Dat_Implan"));
    produ.setDesUniVen(rs.getString("Des_UniVen"));
    produ.setDesUniCom(rs.getString("Des_UniCom"));
    produ.setQtdFraVen(rs.getInt("Qtd_FraVen"));
    produ.setCodClassi(rs.getString("Cod_Classi"));
    produ.setCodSeccao(rs.getInt("Cod_Seccao"));
    produ.setCodFabric(rs.getInt("Cod_Fabric"));
    produ.setCodSubBas(rs.getInt("Cod_SubBas"));
    produ.setCodGrpPrc(rs.getString("Cod_GrpPrc"));
    produ.setCodAbcFar(rs.getInt("Cod_AbcFar"));
    produ.setCodEAN(rs.getString("Cod_EAN"));
    produ.setCodPrdGrd(rs.getInt("Cod_PrdGrd"));
    produ.setCtrPreco(rs.getString("Ctr_Preco"));
    produ.setCtrLista(rs.getString("Ctr_Lista"));
    produ.setCtrVenda(rs.getString("Ctr_Venda"));
    produ.setTipPor344(rs.getString("Tip_Por344"));
    produ.setCtrOrigem(rs.getString("Ctr_Origem"));
    produ.setCodClaTri(rs.getString("Cod_ClaTri"));
    produ.setPrcFabric(rs.getBigDecimal("Prc_Fabric"));
    produ.setPrcMaxVen(rs.getBigDecimal("Prc_MaxVen"));
    produ.setFlgServic(rs.getBoolean("Flg_Servic"));
    produ.setFlgPrcTab(rs.getBoolean("Flg_PrcTab"));
    produ.setFlgImpEtq(rs.getBoolean("Flg_ImpEtq"));
    produ.setCodClaFis(rs.getString("Cod_ClaFis"));
    produ.setQtdEmbVen(rs.getInt("Qtd_EmbVen"));
    produ.setNumRegMS(rs.getString("NUM_REGMS"));
    produ.setCodNcm(rs.getString("Cod_Ncm"));
    produ.setPrcRefFmp(rs.getBigDecimal("Prc_RefFmp"));
    produ.setSnhHash(rs.getString("Snh_Hash"));
    produ.setCodTipIte(rs.getInt("Cod_TipIte"));
    produ.setFlgUsoCtn(rs.getBoolean("Flg_UsoCtn"));
    produ.setCodCEST(rs.getString("Cod_CEST"));
    produ.setCodTipMed(rs.getString("Cod_TipMed"));
    produ.setCodTipPbm(rs.getString("Cod_TipPbm"));
    produ.setCodPriAtv(rs.getInt("Cod_PriAtv"));
    produ.setFlgBlqVenExt(rs.getBoolean("Flg_BlqVenExt"));
    return produ;
  }
}

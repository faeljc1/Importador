package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Ender;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EnderRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Ender ender = new Ender();
    ender.setCodEndFon(rs.getString("Cod_EndFon"));
    ender.setTipEndere(rs.getString("Tip_Endere"));
    ender.setDesEndere(rs.getString("Des_Endere"));
    ender.setDesBairro(rs.getString("Des_Bairro"));
    ender.setNumCep(rs.getString("Num_Cep"));
    ender.setDesCidade(rs.getString("Des_Cidade"));
    ender.setDesEstado(rs.getString("Des_Estado"));
    ender.setDesPtoRef(rs.getString("Des_PtoRef"));
    ender.setNomContat(rs.getString("Nom_Contat"));
    ender.setDatUltAtd(rs.getTimestamp("Dat_UltAtd"));
    ender.setDatCadast(rs.getTimestamp("Dat_Cadast"));
    ender.setDesObserv(rs.getString("Des_Observ"));
    ender.setCodLojOri(rs.getInt("Cod_LojOri"));
    ender.setFlgBloque(rs.getBoolean("Flg_Bloque"));
    ender.setTmpCodCartao(rs.getInt("Tmp_CodCartao"));
    ender.setTmpNumCartao(rs.getString("Tmp_NumCartao"));
    ender.setTmpPerValCcr(rs.getString("Tmp_PerValCcr"));
    ender.setTmpCodCartao1(rs.getInt("Tmp_CodCartao1"));
    ender.setTmpNumCartao1(rs.getString("Tmp_NumCartao1"));
    ender.setTmpPerValCcr1(rs.getString("Tmp_PerValCcr1"));
    ender.setTmpCodCartao2(rs.getInt("Tmp_CodCartao2"));
    ender.setTmpNumCartao2(rs.getString("Tmp_NumCartao2"));
    ender.setTmpPerValCcr2(rs.getString("Tmp_PerValCcr2"));
    ender.setTmpDatNascim(rs.getTimestamp("Tmp_DatNascim"));
    ender.setTmpNumCpf(rs.getString("Tmp_NumCpf"));
    ender.setFlgTaxEnt(rs.getBoolean("Flg_TaxEnt"));
    return ender;
  }
}

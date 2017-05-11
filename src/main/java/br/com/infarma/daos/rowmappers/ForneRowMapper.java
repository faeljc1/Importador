package br.com.infarma.daos.rowmappers;

import br.com.infarma.models.Forne;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ForneRowMapper implements RowMapper {
  @Override
  public Object mapRow(ResultSet rs, int i) throws SQLException {
    Forne forne = new Forne();
    forne.setCodFornec(rs.getInt("Cod_Fornec"));
    forne.setDesRazSoc(rs.getString("Des_RazSoc"));
    forne.setDesFantas(rs.getString("Des_Fantas"));
    forne.setNumCgcCpf(rs.getString("Num_CgcCpf"));
    forne.setNumCgfRg(rs.getString("Num_CgfRg"));
    forne.setDesEndere(rs.getString("Des_Endere"));
    forne.setDesBairro(rs.getString("Des_Bairro"));
    forne.setDesCidade(rs.getString("Des_Cidade"));
    forne.setDesEstado(rs.getString("Des_Estado"));
    forne.setCodRegTri(rs.getInt("Cod_RegTri"));
    forne.setNumCep(rs.getString("Num_Cep"));
    forne.setNumFone(rs.getString("Num_Fone"));
    forne.setNumFax(rs.getString("Num_Fax"));
    forne.setNomContat(rs.getString("Nom_Contat"));
    forne.setPerMarkup(rs.getBigDecimal("Per_Markup"));
    forne.setPerAcrCus(rs.getBigDecimal("Per_AcrCus"));
    forne.setTipDescon(rs.getString("Tip_Descon"));
    forne.setPerDescon(rs.getBigDecimal("Per_Descon"));
    forne.setDesObserv(rs.getString("Des_Observ"));
    forne.setFlgBloque(rs.getBoolean("Flg_Bloque"));
    forne.setQtdDiaPrz(rs.getInt("Qtd_DiaPrz"));
    forne.setFlgNaoRepIcm(rs.getBoolean("Flg_NaoRepIcm"));
    forne.setCodIBGE(rs.getInt("Cod_IBGE"));
    forne.setDesToken(rs.getString("Des_Token"));
    forne.setIsnPlcFin(rs.getInt("Isn_PlcFin"));
    return forne;
  }
}

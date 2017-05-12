package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Produ;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProduPS {

  private static ProduPS INSTANCE = new ProduPS();

  public static ProduPS getInstance() {
    return INSTANCE;
  }

  private ProduPS() {
  }

  public void insert(PreparedStatement ps, Produ produ) throws SQLException {
    ps.setInt(1, produ.getCodProdut());
    ps.setString(2, produ.getDesProdut());
    ps.setString(3, produ.getDesResumi());
    ps.setString(4, produ.getDesComple());
    ps.setTimestamp(5, produ.getDatImplan());
    ps.setString(6, produ.getDesUniVen());
    ps.setString(8, produ.getDesUniCom());
    ps.setInt(9, produ.getQtdFraVen());
    ps.setInt(10, produ.getCodFabric());
    ps.setString(11, produ.getCodEAN());
    ps.setString(12, produ.getCtrPreco());
    ps.setString(13, produ.getCtrLista());
    ps.setString(14, produ.getCtrVenda());
    ps.setString(15, produ.getCtrOrigem());
    ps.setString(16, produ.getCodClaTri());
    ps.setString(17, produ.getCodClassi());
    ps.setString(18, produ.getCodClaFis());
    ps.setInt(19, produ.getQtdEmbVen());
    ps.setString(20, produ.getNumRegMS());
    ps.setString(21, produ.getCodNcm());
    ps.setInt(22, produ.getCodTipIte());
    ps.setInt(23, produ.getCodSeccao());
    ps.setString(24, produ.getCodGrpPrc());
    ps.setInt(25, produ.getCodSubBas());
    ps.setString(26, produ.getCodCEST());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param produ
   * @throws SQLException
   */
}

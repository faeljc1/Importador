package br.com.infarma.daos.preparedstatements;

import br.com.infarma.models.Prxlj;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrxljPS {

  private static PrxljPS INSTANCE = new PrxljPS();

  public static PrxljPS getInstance() {
    return INSTANCE;
  }

  private PrxljPS() {
  }

  public void insert(PreparedStatement ps, Prxlj prxlj) throws SQLException {
    ps.setInt(1, prxlj.getCodLoja());
    ps.setInt(2, prxlj.getCodProdut());
    ps.setBigDecimal(3, prxlj.getPrcVenAtu());
    ps.setBigDecimal(4, prxlj.getPrcCusLiq());
    ps.setBigDecimal(5, prxlj.getPrcCusLiqMed());
    ps.setBigDecimal(6, prxlj.getPrcCusEnt());
    ps.setTimestamp(8, prxlj.getDatPrcVenAtu());
    ps.setBoolean(9, prxlj.getFlgBlqCom());
    ps.setBoolean(10, prxlj.getFlgBlqVen());
    ps.setBoolean(11, prxlj.getFlgBlqDsc());
  }

  public void update(PreparedStatement ps, Prxlj prxlj) throws SQLException {
    ps.setBigDecimal(1, prxlj.getPrcVenAtu());
    ps.setBigDecimal(2, prxlj.getPrcCusLiq());
    ps.setBigDecimal(3, prxlj.getPrcCusLiqMed());
    ps.setBigDecimal(4, prxlj.getPrcCusEnt());
    ps.setTimestamp(5, prxlj.getDatPrcVenAtu());
    ps.setBoolean(6, prxlj.getFlgBlqCom());
    ps.setBoolean(7, prxlj.getFlgBlqVen());
    ps.setBoolean(8, prxlj.getFlgBlqDsc());
    ps.setInt(9, prxlj.getCodLoja());
    ps.setInt(10, prxlj.getCodProdut());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param prxlj
   * @throws SQLException
   */
}

package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

import java.math.BigDecimal;

public class Grcli implements AbstractModel {
  private int codGrpCli;
  private String desGrpCli;
  private BigDecimal PprDscVct;

  public Grcli() {
  }

  public Grcli(int codGrpCli, String desGrpCli, BigDecimal pprDscVct) {
    this.codGrpCli = codGrpCli;
    this.desGrpCli = desGrpCli;
    PprDscVct = pprDscVct;
  }

  public int getCodGrpCli() {
    return codGrpCli;
  }

  public void setCodGrpCli(int codGrpCli) {
    this.codGrpCli = codGrpCli;
  }

  public String getDesGrpCli() {
    return desGrpCli;
  }

  public void setDesGrpCli(String desGrpCli) {
    this.desGrpCli = desGrpCli;
  }

  public BigDecimal getPprDscVct() {
    return PprDscVct;
  }

  public void setPprDscVct(BigDecimal pprDscVct) {
    PprDscVct = pprDscVct;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

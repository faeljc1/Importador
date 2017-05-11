package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

import java.math.BigDecimal;

public class Grprc implements AbstractModel {
  private String codGrpPrc;
  private String desGrpPrc;
  private BigDecimal perMarkup;
  private BigDecimal perAcrCus;
  private BigDecimal perFatRed;

  public Grprc(){}

  public Grprc(String codGrpPrc, String desGrpPrc, BigDecimal perMarkup, BigDecimal perAcrCus, BigDecimal perFatRed) {
    this.codGrpPrc = codGrpPrc;
    this.desGrpPrc = desGrpPrc;
    this.perMarkup = perMarkup;
    this.perAcrCus = perAcrCus;
    this.perFatRed = perFatRed;
  }

  public String getCodGrpPrc() {
    return codGrpPrc;
  }

  public void setCodGrpPrc(String codGrpPrc) {
    this.codGrpPrc = codGrpPrc;
  }

  public String getDesGrpPrc() {
    return desGrpPrc;
  }

  public void setDesGrpPrc(String desGrpPrc) {
    this.desGrpPrc = desGrpPrc;
  }

  public BigDecimal getPerMarkup() {
    return perMarkup;
  }

  public void setPerMarkup(BigDecimal perMarkup) {
    this.perMarkup = perMarkup;
  }

  public BigDecimal getPerAcrCus() {
    return perAcrCus;
  }

  public void setPerAcrCus(BigDecimal perAcrCus) {
    this.perAcrCus = perAcrCus;
  }

  public BigDecimal getPerFatRed() {
    return perFatRed;
  }

  public void setPerFatRed(BigDecimal perFatRed) {
    this.perFatRed = perFatRed;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

import java.math.BigDecimal;

public class Fpgcb implements AbstractModel {
  private int codForPag;
  private String desForPag;
  private String tipForPag;
  private String codFinali;
  private Integer codCartao;
  private Integer qtdParcel;
  private BigDecimal perDscMax;
  private BigDecimal valMinimo;
  private BigDecimal valMaximo;
  private String ctrLojas;
  private String strLojas;
  private String ctrPolDsc;
  private Integer qtdPolDsc;
  private String strClassi;
  private String strConven;
  private Boolean flgBloque;
  private Boolean flgJurAdmCcr;
  private Boolean flgGarantDeb;
  private Integer qtdDiaVctCdb;
  private String codRotTef;

  public Fpgcb(){}

  public Fpgcb(int codForPag, String desForPag, String tipForPag, String codFinali, Integer codCartao, Integer qtdParcel, BigDecimal perDscMax, BigDecimal valMinimo, BigDecimal valMaximo, String ctrLojas, String strLojas, String ctrPolDsc, Integer qtdPolDsc, String strClassi, String strConven, Boolean flgBloque, Boolean flgJurAdmCcr, Boolean flgGarantDeb, Integer qtdDiaVctCdb, String codRotTef) {
    this.codForPag = codForPag;
    this.desForPag = desForPag;
    this.tipForPag = tipForPag;
    this.codFinali = codFinali;
    this.codCartao = codCartao;
    this.qtdParcel = qtdParcel;
    this.perDscMax = perDscMax;
    this.valMinimo = valMinimo;
    this.valMaximo = valMaximo;
    this.ctrLojas = ctrLojas;
    this.strLojas = strLojas;
    this.ctrPolDsc = ctrPolDsc;
    this.qtdPolDsc = qtdPolDsc;
    this.strClassi = strClassi;
    this.strConven = strConven;
    this.flgBloque = flgBloque;
    this.flgJurAdmCcr = flgJurAdmCcr;
    this.flgGarantDeb = flgGarantDeb;
    this.qtdDiaVctCdb = qtdDiaVctCdb;
    this.codRotTef = codRotTef;
  }

  public int getCodForPag() {
    return codForPag;
  }

  public void setCodForPag(int codForPag) {
    this.codForPag = codForPag;
  }

  public String getDesForPag() {
    return desForPag;
  }

  public void setDesForPag(String desForPag) {
    this.desForPag = desForPag;
  }

  public String getTipForPag() {
    return tipForPag;
  }

  public void setTipForPag(String tipForPag) {
    this.tipForPag = tipForPag;
  }

  public String getCodFinali() {
    return codFinali;
  }

  public void setCodFinali(String codFinali) {
    this.codFinali = codFinali;
  }

  public Integer getCodCartao() {
    return codCartao;
  }

  public void setCodCartao(Integer codCartao) {
    this.codCartao = codCartao;
  }

  public Integer getQtdParcel() {
    return qtdParcel;
  }

  public void setQtdParcel(Integer qtdParcel) {
    this.qtdParcel = qtdParcel;
  }

  public BigDecimal getPerDscMax() {
    return perDscMax;
  }

  public void setPerDscMax(BigDecimal perDscMax) {
    this.perDscMax = perDscMax;
  }

  public BigDecimal getValMinimo() {
    return valMinimo;
  }

  public void setValMinimo(BigDecimal valMinimo) {
    this.valMinimo = valMinimo;
  }

  public BigDecimal getValMaximo() {
    return valMaximo;
  }

  public void setValMaximo(BigDecimal valMaximo) {
    this.valMaximo = valMaximo;
  }

  public String getCtrLojas() {
    return ctrLojas;
  }

  public void setCtrLojas(String ctrLojas) {
    this.ctrLojas = ctrLojas;
  }

  public String getStrLojas() {
    return strLojas;
  }

  public void setStrLojas(String strLojas) {
    this.strLojas = strLojas;
  }

  public String getCtrPolDsc() {
    return ctrPolDsc;
  }

  public void setCtrPolDsc(String ctrPolDsc) {
    this.ctrPolDsc = ctrPolDsc;
  }

  public Integer getQtdPolDsc() {
    return qtdPolDsc;
  }

  public void setQtdPolDsc(Integer qtdPolDsc) {
    this.qtdPolDsc = qtdPolDsc;
  }

  public String getStrClassi() {
    return strClassi;
  }

  public void setStrClassi(String strClassi) {
    this.strClassi = strClassi;
  }

  public String getStrConven() {
    return strConven;
  }

  public void setStrConven(String strConven) {
    this.strConven = strConven;
  }

  public Boolean getFlgBloque() {
    return flgBloque;
  }

  public void setFlgBloque(Boolean flgBloque) {
    this.flgBloque = flgBloque;
  }

  public Boolean getFlgJurAdmCcr() {
    return flgJurAdmCcr;
  }

  public void setFlgJurAdmCcr(Boolean flgJurAdmCcr) {
    this.flgJurAdmCcr = flgJurAdmCcr;
  }

  public Boolean getFlgGarantDeb() {
    return flgGarantDeb;
  }

  public void setFlgGarantDeb(Boolean flgGarantDeb) {
    this.flgGarantDeb = flgGarantDeb;
  }

  public Integer getQtdDiaVctCdb() {
    return qtdDiaVctCdb;
  }

  public void setQtdDiaVctCdb(Integer qtdDiaVctCdb) {
    this.qtdDiaVctCdb = qtdDiaVctCdb;
  }

  public String getCodRotTef() {
    return codRotTef;
  }

  public void setCodRotTef(String codRotTef) {
    this.codRotTef = codRotTef;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

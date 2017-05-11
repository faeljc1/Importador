package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Cvxcl implements AbstractModel {
  private int codConven;
  private int codClient;
  private String numMatric;
  private BigDecimal valLimCre;
  private BigDecimal valCprPer;
  private Integer qtdCprPer;
  private Integer qtdItePer;
  private Integer qtdVolPer;
  private Timestamp datUltCpr;
  private Boolean flgBloque;
  private Integer isnCliCvn;
  private Integer codIdent1;
  private String snhHasAceWeb;
  private String tokAceWeb;

  public Cvxcl() {
  }

  public Cvxcl(int codConven, int codClient, String numMatric, BigDecimal valLimCre, BigDecimal valCprPer, Integer qtdCprPer, Integer qtdItePer, Integer qtdVolPer, Timestamp datUltCpr, Boolean flgBloque, Integer isnCliCvn, Integer codIdent1, String snhHasAceWeb, String tokAceWeb) {
    this.codConven = codConven;
    this.codClient = codClient;
    this.numMatric = numMatric;
    this.valLimCre = valLimCre;
    this.valCprPer = valCprPer;
    this.qtdCprPer = qtdCprPer;
    this.qtdItePer = qtdItePer;
    this.qtdVolPer = qtdVolPer;
    this.datUltCpr = datUltCpr;
    this.flgBloque = flgBloque;
    this.isnCliCvn = isnCliCvn;
    this.codIdent1 = codIdent1;
    this.snhHasAceWeb = snhHasAceWeb;
    this.tokAceWeb = tokAceWeb;
  }

  public int getCodConven() {
    return codConven;
  }

  public void setCodConven(int codConven) {
    this.codConven = codConven;
  }

  public int getCodClient() {
    return codClient;
  }

  public void setCodClient(int codClient) {
    this.codClient = codClient;
  }

  public String getNumMatric() {
    return numMatric;
  }

  public void setNumMatric(String numMatric) {
    this.numMatric = numMatric;
  }

  public BigDecimal getValLimCre() {
    return valLimCre;
  }

  public void setValLimCre(BigDecimal valLimCre) {
    this.valLimCre = valLimCre;
  }

  public BigDecimal getValCprPer() {
    return valCprPer;
  }

  public void setValCprPer(BigDecimal valCprPer) {
    this.valCprPer = valCprPer;
  }

  public Integer getQtdCprPer() {
    return qtdCprPer;
  }

  public void setQtdCprPer(Integer qtdCprPer) {
    this.qtdCprPer = qtdCprPer;
  }

  public Integer getQtdItePer() {
    return qtdItePer;
  }

  public void setQtdItePer(Integer qtdItePer) {
    this.qtdItePer = qtdItePer;
  }

  public Integer getQtdVolPer() {
    return qtdVolPer;
  }

  public void setQtdVolPer(Integer qtdVolPer) {
    this.qtdVolPer = qtdVolPer;
  }

  public Timestamp getDatUltCpr() {
    return datUltCpr;
  }

  public void setDatUltCpr(Timestamp datUltCpr) {
    this.datUltCpr = datUltCpr;
  }

  public Boolean getFlgBloque() {
    return flgBloque;
  }

  public void setFlgBloque(Boolean flgBloque) {
    this.flgBloque = flgBloque;
  }

  public Integer getIsnCliCvn() {
    return isnCliCvn;
  }

  public void setIsnCliCvn(Integer isnCliCvn) {
    this.isnCliCvn = isnCliCvn;
  }

  public Integer getCodIdent1() {
    return codIdent1;
  }

  public void setCodIdent1(Integer codIdent1) {
    this.codIdent1 = codIdent1;
  }

  public String getSnhHasAceWeb() {
    return snhHasAceWeb;
  }

  public void setSnhHasAceWeb(String snhHasAceWeb) {
    this.snhHasAceWeb = snhHasAceWeb;
  }

  public String getTokAceWeb() {
    return tokAceWeb;
  }

  public void setTokAceWeb(String tokAceWeb) {
    this.tokAceWeb = tokAceWeb;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

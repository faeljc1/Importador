package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Clien implements AbstractModel {
  private int codClient;
  private String nomClient;
  private Timestamp datCadast;
  private Integer codGrpCli;
  private String sexClient;
  private String numCpfCgc;
  private String numRGCgf;
  private String numFonCel;
  private String desEmail;
  private String diaNascim;
  private String mesNascim;
  private String anoNascim;
  private String ctrVencim;
  private Integer qtdDiaVct;
  private Integer diaVenci1;
  private Integer diaVenci2;
  private BigDecimal valLimCre;
  private BigDecimal valCprPer;
  private Integer qtdCprPer;
  private Timestamp datUltCpr;
  private String desObserv;
  private Boolean flgBloque;
  private BigDecimal valAtraso;
  private String codEndRes;
  private String nomPaiCli;
  private String nomMaeCli;
  private String codEndCob;
  private Boolean flgNaoJur;
  private Integer codRegTri;
  private Integer isnPlcFin;
  private String snhHash;
  private Boolean flgAutEml;
  private String numInscri;
  private String numRG;

  public Clien() {
  }

  public Clien(int codClient, String nomClient, Timestamp datCadast, Integer codGrpCli, String sexClient, String numCpfCgc, String numRGCgf, String numFonCel, String desEmail, String diaNascim, String mesNascim, String anoNascim, String ctrVencim, Integer qtdDiaVct, Integer diaVenci1, Integer diaVenci2, BigDecimal valLimCre, BigDecimal valCprPer, Integer qtdCprPer, Timestamp datUltCpr, String desObserv, Boolean flgBloque, BigDecimal valAtraso, String codEndRes, String nomPaiCli, String nomMaeCli, String codEndCob, Boolean flgNaoJur, Integer codRegTri, Integer isnPlcFin, String snhHash, Boolean flgAutEml, String numInscri, String numRG) {
    this.codClient = codClient;
    this.nomClient = nomClient;
    this.datCadast = datCadast;
    this.codGrpCli = codGrpCli;
    this.sexClient = sexClient;
    this.numCpfCgc = numCpfCgc;
    this.numRGCgf = numRGCgf;
    this.numFonCel = numFonCel;
    this.desEmail = desEmail;
    this.diaNascim = diaNascim;
    this.mesNascim = mesNascim;
    this.anoNascim = anoNascim;
    this.ctrVencim = ctrVencim;
    this.qtdDiaVct = qtdDiaVct;
    this.diaVenci1 = diaVenci1;
    this.diaVenci2 = diaVenci2;
    this.valLimCre = valLimCre;
    this.valCprPer = valCprPer;
    this.qtdCprPer = qtdCprPer;
    this.datUltCpr = datUltCpr;
    this.desObserv = desObserv;
    this.flgBloque = flgBloque;
    this.valAtraso = valAtraso;
    this.codEndRes = codEndRes;
    this.nomPaiCli = nomPaiCli;
    this.nomMaeCli = nomMaeCli;
    this.codEndCob = codEndCob;
    this.flgNaoJur = flgNaoJur;
    this.codRegTri = codRegTri;
    this.isnPlcFin = isnPlcFin;
    this.snhHash = snhHash;
    this.flgAutEml = flgAutEml;
    this.numInscri = numInscri;
    this.numRG = numRG;
  }

  public int getCodClient() {
    return codClient;
  }

  public void setCodClient(int codClient) {
    this.codClient = codClient;
  }

  public String getNomClient() {
    return nomClient;
  }

  public void setNomClient(String nomClient) {
    this.nomClient = nomClient;
  }

  public Timestamp getDatCadast() {
    return datCadast;
  }

  public void setDatCadast(Timestamp datCadast) {
    this.datCadast = datCadast;
  }

  public Integer getCodGrpCli() {
    return codGrpCli;
  }

  public void setCodGrpCli(Integer codGrpCli) {
    this.codGrpCli = codGrpCli;
  }

  public String getSexClient() {
    return sexClient;
  }

  public void setSexClient(String sexClient) {
    this.sexClient = sexClient;
  }

  public String getNumCpfCgc() {
    return numCpfCgc;
  }

  public void setNumCpfCgc(String numCpfCgc) {
    this.numCpfCgc = numCpfCgc;
  }

  public String getNumRGCgf() {
    return numRGCgf;
  }

  public void setNumRGCgf(String numRGCgf) {
    this.numRGCgf = numRGCgf;
  }

  public String getNumFonCel() {
    return numFonCel;
  }

  public void setNumFonCel(String numFonCel) {
    this.numFonCel = numFonCel;
  }

  public String getDesEmail() {
    return desEmail;
  }

  public void setDesEmail(String desEmail) {
    this.desEmail = desEmail;
  }

  public String getDiaNascim() {
    return diaNascim;
  }

  public void setDiaNascim(String diaNascim) {
    this.diaNascim = diaNascim;
  }

  public String getMesNascim() {
    return mesNascim;
  }

  public void setMesNascim(String mesNascim) {
    this.mesNascim = mesNascim;
  }

  public String getAnoNascim() {
    return anoNascim;
  }

  public void setAnoNascim(String anoNascim) {
    this.anoNascim = anoNascim;
  }

  public String getCtrVencim() {
    return ctrVencim;
  }

  public void setCtrVencim(String ctrVencim) {
    this.ctrVencim = ctrVencim;
  }

  public Integer getQtdDiaVct() {
    return qtdDiaVct;
  }

  public void setQtdDiaVct(Integer qtdDiaVct) {
    this.qtdDiaVct = qtdDiaVct;
  }

  public Integer getDiaVenci1() {
    return diaVenci1;
  }

  public void setDiaVenci1(Integer diaVenci1) {
    this.diaVenci1 = diaVenci1;
  }

  public Integer getDiaVenci2() {
    return diaVenci2;
  }

  public void setDiaVenci2(Integer diaVenci2) {
    this.diaVenci2 = diaVenci2;
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

  public Timestamp getDatUltCpr() {
    return datUltCpr;
  }

  public void setDatUltCpr(Timestamp datUltCpr) {
    this.datUltCpr = datUltCpr;
  }

  public String getDesObserv() {
    return desObserv;
  }

  public void setDesObserv(String desObserv) {
    this.desObserv = desObserv;
  }

  public Boolean getFlgBloque() {
    return flgBloque;
  }

  public void setFlgBloque(Boolean flgBloque) {
    this.flgBloque = flgBloque;
  }

  public BigDecimal getValAtraso() {
    return valAtraso;
  }

  public void setValAtraso(BigDecimal valAtraso) {
    this.valAtraso = valAtraso;
  }

  public String getCodEndRes() {
    return codEndRes;
  }

  public void setCodEndRes(String codEndRes) {
    this.codEndRes = codEndRes;
  }

  public String getNomPaiCli() {
    return nomPaiCli;
  }

  public void setNomPaiCli(String nomPaiCli) {
    this.nomPaiCli = nomPaiCli;
  }

  public String getNomMaeCli() {
    return nomMaeCli;
  }

  public void setNomMaeCli(String nomMaeCli) {
    this.nomMaeCli = nomMaeCli;
  }

  public String getCodEndCob() {
    return codEndCob;
  }

  public void setCodEndCob(String codEndCob) {
    this.codEndCob = codEndCob;
  }

  public Boolean getFlgNaoJur() {
    return flgNaoJur;
  }

  public void setFlgNaoJur(Boolean flgNaoJur) {
    this.flgNaoJur = flgNaoJur;
  }

  public Integer getCodRegTri() {
    return codRegTri;
  }

  public void setCodRegTri(Integer codRegTri) {
    this.codRegTri = codRegTri;
  }

  public Integer getIsnPlcFin() {
    return isnPlcFin;
  }

  public void setIsnPlcFin(Integer isnPlcFin) {
    this.isnPlcFin = isnPlcFin;
  }

  public String getSnhHash() {
    return snhHash;
  }

  public void setSnhHash(String snhHash) {
    this.snhHash = snhHash;
  }

  public Boolean getFlgAutEml() {
    return flgAutEml;
  }

  public void setFlgAutEml(Boolean flgAutEml) {
    this.flgAutEml = flgAutEml;
  }

  public String getNumInscri() {
    return numInscri;
  }

  public void setNumInscri(String numInscri) {
    this.numInscri = numInscri;
  }

  public String getNumRG() {
    return numRG;
  }

  public void setNumRG(String numRG) {
    this.numRG = numRG;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

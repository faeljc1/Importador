package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Conve implements AbstractModel {
  private int codConven;
  private String desConven;
  private String tipConven;
  private Integer qtdDiaFec;
  private Integer qtdDiaVct;
  private Timestamp datUltFec;
  private Timestamp datPrxFec;
  private String numCgcCpf;
  private String numCgfRG;
  private String desRazSoc;
  private String desEndere;
  private String desBairro;
  private String desCidade;
  private String desEstado;
  private String numCep;
  private String numFone;
  private String numFax;
  private String nomContat;
  private Integer codAgeCob;
  private String desObserv;
  private BigDecimal valLimCrePad;
  private Integer numSeqFec;
  private BigDecimal perDesCvn;
  private BigDecimal perDesCli;
  private Integer diaFecha1;
  private Integer diaFecha2;
  private Integer qtdMaxPcl;
  private BigDecimal valMinPcl;
  private Boolean flgDscPcl;
  private Boolean flgCpvOrc;
  private Boolean flgCpvEcf;
  private Boolean flgBloque;
  private Integer isnCvnWeb;
  private Integer isnPlcFin;
  private Boolean flgAceWeb;
  private String snhHasAceWeb;
  private String email;
  private Boolean flgAceWebCon;

  public Conve() {
  }

  public Conve(int codConven, String desConven, String tipConven, Integer qtdDiaFec, Integer qtdDiaVct, Timestamp datUltFec, Timestamp datPrxFec, String numCgcCpf, String numCgfRG, String desRazSoc, String desEndere, String desBairro, String desCidade, String desEstado, String numCep, String numFone, String numFax, String nomContat, Integer codAgeCob, String desObserv, BigDecimal valLimCrePad, Integer numSeqFec, BigDecimal perDesCvn, BigDecimal perDesCli, Integer diaFecha1, Integer diaFecha2, Integer qtdMaxPcl, BigDecimal valMinPcl, Boolean flgDscPcl, Boolean flgCpvOrc, Boolean flgCpvEcf, Boolean flgBloque, Integer isnCvnWeb, Integer isnPlcFin, Boolean flgAceWeb, String snhHasAceWeb, String email, Boolean flgAceWebCon) {
    this.codConven = codConven;
    this.desConven = desConven;
    this.tipConven = tipConven;
    this.qtdDiaFec = qtdDiaFec;
    this.qtdDiaVct = qtdDiaVct;
    this.datUltFec = datUltFec;
    this.datPrxFec = datPrxFec;
    this.numCgcCpf = numCgcCpf;
    this.numCgfRG = numCgfRG;
    this.desRazSoc = desRazSoc;
    this.desEndere = desEndere;
    this.desBairro = desBairro;
    this.desCidade = desCidade;
    this.desEstado = desEstado;
    this.numCep = numCep;
    this.numFone = numFone;
    this.numFax = numFax;
    this.nomContat = nomContat;
    this.codAgeCob = codAgeCob;
    this.desObserv = desObserv;
    this.valLimCrePad = valLimCrePad;
    this.numSeqFec = numSeqFec;
    this.perDesCvn = perDesCvn;
    this.perDesCli = perDesCli;
    this.diaFecha1 = diaFecha1;
    this.diaFecha2 = diaFecha2;
    this.qtdMaxPcl = qtdMaxPcl;
    this.valMinPcl = valMinPcl;
    this.flgDscPcl = flgDscPcl;
    this.flgCpvOrc = flgCpvOrc;
    this.flgCpvEcf = flgCpvEcf;
    this.flgBloque = flgBloque;
    this.isnCvnWeb = isnCvnWeb;
    this.isnPlcFin = isnPlcFin;
    this.flgAceWeb = flgAceWeb;
    this.snhHasAceWeb = snhHasAceWeb;
    this.email = email;
    this.flgAceWebCon = flgAceWebCon;
  }

  public int getCodConven() {
    return codConven;
  }

  public void setCodConven(int codConven) {
    this.codConven = codConven;
  }

  public String getDesConven() {
    return desConven;
  }

  public void setDesConven(String desConven) {
    this.desConven = desConven;
  }

  public String getTipConven() {
    return tipConven;
  }

  public void setTipConven(String tipConven) {
    this.tipConven = tipConven;
  }

  public Integer getQtdDiaFec() {
    return qtdDiaFec;
  }

  public void setQtdDiaFec(Integer qtdDiaFec) {
    this.qtdDiaFec = qtdDiaFec;
  }

  public Integer getQtdDiaVct() {
    return qtdDiaVct;
  }

  public void setQtdDiaVct(Integer qtdDiaVct) {
    this.qtdDiaVct = qtdDiaVct;
  }

  public Timestamp getDatUltFec() {
    return datUltFec;
  }

  public void setDatUltFec(Timestamp datUltFec) {
    this.datUltFec = datUltFec;
  }

  public Timestamp getDatPrxFec() {
    return datPrxFec;
  }

  public void setDatPrxFec(Timestamp datPrxFec) {
    this.datPrxFec = datPrxFec;
  }

  public String getNumCgcCpf() {
    return numCgcCpf;
  }

  public void setNumCgcCpf(String numCgcCpf) {
    this.numCgcCpf = numCgcCpf;
  }

  public String getNumCgfRG() {
    return numCgfRG;
  }

  public void setNumCgfRG(String numCgfRG) {
    this.numCgfRG = numCgfRG;
  }

  public String getDesRazSoc() {
    return desRazSoc;
  }

  public void setDesRazSoc(String desRazSoc) {
    this.desRazSoc = desRazSoc;
  }

  public String getDesEndere() {
    return desEndere;
  }

  public void setDesEndere(String desEndere) {
    this.desEndere = desEndere;
  }

  public String getDesBairro() {
    return desBairro;
  }

  public void setDesBairro(String desBairro) {
    this.desBairro = desBairro;
  }

  public String getDesCidade() {
    return desCidade;
  }

  public void setDesCidade(String desCidade) {
    this.desCidade = desCidade;
  }

  public String getDesEstado() {
    return desEstado;
  }

  public void setDesEstado(String desEstado) {
    this.desEstado = desEstado;
  }

  public String getNumCep() {
    return numCep;
  }

  public void setNumCep(String numCep) {
    this.numCep = numCep;
  }

  public String getNumFone() {
    return numFone;
  }

  public void setNumFone(String numFone) {
    this.numFone = numFone;
  }

  public String getNumFax() {
    return numFax;
  }

  public void setNumFax(String numFax) {
    this.numFax = numFax;
  }

  public String getNomContat() {
    return nomContat;
  }

  public void setNomContat(String nomContat) {
    this.nomContat = nomContat;
  }

  public Integer getCodAgeCob() {
    return codAgeCob;
  }

  public void setCodAgeCob(Integer codAgeCob) {
    this.codAgeCob = codAgeCob;
  }

  public String getDesObserv() {
    return desObserv;
  }

  public void setDesObserv(String desObserv) {
    this.desObserv = desObserv;
  }

  public BigDecimal getValLimCrePad() {
    return valLimCrePad;
  }

  public void setValLimCrePad(BigDecimal valLimCrePad) {
    this.valLimCrePad = valLimCrePad;
  }

  public Integer getNumSeqFec() {
    return numSeqFec;
  }

  public void setNumSeqFec(Integer numSeqFec) {
    this.numSeqFec = numSeqFec;
  }

  public BigDecimal getPerDesCvn() {
    return perDesCvn;
  }

  public void setPerDesCvn(BigDecimal perDesCvn) {
    this.perDesCvn = perDesCvn;
  }

  public BigDecimal getPerDesCli() {
    return perDesCli;
  }

  public void setPerDesCli(BigDecimal perDesCli) {
    this.perDesCli = perDesCli;
  }

  public Integer getDiaFecha1() {
    return diaFecha1;
  }

  public void setDiaFecha1(Integer diaFecha1) {
    this.diaFecha1 = diaFecha1;
  }

  public Integer getDiaFecha2() {
    return diaFecha2;
  }

  public void setDiaFecha2(Integer diaFecha2) {
    this.diaFecha2 = diaFecha2;
  }

  public Integer getQtdMaxPcl() {
    return qtdMaxPcl;
  }

  public void setQtdMaxPcl(Integer qtdMaxPcl) {
    this.qtdMaxPcl = qtdMaxPcl;
  }

  public BigDecimal getValMinPcl() {
    return valMinPcl;
  }

  public void setValMinPcl(BigDecimal valMinPcl) {
    this.valMinPcl = valMinPcl;
  }

  public Boolean getFlgDscPcl() {
    return flgDscPcl;
  }

  public void setFlgDscPcl(Boolean flgDscPcl) {
    this.flgDscPcl = flgDscPcl;
  }

  public Boolean getFlgCpvOrc() {
    return flgCpvOrc;
  }

  public void setFlgCpvOrc(Boolean flgCpvOrc) {
    this.flgCpvOrc = flgCpvOrc;
  }

  public Boolean getFlgCpvEcf() {
    return flgCpvEcf;
  }

  public void setFlgCpvEcf(Boolean flgCpvEcf) {
    this.flgCpvEcf = flgCpvEcf;
  }

  public Boolean getFlgBloque() {
    return flgBloque;
  }

  public void setFlgBloque(Boolean flgBloque) {
    this.flgBloque = flgBloque;
  }

  public Integer getIsnCvnWeb() {
    return isnCvnWeb;
  }

  public void setIsnCvnWeb(Integer isnCvnWeb) {
    this.isnCvnWeb = isnCvnWeb;
  }

  public Integer getIsnPlcFin() {
    return isnPlcFin;
  }

  public void setIsnPlcFin(Integer isnPlcFin) {
    this.isnPlcFin = isnPlcFin;
  }

  public Boolean getFlgAceWeb() {
    return flgAceWeb;
  }

  public void setFlgAceWeb(Boolean flgAceWeb) {
    this.flgAceWeb = flgAceWeb;
  }

  public String getSnhHasAceWeb() {
    return snhHasAceWeb;
  }

  public void setSnhHasAceWeb(String snhHasAceWeb) {
    this.snhHasAceWeb = snhHasAceWeb;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Boolean getFlgAceWebCon() {
    return flgAceWebCon;
  }

  public void setFlgAceWebCon(Boolean flgAceWebCon) {
    this.flgAceWebCon = flgAceWebCon;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

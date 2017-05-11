package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

import java.math.BigDecimal;

public class Forne implements AbstractModel {
  private int codFornec;
  private String desRazSoc;
  private String desFantas;
  private String numCgcCpf;
  private String numCgfRg;
  private String desEndere;
  private String desBairro;
  private String desCidade;
  private String desEstado;
  private Integer codRegTri;
  private String numCep;
  private String numFone;
  private String numFax;
  private String nomContat;
  private BigDecimal perMarkup;
  private BigDecimal perAcrCus;
  private String tipDescon;
  private BigDecimal perDescon;
  private String desObserv;
  private Boolean flgBloque;
  private Integer qtdDiaPrz;
  private Boolean flgNaoRepIcm;
  private Integer codIBGE;
  private String desToken;
  private Integer isnPlcFin;

  public Forne() {
  }

  public Forne(int codFornec, String desRazSoc, String desFantas, String numCgcCpf, String numCgfRg, String desEndere, String desBairro, String desCidade, String desEstado, Integer codRegTri, String numCep, String numFone, String numFax, String nomContat, BigDecimal perMarkup, BigDecimal perAcrCus, String tipDescon, BigDecimal perDescon, String desObserv, Boolean flgBloque, Integer qtdDiaPrz, Boolean flgNaoRepIcm, Integer codIBGE, String desToken, Integer isnPlcFin) {
    this.codFornec = codFornec;
    this.desRazSoc = desRazSoc;
    this.desFantas = desFantas;
    this.numCgcCpf = numCgcCpf;
    this.numCgfRg = numCgfRg;
    this.desEndere = desEndere;
    this.desBairro = desBairro;
    this.desCidade = desCidade;
    this.desEstado = desEstado;
    this.codRegTri = codRegTri;
    this.numCep = numCep;
    this.numFone = numFone;
    this.numFax = numFax;
    this.nomContat = nomContat;
    this.perMarkup = perMarkup;
    this.perAcrCus = perAcrCus;
    this.tipDescon = tipDescon;
    this.perDescon = perDescon;
    this.desObserv = desObserv;
    this.flgBloque = flgBloque;
    this.qtdDiaPrz = qtdDiaPrz;
    this.flgNaoRepIcm = flgNaoRepIcm;
    this.codIBGE = codIBGE;
    this.desToken = desToken;
    this.isnPlcFin = isnPlcFin;
  }

  public int getCodFornec() {
    return codFornec;
  }

  public void setCodFornec(int codFornec) {
    this.codFornec = codFornec;
  }

  public String getDesRazSoc() {
    return desRazSoc;
  }

  public void setDesRazSoc(String desRazSoc) {
    this.desRazSoc = desRazSoc;
  }

  public String getDesFantas() {
    return desFantas;
  }

  public void setDesFantas(String desFantas) {
    this.desFantas = desFantas;
  }

  public String getNumCgcCpf() {
    return numCgcCpf;
  }

  public void setNumCgcCpf(String numCgcCpf) {
    this.numCgcCpf = numCgcCpf;
  }

  public String getNumCgfRg() {
    return numCgfRg;
  }

  public void setNumCgfRg(String numCgfRg) {
    this.numCgfRg = numCgfRg;
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

  public Integer getCodRegTri() {
    return codRegTri;
  }

  public void setCodRegTri(Integer codRegTri) {
    this.codRegTri = codRegTri;
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

  public String getTipDescon() {
    return tipDescon;
  }

  public void setTipDescon(String tipDescon) {
    this.tipDescon = tipDescon;
  }

  public BigDecimal getPerDescon() {
    return perDescon;
  }

  public void setPerDescon(BigDecimal perDescon) {
    this.perDescon = perDescon;
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

  public Integer getQtdDiaPrz() {
    return qtdDiaPrz;
  }

  public void setQtdDiaPrz(Integer qtdDiaPrz) {
    this.qtdDiaPrz = qtdDiaPrz;
  }

  public Boolean getFlgNaoRepIcm() {
    return flgNaoRepIcm;
  }

  public void setFlgNaoRepIcm(Boolean flgNaoRepIcm) {
    this.flgNaoRepIcm = flgNaoRepIcm;
  }

  public Integer getCodIBGE() {
    return codIBGE;
  }

  public void setCodIBGE(Integer codIBGE) {
    this.codIBGE = codIBGE;
  }

  public String getDesToken() {
    return desToken;
  }

  public void setDesToken(String desToken) {
    this.desToken = desToken;
  }

  public Integer getIsnPlcFin() {
    return isnPlcFin;
  }

  public void setIsnPlcFin(Integer isnPlcFin) {
    this.isnPlcFin = isnPlcFin;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

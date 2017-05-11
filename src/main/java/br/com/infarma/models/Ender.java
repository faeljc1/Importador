package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

import java.sql.Timestamp;

public class Ender implements AbstractModel {
  private String codEndFon;
  private String tipEndere;
  private String desEndere;
  private String desBairro;
  private String numCep;
  private String desCidade;
  private String desEstado;
  private String desPtoRef;
  private String nomContat;
  private Timestamp datUltAtd;
  private Timestamp datCadast;
  private String desObserv;
  private Integer codLojOri;
  private Boolean flgBloque;
  private Integer tmpCodCartao;
  private String tmpNumCartao;
  private String tmpPerValCcr;
  private Integer tmpCodCartao1;
  private String tmpNumCartao1;
  private String tmpPerValCcr1;
  private Integer tmpCodCartao2;
  private String tmpNumCartao2;
  private String tmpPerValCcr2;
  private Timestamp tmpDatNascim;
  private String tmpNumCpf;
  private Boolean flgTaxEnt;

  public Ender() {
  }

  public Ender(String codEndFon, String tipEndere, String desEndere, String desBairro, String numCep, String desCidade, String desEstado, String desPtoRef, String nomContat, Timestamp datUltAtd, Timestamp datCadast, String desObserv, Integer codLojOri, Boolean flgBloque, Integer tmpCodCartao, String tmpNumCartao, String tmpPerValCcr, Integer tmpCodCartao1, String tmpNumCartao1, String tmpPerValCcr1, Integer tmpCodCartao2, String tmpNumCartao2, String tmpPerValCcr2, Timestamp tmpDatNascim, String tmpNumCpf, Boolean flgTaxEnt) {
    this.codEndFon = codEndFon;
    this.tipEndere = tipEndere;
    this.desEndere = desEndere;
    this.desBairro = desBairro;
    this.numCep = numCep;
    this.desCidade = desCidade;
    this.desEstado = desEstado;
    this.desPtoRef = desPtoRef;
    this.nomContat = nomContat;
    this.datUltAtd = datUltAtd;
    this.datCadast = datCadast;
    this.desObserv = desObserv;
    this.codLojOri = codLojOri;
    this.flgBloque = flgBloque;
    this.tmpCodCartao = tmpCodCartao;
    this.tmpNumCartao = tmpNumCartao;
    this.tmpPerValCcr = tmpPerValCcr;
    this.tmpCodCartao1 = tmpCodCartao1;
    this.tmpNumCartao1 = tmpNumCartao1;
    this.tmpPerValCcr1 = tmpPerValCcr1;
    this.tmpCodCartao2 = tmpCodCartao2;
    this.tmpNumCartao2 = tmpNumCartao2;
    this.tmpPerValCcr2 = tmpPerValCcr2;
    this.tmpDatNascim = tmpDatNascim;
    this.tmpNumCpf = tmpNumCpf;
    this.flgTaxEnt = flgTaxEnt;
  }

  public String getCodEndFon() {
    return codEndFon;
  }

  public void setCodEndFon(String codEndFon) {
    this.codEndFon = codEndFon;
  }

  public String getTipEndere() {
    return tipEndere;
  }

  public void setTipEndere(String tipEndere) {
    this.tipEndere = tipEndere;
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

  public String getNumCep() {
    return numCep;
  }

  public void setNumCep(String numCep) {
    this.numCep = numCep;
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

  public String getDesPtoRef() {
    return desPtoRef;
  }

  public void setDesPtoRef(String desPtoRef) {
    this.desPtoRef = desPtoRef;
  }

  public String getNomContat() {
    return nomContat;
  }

  public void setNomContat(String nomContat) {
    this.nomContat = nomContat;
  }

  public Timestamp getDatUltAtd() {
    return datUltAtd;
  }

  public void setDatUltAtd(Timestamp datUltAtd) {
    this.datUltAtd = datUltAtd;
  }

  public Timestamp getDatCadast() {
    return datCadast;
  }

  public void setDatCadast(Timestamp datCadast) {
    this.datCadast = datCadast;
  }

  public String getDesObserv() {
    return desObserv;
  }

  public void setDesObserv(String desObserv) {
    this.desObserv = desObserv;
  }

  public Integer getCodLojOri() {
    return codLojOri;
  }

  public void setCodLojOri(Integer codLojOri) {
    this.codLojOri = codLojOri;
  }

  public Boolean getFlgBloque() {
    return flgBloque;
  }

  public void setFlgBloque(Boolean flgBloque) {
    this.flgBloque = flgBloque;
  }

  public Integer getTmpCodCartao() {
    return tmpCodCartao;
  }

  public void setTmpCodCartao(Integer tmpCodCartao) {
    this.tmpCodCartao = tmpCodCartao;
  }

  public String getTmpNumCartao() {
    return tmpNumCartao;
  }

  public void setTmpNumCartao(String tmpNumCartao) {
    this.tmpNumCartao = tmpNumCartao;
  }

  public String getTmpPerValCcr() {
    return tmpPerValCcr;
  }

  public void setTmpPerValCcr(String tmpPerValCcr) {
    this.tmpPerValCcr = tmpPerValCcr;
  }

  public Integer getTmpCodCartao1() {
    return tmpCodCartao1;
  }

  public void setTmpCodCartao1(Integer tmpCodCartao1) {
    this.tmpCodCartao1 = tmpCodCartao1;
  }

  public String getTmpNumCartao1() {
    return tmpNumCartao1;
  }

  public void setTmpNumCartao1(String tmpNumCartao1) {
    this.tmpNumCartao1 = tmpNumCartao1;
  }

  public String getTmpPerValCcr1() {
    return tmpPerValCcr1;
  }

  public void setTmpPerValCcr1(String tmpPerValCcr1) {
    this.tmpPerValCcr1 = tmpPerValCcr1;
  }

  public Integer getTmpCodCartao2() {
    return tmpCodCartao2;
  }

  public void setTmpCodCartao2(Integer tmpCodCartao2) {
    this.tmpCodCartao2 = tmpCodCartao2;
  }

  public String getTmpNumCartao2() {
    return tmpNumCartao2;
  }

  public void setTmpNumCartao2(String tmpNumCartao2) {
    this.tmpNumCartao2 = tmpNumCartao2;
  }

  public String getTmpPerValCcr2() {
    return tmpPerValCcr2;
  }

  public void setTmpPerValCcr2(String tmpPerValCcr2) {
    this.tmpPerValCcr2 = tmpPerValCcr2;
  }

  public Timestamp getTmpDatNascim() {
    return tmpDatNascim;
  }

  public void setTmpDatNascim(Timestamp tmpDatNascim) {
    this.tmpDatNascim = tmpDatNascim;
  }

  public String getTmpNumCpf() {
    return tmpNumCpf;
  }

  public void setTmpNumCpf(String tmpNumCpf) {
    this.tmpNumCpf = tmpNumCpf;
  }

  public Boolean getFlgTaxEnt() {
    return flgTaxEnt;
  }

  public void setFlgTaxEnt(Boolean flgTaxEnt) {
    this.flgTaxEnt = flgTaxEnt;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {
  }
}

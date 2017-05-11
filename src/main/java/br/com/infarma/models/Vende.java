package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

public class Vende implements AbstractModel {
  private int codVended;
  private String nomVended;
  private Integer codTabCom;
  private Boolean flgBloque;
  private String snhVended;
  private String snhHash;
  private String numCpf;

  public Vende() {
  }

  public Vende(int codVended, String nomVended, Integer codTabCom, Boolean flgBloque, String snhVended, String snhHash, String numCpf) {
    this.codVended = codVended;
    this.nomVended = nomVended;
    this.codTabCom = codTabCom;
    this.flgBloque = flgBloque;
    this.snhVended = snhVended;
    this.snhHash = snhHash;
    this.numCpf = numCpf;
  }

  public int getCodVended() {
    return codVended;
  }

  public void setCodVended(int codVended) {
    this.codVended = codVended;
  }

  public String getNomVended() {
    return nomVended;
  }

  public void setNomVended(String nomVended) {
    this.nomVended = nomVended;
  }

  public Integer getCodTabCom() {
    return codTabCom;
  }

  public void setCodTabCom(Integer codTabCom) {
    this.codTabCom = codTabCom;
  }

  public Boolean getFlgBloque() {
    return flgBloque;
  }

  public void setFlgBloque(Boolean flgBloque) {
    this.flgBloque = flgBloque;
  }

  public String getSnhVended() {
    return snhVended;
  }

  public void setSnhVended(String snhVended) {
    this.snhVended = snhVended;
  }

  public String getSnhHash() {
    return snhHash;
  }

  public void setSnhHash(String snhHash) {
    this.snhHash = snhHash;
  }

  public String getNumCpf() {
    return numCpf;
  }

  public void setNumCpf(String numCpf) {
    this.numCpf = numCpf;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {
  }
}

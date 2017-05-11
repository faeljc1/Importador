package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

public class Class implements AbstractModel {
  private String codClassi;
  private String desClassi;
  private Integer numNivel;

  public Class() {
  }

  public Class(String codClassi, String desClassi, Integer numNivel) {
    this.codClassi = codClassi;
    this.desClassi = desClassi;
    this.numNivel = numNivel;
  }

  public String getCodClassi() {
    return codClassi;
  }

  public void setCodClassi(String codClassi) {
    this.codClassi = codClassi;
  }

  public String getDesClassi() {
    return desClassi;
  }

  public void setDesClassi(String desClassi) {
    this.desClassi = desClassi;
  }

  public Integer getNumNivel() {
    return numNivel;
  }

  public void setNumNivel(Integer numNivel) {
    this.numNivel = numNivel;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {
  }
}

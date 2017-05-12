package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

public class Prean implements AbstractModel {
  private int codProdut;
  private String codEan;
  private Integer qtdFraVen;

  public Prean() {
  }

  public Prean(int codProdut, String codEan, Integer qtdFraVen) {
    this.codProdut = codProdut;
    this.codEan = codEan;
    this.qtdFraVen = qtdFraVen;
  }

  public int getCodProdut() {
    return codProdut;
  }

  public void setCodProdut(int codProdut) {
    this.codProdut = codProdut;
  }

  public String getCodEan() {
    return codEan;
  }

  public void setCodEan(String codEan) {
    this.codEan = codEan;
  }

  public Integer getQtdFraVen() {
    return qtdFraVen;
  }

  public void setQtdFraVen(Integer qtdFraVen) {
    this.qtdFraVen = qtdFraVen;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

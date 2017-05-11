package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

public class Tbsec implements AbstractModel {
  private int codSeccao;
  private String desSeccao;

  public Tbsec() {}

  public Tbsec(int codSeccao, String desSeccao) {
    this.codSeccao = codSeccao;
    this.desSeccao = desSeccao;
  }

  public int getCodSeccao() {
    return codSeccao;
  }

  public void setCodSeccao(int codSeccao) {
    this.codSeccao = codSeccao;
  }

  public String getDesSeccao() {
    return desSeccao;
  }

  public void setDesSeccao(String desSeccao) {
    this.desSeccao = desSeccao;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

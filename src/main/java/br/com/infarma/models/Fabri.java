package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

public class Fabri implements AbstractModel {
  private int codFabric;
  private String desFabric;
  private String numCnpj;

  public Fabri() {
  }

  public Fabri(int codFabric, String desFabric, String numCnpj) {
    this.codFabric = codFabric;
    this.desFabric = desFabric;
    this.numCnpj = numCnpj;
  }

  public int getCodFabric() {
    return codFabric;
  }

  public void setCodFabric(int codFabric) {
    this.codFabric = codFabric;
  }

  public String getDesFabric() {
    return desFabric;
  }

  public void setDesFabric(String desFabric) {
    this.desFabric = desFabric;
  }

  public String getNumCnpj() {
    return numCnpj;
  }

  public void setNumCnpj(String numCnpj) {
    this.numCnpj = numCnpj;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

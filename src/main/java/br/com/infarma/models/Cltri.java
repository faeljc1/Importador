package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

public class Cltri implements AbstractModel {
  private String codClaTri;
  private String desClaTri;
  private String desObserv;

  public Cltri() {
  }

  public Cltri(String codClaTri, String desClaTri, String desObserv) {
    this.codClaTri = codClaTri;
    this.desClaTri = desClaTri;
    this.desObserv = desObserv;
  }

  public String getCodClaTri() {
    return codClaTri;
  }

  public void setCodClaTri(String codClaTri) {
    this.codClaTri = codClaTri;
  }

  public String getDesClaTri() {
    return desClaTri;
  }

  public void setDesClaTri(String desClaTri) {
    this.desClaTri = desClaTri;
  }

  public String getDesObserv() {
    return desObserv;
  }

  public void setDesObserv(String desObserv) {
    this.desObserv = desObserv;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

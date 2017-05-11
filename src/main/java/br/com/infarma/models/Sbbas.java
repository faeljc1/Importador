package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

public class Sbbas implements AbstractModel {
  private int codSubBas;
  private String desSubBas;
  private String codDCB;
  private String obsSubBas;

  public Sbbas() {
  }

  public Sbbas(int codSubBas, String desSubBas, String codDCB, String obsSubBas) {
    this.codSubBas = codSubBas;
    this.desSubBas = desSubBas;
    this.codDCB = codDCB;
    this.obsSubBas = obsSubBas;
  }

  public int getCodSubBas() {
    return codSubBas;
  }

  public void setCodSubBas(int codSubBas) {
    this.codSubBas = codSubBas;
  }

  public String getDesSubBas() {
    return desSubBas;
  }

  public void setDesSubBas(String desSubBas) {
    this.desSubBas = desSubBas;
  }

  public String getCodDCB() {
    return codDCB;
  }

  public void setCodDCB(String codDCB) {
    this.codDCB = codDCB;
  }

  public String getObsSubBas() {
    return obsSubBas;
  }

  public void setObsSubBas(String obsSubBas) {
    this.obsSubBas = obsSubBas;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {
  }
}

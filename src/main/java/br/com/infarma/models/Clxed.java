package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Clxed implements AbstractModel {
  private int codClient;
  private String codEndFon;

  public Clxed() {
  }

  public Clxed(int codClient, String codEndFon) {
    this.codClient = codClient;
    this.codEndFon = codEndFon;
  }

  public int getCodClient() {
    return codClient;
  }

  public void setCodClient(int codClient) {
    this.codClient = codClient;
  }

  public String getCodEndFon() {
    return codEndFon;
  }

  public void setCodEndFon(String codEndFon) {
    this.codEndFon = codEndFon;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

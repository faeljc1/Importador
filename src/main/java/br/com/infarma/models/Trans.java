package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

public class Trans implements AbstractModel {
  private int codTransp;
  private String desRazSoc;
  private String desFantas;
  private String numCgcCpf;
  private String numCgfRg;
  private String desEndere;
  private String desBairro;
  private String desCidade;
  private String desEstado;
  private String numCep;
  private String numFone;
  private String numFax;
  private String nomContat;
  private Integer codRegTri;
  private Boolean flgBloque;
  private Integer codIBGE;
  private String numInscri;
  private String numRG;

  public Trans() {
  }

  public Trans(int codTransp, String desRazSoc, String desFantas, String numCgcCpf, String numCgfRg, String desEndere, String desBairro, String desCidade, String desEstado, String numCep, String numFone, String numFax, String nomContat, Integer codRegTri, Boolean flgBloque, Integer codIBGE, String numInscri, String numRG) {
    this.codTransp = codTransp;
    this.desRazSoc = desRazSoc;
    this.desFantas = desFantas;
    this.numCgcCpf = numCgcCpf;
    this.numCgfRg = numCgfRg;
    this.desEndere = desEndere;
    this.desBairro = desBairro;
    this.desCidade = desCidade;
    this.desEstado = desEstado;
    this.numCep = numCep;
    this.numFone = numFone;
    this.numFax = numFax;
    this.nomContat = nomContat;
    this.codRegTri = codRegTri;
    this.flgBloque = flgBloque;
    this.codIBGE = codIBGE;
    this.numInscri = numInscri;
    this.numRG = numRG;
  }

  public int getCodTransp() {
    return codTransp;
  }

  public void setCodTransp(int codTransp) {
    this.codTransp = codTransp;
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

  public Integer getCodRegTri() {
    return codRegTri;
  }

  public void setCodRegTri(Integer codRegTri) {
    this.codRegTri = codRegTri;
  }

  public Boolean getFlgBloque() {
    return flgBloque;
  }

  public void setFlgBloque(Boolean flgBloque) {
    this.flgBloque = flgBloque;
  }

  public Integer getCodIBGE() {
    return codIBGE;
  }

  public void setCodIBGE(Integer codIBGE) {
    this.codIBGE = codIBGE;
  }

  public String getNumInscri() {
    return numInscri;
  }

  public void setNumInscri(String numInscri) {
    this.numInscri = numInscri;
  }

  public String getNumRG() {
    return numRG;
  }

  public void setNumRG(String numRG) {
    this.numRG = numRG;
  }


  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

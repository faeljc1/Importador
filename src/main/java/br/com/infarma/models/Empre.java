package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

import java.sql.Timestamp;

public class Empre implements AbstractModel {
  private String razaoSocial;
  private String fantasia;
  private String endereco;
  private String numero;
  private String complemento;
  private String bairro;
  private String cep;
  private String cidade;
  private String estado;
  private String cgc;
  private String cgf;
  private String fone;
  private String fax;
  private String email;

  public Empre() {
  }

  public Empre(String razaoSocial, String fantasia, String endereco, String numero, String complemento, String bairro, String cep, String cidade, String estado, String cgc, String cgf, String fone, String fax, String email) {
    this.razaoSocial = razaoSocial;
    this.fantasia = fantasia;
    this.endereco = endereco;
    this.numero = numero;
    this.complemento = complemento;
    this.bairro = bairro;
    this.cep = cep;
    this.cidade = cidade;
    this.estado = estado;
    this.cgc = cgc;
    this.cgf = cgf;
    this.fone = fone;
    this.fax = fax;
    this.email = email;
  }

  public String getRazaoSocial() {
    return razaoSocial;
  }

  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  public String getFantasia() {
    return fantasia;
  }

  public void setFantasia(String fantasia) {
    this.fantasia = fantasia;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getCgc() {
    return cgc;
  }

  public void setCgc(String cgc) {
    this.cgc = cgc;
  }

  public String getCgf() {
    return cgf;
  }

  public void setCgf(String cgf) {
    this.cgf = cgf;
  }

  public String getFone() {
    return fone;
  }

  public void setFone(String fone) {
    this.fone = fone;
  }

  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

package br.com.infarma.models.dto;

import br.com.infarma.models.Configuracao;
import br.com.infarma.models.pojo.TabelaPOJO;

import java.util.List;

public class TelaDTO {
  private Configuracao configuracao;
  private List<TabelaPOJO> tabelaPOJOs;
  private String tipo;
  private String status;
  private String mensagemQueVeioDaRequest;

  public TelaDTO() {
  }

  public TelaDTO(Configuracao configuracao, List<TabelaPOJO> tabelaPOJOs, String tipo, String status, String mensagemQueVeioDaRequest) {
    this.configuracao = configuracao;
    this.tabelaPOJOs = tabelaPOJOs;
    this.tipo = tipo;
    this.status = status;
    this.mensagemQueVeioDaRequest = mensagemQueVeioDaRequest;
  }

  public Configuracao getConfiguracao() {
    return configuracao;
  }

  public void setConfiguracao(Configuracao configuracao) {
    this.configuracao = configuracao;
  }

  public List<TabelaPOJO> getTabelaPOJOs() {
    return tabelaPOJOs;
  }

  public void setTabelaPOJOs(List<TabelaPOJO> tabelaPOJOs) {
    this.tabelaPOJOs = tabelaPOJOs;
  }

  public String getTipo() {
    if (tipo == null) {
      tipo = "";
    }
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getStatus() {
    if (status == null) {
      status = "";
    }
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMensagemQueVeioDaRequest() {
    return mensagemQueVeioDaRequest;
  }

  public void setMensagemQueVeioDaRequest(String mensagemQueVeioDaRequest) {
    this.mensagemQueVeioDaRequest = mensagemQueVeioDaRequest;
  }
}

package br.com.infarma.models;

public class Configuracao {

  private String servidorOrigem;
  private String instanciaOrigem;
  private String bancoOrigem;
  private String portaOrigem;
  private String usuarioOrigem;
  private String senhaOrigem;
  private String servidorDestino;
  private String instanciaDestino;
  private String bancoDestino;
  private String portaDestino;
  private String usuarioDestino;
  private String senhaDestino;

  public Configuracao() {

  }

  public Configuracao(String servidorOrigem, String instanciaOrigem,
                      String bancoOrigem, String portaOrigem, String usuarioOrigem,
                      String senhaOrigem, String servidorDestino,
                      String instanciaDestino, String bancoDestino, String portaDestino,
                      String usuarioDestino, String senhaDestino) {
    this.servidorOrigem = servidorOrigem;
    this.instanciaOrigem = instanciaOrigem;
    this.bancoOrigem = bancoOrigem;
    this.portaOrigem = portaOrigem;
    this.usuarioOrigem = usuarioOrigem;
    this.senhaOrigem = senhaOrigem;
    this.servidorDestino = servidorDestino;
    this.bancoDestino = bancoDestino;
    this.portaDestino = portaDestino;
    this.instanciaDestino = instanciaDestino;
    this.usuarioDestino = usuarioDestino;
    this.senhaDestino = senhaDestino;
  }

  public String getServidorOrigem() {
    return servidorOrigem;
  }

  public void setServidorOrigem(String servidorOrigem) {
    this.servidorOrigem = servidorOrigem;
  }

  public String getInstanciaOrigem() {
    return instanciaOrigem;
  }

  public void setInstanciaOrigem(String instanciaOrigem) {
    this.instanciaOrigem = instanciaOrigem;
  }

  public String getBancoOrigem() {
    return bancoOrigem;
  }

  public void setBancoOrigem(String bancoOrigem) {
    this.bancoOrigem = bancoOrigem;
  }

  public String getPortaOrigem() {
    return portaOrigem;
  }

  public void setPortaOrigem(String portaOrigem) {
    this.portaOrigem = portaOrigem;
  }

  public String getUsuarioOrigem() {
    return usuarioOrigem;
  }

  public void setUsuarioOrigem(String usuarioOrigem) {
    this.usuarioOrigem = usuarioOrigem;
  }

  public String getSenhaOrigem() {
    return senhaOrigem;
  }

  public void setSenhaOrigem(String senhaOrigem) {
    this.senhaOrigem = senhaOrigem;
  }

  public String getServidorDestino() {
    return servidorDestino;
  }

  public void setServidorDestino(String servidorDestino) {
    this.servidorDestino = servidorDestino;
  }

  public String getBancoDestino() {
    return bancoDestino;
  }

  public void setBancoDestino(String bancoDestino) {
    this.bancoDestino = bancoDestino;
  }

  public String getPortaDestino() {
    return portaDestino;
  }

  public void setPortaDestino(String portaDestino) {
    this.portaDestino = portaDestino;
  }

  public String getInstanciaDestino() {
    return instanciaDestino;
  }

  public void setInstanciaDestino(String instanciaDestino) {
    this.instanciaDestino = instanciaDestino;
  }

  public String getUsuarioDestino() {
    return usuarioDestino;
  }

  public void setUsuarioDestino(String usuarioDestino) {
    this.usuarioDestino = usuarioDestino;
  }

  public String getSenhaDestino() {
    return senhaDestino;
  }

  public void setSenhaDestino(String senhaDestino) {
    this.senhaDestino = senhaDestino;
  }
}

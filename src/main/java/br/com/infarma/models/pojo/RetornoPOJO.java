package br.com.infarma.models.pojo;

public class RetornoPOJO {

  private int processado1;
  private int totalDeRegiistros1;
  private int processado2;
  private int totalDeRegiistros2;
  private String status;
  private String mensagem;

  public RetornoPOJO() {
  }

  public int getProcessado1() {
    return processado1;
  }

  public void setProcessado1(int processado1) {
    this.processado1 = processado1;
  }

  public int getTotalDeRegiistros1() {
    return totalDeRegiistros1;
  }

  public void setTotalDeRegiistros1(int totalDeRegiistros1) {
    this.totalDeRegiistros1 = totalDeRegiistros1;
  }

  public int getProcessado2() {
    return processado2;
  }

  public void setProcessado2(int processado2) {
    this.processado2 = processado2;
  }

  public int getTotalDeRegiistros2() {
    return totalDeRegiistros2;
  }

  public void setTotalDeRegiistros2(int totalDeRegiistros2) {
    this.totalDeRegiistros2 = totalDeRegiistros2;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }
}

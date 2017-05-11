package br.com.infarma.utils;

import br.com.infarma.models.pojo.TabelaPOJO;

import java.util.List;

public class Message {

  private List<TabelaPOJO> message;
  private int id;

  public Message() {

  }

  public Message(List<TabelaPOJO> message, int id) {
    this.message = message;
    this.id = id;
  }

  public List<TabelaPOJO> getMessage() {
    return message;
  }

  public void setMessage(List<TabelaPOJO> message) {
    this.message = message;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
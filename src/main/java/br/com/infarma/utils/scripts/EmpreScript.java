package br.com.infarma.utils.scripts;

public class EmpreScript {

  private static EmpreScript INSTANCE = new EmpreScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static EmpreScript getInstance() {
    return INSTANCE;
  }

  private EmpreScript() {
    // INSERT
    insert.append("INSERT INTO EMPRE (");
    insert.append(" Razao_Social, Fantasia, Endereco, Numero, Complemento, Bairro, CEP, Cidade, Estado, CGC, CGF, Fone, Fax, Email) ");
    insert.append(" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?);");

    //SELECT
    select.append("SELECT * FROM EMPRE");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }

}

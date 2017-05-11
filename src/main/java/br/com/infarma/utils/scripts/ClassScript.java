package br.com.infarma.utils.scripts;

public class ClassScript {

  private static ClassScript INSTANCE = new ClassScript();
  private final StringBuilder insert = new StringBuilder();
  private final StringBuilder select = new StringBuilder();

  public static ClassScript getInstance() {
    return INSTANCE;
  }

  private ClassScript() {
    // INSERT
    insert.append("INSERT INTO CLASS (");
    insert.append(" Cod_Classi, Des_Classi, Num_Nivel) ");
    insert.append(" VALUES (?,?,?);");

    //SELECT
    select.append("SELECT * FROM CLASS WHERE Cod_Classi=?");
  }

  public String getInsert() {
    return insert.toString();
  }

  public String getSelect() {
    return select.toString();
  }

}

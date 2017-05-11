package br.com.infarma.models.pojo;

import br.com.infarma.utils.TabelasEnum;

public class TabelaPOJO {

    private String codigo;
    private String descricao;
    private TabelasEnum tabelasEnum;
    private boolean checked;

    public TabelaPOJO() {
    }

    public TabelaPOJO(String codigo, String descricao, TabelasEnum tabelasEnum, boolean checked) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tabelasEnum = tabelasEnum;
        this.checked = checked;
    }

    public TabelasEnum getTabelasEnum() {
        return tabelasEnum;
    }

    public void setTabelasEnum(TabelasEnum tabelasEnum) {
        this.tabelasEnum = tabelasEnum;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

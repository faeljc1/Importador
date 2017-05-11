package br.com.infarma.utils;

import br.com.infarma.daos.*;

public enum TabelasEnum {

  SCRIPT("1-Script Estoque", new ScriptDAO(), "");
  /*ESTAB("3-ESTAB", new EstabDAO(), ""), VENDE("4-VENDE", new VendeDAO(), ""),
  GRCLI("5-GRCLI", new GrcliDAO(), "AGCOB BAIRR CIDAD ESTAD"),
  CLIEN("6-CLIEN", new ClienDAO(), ""), ENDER("7-ENDER", new EnderDAO(), "CLXED"),
  FABRI("8-FABRI", new FabriDAO(), ""), FORNE("9-FORNE", new ForneDAO(), ""),
  CLASS("10-CLASS", new ClassDAO(), ""), GRPRC("11-GRPRC", new GrprcDAO(), ""),
  CLTRI("12-CLTRI", new CltriDAO(), ""), SBBAS("13-SBBAS", new SbbasDAO(), ""),
  TBNCM("14-TBNCM", new TbncmDAO(), ""), PRODU("15-PRODU", new ProduDAO(), "PREAN PRXES HSPRC"),
  BALAN("16-BALAN", new BalanDAO(), ""), ATUALIZAPRECOS("AtualizaPreços", new AtualizaPrecos(), "");*/

  private String descricao;
  private DAO DAO;
  private String relacionamentos;

  TabelasEnum(String descricao, DAO dao, String relacionamentos) {
    this.descricao = descricao;
    this.DAO = dao;
    this.relacionamentos = relacionamentos;
  }

  public String getDescricao() {
    return descricao;
  }

  public DAO getDAO() {
    return DAO;
  }

  public String getRelacionamentos() {
    return relacionamentos;
  }
}

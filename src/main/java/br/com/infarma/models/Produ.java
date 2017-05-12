package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Produ implements AbstractModel {
  private int codProdut;
  private String desProdut;
  private String desResumi;
  private String desComple;
  private Timestamp datImplan;
  private String desUniVen;
  private String desUniCom;
  private Integer qtdFraVen;
  private String codClassi;
  private Integer codSeccao;
  private Integer codFabric;
  private Integer codSubBas;
  private String codGrpPrc;
  private Integer codAbcFar;
  private String codEAN;
  private Integer codPrdGrd;
  private String ctrPreco;
  private String ctrLista;
  private String ctrVenda;
  private String tipPor344;
  private String ctrOrigem;
  private String codClaTri;
  private BigDecimal prcFabric;
  private BigDecimal prcMaxVen;
  private Boolean flgServic;
  private Boolean flgPrcTab;
  private Boolean flgImpEtq;
  private String codClaFis;
  private Integer qtdEmbVen;
  private String numRegMS;
  private String codNcm;
  private BigDecimal prcRefFmp;
  private String snhHash;
  private Integer codTipIte;
  private Boolean flgUsoCtn;
  private String codCEST;
  private String codTipMed;
  private String codTipPbm;
  private Integer codPriAtv;
  private Boolean flgBlqVenExt;

  public Produ() {
  }

  public Produ(int codProdut, String desProdut, String desResumi, String desComple, Timestamp datImplan, String desUniVen, String desUniCom, Integer qtdFraVen, String codClassi, Integer codSeccao, Integer codFabric, Integer codSubBas, String codGrpPrc, Integer codAbcFar, String codEAN, Integer codPrdGrd, String ctrPreco, String ctrLista, String ctrVenda, String tipPor344, String ctrOrigem, String codClaTri, BigDecimal prcFabric, BigDecimal prcMaxVen, Boolean flgServic, Boolean flgPrcTab, Boolean flgImpEtq, String codClaFis, Integer qtdEmbVen, String numRegMS, String codNcm, BigDecimal prcRefFmp, String snhHash, Integer codTipIte, Boolean flgUsoCtn, String codCEST, String codTipMed, String codTipPbm, Integer codPriAtv, Boolean flgBlqVenExt) {
    this.codProdut = codProdut;
    this.desProdut = desProdut;
    this.desResumi = desResumi;
    this.desComple = desComple;
    this.datImplan = datImplan;
    this.desUniVen = desUniVen;
    this.desUniCom = desUniCom;
    this.qtdFraVen = qtdFraVen;
    this.codClassi = codClassi;
    this.codSeccao = codSeccao;
    this.codFabric = codFabric;
    this.codSubBas = codSubBas;
    this.codGrpPrc = codGrpPrc;
    this.codAbcFar = codAbcFar;
    this.codEAN = codEAN;
    this.codPrdGrd = codPrdGrd;
    this.ctrPreco = ctrPreco;
    this.ctrLista = ctrLista;
    this.ctrVenda = ctrVenda;
    this.tipPor344 = tipPor344;
    this.ctrOrigem = ctrOrigem;
    this.codClaTri = codClaTri;
    this.prcFabric = prcFabric;
    this.prcMaxVen = prcMaxVen;
    this.flgServic = flgServic;
    this.flgPrcTab = flgPrcTab;
    this.flgImpEtq = flgImpEtq;
    this.codClaFis = codClaFis;
    this.qtdEmbVen = qtdEmbVen;
    this.numRegMS = numRegMS;
    this.codNcm = codNcm;
    this.prcRefFmp = prcRefFmp;
    this.snhHash = snhHash;
    this.codTipIte = codTipIte;
    this.flgUsoCtn = flgUsoCtn;
    this.codCEST = codCEST;
    this.codTipMed = codTipMed;
    this.codTipPbm = codTipPbm;
    this.codPriAtv = codPriAtv;
    this.flgBlqVenExt = flgBlqVenExt;
  }

  public int getCodProdut() {
    return codProdut;
  }

  public void setCodProdut(int codProdut) {
    this.codProdut = codProdut;
  }

  public String getDesProdut() {
    return desProdut;
  }

  public void setDesProdut(String desProdut) {
    this.desProdut = desProdut;
  }

  public String getDesResumi() {
    return desResumi;
  }

  public void setDesResumi(String desResumi) {
    this.desResumi = desResumi;
  }

  public String getDesComple() {
    return desComple;
  }

  public void setDesComple(String desComple) {
    this.desComple = desComple;
  }

  public Timestamp getDatImplan() {
    return datImplan;
  }

  public void setDatImplan(Timestamp datImplan) {
    this.datImplan = datImplan;
  }

  public String getDesUniVen() {
    return desUniVen;
  }

  public void setDesUniVen(String desUniVen) {
    this.desUniVen = desUniVen;
  }

  public String getDesUniCom() {
    return desUniCom;
  }

  public void setDesUniCom(String desUniCom) {
    this.desUniCom = desUniCom;
  }

  public Integer getQtdFraVen() {
    return qtdFraVen;
  }

  public void setQtdFraVen(Integer qtdFraVen) {
    this.qtdFraVen = qtdFraVen;
  }

  public String getCodClassi() {
    return codClassi;
  }

  public void setCodClassi(String codClassi) {
    this.codClassi = codClassi;
  }

  public Integer getCodSeccao() {
    return codSeccao;
  }

  public void setCodSeccao(Integer codSeccao) {
    this.codSeccao = codSeccao;
  }

  public Integer getCodFabric() {
    return codFabric;
  }

  public void setCodFabric(Integer codFabric) {
    this.codFabric = codFabric;
  }

  public Integer getCodSubBas() {
    return codSubBas;
  }

  public void setCodSubBas(Integer codSubBas) {
    this.codSubBas = codSubBas;
  }

  public String getCodGrpPrc() {
    return codGrpPrc;
  }

  public void setCodGrpPrc(String codGrpPrc) {
    this.codGrpPrc = codGrpPrc;
  }

  public Integer getCodAbcFar() {
    return codAbcFar;
  }

  public void setCodAbcFar(Integer codAbcFar) {
    this.codAbcFar = codAbcFar;
  }

  public String getCodEAN() {
    return codEAN;
  }

  public void setCodEAN(String codEAN) {
    this.codEAN = codEAN;
  }

  public Integer getCodPrdGrd() {
    return codPrdGrd;
  }

  public void setCodPrdGrd(Integer codPrdGrd) {
    this.codPrdGrd = codPrdGrd;
  }

  public String getCtrPreco() {
    return ctrPreco;
  }

  public void setCtrPreco(String ctrPreco) {
    this.ctrPreco = ctrPreco;
  }

  public String getCtrLista() {
    return ctrLista;
  }

  public void setCtrLista(String ctrLista) {
    this.ctrLista = ctrLista;
  }

  public String getCtrVenda() {
    return ctrVenda;
  }

  public void setCtrVenda(String ctrVenda) {
    this.ctrVenda = ctrVenda;
  }

  public String getTipPor344() {
    return tipPor344;
  }

  public void setTipPor344(String tipPor344) {
    this.tipPor344 = tipPor344;
  }

  public String getCtrOrigem() {
    return ctrOrigem;
  }

  public void setCtrOrigem(String ctrOrigem) {
    this.ctrOrigem = ctrOrigem;
  }

  public String getCodClaTri() {
    return codClaTri;
  }

  public void setCodClaTri(String codClaTri) {
    this.codClaTri = codClaTri;
  }

  public BigDecimal getPrcFabric() {
    return prcFabric;
  }

  public void setPrcFabric(BigDecimal prcFabric) {
    this.prcFabric = prcFabric;
  }

  public BigDecimal getPrcMaxVen() {
    return prcMaxVen;
  }

  public void setPrcMaxVen(BigDecimal prcMaxVen) {
    this.prcMaxVen = prcMaxVen;
  }

  public Boolean getFlgServic() {
    return flgServic;
  }

  public void setFlgServic(Boolean flgServic) {
    this.flgServic = flgServic;
  }

  public Boolean getFlgPrcTab() {
    return flgPrcTab;
  }

  public void setFlgPrcTab(Boolean flgPrcTab) {
    this.flgPrcTab = flgPrcTab;
  }

  public Boolean getFlgImpEtq() {
    return flgImpEtq;
  }

  public void setFlgImpEtq(Boolean flgImpEtq) {
    this.flgImpEtq = flgImpEtq;
  }

  public String getCodClaFis() {
    return codClaFis;
  }

  public void setCodClaFis(String codClaFis) {
    this.codClaFis = codClaFis;
  }

  public Integer getQtdEmbVen() {
    return qtdEmbVen;
  }

  public void setQtdEmbVen(Integer qtdEmbVen) {
    this.qtdEmbVen = qtdEmbVen;
  }

  public String getNumRegMS() {
    return numRegMS;
  }

  public void setNumRegMS(String numRegMS) {
    this.numRegMS = numRegMS;
  }

  public String getCodNcm() {
    return codNcm;
  }

  public void setCodNcm(String codNcm) {
    this.codNcm = codNcm;
  }

  public BigDecimal getPrcRefFmp() {
    return prcRefFmp;
  }

  public void setPrcRefFmp(BigDecimal prcRefFmp) {
    this.prcRefFmp = prcRefFmp;
  }

  public String getSnhHash() {
    return snhHash;
  }

  public void setSnhHash(String snhHash) {
    this.snhHash = snhHash;
  }

  public Integer getCodTipIte() {
    return codTipIte;
  }

  public void setCodTipIte(Integer codTipIte) {
    this.codTipIte = codTipIte;
  }

  public Boolean getFlgUsoCtn() {
    return flgUsoCtn;
  }

  public void setFlgUsoCtn(Boolean flgUsoCtn) {
    this.flgUsoCtn = flgUsoCtn;
  }

  public String getCodCEST() {
    return codCEST;
  }

  public void setCodCEST(String codCEST) {
    this.codCEST = codCEST;
  }

  public String getCodTipMed() {
    return codTipMed;
  }

  public void setCodTipMed(String codTipMed) {
    this.codTipMed = codTipMed;
  }

  public String getCodTipPbm() {
    return codTipPbm;
  }

  public void setCodTipPbm(String codTipPbm) {
    this.codTipPbm = codTipPbm;
  }

  public Integer getCodPriAtv() {
    return codPriAtv;
  }

  public void setCodPriAtv(Integer codPriAtv) {
    this.codPriAtv = codPriAtv;
  }

  public Boolean getFlgBlqVenExt() {
    return flgBlqVenExt;
  }

  public void setFlgBlqVenExt(Boolean flgBlqVenExt) {
    this.flgBlqVenExt = flgBlqVenExt;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {
  }
}

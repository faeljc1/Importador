package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Prxlj implements AbstractModel {
  private int codLoja;
  private int codProdut;
  private Integer codPrmAtv;
  private String locFisica;
  private String claAbcVal;
  private Integer posAbcVal;
  private String claAbcVol;
  private Integer posAbcVol;
  private Integer qtdMinCal;
  private Integer qtdMinCfg;
  private Integer qtdMaxCal;
  private Integer qtdMaxCfg;
  private BigDecimal qtdVenMedSem;
  private Integer qtdTrnDep;
  private Integer qtdTransi;
  private Integer qtdFisico;
  private Integer qtdAvaria;
  private Integer qtdSolici;
  private Integer qtdEntPen;
  private Integer qtdSaiPen;
  private Integer qtdSaldo;
  private BigDecimal prcCusEnt;
  private BigDecimal prcCusLiq;
  private BigDecimal prcCusLiqMed;
  private BigDecimal prcVenAtu;
  private Timestamp datPrcVenAtu;
  private Timestamp datUltCom;
  private Timestamp datUltVen;
  private Boolean flgBlqCom;
  private Boolean flgBlqVen;
  private Boolean flgBlqDsc;
  private Timestamp datPrcUltBal;
  private Integer qtdSldAntBal;
  private Integer qtdSldPosBal;
  private String nomUsuari;
  private Integer qtdConsig;
  private Integer numEsteir;
  private String codLocali;
  private Integer qtdReserv;
  private Integer qtdSldAnt;
  private Timestamp datSldAnt;
  private String snhHash;
  private BigDecimal prcFabric;
  private BigDecimal prcMaxCon;

  public Prxlj() {}

  public Prxlj(int codLoja, int codProdut, Integer codPrmAtv, String locFisica, String claAbcVal, Integer posAbcVal, String claAbcVol, Integer posAbcVol, Integer qtdMinCal, Integer qtdMinCfg, Integer qtdMaxCal, Integer qtdMaxCfg, BigDecimal qtdVenMedSem, Integer qtdTrnDep, Integer qtdTransi, Integer qtdFisico, Integer qtdAvaria, Integer qtdSolici, Integer qtdEntPen, Integer qtdSaiPen, Integer qtdSaldo, BigDecimal prcCusEnt, BigDecimal prcCusLiq, BigDecimal prcCusLiqMed, BigDecimal prcVenAtu, Timestamp datPrcVenAtu, Timestamp datUltCom, Timestamp datUltVen, Boolean flgBlqCom, Boolean flgBlqVen, Boolean flgBlqDsc, Timestamp datPrcUltBal, Integer qtdSldAntBal, Integer qtdSldPosBal, String nomUsuari, Integer qtdConsig, Integer numEsteir, String codLocali, Integer qtdReserv, Integer qtdSldAnt, Timestamp datSldAnt, String snhHash, BigDecimal prcFabric, BigDecimal prcMaxCon) {
    this.codLoja = codLoja;
    this.codProdut = codProdut;
    this.codPrmAtv = codPrmAtv;
    this.locFisica = locFisica;
    this.claAbcVal = claAbcVal;
    this.posAbcVal = posAbcVal;
    this.claAbcVol = claAbcVol;
    this.posAbcVol = posAbcVol;
    this.qtdMinCal = qtdMinCal;
    this.qtdMinCfg = qtdMinCfg;
    this.qtdMaxCal = qtdMaxCal;
    this.qtdMaxCfg = qtdMaxCfg;
    this.qtdVenMedSem = qtdVenMedSem;
    this.qtdTrnDep = qtdTrnDep;
    this.qtdTransi = qtdTransi;
    this.qtdFisico = qtdFisico;
    this.qtdAvaria = qtdAvaria;
    this.qtdSolici = qtdSolici;
    this.qtdEntPen = qtdEntPen;
    this.qtdSaiPen = qtdSaiPen;
    this.qtdSaldo = qtdSaldo;
    this.prcCusEnt = prcCusEnt;
    this.prcCusLiq = prcCusLiq;
    this.prcCusLiqMed = prcCusLiqMed;
    this.prcVenAtu = prcVenAtu;
    this.datPrcVenAtu = datPrcVenAtu;
    this.datUltCom = datUltCom;
    this.datUltVen = datUltVen;
    this.flgBlqCom = flgBlqCom;
    this.flgBlqVen = flgBlqVen;
    this.flgBlqDsc = flgBlqDsc;
    this.datPrcUltBal = datPrcUltBal;
    this.qtdSldAntBal = qtdSldAntBal;
    this.qtdSldPosBal = qtdSldPosBal;
    this.nomUsuari = nomUsuari;
    this.qtdConsig = qtdConsig;
    this.numEsteir = numEsteir;
    this.codLocali = codLocali;
    this.qtdReserv = qtdReserv;
    this.qtdSldAnt = qtdSldAnt;
    this.datSldAnt = datSldAnt;
    this.snhHash = snhHash;
    this.prcFabric = prcFabric;
    this.prcMaxCon = prcMaxCon;
  }

  public int getCodLoja() {
    return codLoja;
  }

  public void setCodLoja(int codLoja) {
    this.codLoja = codLoja;
  }

  public int getCodProdut() {
    return codProdut;
  }

  public void setCodProdut(int codProdut) {
    this.codProdut = codProdut;
  }

  public Integer getCodPrmAtv() {
    return codPrmAtv;
  }

  public void setCodPrmAtv(Integer codPrmAtv) {
    this.codPrmAtv = codPrmAtv;
  }

  public String getLocFisica() {
    return locFisica;
  }

  public void setLocFisica(String locFisica) {
    this.locFisica = locFisica;
  }

  public String getClaAbcVal() {
    return claAbcVal;
  }

  public void setClaAbcVal(String claAbcVal) {
    this.claAbcVal = claAbcVal;
  }

  public Integer getPosAbcVal() {
    return posAbcVal;
  }

  public void setPosAbcVal(Integer posAbcVal) {
    this.posAbcVal = posAbcVal;
  }

  public String getClaAbcVol() {
    return claAbcVol;
  }

  public void setClaAbcVol(String claAbcVol) {
    this.claAbcVol = claAbcVol;
  }

  public Integer getPosAbcVol() {
    return posAbcVol;
  }

  public void setPosAbcVol(Integer posAbcVol) {
    this.posAbcVol = posAbcVol;
  }

  public Integer getQtdMinCal() {
    return qtdMinCal;
  }

  public void setQtdMinCal(Integer qtdMinCal) {
    this.qtdMinCal = qtdMinCal;
  }

  public Integer getQtdMinCfg() {
    return qtdMinCfg;
  }

  public void setQtdMinCfg(Integer qtdMinCfg) {
    this.qtdMinCfg = qtdMinCfg;
  }

  public Integer getQtdMaxCal() {
    return qtdMaxCal;
  }

  public void setQtdMaxCal(Integer qtdMaxCal) {
    this.qtdMaxCal = qtdMaxCal;
  }

  public Integer getQtdMaxCfg() {
    return qtdMaxCfg;
  }

  public void setQtdMaxCfg(Integer qtdMaxCfg) {
    this.qtdMaxCfg = qtdMaxCfg;
  }

  public BigDecimal getQtdVenMedSem() {
    return qtdVenMedSem;
  }

  public void setQtdVenMedSem(BigDecimal qtdVenMedSem) {
    this.qtdVenMedSem = qtdVenMedSem;
  }

  public Integer getQtdTrnDep() {
    return qtdTrnDep;
  }

  public void setQtdTrnDep(Integer qtdTrnDep) {
    this.qtdTrnDep = qtdTrnDep;
  }

  public Integer getQtdTransi() {
    return qtdTransi;
  }

  public void setQtdTransi(Integer qtdTransi) {
    this.qtdTransi = qtdTransi;
  }

  public Integer getQtdFisico() {
    return qtdFisico;
  }

  public void setQtdFisico(Integer qtdFisico) {
    this.qtdFisico = qtdFisico;
  }

  public Integer getQtdAvaria() {
    return qtdAvaria;
  }

  public void setQtdAvaria(Integer qtdAvaria) {
    this.qtdAvaria = qtdAvaria;
  }

  public Integer getQtdSolici() {
    return qtdSolici;
  }

  public void setQtdSolici(Integer qtdSolici) {
    this.qtdSolici = qtdSolici;
  }

  public Integer getQtdEntPen() {
    return qtdEntPen;
  }

  public void setQtdEntPen(Integer qtdEntPen) {
    this.qtdEntPen = qtdEntPen;
  }

  public Integer getQtdSaiPen() {
    return qtdSaiPen;
  }

  public void setQtdSaiPen(Integer qtdSaiPen) {
    this.qtdSaiPen = qtdSaiPen;
  }

  public Integer getQtdSaldo() {
    return qtdSaldo;
  }

  public void setQtdSaldo(Integer qtdSaldo) {
    this.qtdSaldo = qtdSaldo;
  }

  public BigDecimal getPrcCusEnt() {
    return prcCusEnt;
  }

  public void setPrcCusEnt(BigDecimal prcCusEnt) {
    this.prcCusEnt = prcCusEnt;
  }

  public BigDecimal getPrcCusLiq() {
    return prcCusLiq;
  }

  public void setPrcCusLiq(BigDecimal prcCusLiq) {
    this.prcCusLiq = prcCusLiq;
  }

  public BigDecimal getPrcCusLiqMed() {
    return prcCusLiqMed;
  }

  public void setPrcCusLiqMed(BigDecimal prcCusLiqMed) {
    this.prcCusLiqMed = prcCusLiqMed;
  }

  public BigDecimal getPrcVenAtu() {
    return prcVenAtu;
  }

  public void setPrcVenAtu(BigDecimal prcVenAtu) {
    this.prcVenAtu = prcVenAtu;
  }

  public Timestamp getDatPrcVenAtu() {
    return datPrcVenAtu;
  }

  public void setDatPrcVenAtu(Timestamp datPrcVenAtu) {
    this.datPrcVenAtu = datPrcVenAtu;
  }

  public Timestamp getDatUltCom() {
    return datUltCom;
  }

  public void setDatUltCom(Timestamp datUltCom) {
    this.datUltCom = datUltCom;
  }

  public Timestamp getDatUltVen() {
    return datUltVen;
  }

  public void setDatUltVen(Timestamp datUltVen) {
    this.datUltVen = datUltVen;
  }

  public Boolean getFlgBlqCom() {
    return flgBlqCom;
  }

  public void setFlgBlqCom(Boolean flgBlqCom) {
    this.flgBlqCom = flgBlqCom;
  }

  public Boolean getFlgBlqVen() {
    return flgBlqVen;
  }

  public void setFlgBlqVen(Boolean flgBlqVen) {
    this.flgBlqVen = flgBlqVen;
  }

  public Boolean getFlgBlqDsc() {
    return flgBlqDsc;
  }

  public void setFlgBlqDsc(Boolean flgBlqDsc) {
    this.flgBlqDsc = flgBlqDsc;
  }

  public Timestamp getDatPrcUltBal() {
    return datPrcUltBal;
  }

  public void setDatPrcUltBal(Timestamp datPrcUltBal) {
    this.datPrcUltBal = datPrcUltBal;
  }

  public Integer getQtdSldAntBal() {
    return qtdSldAntBal;
  }

  public void setQtdSldAntBal(Integer qtdSldAntBal) {
    this.qtdSldAntBal = qtdSldAntBal;
  }

  public Integer getQtdSldPosBal() {
    return qtdSldPosBal;
  }

  public void setQtdSldPosBal(Integer qtdSldPosBal) {
    this.qtdSldPosBal = qtdSldPosBal;
  }

  public String getNomUsuari() {
    return nomUsuari;
  }

  public void setNomUsuari(String nomUsuari) {
    this.nomUsuari = nomUsuari;
  }

  public Integer getQtdConsig() {
    return qtdConsig;
  }

  public void setQtdConsig(Integer qtdConsig) {
    this.qtdConsig = qtdConsig;
  }

  public Integer getNumEsteir() {
    return numEsteir;
  }

  public void setNumEsteir(Integer numEsteir) {
    this.numEsteir = numEsteir;
  }

  public String getCodLocali() {
    return codLocali;
  }

  public void setCodLocali(String codLocali) {
    this.codLocali = codLocali;
  }

  public Integer getQtdReserv() {
    return qtdReserv;
  }

  public void setQtdReserv(Integer qtdReserv) {
    this.qtdReserv = qtdReserv;
  }

  public Integer getQtdSldAnt() {
    return qtdSldAnt;
  }

  public void setQtdSldAnt(Integer qtdSldAnt) {
    this.qtdSldAnt = qtdSldAnt;
  }

  public Timestamp getDatSldAnt() {
    return datSldAnt;
  }

  public void setDatSldAnt(Timestamp datSldAnt) {
    this.datSldAnt = datSldAnt;
  }

  public String getSnhHash() {
    return snhHash;
  }

  public void setSnhHash(String snhHash) {
    this.snhHash = snhHash;
  }

  public BigDecimal getPrcFabric() {
    return prcFabric;
  }

  public void setPrcFabric(BigDecimal prcFabric) {
    this.prcFabric = prcFabric;
  }

  public BigDecimal getPrcMaxCon() {
    return prcMaxCon;
  }

  public void setPrcMaxCon(BigDecimal prcMaxCon) {
    this.prcMaxCon = prcMaxCon;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

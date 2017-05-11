package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Lojas implements AbstractModel {
  private int codLoja;
  private String desLoja;
  private String desRazSoc;
  private Integer codGrpLoj;
  private Integer codRegTri;
  private Integer codTransp;
  private String numCnpj;
  private String numInscri;
  private String desEndere;
  private Integer numEndere;
  private String cplEndere;
  private String desBairro;
  private String numCep;
  private String desCidade;
  private String desEstado;
  private String numFone;
  private String nomGerent;
  private String nomFarmac;
  private Integer numCrfFrm;
  private String numLicFun;
  private Integer CodCfoTrf;
  private Timestamp datImpEst;
  private Timestamp datImpMov;
  private BigDecimal perAlqIcm;
  private Integer numSeqBal;
  private Integer codPromoc;
  private Boolean flgDeposi;
  private Boolean flgImpNfs;
  private Boolean flgInativ;
  private Boolean flgNaoGerRep;
  private Boolean flgRljSql;
  private Timestamp datCadast;
  private String numCnae;
  private Timestamp parDatUltFecSem;
  private Integer numRotEnt;
  private Timestamp parDatUltFecDia;
  private Boolean parFlgIniVenTelEnd;
  private Integer parCodFpgIniVenTrm;
  private Boolean parFlgImpOrcVenBal;
  private Boolean parFlgImpOrcVenDom;
  private Integer parQtdViaCupOrc;
  private Boolean parFlgImpNomEmpOrc;
  private String parCodClaTaxEnt;
  private BigDecimal parValDscMsgValEco;
  private String parDesMsgOrcam1;
  private String parDesMsgOrcam2;
  private String parDesMsgOrcam3;
  private String parDesMsgOrcam4;
  private String parDesMsgOrcam5;
  private BigDecimal parValMinTaxEntCla;
  private Boolean parFlgImpViaCpvPcl;
  private Boolean parFlgImpEndBolVenPrz;
  private Boolean parFlgImpMsgOrcame;
  private Integer parQtdViaCpvCvnOrc;
  private Integer parQtdViaCpvPrzOrc;
  private Boolean parFlgImpBolEntreg;
  private Integer parQtdViaCpvEntOrc;
  private Boolean parFlgLerRegSaiDev;
  private Boolean parFlgCtrEntregPdv;
  private Integer parQtdDiaBlqCxaEntPen;
  private String parFMPCnpjEmpre;
  private String parFMPUsuario;
  private String parFMPSenha;
  private Boolean parFMPAtivo;
  private Boolean parFMPHomologado;
  private String parDesMsgCupFis1;
  private String parDesMsgCupFis2;
  private String parDesMsgCupFis3;
  private String parDesMsgCupFis4;
  private String parDesMsgCupFis5;
  private Boolean parFlgConferOrcCodBar;
  private String parSerNotVenMan;
  private Boolean parFlgImpRomEntSai;
  private Timestamp parDatUltImpCad;
  private BigDecimal parValTaxEntEnd;
  private BigDecimal parPerMaxDscVen;
  private Integer parQtdDiaAtrVenPrz;
  private Boolean parFlgNaoVisSldEstVen;
  private Boolean parFlgAltDscVenBal;
  private Boolean parFlgDigPrcPrdVen;
  private Boolean parFlgUsaDscPrmVenTrm;
  private Boolean parFlgExiRecPrdNra;
  private Boolean parFlgNaoVenEstNeg;
  private Boolean parFlgDscFinPolVen;
  private Boolean parFlgDscPrdSemDsc;
  private Boolean parFlgUsaFidCli;
  private Boolean parFlgImpNumCmgOrc;
  private Boolean parFlgExiCpfVenChe;
  private Boolean parFlgBlqEmiChqDev;
  private Boolean parFlgInfVenDomEcf;
  private Boolean parFlgImpCpvCliEcf;
  private Boolean parFlgImpResCmgFcx;
  private Boolean parFlgImpResCvnFcx;
  private Boolean parFlgNaoExpNfePen;
  private Boolean parFlgCtrSNGPC;
  private Timestamp parDatInventSNGPC;
  private Timestamp parDatUltMovSNGPC;
  private Boolean parFlgCnfOrcCodPrd;
  private Boolean parFlgNaoFecCxgEntPen;
  private String parClaPrdMagNum;
  private Boolean flgDtbCen;
  private Boolean parFlgCxaMovTrm;
  private Boolean parFlgImpCpvPreRec;
  private Boolean parFlgImpCpvRecEcf;
  private Boolean flgImpRom;
  private BigDecimal parValMaxPrdTipServic;
  private Boolean parFlgNaoTrfEstNeg;
  private Boolean parFlgCadChqVenBal;
  private String numInsMun;
  private Boolean parFlgPafEcf;
  private Boolean parFlgPafEcfImpDavEcf;
  private Integer codMunici;
  private Boolean parFlgNaoLibDscSnhEsp;
  private String parIsnEstabeInfCrd;
  private Boolean flgUsaNFe;
  private Boolean parFlgLibDigPrcTrm;
  private Integer parCodPrdSrvEntDom;
  private String parFMPVersao;
  private String tipTriLuc;
  private String snhHash;
  private Boolean flgConferNfeFec;
  private Boolean flgImpTrfEntMov;
  private String desEmail;
  private String desVerBD;
  private Boolean flgUsaEstornoNFe;
  private Integer codContad;
  private Integer codIBGE;
  private String parDesVerSNGPC;
  private Boolean flgAtacarejo;
  private Boolean parFlgPrgCred;
  private Integer codComis1;
  private Integer codComis2;
  private Integer codComis3;
  private Integer codComis4;
  private Boolean parFlgConferOrcCodBarTrm;
  private Boolean parFlgSugConferFecPreVnd;
  private String codSimCrt;
  private Boolean parFlgEntXmlNfe;
  private Boolean parFlgEntChvNfe;
  private Boolean parFlgEntXmlCrit;
  private Boolean parFlgSugConferRemPrd;
  private Integer parSugConferRemPrdQtdIni;
  private Boolean parFlgCapFon;
  private Integer isnPlcFin;
  private String desToken;
  private BigDecimal parValMaxSan;
  private Boolean parFlgTxaEntObg;
  private BigDecimal parValExiCpfCnpj;
  private Boolean flgBkpAtv;
  private String desBkpDir;
  private Timestamp horBkpIni;
  private Timestamp datBkpFin;
  private Boolean flgBkpDom;
  private Boolean flgBkpSeg;
  private Boolean flgBkpTer;
  private Boolean flgBkpQua;
  private Boolean flgBkpQui;
  private Boolean flgBkpSex;
  private Boolean flgBkpSab;
  private Integer parCodTabComDefVdr;
  private Integer parQtdMesAleVctPrd;
  private Boolean flgNfeWebSer;
  private String tipEmiNfe;
  private Boolean parFlgBlqCodPrdCst;
  private Integer codFpgDinVenExt;
  private Integer codFpgCmgVenExt;
  private Integer codCmgPdrVenExt;
  private String desAssDigSat;
  private Boolean parFlgEstVenFmcPop;

  public Lojas() {
  }

  public Lojas(int codLoja, String desLoja, String desRazSoc, Integer codGrpLoj, Integer codRegTri, Integer codTransp,
               String numCnpj, String numInscri, String desEndere, Integer numEndere, String cplEndere, String desBairro,
               String numCep, String desCidade, String desEstado, String numFone, String nomGerent, String nomFarmac,
               Integer numCrfFrm, String numLicFun, Integer codCfoTrf, Timestamp datImpEst, Timestamp datImpMov,
               BigDecimal perAlqIcm, Integer numSeqBal, Integer codPromoc, Boolean flgDeposi, Boolean flgImpNfs,
               Boolean flgInativ, Boolean flgNaoGerRep, Boolean flgRljSql, Timestamp datCadast, String numCnae,
               Timestamp parDatUltFecSem, Integer numRotEnt, Timestamp parDatUltFecDia, Boolean parFlgIniVenTelEnd,
               Integer parCodFpgIniVenTrm, Boolean parFlgImpOrcVenBal, Boolean parFlgImpOrcVenDom, Integer parQtdViaCupOrc,
               Boolean parFlgImpNomEmpOrc, String parCodClaTaxEnt, BigDecimal parValDscMsgValEco, String parDesMsgOrcam1,
               String parDesMsgOrcam2, String parDesMsgOrcam3, String parDesMsgOrcam4, String parDesMsgOrcam5,
               BigDecimal parValMinTaxEntCla, Boolean parFlgImpViaCpvPcl, Boolean parFlgImpEndBolVenPrz, Boolean parFlgImpMsgOrcame,
               Integer parQtdViaCpvCvnOrc, Integer parQtdViaCpvPrzOrc, Boolean parFlgImpBolEntreg, Integer parQtdViaCpvEntOrc,
               Boolean parFlgLerRegSaiDev, Boolean parFlgCtrEntregPdv, Integer parQtdDiaBlqCxaEntPen, String parFMPCnpjEmpre,
               String parFMPUsuario, String parFMPSenha, Boolean parFMPAtivo, Boolean parFMPHomologado, String parDesMsgCupFis1,
               String parDesMsgCupFis2, String parDesMsgCupFis3, String parDesMsgCupFis4, String parDesMsgCupFis5,
               Boolean parFlgConferOrcCodBar, String parSerNotVenMan, Boolean parFlgImpRomEntSai, Timestamp parDatUltImpCad,
               BigDecimal parValTaxEntEnd, BigDecimal parPerMaxDscVen, Integer parQtdDiaAtrVenPrz, Boolean parFlgNaoVisSldEstVen,
               Boolean parFlgAltDscVenBal, Boolean parFlgDigPrcPrdVen, Boolean parFlgUsaDscPrmVenTrm, Boolean parFlgExiRecPrdNra,
               Boolean parFlgNaoVenEstNeg, Boolean parFlgDscFinPolVen, Boolean parFlgDscPrdSemDsc, Boolean parFlgUsaFidCli,
               Boolean parFlgImpNumCmgOrc, Boolean parFlgExiCpfVenChe, Boolean parFlgBlqEmiChqDev, Boolean parFlgInfVenDomEcf,
               Boolean parFlgImpCpvCliEcf, Boolean parFlgImpResCmgFcx, Boolean parFlgImpResCvnFcx, Boolean parFlgNaoExpNfePen,
               Boolean parFlgCtrSNGPC, Timestamp parDatInventSNGPC, Timestamp parDatUltMovSNGPC, Boolean parFlgCnfOrcCodPrd,
               Boolean parFlgNaoFecCxgEntPen, String parClaPrdMagNum, Boolean flgDtbCen, Boolean parFlgCxaMovTrm,
               Boolean parFlgImpCpvPreRec, Boolean parFlgImpCpvRecEcf, Boolean flgImpRom, BigDecimal parValMaxPrdTipServic,
               Boolean parFlgNaoTrfEstNeg, Boolean parFlgCadChqVenBal, String numInsMun, Boolean parFlgPafEcf,
               Boolean parFlgPafEcfImpDavEcf, Integer codMunici, Boolean parFlgNaoLibDscSnhEsp, String parIsnEstabeInfCrd,
               Boolean flgUsaNFe, Boolean parFlgLibDigPrcTrm, Integer parCodPrdSrvEntDom, String parFMPVersao, String tipTriLuc,
               String snhHash, Boolean flgConferNfeFec, Boolean flgImpTrfEntMov, String desEmail, String desVerBD,
               Boolean flgUsaEstornoNFe, Integer codContad, Integer codIBGE, String parDesVerSNGPC, Boolean flgAtacarejo,
               Boolean parFlgPrgCred, Integer codComis1, Integer codComis2, Integer codComis3, Integer codComis4,
               Boolean parFlgConferOrcCodBarTrm, Boolean parFlgSugConferFecPreVnd, String codSimCrt, Boolean parFlgEntXmlNfe,
               Boolean parFlgEntChvNfe, Boolean parFlgEntXmlCrit, Boolean parFlgSugConferRemPrd, Integer parSugConferRemPrdQtdIni,
               Boolean parFlgCapFon, Integer isnPlcFin, String desToken, BigDecimal parValMaxSan, Boolean parFlgTxaEntObg,
               BigDecimal parValExiCpfCnpj, Boolean flgBkpAtv, String desBkpDir, Timestamp horBkpIni, Timestamp datBkpFin,
               Boolean flgBkpDom, Boolean flgBkpSeg, Boolean flgBkpTer, Boolean flgBkpQua, Boolean flgBkpQui, Boolean flgBkpSex,
               Boolean flgBkpSab, Integer parCodTabComDefVdr, Integer parQtdMesAleVctPrd, Boolean flgNfeWebSer, String tipEmiNfe,
               Boolean parFlgBlqCodPrdCst, Integer codFpgDinVenExt, Integer codFpgCmgVenExt, Integer codCmgPdrVenExt,
               String desAssDigSat, Boolean parFlgEstVenFmcPop) {
    this.codLoja = codLoja;
    this.desLoja = desLoja;
    this.desRazSoc = desRazSoc;
    this.codGrpLoj = codGrpLoj;
    this.codRegTri = codRegTri;
    this.codTransp = codTransp;
    this.numCnpj = numCnpj;
    this.numInscri = numInscri;
    this.desEndere = desEndere;
    this.numEndere = numEndere;
    this.cplEndere = cplEndere;
    this.desBairro = desBairro;
    this.numCep = numCep;
    this.desCidade = desCidade;
    this.desEstado = desEstado;
    this.numFone = numFone;
    this.nomGerent = nomGerent;
    this.nomFarmac = nomFarmac;
    this.numCrfFrm = numCrfFrm;
    this.numLicFun = numLicFun;
    CodCfoTrf = codCfoTrf;
    this.datImpEst = datImpEst;
    this.datImpMov = datImpMov;
    this.perAlqIcm = perAlqIcm;
    this.numSeqBal = numSeqBal;
    this.codPromoc = codPromoc;
    this.flgDeposi = flgDeposi;
    this.flgImpNfs = flgImpNfs;
    this.flgInativ = flgInativ;
    this.flgNaoGerRep = flgNaoGerRep;
    this.flgRljSql = flgRljSql;
    this.datCadast = datCadast;
    this.numCnae = numCnae;
    this.parDatUltFecSem = parDatUltFecSem;
    this.numRotEnt = numRotEnt;
    this.parDatUltFecDia = parDatUltFecDia;
    this.parFlgIniVenTelEnd = parFlgIniVenTelEnd;
    this.parCodFpgIniVenTrm = parCodFpgIniVenTrm;
    this.parFlgImpOrcVenBal = parFlgImpOrcVenBal;
    this.parFlgImpOrcVenDom = parFlgImpOrcVenDom;
    this.parQtdViaCupOrc = parQtdViaCupOrc;
    this.parFlgImpNomEmpOrc = parFlgImpNomEmpOrc;
    this.parCodClaTaxEnt = parCodClaTaxEnt;
    this.parValDscMsgValEco = parValDscMsgValEco;
    this.parDesMsgOrcam1 = parDesMsgOrcam1;
    this.parDesMsgOrcam2 = parDesMsgOrcam2;
    this.parDesMsgOrcam3 = parDesMsgOrcam3;
    this.parDesMsgOrcam4 = parDesMsgOrcam4;
    this.parDesMsgOrcam5 = parDesMsgOrcam5;
    this.parValMinTaxEntCla = parValMinTaxEntCla;
    this.parFlgImpViaCpvPcl = parFlgImpViaCpvPcl;
    this.parFlgImpEndBolVenPrz = parFlgImpEndBolVenPrz;
    this.parFlgImpMsgOrcame = parFlgImpMsgOrcame;
    this.parQtdViaCpvCvnOrc = parQtdViaCpvCvnOrc;
    this.parQtdViaCpvPrzOrc = parQtdViaCpvPrzOrc;
    this.parFlgImpBolEntreg = parFlgImpBolEntreg;
    this.parQtdViaCpvEntOrc = parQtdViaCpvEntOrc;
    this.parFlgLerRegSaiDev = parFlgLerRegSaiDev;
    this.parFlgCtrEntregPdv = parFlgCtrEntregPdv;
    this.parQtdDiaBlqCxaEntPen = parQtdDiaBlqCxaEntPen;
    this.parFMPCnpjEmpre = parFMPCnpjEmpre;
    this.parFMPUsuario = parFMPUsuario;
    this.parFMPSenha = parFMPSenha;
    this.parFMPAtivo = parFMPAtivo;
    this.parFMPHomologado = parFMPHomologado;
    this.parDesMsgCupFis1 = parDesMsgCupFis1;
    this.parDesMsgCupFis2 = parDesMsgCupFis2;
    this.parDesMsgCupFis3 = parDesMsgCupFis3;
    this.parDesMsgCupFis4 = parDesMsgCupFis4;
    this.parDesMsgCupFis5 = parDesMsgCupFis5;
    this.parFlgConferOrcCodBar = parFlgConferOrcCodBar;
    this.parSerNotVenMan = parSerNotVenMan;
    this.parFlgImpRomEntSai = parFlgImpRomEntSai;
    this.parDatUltImpCad = parDatUltImpCad;
    this.parValTaxEntEnd = parValTaxEntEnd;
    this.parPerMaxDscVen = parPerMaxDscVen;
    this.parQtdDiaAtrVenPrz = parQtdDiaAtrVenPrz;
    this.parFlgNaoVisSldEstVen = parFlgNaoVisSldEstVen;
    this.parFlgAltDscVenBal = parFlgAltDscVenBal;
    this.parFlgDigPrcPrdVen = parFlgDigPrcPrdVen;
    this.parFlgUsaDscPrmVenTrm = parFlgUsaDscPrmVenTrm;
    this.parFlgExiRecPrdNra = parFlgExiRecPrdNra;
    this.parFlgNaoVenEstNeg = parFlgNaoVenEstNeg;
    this.parFlgDscFinPolVen = parFlgDscFinPolVen;
    this.parFlgDscPrdSemDsc = parFlgDscPrdSemDsc;
    this.parFlgUsaFidCli = parFlgUsaFidCli;
    this.parFlgImpNumCmgOrc = parFlgImpNumCmgOrc;
    this.parFlgExiCpfVenChe = parFlgExiCpfVenChe;
    this.parFlgBlqEmiChqDev = parFlgBlqEmiChqDev;
    this.parFlgInfVenDomEcf = parFlgInfVenDomEcf;
    this.parFlgImpCpvCliEcf = parFlgImpCpvCliEcf;
    this.parFlgImpResCmgFcx = parFlgImpResCmgFcx;
    this.parFlgImpResCvnFcx = parFlgImpResCvnFcx;
    this.parFlgNaoExpNfePen = parFlgNaoExpNfePen;
    this.parFlgCtrSNGPC = parFlgCtrSNGPC;
    this.parDatInventSNGPC = parDatInventSNGPC;
    this.parDatUltMovSNGPC = parDatUltMovSNGPC;
    this.parFlgCnfOrcCodPrd = parFlgCnfOrcCodPrd;
    this.parFlgNaoFecCxgEntPen = parFlgNaoFecCxgEntPen;
    this.parClaPrdMagNum = parClaPrdMagNum;
    this.flgDtbCen = flgDtbCen;
    this.parFlgCxaMovTrm = parFlgCxaMovTrm;
    this.parFlgImpCpvPreRec = parFlgImpCpvPreRec;
    this.parFlgImpCpvRecEcf = parFlgImpCpvRecEcf;
    this.flgImpRom = flgImpRom;
    this.parValMaxPrdTipServic = parValMaxPrdTipServic;
    this.parFlgNaoTrfEstNeg = parFlgNaoTrfEstNeg;
    this.parFlgCadChqVenBal = parFlgCadChqVenBal;
    this.numInsMun = numInsMun;
    this.parFlgPafEcf = parFlgPafEcf;
    this.parFlgPafEcfImpDavEcf = parFlgPafEcfImpDavEcf;
    this.codMunici = codMunici;
    this.parFlgNaoLibDscSnhEsp = parFlgNaoLibDscSnhEsp;
    this.parIsnEstabeInfCrd = parIsnEstabeInfCrd;
    this.flgUsaNFe = flgUsaNFe;
    this.parFlgLibDigPrcTrm = parFlgLibDigPrcTrm;
    this.parCodPrdSrvEntDom = parCodPrdSrvEntDom;
    this.parFMPVersao = parFMPVersao;
    this.tipTriLuc = tipTriLuc;
    this.snhHash = snhHash;
    this.flgConferNfeFec = flgConferNfeFec;
    this.flgImpTrfEntMov = flgImpTrfEntMov;
    this.desEmail = desEmail;
    this.desVerBD = desVerBD;
    this.flgUsaEstornoNFe = flgUsaEstornoNFe;
    this.codContad = codContad;
    this.codIBGE = codIBGE;
    this.parDesVerSNGPC = parDesVerSNGPC;
    this.flgAtacarejo = flgAtacarejo;
    this.parFlgPrgCred = parFlgPrgCred;
    this.codComis1 = codComis1;
    this.codComis2 = codComis2;
    this.codComis3 = codComis3;
    this.codComis4 = codComis4;
    this.parFlgConferOrcCodBarTrm = parFlgConferOrcCodBarTrm;
    this.parFlgSugConferFecPreVnd = parFlgSugConferFecPreVnd;
    this.codSimCrt = codSimCrt;
    this.parFlgEntXmlNfe = parFlgEntXmlNfe;
    this.parFlgEntChvNfe = parFlgEntChvNfe;
    this.parFlgEntXmlCrit = parFlgEntXmlCrit;
    this.parFlgSugConferRemPrd = parFlgSugConferRemPrd;
    this.parSugConferRemPrdQtdIni = parSugConferRemPrdQtdIni;
    this.parFlgCapFon = parFlgCapFon;
    this.isnPlcFin = isnPlcFin;
    this.desToken = desToken;
    this.parValMaxSan = parValMaxSan;
    this.parFlgTxaEntObg = parFlgTxaEntObg;
    this.parValExiCpfCnpj = parValExiCpfCnpj;
    this.flgBkpAtv = flgBkpAtv;
    this.desBkpDir = desBkpDir;
    this.horBkpIni = horBkpIni;
    this.datBkpFin = datBkpFin;
    this.flgBkpDom = flgBkpDom;
    this.flgBkpSeg = flgBkpSeg;
    this.flgBkpTer = flgBkpTer;
    this.flgBkpQua = flgBkpQua;
    this.flgBkpQui = flgBkpQui;
    this.flgBkpSex = flgBkpSex;
    this.flgBkpSab = flgBkpSab;
    this.parCodTabComDefVdr = parCodTabComDefVdr;
    this.parQtdMesAleVctPrd = parQtdMesAleVctPrd;
    this.flgNfeWebSer = flgNfeWebSer;
    this.tipEmiNfe = tipEmiNfe;
    this.parFlgBlqCodPrdCst = parFlgBlqCodPrdCst;
    this.codFpgDinVenExt = codFpgDinVenExt;
    this.codFpgCmgVenExt = codFpgCmgVenExt;
    this.codCmgPdrVenExt = codCmgPdrVenExt;
    this.desAssDigSat = desAssDigSat;
    this.parFlgEstVenFmcPop = parFlgEstVenFmcPop;
  }

  public int getCodLoja() {
    return codLoja;
  }

  public void setCodLoja(int codLoja) {
    this.codLoja = codLoja;
  }

  public String getDesLoja() {
    return desLoja;
  }

  public void setDesLoja(String desLoja) {
    this.desLoja = desLoja;
  }

  public String getDesRazSoc() {
    return desRazSoc;
  }

  public void setDesRazSoc(String desRazSoc) {
    this.desRazSoc = desRazSoc;
  }

  public Integer getCodGrpLoj() {
    return codGrpLoj;
  }

  public void setCodGrpLoj(Integer codGrpLoj) {
    this.codGrpLoj = codGrpLoj;
  }

  public Integer getCodRegTri() {
    return codRegTri;
  }

  public void setCodRegTri(Integer codRegTri) {
    this.codRegTri = codRegTri;
  }

  public Integer getCodTransp() {
    return codTransp;
  }

  public void setCodTransp(Integer codTransp) {
    this.codTransp = codTransp;
  }

  public String getNumCnpj() {
    return numCnpj;
  }

  public void setNumCnpj(String numCnpj) {
    this.numCnpj = numCnpj;
  }

  public String getNumInscri() {
    return numInscri;
  }

  public void setNumInscri(String numInscri) {
    this.numInscri = numInscri;
  }

  public String getDesEndere() {
    return desEndere;
  }

  public void setDesEndere(String desEndere) {
    this.desEndere = desEndere;
  }

  public Integer getNumEndere() {
    return numEndere;
  }

  public void setNumEndere(Integer numEndere) {
    this.numEndere = numEndere;
  }

  public String getCplEndere() {
    return cplEndere;
  }

  public void setCplEndere(String cplEndere) {
    this.cplEndere = cplEndere;
  }

  public String getDesBairro() {
    return desBairro;
  }

  public void setDesBairro(String desBairro) {
    this.desBairro = desBairro;
  }

  public String getNumCep() {
    return numCep;
  }

  public void setNumCep(String numCep) {
    this.numCep = numCep;
  }

  public String getDesCidade() {
    return desCidade;
  }

  public void setDesCidade(String desCidade) {
    this.desCidade = desCidade;
  }

  public String getDesEstado() {
    return desEstado;
  }

  public void setDesEstado(String desEstado) {
    this.desEstado = desEstado;
  }

  public String getNumFone() {
    return numFone;
  }

  public void setNumFone(String numFone) {
    this.numFone = numFone;
  }

  public String getNomGerent() {
    return nomGerent;
  }

  public void setNomGerent(String nomGerent) {
    this.nomGerent = nomGerent;
  }

  public String getNomFarmac() {
    return nomFarmac;
  }

  public void setNomFarmac(String nomFarmac) {
    this.nomFarmac = nomFarmac;
  }

  public Integer getNumCrfFrm() {
    return numCrfFrm;
  }

  public void setNumCrfFrm(Integer numCrfFrm) {
    this.numCrfFrm = numCrfFrm;
  }

  public String getNumLicFun() {
    return numLicFun;
  }

  public void setNumLicFun(String numLicFun) {
    this.numLicFun = numLicFun;
  }

  public Integer getCodCfoTrf() {
    return CodCfoTrf;
  }

  public void setCodCfoTrf(Integer codCfoTrf) {
    CodCfoTrf = codCfoTrf;
  }

  public Timestamp getDatImpEst() {
    return datImpEst;
  }

  public void setDatImpEst(Timestamp datImpEst) {
    this.datImpEst = datImpEst;
  }

  public Timestamp getDatImpMov() {
    return datImpMov;
  }

  public void setDatImpMov(Timestamp datImpMov) {
    this.datImpMov = datImpMov;
  }

  public BigDecimal getPerAlqIcm() {
    return perAlqIcm;
  }

  public void setPerAlqIcm(BigDecimal perAlqIcm) {
    this.perAlqIcm = perAlqIcm;
  }

  public Integer getNumSeqBal() {
    return numSeqBal;
  }

  public void setNumSeqBal(Integer numSeqBal) {
    this.numSeqBal = numSeqBal;
  }

  public Integer getCodPromoc() {
    return codPromoc;
  }

  public void setCodPromoc(Integer codPromoc) {
    this.codPromoc = codPromoc;
  }

  public Boolean getFlgDeposi() {
    return flgDeposi;
  }

  public void setFlgDeposi(Boolean flgDeposi) {
    this.flgDeposi = flgDeposi;
  }

  public Boolean getFlgImpNfs() {
    return flgImpNfs;
  }

  public void setFlgImpNfs(Boolean flgImpNfs) {
    this.flgImpNfs = flgImpNfs;
  }

  public Boolean getFlgInativ() {
    return flgInativ;
  }

  public void setFlgInativ(Boolean flgInativ) {
    this.flgInativ = flgInativ;
  }

  public Boolean getFlgNaoGerRep() {
    return flgNaoGerRep;
  }

  public void setFlgNaoGerRep(Boolean flgNaoGerRep) {
    this.flgNaoGerRep = flgNaoGerRep;
  }

  public Boolean getFlgRljSql() {
    return flgRljSql;
  }

  public void setFlgRljSql(Boolean flgRljSql) {
    this.flgRljSql = flgRljSql;
  }

  public Timestamp getDatCadast() {
    return datCadast;
  }

  public void setDatCadast(Timestamp datCadast) {
    this.datCadast = datCadast;
  }

  public String getNumCnae() {
    return numCnae;
  }

  public void setNumCnae(String numCnae) {
    this.numCnae = numCnae;
  }

  public Timestamp getParDatUltFecSem() {
    return parDatUltFecSem;
  }

  public void setParDatUltFecSem(Timestamp parDatUltFecSem) {
    this.parDatUltFecSem = parDatUltFecSem;
  }

  public Integer getNumRotEnt() {
    return numRotEnt;
  }

  public void setNumRotEnt(Integer numRotEnt) {
    this.numRotEnt = numRotEnt;
  }

  public Timestamp getParDatUltFecDia() {
    return parDatUltFecDia;
  }

  public void setParDatUltFecDia(Timestamp parDatUltFecDia) {
    this.parDatUltFecDia = parDatUltFecDia;
  }

  public Boolean getParFlgIniVenTelEnd() {
    return parFlgIniVenTelEnd;
  }

  public void setParFlgIniVenTelEnd(Boolean parFlgIniVenTelEnd) {
    this.parFlgIniVenTelEnd = parFlgIniVenTelEnd;
  }

  public Integer getParCodFpgIniVenTrm() {
    return parCodFpgIniVenTrm;
  }

  public void setParCodFpgIniVenTrm(Integer parCodFpgIniVenTrm) {
    this.parCodFpgIniVenTrm = parCodFpgIniVenTrm;
  }

  public Boolean getParFlgImpOrcVenBal() {
    return parFlgImpOrcVenBal;
  }

  public void setParFlgImpOrcVenBal(Boolean parFlgImpOrcVenBal) {
    this.parFlgImpOrcVenBal = parFlgImpOrcVenBal;
  }

  public Boolean getParFlgImpOrcVenDom() {
    return parFlgImpOrcVenDom;
  }

  public void setParFlgImpOrcVenDom(Boolean parFlgImpOrcVenDom) {
    this.parFlgImpOrcVenDom = parFlgImpOrcVenDom;
  }

  public Integer getParQtdViaCupOrc() {
    return parQtdViaCupOrc;
  }

  public void setParQtdViaCupOrc(Integer parQtdViaCupOrc) {
    this.parQtdViaCupOrc = parQtdViaCupOrc;
  }

  public Boolean getParFlgImpNomEmpOrc() {
    return parFlgImpNomEmpOrc;
  }

  public void setParFlgImpNomEmpOrc(Boolean parFlgImpNomEmpOrc) {
    this.parFlgImpNomEmpOrc = parFlgImpNomEmpOrc;
  }

  public String getParCodClaTaxEnt() {
    return parCodClaTaxEnt;
  }

  public void setParCodClaTaxEnt(String parCodClaTaxEnt) {
    this.parCodClaTaxEnt = parCodClaTaxEnt;
  }

  public BigDecimal getParValDscMsgValEco() {
    return parValDscMsgValEco;
  }

  public void setParValDscMsgValEco(BigDecimal parValDscMsgValEco) {
    this.parValDscMsgValEco = parValDscMsgValEco;
  }

  public String getParDesMsgOrcam1() {
    return parDesMsgOrcam1;
  }

  public void setParDesMsgOrcam1(String parDesMsgOrcam1) {
    this.parDesMsgOrcam1 = parDesMsgOrcam1;
  }

  public String getParDesMsgOrcam2() {
    return parDesMsgOrcam2;
  }

  public void setParDesMsgOrcam2(String parDesMsgOrcam2) {
    this.parDesMsgOrcam2 = parDesMsgOrcam2;
  }

  public String getParDesMsgOrcam3() {
    return parDesMsgOrcam3;
  }

  public void setParDesMsgOrcam3(String parDesMsgOrcam3) {
    this.parDesMsgOrcam3 = parDesMsgOrcam3;
  }

  public String getParDesMsgOrcam4() {
    return parDesMsgOrcam4;
  }

  public void setParDesMsgOrcam4(String parDesMsgOrcam4) {
    this.parDesMsgOrcam4 = parDesMsgOrcam4;
  }

  public String getParDesMsgOrcam5() {
    return parDesMsgOrcam5;
  }

  public void setParDesMsgOrcam5(String parDesMsgOrcam5) {
    this.parDesMsgOrcam5 = parDesMsgOrcam5;
  }

  public BigDecimal getParValMinTaxEntCla() {
    return parValMinTaxEntCla;
  }

  public void setParValMinTaxEntCla(BigDecimal parValMinTaxEntCla) {
    this.parValMinTaxEntCla = parValMinTaxEntCla;
  }

  public Boolean getParFlgImpViaCpvPcl() {
    return parFlgImpViaCpvPcl;
  }

  public void setParFlgImpViaCpvPcl(Boolean parFlgImpViaCpvPcl) {
    this.parFlgImpViaCpvPcl = parFlgImpViaCpvPcl;
  }

  public Boolean getParFlgImpEndBolVenPrz() {
    return parFlgImpEndBolVenPrz;
  }

  public void setParFlgImpEndBolVenPrz(Boolean parFlgImpEndBolVenPrz) {
    this.parFlgImpEndBolVenPrz = parFlgImpEndBolVenPrz;
  }

  public Boolean getParFlgImpMsgOrcame() {
    return parFlgImpMsgOrcame;
  }

  public void setParFlgImpMsgOrcame(Boolean parFlgImpMsgOrcame) {
    this.parFlgImpMsgOrcame = parFlgImpMsgOrcame;
  }

  public Integer getParQtdViaCpvCvnOrc() {
    return parQtdViaCpvCvnOrc;
  }

  public void setParQtdViaCpvCvnOrc(Integer parQtdViaCpvCvnOrc) {
    this.parQtdViaCpvCvnOrc = parQtdViaCpvCvnOrc;
  }

  public Integer getParQtdViaCpvPrzOrc() {
    return parQtdViaCpvPrzOrc;
  }

  public void setParQtdViaCpvPrzOrc(Integer parQtdViaCpvPrzOrc) {
    this.parQtdViaCpvPrzOrc = parQtdViaCpvPrzOrc;
  }

  public Boolean getParFlgImpBolEntreg() {
    return parFlgImpBolEntreg;
  }

  public void setParFlgImpBolEntreg(Boolean parFlgImpBolEntreg) {
    this.parFlgImpBolEntreg = parFlgImpBolEntreg;
  }

  public Integer getParQtdViaCpvEntOrc() {
    return parQtdViaCpvEntOrc;
  }

  public void setParQtdViaCpvEntOrc(Integer parQtdViaCpvEntOrc) {
    this.parQtdViaCpvEntOrc = parQtdViaCpvEntOrc;
  }

  public Boolean getParFlgLerRegSaiDev() {
    return parFlgLerRegSaiDev;
  }

  public void setParFlgLerRegSaiDev(Boolean parFlgLerRegSaiDev) {
    this.parFlgLerRegSaiDev = parFlgLerRegSaiDev;
  }

  public Boolean getParFlgCtrEntregPdv() {
    return parFlgCtrEntregPdv;
  }

  public void setParFlgCtrEntregPdv(Boolean parFlgCtrEntregPdv) {
    this.parFlgCtrEntregPdv = parFlgCtrEntregPdv;
  }

  public Integer getParQtdDiaBlqCxaEntPen() {
    return parQtdDiaBlqCxaEntPen;
  }

  public void setParQtdDiaBlqCxaEntPen(Integer parQtdDiaBlqCxaEntPen) {
    this.parQtdDiaBlqCxaEntPen = parQtdDiaBlqCxaEntPen;
  }

  public String getParFMPCnpjEmpre() {
    return parFMPCnpjEmpre;
  }

  public void setParFMPCnpjEmpre(String parFMPCnpjEmpre) {
    this.parFMPCnpjEmpre = parFMPCnpjEmpre;
  }

  public String getParFMPUsuario() {
    return parFMPUsuario;
  }

  public void setParFMPUsuario(String parFMPUsuario) {
    this.parFMPUsuario = parFMPUsuario;
  }

  public String getParFMPSenha() {
    return parFMPSenha;
  }

  public void setParFMPSenha(String parFMPSenha) {
    this.parFMPSenha = parFMPSenha;
  }

  public Boolean getParFMPAtivo() {
    return parFMPAtivo;
  }

  public void setParFMPAtivo(Boolean parFMPAtivo) {
    this.parFMPAtivo = parFMPAtivo;
  }

  public Boolean getParFMPHomologado() {
    return parFMPHomologado;
  }

  public void setParFMPHomologado(Boolean parFMPHomologado) {
    this.parFMPHomologado = parFMPHomologado;
  }

  public String getParDesMsgCupFis1() {
    return parDesMsgCupFis1;
  }

  public void setParDesMsgCupFis1(String parDesMsgCupFis1) {
    this.parDesMsgCupFis1 = parDesMsgCupFis1;
  }

  public String getParDesMsgCupFis2() {
    return parDesMsgCupFis2;
  }

  public void setParDesMsgCupFis2(String parDesMsgCupFis2) {
    this.parDesMsgCupFis2 = parDesMsgCupFis2;
  }

  public String getParDesMsgCupFis3() {
    return parDesMsgCupFis3;
  }

  public void setParDesMsgCupFis3(String parDesMsgCupFis3) {
    this.parDesMsgCupFis3 = parDesMsgCupFis3;
  }

  public String getParDesMsgCupFis4() {
    return parDesMsgCupFis4;
  }

  public void setParDesMsgCupFis4(String parDesMsgCupFis4) {
    this.parDesMsgCupFis4 = parDesMsgCupFis4;
  }

  public String getParDesMsgCupFis5() {
    return parDesMsgCupFis5;
  }

  public void setParDesMsgCupFis5(String parDesMsgCupFis5) {
    this.parDesMsgCupFis5 = parDesMsgCupFis5;
  }

  public Boolean getParFlgConferOrcCodBar() {
    return parFlgConferOrcCodBar;
  }

  public void setParFlgConferOrcCodBar(Boolean parFlgConferOrcCodBar) {
    this.parFlgConferOrcCodBar = parFlgConferOrcCodBar;
  }

  public String getParSerNotVenMan() {
    return parSerNotVenMan;
  }

  public void setParSerNotVenMan(String parSerNotVenMan) {
    this.parSerNotVenMan = parSerNotVenMan;
  }

  public Boolean getParFlgImpRomEntSai() {
    return parFlgImpRomEntSai;
  }

  public void setParFlgImpRomEntSai(Boolean parFlgImpRomEntSai) {
    this.parFlgImpRomEntSai = parFlgImpRomEntSai;
  }

  public Timestamp getParDatUltImpCad() {
    return parDatUltImpCad;
  }

  public void setParDatUltImpCad(Timestamp parDatUltImpCad) {
    this.parDatUltImpCad = parDatUltImpCad;
  }

  public BigDecimal getParValTaxEntEnd() {
    return parValTaxEntEnd;
  }

  public void setParValTaxEntEnd(BigDecimal parValTaxEntEnd) {
    this.parValTaxEntEnd = parValTaxEntEnd;
  }

  public BigDecimal getParPerMaxDscVen() {
    return parPerMaxDscVen;
  }

  public void setParPerMaxDscVen(BigDecimal parPerMaxDscVen) {
    this.parPerMaxDscVen = parPerMaxDscVen;
  }

  public Integer getParQtdDiaAtrVenPrz() {
    return parQtdDiaAtrVenPrz;
  }

  public void setParQtdDiaAtrVenPrz(Integer parQtdDiaAtrVenPrz) {
    this.parQtdDiaAtrVenPrz = parQtdDiaAtrVenPrz;
  }

  public Boolean getParFlgNaoVisSldEstVen() {
    return parFlgNaoVisSldEstVen;
  }

  public void setParFlgNaoVisSldEstVen(Boolean parFlgNaoVisSldEstVen) {
    this.parFlgNaoVisSldEstVen = parFlgNaoVisSldEstVen;
  }

  public Boolean getParFlgAltDscVenBal() {
    return parFlgAltDscVenBal;
  }

  public void setParFlgAltDscVenBal(Boolean parFlgAltDscVenBal) {
    this.parFlgAltDscVenBal = parFlgAltDscVenBal;
  }

  public Boolean getParFlgDigPrcPrdVen() {
    return parFlgDigPrcPrdVen;
  }

  public void setParFlgDigPrcPrdVen(Boolean parFlgDigPrcPrdVen) {
    this.parFlgDigPrcPrdVen = parFlgDigPrcPrdVen;
  }

  public Boolean getParFlgUsaDscPrmVenTrm() {
    return parFlgUsaDscPrmVenTrm;
  }

  public void setParFlgUsaDscPrmVenTrm(Boolean parFlgUsaDscPrmVenTrm) {
    this.parFlgUsaDscPrmVenTrm = parFlgUsaDscPrmVenTrm;
  }

  public Boolean getParFlgExiRecPrdNra() {
    return parFlgExiRecPrdNra;
  }

  public void setParFlgExiRecPrdNra(Boolean parFlgExiRecPrdNra) {
    this.parFlgExiRecPrdNra = parFlgExiRecPrdNra;
  }

  public Boolean getParFlgNaoVenEstNeg() {
    return parFlgNaoVenEstNeg;
  }

  public void setParFlgNaoVenEstNeg(Boolean parFlgNaoVenEstNeg) {
    this.parFlgNaoVenEstNeg = parFlgNaoVenEstNeg;
  }

  public Boolean getParFlgDscFinPolVen() {
    return parFlgDscFinPolVen;
  }

  public void setParFlgDscFinPolVen(Boolean parFlgDscFinPolVen) {
    this.parFlgDscFinPolVen = parFlgDscFinPolVen;
  }

  public Boolean getParFlgDscPrdSemDsc() {
    return parFlgDscPrdSemDsc;
  }

  public void setParFlgDscPrdSemDsc(Boolean parFlgDscPrdSemDsc) {
    this.parFlgDscPrdSemDsc = parFlgDscPrdSemDsc;
  }

  public Boolean getParFlgUsaFidCli() {
    return parFlgUsaFidCli;
  }

  public void setParFlgUsaFidCli(Boolean parFlgUsaFidCli) {
    this.parFlgUsaFidCli = parFlgUsaFidCli;
  }

  public Boolean getParFlgImpNumCmgOrc() {
    return parFlgImpNumCmgOrc;
  }

  public void setParFlgImpNumCmgOrc(Boolean parFlgImpNumCmgOrc) {
    this.parFlgImpNumCmgOrc = parFlgImpNumCmgOrc;
  }

  public Boolean getParFlgExiCpfVenChe() {
    return parFlgExiCpfVenChe;
  }

  public void setParFlgExiCpfVenChe(Boolean parFlgExiCpfVenChe) {
    this.parFlgExiCpfVenChe = parFlgExiCpfVenChe;
  }

  public Boolean getParFlgBlqEmiChqDev() {
    return parFlgBlqEmiChqDev;
  }

  public void setParFlgBlqEmiChqDev(Boolean parFlgBlqEmiChqDev) {
    this.parFlgBlqEmiChqDev = parFlgBlqEmiChqDev;
  }

  public Boolean getParFlgInfVenDomEcf() {
    return parFlgInfVenDomEcf;
  }

  public void setParFlgInfVenDomEcf(Boolean parFlgInfVenDomEcf) {
    this.parFlgInfVenDomEcf = parFlgInfVenDomEcf;
  }

  public Boolean getParFlgImpCpvCliEcf() {
    return parFlgImpCpvCliEcf;
  }

  public void setParFlgImpCpvCliEcf(Boolean parFlgImpCpvCliEcf) {
    this.parFlgImpCpvCliEcf = parFlgImpCpvCliEcf;
  }

  public Boolean getParFlgImpResCmgFcx() {
    return parFlgImpResCmgFcx;
  }

  public void setParFlgImpResCmgFcx(Boolean parFlgImpResCmgFcx) {
    this.parFlgImpResCmgFcx = parFlgImpResCmgFcx;
  }

  public Boolean getParFlgImpResCvnFcx() {
    return parFlgImpResCvnFcx;
  }

  public void setParFlgImpResCvnFcx(Boolean parFlgImpResCvnFcx) {
    this.parFlgImpResCvnFcx = parFlgImpResCvnFcx;
  }

  public Boolean getParFlgNaoExpNfePen() {
    return parFlgNaoExpNfePen;
  }

  public void setParFlgNaoExpNfePen(Boolean parFlgNaoExpNfePen) {
    this.parFlgNaoExpNfePen = parFlgNaoExpNfePen;
  }

  public Boolean getParFlgCtrSNGPC() {
    return parFlgCtrSNGPC;
  }

  public void setParFlgCtrSNGPC(Boolean parFlgCtrSNGPC) {
    this.parFlgCtrSNGPC = parFlgCtrSNGPC;
  }

  public Timestamp getParDatInventSNGPC() {
    return parDatInventSNGPC;
  }

  public void setParDatInventSNGPC(Timestamp parDatInventSNGPC) {
    this.parDatInventSNGPC = parDatInventSNGPC;
  }

  public Timestamp getParDatUltMovSNGPC() {
    return parDatUltMovSNGPC;
  }

  public void setParDatUltMovSNGPC(Timestamp parDatUltMovSNGPC) {
    this.parDatUltMovSNGPC = parDatUltMovSNGPC;
  }

  public Boolean getParFlgCnfOrcCodPrd() {
    return parFlgCnfOrcCodPrd;
  }

  public void setParFlgCnfOrcCodPrd(Boolean parFlgCnfOrcCodPrd) {
    this.parFlgCnfOrcCodPrd = parFlgCnfOrcCodPrd;
  }

  public Boolean getParFlgNaoFecCxgEntPen() {
    return parFlgNaoFecCxgEntPen;
  }

  public void setParFlgNaoFecCxgEntPen(Boolean parFlgNaoFecCxgEntPen) {
    this.parFlgNaoFecCxgEntPen = parFlgNaoFecCxgEntPen;
  }

  public String getParClaPrdMagNum() {
    return parClaPrdMagNum;
  }

  public void setParClaPrdMagNum(String parClaPrdMagNum) {
    this.parClaPrdMagNum = parClaPrdMagNum;
  }

  public Boolean getFlgDtbCen() {
    return flgDtbCen;
  }

  public void setFlgDtbCen(Boolean flgDtbCen) {
    this.flgDtbCen = flgDtbCen;
  }

  public Boolean getParFlgCxaMovTrm() {
    return parFlgCxaMovTrm;
  }

  public void setParFlgCxaMovTrm(Boolean parFlgCxaMovTrm) {
    this.parFlgCxaMovTrm = parFlgCxaMovTrm;
  }

  public Boolean getParFlgImpCpvPreRec() {
    return parFlgImpCpvPreRec;
  }

  public void setParFlgImpCpvPreRec(Boolean parFlgImpCpvPreRec) {
    this.parFlgImpCpvPreRec = parFlgImpCpvPreRec;
  }

  public Boolean getParFlgImpCpvRecEcf() {
    return parFlgImpCpvRecEcf;
  }

  public void setParFlgImpCpvRecEcf(Boolean parFlgImpCpvRecEcf) {
    this.parFlgImpCpvRecEcf = parFlgImpCpvRecEcf;
  }

  public Boolean getFlgImpRom() {
    return flgImpRom;
  }

  public void setFlgImpRom(Boolean flgImpRom) {
    this.flgImpRom = flgImpRom;
  }

  public BigDecimal getParValMaxPrdTipServic() {
    return parValMaxPrdTipServic;
  }

  public void setParValMaxPrdTipServic(BigDecimal parValMaxPrdTipServic) {
    this.parValMaxPrdTipServic = parValMaxPrdTipServic;
  }

  public Boolean getParFlgNaoTrfEstNeg() {
    return parFlgNaoTrfEstNeg;
  }

  public void setParFlgNaoTrfEstNeg(Boolean parFlgNaoTrfEstNeg) {
    this.parFlgNaoTrfEstNeg = parFlgNaoTrfEstNeg;
  }

  public Boolean getParFlgCadChqVenBal() {
    return parFlgCadChqVenBal;
  }

  public void setParFlgCadChqVenBal(Boolean parFlgCadChqVenBal) {
    this.parFlgCadChqVenBal = parFlgCadChqVenBal;
  }

  public String getNumInsMun() {
    return numInsMun;
  }

  public void setNumInsMun(String numInsMun) {
    this.numInsMun = numInsMun;
  }

  public Boolean getParFlgPafEcf() {
    return parFlgPafEcf;
  }

  public void setParFlgPafEcf(Boolean parFlgPafEcf) {
    this.parFlgPafEcf = parFlgPafEcf;
  }

  public Boolean getParFlgPafEcfImpDavEcf() {
    return parFlgPafEcfImpDavEcf;
  }

  public void setParFlgPafEcfImpDavEcf(Boolean parFlgPafEcfImpDavEcf) {
    this.parFlgPafEcfImpDavEcf = parFlgPafEcfImpDavEcf;
  }

  public Integer getCodMunici() {
    return codMunici;
  }

  public void setCodMunici(Integer codMunici) {
    this.codMunici = codMunici;
  }

  public Boolean getParFlgNaoLibDscSnhEsp() {
    return parFlgNaoLibDscSnhEsp;
  }

  public void setParFlgNaoLibDscSnhEsp(Boolean parFlgNaoLibDscSnhEsp) {
    this.parFlgNaoLibDscSnhEsp = parFlgNaoLibDscSnhEsp;
  }

  public String getParIsnEstabeInfCrd() {
    return parIsnEstabeInfCrd;
  }

  public void setParIsnEstabeInfCrd(String parIsnEstabeInfCrd) {
    this.parIsnEstabeInfCrd = parIsnEstabeInfCrd;
  }

  public Boolean getFlgUsaNFe() {
    return flgUsaNFe;
  }

  public void setFlgUsaNFe(Boolean flgUsaNFe) {
    this.flgUsaNFe = flgUsaNFe;
  }

  public Boolean getParFlgLibDigPrcTrm() {
    return parFlgLibDigPrcTrm;
  }

  public void setParFlgLibDigPrcTrm(Boolean parFlgLibDigPrcTrm) {
    this.parFlgLibDigPrcTrm = parFlgLibDigPrcTrm;
  }

  public Integer getParCodPrdSrvEntDom() {
    return parCodPrdSrvEntDom;
  }

  public void setParCodPrdSrvEntDom(Integer parCodPrdSrvEntDom) {
    this.parCodPrdSrvEntDom = parCodPrdSrvEntDom;
  }

  public String getParFMPVersao() {
    return parFMPVersao;
  }

  public void setParFMPVersao(String parFMPVersao) {
    this.parFMPVersao = parFMPVersao;
  }

  public String getTipTriLuc() {
    return tipTriLuc;
  }

  public void setTipTriLuc(String tipTriLuc) {
    this.tipTriLuc = tipTriLuc;
  }

  public String getSnhHash() {
    return snhHash;
  }

  public void setSnhHash(String snhHash) {
    this.snhHash = snhHash;
  }

  public Boolean getFlgConferNfeFec() {
    return flgConferNfeFec;
  }

  public void setFlgConferNfeFec(Boolean flgConferNfeFec) {
    this.flgConferNfeFec = flgConferNfeFec;
  }

  public Boolean getFlgImpTrfEntMov() {
    return flgImpTrfEntMov;
  }

  public void setFlgImpTrfEntMov(Boolean flgImpTrfEntMov) {
    this.flgImpTrfEntMov = flgImpTrfEntMov;
  }

  public String getDesEmail() {
    return desEmail;
  }

  public void setDesEmail(String desEmail) {
    this.desEmail = desEmail;
  }

  public String getDesVerBD() {
    return desVerBD;
  }

  public void setDesVerBD(String desVerBD) {
    this.desVerBD = desVerBD;
  }

  public Boolean getFlgUsaEstornoNFe() {
    return flgUsaEstornoNFe;
  }

  public void setFlgUsaEstornoNFe(Boolean flgUsaEstornoNFe) {
    this.flgUsaEstornoNFe = flgUsaEstornoNFe;
  }

  public Integer getCodContad() {
    return codContad;
  }

  public void setCodContad(Integer codContad) {
    this.codContad = codContad;
  }

  public Integer getCodIBGE() {
    return codIBGE;
  }

  public void setCodIBGE(Integer codIBGE) {
    this.codIBGE = codIBGE;
  }

  public String getParDesVerSNGPC() {
    return parDesVerSNGPC;
  }

  public void setParDesVerSNGPC(String parDesVerSNGPC) {
    this.parDesVerSNGPC = parDesVerSNGPC;
  }

  public Boolean getFlgAtacarejo() {
    return flgAtacarejo;
  }

  public void setFlgAtacarejo(Boolean flgAtacarejo) {
    this.flgAtacarejo = flgAtacarejo;
  }

  public Boolean getParFlgPrgCred() {
    return parFlgPrgCred;
  }

  public void setParFlgPrgCred(Boolean parFlgPrgCred) {
    this.parFlgPrgCred = parFlgPrgCred;
  }

  public Integer getCodComis1() {
    return codComis1;
  }

  public void setCodComis1(Integer codComis1) {
    this.codComis1 = codComis1;
  }

  public Integer getCodComis2() {
    return codComis2;
  }

  public void setCodComis2(Integer codComis2) {
    this.codComis2 = codComis2;
  }

  public Integer getCodComis3() {
    return codComis3;
  }

  public void setCodComis3(Integer codComis3) {
    this.codComis3 = codComis3;
  }

  public Integer getCodComis4() {
    return codComis4;
  }

  public void setCodComis4(Integer codComis4) {
    this.codComis4 = codComis4;
  }

  public Boolean getParFlgConferOrcCodBarTrm() {
    return parFlgConferOrcCodBarTrm;
  }

  public void setParFlgConferOrcCodBarTrm(Boolean parFlgConferOrcCodBarTrm) {
    this.parFlgConferOrcCodBarTrm = parFlgConferOrcCodBarTrm;
  }

  public Boolean getParFlgSugConferFecPreVnd() {
    return parFlgSugConferFecPreVnd;
  }

  public void setParFlgSugConferFecPreVnd(Boolean parFlgSugConferFecPreVnd) {
    this.parFlgSugConferFecPreVnd = parFlgSugConferFecPreVnd;
  }

  public String getCodSimCrt() {
    return codSimCrt;
  }

  public void setCodSimCrt(String codSimCrt) {
    this.codSimCrt = codSimCrt;
  }

  public Boolean getParFlgEntXmlNfe() {
    return parFlgEntXmlNfe;
  }

  public void setParFlgEntXmlNfe(Boolean parFlgEntXmlNfe) {
    this.parFlgEntXmlNfe = parFlgEntXmlNfe;
  }

  public Boolean getParFlgEntChvNfe() {
    return parFlgEntChvNfe;
  }

  public void setParFlgEntChvNfe(Boolean parFlgEntChvNfe) {
    this.parFlgEntChvNfe = parFlgEntChvNfe;
  }

  public Boolean getParFlgEntXmlCrit() {
    return parFlgEntXmlCrit;
  }

  public void setParFlgEntXmlCrit(Boolean parFlgEntXmlCrit) {
    this.parFlgEntXmlCrit = parFlgEntXmlCrit;
  }

  public Boolean getParFlgSugConferRemPrd() {
    return parFlgSugConferRemPrd;
  }

  public void setParFlgSugConferRemPrd(Boolean parFlgSugConferRemPrd) {
    this.parFlgSugConferRemPrd = parFlgSugConferRemPrd;
  }

  public Integer getParSugConferRemPrdQtdIni() {
    return parSugConferRemPrdQtdIni;
  }

  public void setParSugConferRemPrdQtdIni(Integer parSugConferRemPrdQtdIni) {
    this.parSugConferRemPrdQtdIni = parSugConferRemPrdQtdIni;
  }

  public Boolean getParFlgCapFon() {
    return parFlgCapFon;
  }

  public void setParFlgCapFon(Boolean parFlgCapFon) {
    this.parFlgCapFon = parFlgCapFon;
  }

  public Integer getIsnPlcFin() {
    return isnPlcFin;
  }

  public void setIsnPlcFin(Integer isnPlcFin) {
    this.isnPlcFin = isnPlcFin;
  }

  public String getDesToken() {
    return desToken;
  }

  public void setDesToken(String desToken) {
    this.desToken = desToken;
  }

  public BigDecimal getParValMaxSan() {
    return parValMaxSan;
  }

  public void setParValMaxSan(BigDecimal parValMaxSan) {
    this.parValMaxSan = parValMaxSan;
  }

  public Boolean getParFlgTxaEntObg() {
    return parFlgTxaEntObg;
  }

  public void setParFlgTxaEntObg(Boolean parFlgTxaEntObg) {
    this.parFlgTxaEntObg = parFlgTxaEntObg;
  }

  public BigDecimal getParValExiCpfCnpj() {
    return parValExiCpfCnpj;
  }

  public void setParValExiCpfCnpj(BigDecimal parValExiCpfCnpj) {
    this.parValExiCpfCnpj = parValExiCpfCnpj;
  }

  public Boolean getFlgBkpAtv() {
    return flgBkpAtv;
  }

  public void setFlgBkpAtv(Boolean flgBkpAtv) {
    this.flgBkpAtv = flgBkpAtv;
  }

  public String getDesBkpDir() {
    return desBkpDir;
  }

  public void setDesBkpDir(String desBkpDir) {
    this.desBkpDir = desBkpDir;
  }

  public Timestamp getHorBkpIni() {
    return horBkpIni;
  }

  public void setHorBkpIni(Timestamp horBkpIni) {
    this.horBkpIni = horBkpIni;
  }

  public Timestamp getDatBkpFin() {
    return datBkpFin;
  }

  public void setDatBkpFin(Timestamp datBkpFin) {
    this.datBkpFin = datBkpFin;
  }

  public Boolean getFlgBkpDom() {
    return flgBkpDom;
  }

  public void setFlgBkpDom(Boolean flgBkpDom) {
    this.flgBkpDom = flgBkpDom;
  }

  public Boolean getFlgBkpSeg() {
    return flgBkpSeg;
  }

  public void setFlgBkpSeg(Boolean flgBkpSeg) {
    this.flgBkpSeg = flgBkpSeg;
  }

  public Boolean getFlgBkpTer() {
    return flgBkpTer;
  }

  public void setFlgBkpTer(Boolean flgBkpTer) {
    this.flgBkpTer = flgBkpTer;
  }

  public Boolean getFlgBkpQua() {
    return flgBkpQua;
  }

  public void setFlgBkpQua(Boolean flgBkpQua) {
    this.flgBkpQua = flgBkpQua;
  }

  public Boolean getFlgBkpQui() {
    return flgBkpQui;
  }

  public void setFlgBkpQui(Boolean flgBkpQui) {
    this.flgBkpQui = flgBkpQui;
  }

  public Boolean getFlgBkpSex() {
    return flgBkpSex;
  }

  public void setFlgBkpSex(Boolean flgBkpSex) {
    this.flgBkpSex = flgBkpSex;
  }

  public Boolean getFlgBkpSab() {
    return flgBkpSab;
  }

  public void setFlgBkpSab(Boolean flgBkpSab) {
    this.flgBkpSab = flgBkpSab;
  }

  public Integer getParCodTabComDefVdr() {
    return parCodTabComDefVdr;
  }

  public void setParCodTabComDefVdr(Integer parCodTabComDefVdr) {
    this.parCodTabComDefVdr = parCodTabComDefVdr;
  }

  public Integer getParQtdMesAleVctPrd() {
    return parQtdMesAleVctPrd;
  }

  public void setParQtdMesAleVctPrd(Integer parQtdMesAleVctPrd) {
    this.parQtdMesAleVctPrd = parQtdMesAleVctPrd;
  }

  public Boolean getFlgNfeWebSer() {
    return flgNfeWebSer;
  }

  public void setFlgNfeWebSer(Boolean flgNfeWebSer) {
    this.flgNfeWebSer = flgNfeWebSer;
  }

  public String getTipEmiNfe() {
    return tipEmiNfe;
  }

  public void setTipEmiNfe(String tipEmiNfe) {
    this.tipEmiNfe = tipEmiNfe;
  }

  public Boolean getParFlgBlqCodPrdCst() {
    return parFlgBlqCodPrdCst;
  }

  public void setParFlgBlqCodPrdCst(Boolean parFlgBlqCodPrdCst) {
    this.parFlgBlqCodPrdCst = parFlgBlqCodPrdCst;
  }

  public Integer getCodFpgDinVenExt() {
    return codFpgDinVenExt;
  }

  public void setCodFpgDinVenExt(Integer codFpgDinVenExt) {
    this.codFpgDinVenExt = codFpgDinVenExt;
  }

  public Integer getCodFpgCmgVenExt() {
    return codFpgCmgVenExt;
  }

  public void setCodFpgCmgVenExt(Integer codFpgCmgVenExt) {
    this.codFpgCmgVenExt = codFpgCmgVenExt;
  }

  public Integer getCodCmgPdrVenExt() {
    return codCmgPdrVenExt;
  }

  public void setCodCmgPdrVenExt(Integer codCmgPdrVenExt) {
    this.codCmgPdrVenExt = codCmgPdrVenExt;
  }

  public String getDesAssDigSat() {
    return desAssDigSat;
  }

  public void setDesAssDigSat(String desAssDigSat) {
    this.desAssDigSat = desAssDigSat;
  }

  public Boolean getParFlgEstVenFmcPop() {
    return parFlgEstVenFmcPop;
  }

  public void setParFlgEstVenFmcPop(Boolean parFlgEstVenFmcPop) {
    this.parFlgEstVenFmcPop = parFlgEstVenFmcPop;
  }

  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

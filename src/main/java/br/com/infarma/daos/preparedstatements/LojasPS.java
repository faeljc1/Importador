package br.com.infarma.daos.preparedstatements;


import br.com.infarma.models.Lojas;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LojasPS {

  private static LojasPS INSTANCE = new LojasPS();

  public static LojasPS getInstance() {
    return INSTANCE;
  }

  private LojasPS() {
  }

  public void insert(PreparedStatement ps, Lojas lojas) throws SQLException {
    ps.setInt(1, lojas.getCodLoja());
    ps.setString(2, lojas.getDesLoja());
    ps.setString(3, lojas.getDesRazSoc());
    ps.setInt(4, lojas.getCodGrpLoj());
    ps.setInt(5, lojas.getCodRegTri());
    ps.setString(6, lojas.getNumCnpj());
    ps.setString(7, lojas.getNumInscri());
    ps.setString(8, lojas.getDesEndere());
    ps.setInt(9, lojas.getNumEndere());
    ps.setString(10, lojas.getDesBairro());
    ps.setString(11, lojas.getNumCep());
    ps.setString(12, lojas.getDesCidade());
    ps.setString(13, lojas.getDesEstado());
    ps.setString(14, lojas.getNumFone());
    ps.setString(15, lojas.getNomFarmac());
    ps.setTimestamp(16, lojas.getDatCadast());
    ps.setBigDecimal(17, lojas.getPerAlqIcm());
    ps.setInt(18, lojas.getCodMunici());
    ps.setString(19, lojas.getTipTriLuc());
    ps.setInt(20, lojas.getCodIBGE());
    ps.setTimestamp(21, lojas.getParDatUltFecDia());
  }

  public void insertAll(PreparedStatement ps, Lojas lojas) throws SQLException {
    ps.setInt(1, lojas.getCodLoja());
    ps.setString(2, lojas.getDesLoja());
    ps.setString(3, lojas.getDesRazSoc());
    ps.setInt(4, lojas.getCodGrpLoj());
    ps.setInt(5, lojas.getCodRegTri());
    ps.setInt(6, lojas.getCodTransp());
    ps.setString(7, lojas.getNumCnpj());
    ps.setString(8, lojas.getNumInscri());
    ps.setString(9, lojas.getDesEndere());
    ps.setInt(10, lojas.getNumEndere());
    ps.setString(11, lojas.getCplEndere());
    ps.setString(12, lojas.getDesBairro());
    ps.setString(13, lojas.getNumCep());
    ps.setString(14, lojas.getDesCidade());
    ps.setString(15, lojas.getDesEstado());
    ps.setString(16, lojas.getNumFone());
    ps.setString(17, lojas.getNomGerent());
    ps.setString(18, lojas.getNomFarmac());
    ps.setInt(19, lojas.getNumCrfFrm());
    ps.setString(20, lojas.getNumLicFun());
    ps.setInt(21, lojas.getCodCfoTrf());
    ps.setTimestamp(22, lojas.getDatImpEst());
    ps.setTimestamp(23, lojas.getDatImpMov());
    ps.setBigDecimal(24, lojas.getPerAlqIcm());
    ps.setInt(25, lojas.getNumSeqBal());
    ps.setInt(26, lojas.getCodPromoc());
    ps.setBoolean(27, lojas.getFlgDeposi());
    ps.setBoolean(28, lojas.getFlgImpNfs());
    ps.setBoolean(29, lojas.getFlgInativ());
    ps.setBoolean(30, lojas.getFlgNaoGerRep());
    ps.setBoolean(31, lojas.getFlgRljSql());
    ps.setTimestamp(32, lojas.getDatCadast());
    ps.setString(33, lojas.getNumCnae());
    ps.setTimestamp(34, lojas.getParDatUltFecSem());
    ps.setInt(35, lojas.getNumRotEnt());
    ps.setTimestamp(36, lojas.getParDatUltFecDia());
    ps.setBoolean(37, lojas.getParFlgIniVenTelEnd());
    ps.setInt(38, lojas.getParCodFpgIniVenTrm());
    ps.setBoolean(39, lojas.getParFlgImpOrcVenBal());
    ps.setBoolean(40, lojas.getParFlgImpOrcVenDom());
    ps.setInt(41, lojas.getParQtdViaCupOrc());
    ps.setBoolean(42, lojas.getParFlgImpNomEmpOrc());
    ps.setString(43, lojas.getParCodClaTaxEnt());
    ps.setBigDecimal(44, lojas.getParValDscMsgValEco());
    ps.setString(45, lojas.getParDesMsgOrcam1());
    ps.setString(46, lojas.getParDesMsgOrcam2());
    ps.setString(47, lojas.getParDesMsgOrcam3());
    ps.setString(48, lojas.getParDesMsgOrcam4());
    ps.setString(49, lojas.getParDesMsgOrcam5());
    ps.setBigDecimal(50, lojas.getParValMinTaxEntCla());
    ps.setBoolean(51, lojas.getParFlgImpViaCpvPcl());
    ps.setBoolean(52, lojas.getParFlgImpEndBolVenPrz());
    ps.setBoolean(53, lojas.getParFlgImpMsgOrcame());
    ps.setInt(54, lojas.getParQtdViaCpvCvnOrc());
    ps.setInt(55, lojas.getParQtdViaCpvPrzOrc());
    ps.setBoolean(56, lojas.getParFlgImpBolEntreg());
    ps.setInt(57, lojas.getParQtdViaCpvEntOrc());
    ps.setBoolean(58, lojas.getParFlgLerRegSaiDev());
    ps.setBoolean(59, lojas.getParFlgCtrEntregPdv());
    ps.setInt(60, lojas.getParQtdDiaBlqCxaEntPen());
    ps.setString(61, lojas.getParFMPCnpjEmpre());
    ps.setString(62, lojas.getParFMPUsuario());
    ps.setString(63, lojas.getParFMPSenha());
    ps.setBoolean(64, lojas.getParFMPAtivo());
    ps.setBoolean(65, lojas.getParFMPHomologado());
    ps.setString(66, lojas.getParDesMsgCupFis1());
    ps.setString(67, lojas.getParDesMsgCupFis2());
    ps.setString(68, lojas.getParDesMsgCupFis3());
    ps.setString(69, lojas.getParDesMsgCupFis4());
    ps.setString(70, lojas.getParDesMsgCupFis5());
    ps.setBoolean(71, lojas.getParFlgConferOrcCodBar());
    ps.setString(72, lojas.getParSerNotVenMan());
    ps.setBoolean(73, lojas.getParFlgImpRomEntSai());
    ps.setTimestamp(74, lojas.getParDatUltImpCad());
    ps.setBigDecimal(75, lojas.getParValTaxEntEnd());
    ps.setBigDecimal(76, lojas.getParPerMaxDscVen());
    ps.setInt(77, lojas.getParQtdDiaAtrVenPrz());
    ps.setBoolean(78, lojas.getParFlgNaoVisSldEstVen());
    ps.setBoolean(79, lojas.getParFlgAltDscVenBal());
    ps.setBoolean(80, lojas.getParFlgDigPrcPrdVen());
    ps.setBoolean(81, lojas.getParFlgUsaDscPrmVenTrm());
    ps.setBoolean(82, lojas.getParFlgExiRecPrdNra());
    ps.setBoolean(83, lojas.getParFlgNaoVenEstNeg());
    ps.setBoolean(84, lojas.getParFlgDscFinPolVen());
    ps.setBoolean(85, lojas.getParFlgDscPrdSemDsc());
    ps.setBoolean(86, lojas.getParFlgUsaFidCli());
    ps.setBoolean(87, lojas.getParFlgImpNumCmgOrc());
    ps.setBoolean(88, lojas.getParFlgExiCpfVenChe());
    ps.setBoolean(89, lojas.getParFlgBlqEmiChqDev());
    ps.setBoolean(90, lojas.getParFlgInfVenDomEcf());
    ps.setBoolean(91, lojas.getParFlgImpCpvCliEcf());
    ps.setBoolean(92, lojas.getParFlgImpResCmgFcx());
    ps.setBoolean(93, lojas.getParFlgImpResCvnFcx());
    ps.setBoolean(94, lojas.getParFlgNaoExpNfePen());
    ps.setBoolean(95, lojas.getParFlgCtrSNGPC());
    ps.setTimestamp(96, lojas.getParDatInventSNGPC());
    ps.setTimestamp(97, lojas.getParDatUltMovSNGPC());
    ps.setBoolean(98, lojas.getParFlgCnfOrcCodPrd());
    ps.setBoolean(99, lojas.getParFlgNaoFecCxgEntPen());
    ps.setString(100, lojas.getParClaPrdMagNum());
    ps.setBoolean(101, lojas.getFlgDtbCen());
    ps.setBoolean(102, lojas.getParFlgCxaMovTrm());
    ps.setBoolean(103, lojas.getParFlgImpCpvPreRec());
    ps.setBoolean(104, lojas.getParFlgImpCpvRecEcf());
    ps.setBoolean(105, lojas.getFlgImpRom());
    ps.setBigDecimal(106, lojas.getParValMaxPrdTipServic());
    ps.setBoolean(107, lojas.getParFlgNaoTrfEstNeg());
    ps.setBoolean(108, lojas.getParFlgCadChqVenBal());
    ps.setString(109, lojas.getNumInsMun());
    ps.setBoolean(110, lojas.getParFlgPafEcf());
    ps.setBoolean(111, lojas.getParFlgPafEcfImpDavEcf());
    ps.setInt(112, lojas.getCodMunici());
    ps.setBoolean(113, lojas.getParFlgNaoLibDscSnhEsp());
    ps.setString(114, lojas.getParIsnEstabeInfCrd());
    ps.setBoolean(115, lojas.getFlgUsaNFe());
    ps.setBoolean(116, lojas.getParFlgLibDigPrcTrm());
    ps.setInt(117, lojas.getParCodPrdSrvEntDom());
    ps.setString(118, lojas.getParFMPVersao());
    ps.setString(119, lojas.getTipTriLuc());
    ps.setString(120, lojas.getSnhHash());
    ps.setBoolean(121, lojas.getFlgConferNfeFec());
    ps.setBoolean(122, lojas.getFlgImpTrfEntMov());
    ps.setString(123, lojas.getDesEmail());
    ps.setString(124, lojas.getDesVerBD());
    ps.setBoolean(125, lojas.getFlgUsaEstornoNFe());
    ps.setInt(126, lojas.getCodContad());
    ps.setInt(127, lojas.getCodIBGE());
    ps.setString(128, lojas.getParDesVerSNGPC());
    ps.setBoolean(129, lojas.getFlgAtacarejo());
    ps.setBoolean(130, lojas.getParFlgPrgCred());
    ps.setInt(131, lojas.getCodComis1());
    ps.setInt(132, lojas.getCodComis2());
    ps.setInt(133, lojas.getCodComis3());
    ps.setInt(134, lojas.getCodComis4());
    ps.setBoolean(135, lojas.getParFlgConferOrcCodBarTrm());
    ps.setBoolean(136, lojas.getParFlgSugConferFecPreVnd());
    ps.setString(137, lojas.getCodSimCrt());
    ps.setBoolean(138, lojas.getParFlgEntXmlNfe());
    ps.setBoolean(139, lojas.getParFlgEntChvNfe());
    ps.setBoolean(140, lojas.getParFlgEntXmlCrit());
    ps.setBoolean(141, lojas.getParFlgSugConferRemPrd());
    ps.setInt(142, lojas.getParSugConferRemPrdQtdIni());
    ps.setBoolean(143, lojas.getParFlgCapFon());
    ps.setInt(144, lojas.getIsnPlcFin());
    ps.setString(145, lojas.getDesToken());
    ps.setBigDecimal(146, lojas.getParValMaxSan());
    ps.setBoolean(147, lojas.getParFlgTxaEntObg());
    ps.setBigDecimal(148, lojas.getParValExiCpfCnpj());
    ps.setBoolean(149, lojas.getFlgBkpAtv());
    ps.setString(150, lojas.getDesBkpDir());
    ps.setTimestamp(151, lojas.getHorBkpIni());
    ps.setTimestamp(152, lojas.getDatBkpFin());
    ps.setBoolean(153, lojas.getFlgBkpDom());
    ps.setBoolean(154, lojas.getFlgBkpSeg());
    ps.setBoolean(155, lojas.getFlgBkpTer());
    ps.setBoolean(156, lojas.getFlgBkpQua());
    ps.setBoolean(157, lojas.getFlgBkpQui());
    ps.setBoolean(158, lojas.getFlgBkpSex());
    ps.setBoolean(159, lojas.getFlgBkpSab());
    ps.setInt(160, lojas.getParCodTabComDefVdr());
    ps.setInt(161, lojas.getParQtdMesAleVctPrd());
    ps.setBoolean(162, lojas.getFlgNfeWebSer());
    ps.setString(163, lojas.getTipEmiNfe());
    ps.setBoolean(164, lojas.getParFlgBlqCodPrdCst());
    ps.setInt(165, lojas.getCodFpgDinVenExt());
    ps.setInt(166, lojas.getCodFpgCmgVenExt());
    ps.setInt(167, lojas.getCodCmgPdrVenExt());
    ps.setString(168, lojas.getDesAssDigSat());
    ps.setBoolean(169, lojas.getParFlgEstVenFmcPop());
  }

  /**
   * Inserir se não existir
   *
   * @param ps
   * @param lojas
   * @throws SQLException
   */
}

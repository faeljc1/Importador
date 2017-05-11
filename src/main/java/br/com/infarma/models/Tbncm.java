package br.com.infarma.models;

import br.com.infarma.geral.models.geral.AbstractModel;

import java.math.BigDecimal;

public class Tbncm implements AbstractModel {
  private String codNcm;
  private String desNcm;
  private String cstPisEntTri;
  private String cstPisSaiTri;
  private String cstPisEntNaoTri;
  private String cstPisSaiNaoTri;
  private String cstCofEntTri;
  private String cstCofSaiTri;
  private String cstCofEntNaoTri;
  private String cstCofSaiNaoTri;
  private Integer codSeqNat;
  private BigDecimal alqIbptNac;
  private BigDecimal alqIbptImp;

  public Tbncm() {}

  public Tbncm(String codNcm, String desNcm, String cstPisEntTri, String cstPisSaiTri, String cstPisEntNaoTri, String cstPisSaiNaoTri, String cstCofEntTri, String cstCofSaiTri, String cstCofEntNaoTri, String cstCofSaiNaoTri, Integer codSeqNat, BigDecimal alqIbptNac, BigDecimal alqIbptImp) {
    this.codNcm = codNcm;
    this.desNcm = desNcm;
    this.cstPisEntTri = cstPisEntTri;
    this.cstPisSaiTri = cstPisSaiTri;
    this.cstPisEntNaoTri = cstPisEntNaoTri;
    this.cstPisSaiNaoTri = cstPisSaiNaoTri;
    this.cstCofEntTri = cstCofEntTri;
    this.cstCofSaiTri = cstCofSaiTri;
    this.cstCofEntNaoTri = cstCofEntNaoTri;
    this.cstCofSaiNaoTri = cstCofSaiNaoTri;
    this.codSeqNat = codSeqNat;
    this.alqIbptNac = alqIbptNac;
    this.alqIbptImp = alqIbptImp;
  }

  public String getCodNcm() {
    return codNcm;
  }

  public void setCodNcm(String codNcm) {
    this.codNcm = codNcm;
  }

  public String getDesNcm() {
    return desNcm;
  }

  public void setDesNcm(String desNcm) {
    this.desNcm = desNcm;
  }

  public String getCstPisEntTri() {
    return cstPisEntTri;
  }

  public void setCstPisEntTri(String cstPisEntTri) {
    this.cstPisEntTri = cstPisEntTri;
  }

  public String getCstPisSaiTri() {
    return cstPisSaiTri;
  }

  public void setCstPisSaiTri(String cstPisSaiTri) {
    this.cstPisSaiTri = cstPisSaiTri;
  }

  public String getCstPisEntNaoTri() {
    return cstPisEntNaoTri;
  }

  public void setCstPisEntNaoTri(String cstPisEntNaoTri) {
    this.cstPisEntNaoTri = cstPisEntNaoTri;
  }

  public String getCstPisSaiNaoTri() {
    return cstPisSaiNaoTri;
  }

  public void setCstPisSaiNaoTri(String cstPisSaiNaoTri) {
    this.cstPisSaiNaoTri = cstPisSaiNaoTri;
  }

  public String getCstCofEntTri() {
    return cstCofEntTri;
  }

  public void setCstCofEntTri(String cstCofEntTri) {
    this.cstCofEntTri = cstCofEntTri;
  }

  public String getCstCofSaiTri() {
    return cstCofSaiTri;
  }

  public void setCstCofSaiTri(String cstCofSaiTri) {
    this.cstCofSaiTri = cstCofSaiTri;
  }

  public String getCstCofEntNaoTri() {
    return cstCofEntNaoTri;
  }

  public void setCstCofEntNaoTri(String cstCofEntNaoTri) {
    this.cstCofEntNaoTri = cstCofEntNaoTri;
  }

  public String getCstCofSaiNaoTri() {
    return cstCofSaiNaoTri;
  }

  public void setCstCofSaiNaoTri(String cstCofSaiNaoTri) {
    this.cstCofSaiNaoTri = cstCofSaiNaoTri;
  }

  public Integer getCodSeqNat() {
    return codSeqNat;
  }

  public void setCodSeqNat(Integer codSeqNat) {
    this.codSeqNat = codSeqNat;
  }

  public BigDecimal getAlqIbptNac() {
    return alqIbptNac;
  }

  public void setAlqIbptNac(BigDecimal alqIbptNac) {
    this.alqIbptNac = alqIbptNac;
  }

  public BigDecimal getAlqIbptImp() {
    return alqIbptImp;
  }

  public void setAlqIbptImp(BigDecimal alqIbptImp) {
    this.alqIbptImp = alqIbptImp;
  }


  @Override
  public Object getId() {
    return null;
  }

  @Override
  public void setId(Object o) {

  }
}

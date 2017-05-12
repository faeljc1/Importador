package br.com.infarma.daos.impl;

import br.com.infarma.daos.PrxljDAO;
import br.com.infarma.daos.rowmappers.PrxljRowMapper;
import br.com.infarma.models.Prxlj;
import br.com.infarma.utils.scripts.PrxljScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository("jdbcPrxljDAO")
public class PrxljDAOImpl extends DAOImpl<Prxlj, Integer[]> implements PrxljDAO {

  private static final Logger LOGGER = Logger.getLogger(PrxljDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Prxlj entity) {
    Object[] objects = new Object[]{entity.getCodLoja(), entity.getCodProdut(), entity.getPrcVenAtu(), entity.getPrcCusLiq(),
        entity.getPrcCusLiqMed(), entity.getPrcCusEnt(), entity.getDatPrcVenAtu(), entity.getFlgBlqCom(), entity.getFlgBlqVen(),
        entity.getFlgBlqDsc()};
    getJdbcTemplate().update(PrxljScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Prxlj entity) throws Exception {
    Object[] objects = new Object[]{entity.getPrcVenAtu(), entity.getPrcCusLiq(),
        entity.getPrcCusLiqMed(), entity.getPrcCusEnt(), entity.getDatPrcVenAtu(), entity.getFlgBlqCom(), entity.getFlgBlqVen(),
        entity.getFlgBlqDsc(), entity.getCodLoja(), entity.getCodProdut()};
    getJdbcTemplate().update(PrxljScript.getInstance().getUpdate(), objects);
  }

  @Override
  public void delete(Prxlj entity) throws Exception {

  }


  @Override
  public void createBatch(List<Prxlj> list) {
  }

  @Override
  public Prxlj find(Integer[] codLojaProdut) {
    Object objects[] = new Object[]{codLojaProdut[0], codLojaProdut[1]};
    List<Prxlj> preans = getJdbcTemplate().query(PrxljScript.getInstance().getSelect(), objects, new PrxljRowMapper());
    return !preans.isEmpty() ? preans.get(0) : null;
  }

  @Override
  public List<Prxlj> findAll() {
    return null;
  }
}
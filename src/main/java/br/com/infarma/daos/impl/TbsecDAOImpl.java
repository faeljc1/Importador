package br.com.infarma.daos.impl;

import br.com.infarma.daos.TbsecDAO;
import br.com.infarma.daos.rowmappers.TbsecRowMapper;
import br.com.infarma.models.Tbsec;
import br.com.infarma.utils.scripts.TbsecScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository("jdbcTbsecDAO")
public class TbsecDAOImpl extends DAOImpl<Tbsec, Integer> implements TbsecDAO {

  private static final Logger LOGGER = Logger.getLogger(FabriDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Tbsec entity) {
    Object[] objects = new Object[]{entity.getCodSeccao(), entity.getDesSeccao()};
    getJdbcTemplate().update(TbsecScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Tbsec entity) throws Exception {

  }

  @Override
  public void delete(Tbsec entity) throws Exception {

  }


  @Override
  public void createBatch(List<Tbsec> list) {
  }

  @Override
  public Tbsec find(Integer codTransp) {
    Object objects[] = new Object[]{codTransp};
    List<Tbsec> tbsecs = getJdbcTemplate().query(TbsecScript.getInstance().getSelect(), objects, new TbsecRowMapper());
    return !tbsecs.isEmpty() ? tbsecs.get(0) : null;
  }

  @Override
  public List<Tbsec> findAll() {
    return null;
  }
}
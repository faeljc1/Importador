package br.com.infarma.daos.impl;

import br.com.infarma.daos.SbbasDAO;
import br.com.infarma.daos.rowmappers.SbbasRowMapper;
import br.com.infarma.models.Sbbas;
import br.com.infarma.utils.scripts.SbbasScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository("jdbcSbbasDAO")
public class SbbasDAOImpl extends DAOImpl<Sbbas, Integer> implements SbbasDAO {

  private static final Logger LOGGER = Logger.getLogger(SbbasDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Sbbas entity) {
    Object[] objects = new Object[]{entity.getCodSubBas(), entity.getDesSubBas(), entity.getCodDCB()};
    getJdbcTemplate().update(SbbasScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Sbbas entity) throws Exception {

  }

  @Override
  public void delete(Sbbas entity) throws Exception {

  }


  @Override
  public void createBatch(List<Sbbas> list) {
  }

  @Override
  public Sbbas find(Integer codTransp) {
    Object objects[] = new Object[]{codTransp};
    List<Sbbas> fabris = getJdbcTemplate().query(SbbasScript.getInstance().getSelect(), objects, new SbbasRowMapper());
    return !fabris.isEmpty() ? fabris.get(0) : null;
  }

  @Override
  public List<Sbbas> findAll() {
    return null;
  }
}
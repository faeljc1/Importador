package br.com.infarma.daos.impl;

import br.com.infarma.daos.CltriDAO;
import br.com.infarma.daos.rowmappers.CltriRowMapper;
import br.com.infarma.models.Cltri;
import br.com.infarma.utils.scripts.CltriScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository("jdbcCltriDAO")
public class CltriDAOImpl extends DAOImpl<Cltri, String> implements CltriDAO {

  private static final Logger LOGGER = Logger.getLogger(CltriDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Cltri entity) {
    Object[] objects = new Object[]{entity.getCodClaTri(), entity.getDesClaTri(), entity.getDesObserv()};
    getJdbcTemplate().update(CltriScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Cltri entity) throws Exception {

  }

  @Override
  public void delete(Cltri entity) throws Exception {

  }


  @Override
  public void createBatch(List<Cltri> list) {
  }

  @Override
  public Cltri find(String codClaTri) {
    Object objects[] = new Object[]{codClaTri};
    List<Cltri> fabris = getJdbcTemplate().query(CltriScript.getInstance().getSelect(), objects, new CltriRowMapper());
    return !fabris.isEmpty() ? fabris.get(0) : null;
  }

  @Override
  public List<Cltri> findAll() {
    return null;
  }
}
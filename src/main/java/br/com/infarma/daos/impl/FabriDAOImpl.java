package br.com.infarma.daos.impl;

import br.com.infarma.daos.FabriDAO;
import br.com.infarma.daos.TransDAO;
import br.com.infarma.daos.rowmappers.FabriRowMapper;
import br.com.infarma.daos.rowmappers.TransRowMapper;
import br.com.infarma.models.Fabri;
import br.com.infarma.models.Trans;
import br.com.infarma.utils.scripts.EmpreScript;
import br.com.infarma.utils.scripts.FabriScript;
import br.com.infarma.utils.scripts.TransScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Repository("jdbcFabriDAO")
public class FabriDAOImpl extends DAOImpl<Fabri, Integer> implements FabriDAO {

  private static final Logger LOGGER = Logger.getLogger(FabriDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Fabri entity) {
    Object[] objects = new Object[]{entity.getCodFabric(), entity.getDesFabric(), entity.getNumCnpj()};
    getJdbcTemplate().update(FabriScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Fabri entity) throws Exception {

  }

  @Override
  public void delete(Fabri entity) throws Exception {

  }


  @Override
  public void createBatch(List<Fabri> list) {
  }

  @Override
  public Fabri find(Integer codTransp) {
    Object objects[] = new Object[]{codTransp};
    List<Fabri> fabris = getJdbcTemplate().query(FabriScript.getInstance().getSelect(), objects, new FabriRowMapper());
    return !fabris.isEmpty() ? fabris.get(0) : null;
  }

  @Override
  public List<Fabri> findAll() {
    return null;
  }
}
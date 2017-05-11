package br.com.infarma.daos.impl;

import br.com.infarma.daos.EnderDAO;
import br.com.infarma.daos.rowmappers.EnderRowMapper;
import br.com.infarma.models.Ender;
import br.com.infarma.utils.scripts.EnderScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository("jdbcEnderDAO")
public class EnderDAOImpl extends DAOImpl<Ender, String> implements EnderDAO {

  private static final Logger LOGGER = Logger.getLogger(EnderDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Ender entity) {
    Object[] objects = new Object[]{entity.getCodEndFon(), entity.getCodEndFon(), entity.getDesEndere(), entity.getDesBairro(),
        entity.getNumCep(), entity.getDesCidade(), entity.getDesEstado(), entity.getNomContat(), entity.getDatCadast(),
        entity.getCodLojOri()};
    getJdbcTemplate().update(EnderScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Ender entity) throws Exception {

  }

  @Override
  public void delete(Ender entity) throws Exception {

  }


  @Override
  public void createBatch(List<Ender> list) {
  }

  @Override
  public Ender find(String codEndCob) {
    Object objects[] = new Object[]{codEndCob};
    List<Ender> enders = getJdbcTemplate().query(EnderScript.getInstance().getSelect(), objects, new EnderRowMapper());
    return !enders.isEmpty() ? enders.get(0) : null;
  }

  @Override
  public List<Ender> findAll() {
    return null;
  }
}
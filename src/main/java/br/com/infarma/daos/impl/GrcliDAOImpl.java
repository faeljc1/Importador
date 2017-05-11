package br.com.infarma.daos.impl;

import br.com.infarma.daos.GrcliDAO;
import br.com.infarma.daos.rowmappers.ForneRowMapper;
import br.com.infarma.daos.rowmappers.GrcliRowMapper;
import br.com.infarma.models.Forne;
import br.com.infarma.models.Grcli;
import br.com.infarma.utils.scripts.ForneScript;
import br.com.infarma.utils.scripts.GrcliScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Repository("jdbcGrcliDAO")
public class GrcliDAOImpl extends DAOImpl<Grcli, Integer> implements GrcliDAO {

  private static final Logger LOGGER = Logger.getLogger(GrcliDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Grcli entity) {
    Object[] objects = new Object[]{entity.getCodGrpCli(), entity.getDesGrpCli(), entity.getPprDscVct()};
    getJdbcTemplate().update(GrcliScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Grcli entity) throws Exception {

  }

  @Override
  public void delete(Grcli entity) throws Exception {

  }


  @Override
  public void createBatch(List<Grcli> list) {
  }

  @Override
  public Grcli find(Integer codTransp) {
    Objects objects[] = new Objects[codTransp];
    List<Grcli> grclis = getJdbcTemplate().query(GrcliScript.getInstance().getSelect(), objects, new GrcliRowMapper());
    return !grclis.isEmpty() ? grclis.get(0) : null;
  }

  @Override
  public List<Grcli> findAll() {
    return null;
  }
}
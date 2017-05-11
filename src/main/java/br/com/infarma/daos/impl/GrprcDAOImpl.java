package br.com.infarma.daos.impl;

import br.com.infarma.daos.GrprcDAO;
import br.com.infarma.daos.rowmappers.GrprcRowMapper;
import br.com.infarma.models.Grprc;
import br.com.infarma.utils.scripts.GrprcScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository("jdbcGrprcDAO")
public class GrprcDAOImpl extends DAOImpl<Grprc, String> implements GrprcDAO {

  private static final Logger LOGGER = Logger.getLogger(GrprcDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Grprc entity) {
    Object[] objects = new Object[]{entity.getCodGrpPrc(), entity.getDesGrpPrc()};
    getJdbcTemplate().update(GrprcScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Grprc entity) throws Exception {

  }

  @Override
  public void delete(Grprc entity) throws Exception {

  }


  @Override
  public void createBatch(List<Grprc> list) {
  }

  @Override
  public Grprc find(String codGrpPrc) {
    Object objects[] = new Object[]{codGrpPrc};
    List<Grprc> grprcs = getJdbcTemplate().query(GrprcScript.getInstance().getSelect(), objects, new GrprcRowMapper());
    return !grprcs.isEmpty() ? grprcs.get(0) : null;
  }

  @Override
  public List<Grprc> findAll() {
    return null;
  }
}
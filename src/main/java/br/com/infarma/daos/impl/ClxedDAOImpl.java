package br.com.infarma.daos.impl;

import br.com.infarma.daos.ClxedDAO;
import br.com.infarma.daos.FabriDAO;
import br.com.infarma.daos.TransDAO;
import br.com.infarma.daos.rowmappers.ClxedRowMapper;
import br.com.infarma.daos.rowmappers.FabriRowMapper;
import br.com.infarma.daos.rowmappers.TransRowMapper;
import br.com.infarma.models.Clxed;
import br.com.infarma.models.Fabri;
import br.com.infarma.models.Trans;
import br.com.infarma.utils.scripts.ClxedScript;
import br.com.infarma.utils.scripts.EmpreScript;
import br.com.infarma.utils.scripts.FabriScript;
import br.com.infarma.utils.scripts.TransScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Repository("jdbcClxedDAO")
public class ClxedDAOImpl extends DAOImpl<Clxed, Object[]> implements ClxedDAO {

  private static final Logger LOGGER = Logger.getLogger(ClxedDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Clxed entity) {
    Object[] objects = new Object[]{entity.getCodClient(), entity.getCodEndFon()};
    getJdbcTemplate().update(ClxedScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Clxed entity) throws Exception {

  }

  @Override
  public void delete(Clxed entity) throws Exception {

  }


  @Override
  public void createBatch(List<Clxed> list) {
  }

  @Override
  public Clxed find(Object[] codClientCodEndCob) {
    Object objects[] = new Object[]{codClientCodEndCob[0], codClientCodEndCob[1]};
    List<Clxed> clxeds = getJdbcTemplate().query(ClxedScript.getInstance().getSelect(), objects, new ClxedRowMapper());
    return !clxeds.isEmpty() ? clxeds.get(0) : null;
  }

  @Override
  public List<Clxed> findAll() {
    return null;
  }
}
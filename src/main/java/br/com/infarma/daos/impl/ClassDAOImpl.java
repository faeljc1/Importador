package br.com.infarma.daos.impl;

import br.com.infarma.daos.ClassDAO;
import br.com.infarma.daos.FabriDAO;
import br.com.infarma.daos.TransDAO;
import br.com.infarma.daos.rowmappers.ClassRowMapper;
import br.com.infarma.daos.rowmappers.FabriRowMapper;
import br.com.infarma.daos.rowmappers.TransRowMapper;
import br.com.infarma.models.Class;
import br.com.infarma.models.Fabri;
import br.com.infarma.models.Trans;
import br.com.infarma.utils.scripts.ClassScript;
import br.com.infarma.utils.scripts.EmpreScript;
import br.com.infarma.utils.scripts.FabriScript;
import br.com.infarma.utils.scripts.TransScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Repository("jdbcClassDAO")
public class ClassDAOImpl extends DAOImpl<Class, String> implements ClassDAO {

  private static final Logger LOGGER = Logger.getLogger(ClassDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Class entity) {
    Object[] objects = new Object[]{entity.getCodClassi(), entity.getDesClassi(), entity.getNumNivel()};
    getJdbcTemplate().update(ClassScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Class entity) throws Exception {

  }

  @Override
  public void delete(Class entity) throws Exception {

  }


  @Override
  public void createBatch(List<Class> list) {
  }

  @Override
  public Class find(String codClassi) {
    Object objects[] = new Object[]{codClassi};
    List<Class> classes = getJdbcTemplate().query(ClassScript.getInstance().getSelect(), objects, new ClassRowMapper());
    return !classes.isEmpty() ? classes.get(0) : null;
  }

  @Override
  public List<Class> findAll() {
    return null;
  }
}
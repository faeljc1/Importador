package br.com.infarma.daos.impl;

import br.com.infarma.daos.PreanDAO;
import br.com.infarma.daos.rowmappers.PreanRowMapper;
import br.com.infarma.models.Prean;
import br.com.infarma.utils.scripts.PreanScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository("jdbcPreanDAO")
public class PreanDAOImpl extends DAOImpl<Prean, Object[]> implements PreanDAO {

  private static final Logger LOGGER = Logger.getLogger(PreanDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Prean entity) {
    Object[] objects = new Object[]{entity.getCodProdut(), entity.getCodEan(), entity.getQtdFraVen()};
    getJdbcTemplate().update(PreanScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Prean entity) throws Exception {

  }

  @Override
  public void delete(Prean entity) throws Exception {

  }


  @Override
  public void createBatch(List<Prean> list) {
  }

  @Override
  public Prean find(Object[] codProdutEAN) {
    Object objects[] = new Object[]{codProdutEAN[0], codProdutEAN[1]};
    List<Prean> preans = getJdbcTemplate().query(PreanScript.getInstance().getSelect(), objects, new PreanRowMapper());
    return !preans.isEmpty() ? preans.get(0) : null;
  }

  @Override
  public List<Prean> findAll() {
    return null;
  }
}
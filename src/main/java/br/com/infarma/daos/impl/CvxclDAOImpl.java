package br.com.infarma.daos.impl;

import br.com.infarma.daos.CvxclDAO;
import br.com.infarma.daos.rowmappers.CvxclRowMapper;
import br.com.infarma.models.Cvxcl;
import br.com.infarma.utils.scripts.CvxclScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository("jdbcCvxclDAO")
public class CvxclDAOImpl extends DAOImpl<Cvxcl, Integer[]> implements CvxclDAO {

  private static final Logger LOGGER = Logger.getLogger(CvxclDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Cvxcl entity) {
    Object[] objects = new Object[]{entity.getCodConven(), entity.getCodClient(), entity.getNumMatric(), entity.getDatUltCpr(),
        entity.getFlgBloque(), entity.getValLimCre()};
    getJdbcTemplate().update(CvxclScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Cvxcl entity) throws Exception {

  }

  @Override
  public void delete(Cvxcl entity) throws Exception {

  }


  @Override
  public void createBatch(List<Cvxcl> list) {
  }

  @Override
  public Cvxcl find(Integer[] codConvenClient) {
    Object objects[] = new Object[]{codConvenClient[0], codConvenClient[1]};
    List<Cvxcl> cvxcls = getJdbcTemplate().query(CvxclScript.getInstance().getSelect(), objects, new CvxclRowMapper());
    return !cvxcls.isEmpty() ? cvxcls.get(0) : null;
  }

  @Override
  public List<Cvxcl> findAll() {
    return null;
  }
}
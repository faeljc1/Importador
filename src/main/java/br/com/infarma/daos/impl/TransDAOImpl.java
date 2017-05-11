package br.com.infarma.daos.impl;

import br.com.infarma.daos.TransDAO;
import br.com.infarma.daos.rowmappers.TransRowMapper;
import br.com.infarma.models.Trans;
import br.com.infarma.utils.scripts.EmpreScript;
import br.com.infarma.utils.scripts.TransScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Repository("jdbcTransDAO")
public class TransDAOImpl extends DAOImpl<Trans, Integer> implements TransDAO {

  private static final Logger LOGGER = Logger.getLogger(TransDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Trans entity) {
    Object[] objects = new Object[]{entity.getCodTransp(), entity.getDesRazSoc(), entity.getDesFantas(), entity.getNumCgcCpf(),
        entity.getNumCgfRg(), entity.getDesEndere(), entity.getDesBairro(), entity.getDesCidade(), entity.getDesEstado(),
        entity.getNumCep(), entity.getNumFone(), entity.getNumFax(), entity.getNomContat(), entity.getCodRegTri(),
        entity.getFlgBloque(), entity.getFlgBloque(), entity.getCodIBGE(), entity.getNumInscri(), entity.getNumRG()};
    getJdbcTemplate().update(TransScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Trans entity) throws Exception {

  }

  @Override
  public void delete(Trans entity) throws Exception {

  }


  @Override
  public void createBatch(List<Trans> list) {
  }

  @Override
  public Trans find(Integer codTransp) {
    Objects objects[] = new Objects[codTransp];
    List<Trans> transs = getJdbcTemplate().query(TransScript.getInstance().getSelect(), objects, new TransRowMapper());
    return !transs.isEmpty() ? transs.get(0) : null;
  }

  @Override
  public List<Trans> findAll() {
    return null;
  }
}
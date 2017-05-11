package br.com.infarma.daos.impl;

import br.com.infarma.daos.ForneDAO;
import br.com.infarma.daos.rowmappers.ForneRowMapper;
import br.com.infarma.models.Forne;
import br.com.infarma.utils.scripts.ForneScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Repository("jdbcForneDAO")
public class ForneDAOImpl extends DAOImpl<Forne, Integer> implements ForneDAO {

  private static final Logger LOGGER = Logger.getLogger(ForneDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Forne entity) {
    Object[] objects = new Object[]{entity.getCodFornec(), entity.getDesRazSoc(), entity.getDesFantas(), entity.getNumCgcCpf(),
        entity.getNumCgfRg(), entity.getDesCidade(), entity.getDesEstado(), entity.getCodRegTri(), entity.getDesEndere(),
        entity.getDesBairro(), entity.getNumCep(), entity.getNumFone(), entity.getNumFax(), entity.getDesObserv(),
        entity.getCodIBGE(), entity.getFlgBloque()};
    getJdbcTemplate().update(ForneScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Forne entity) throws Exception {

  }

  @Override
  public void delete(Forne entity) throws Exception {

  }


  @Override
  public void createBatch(List<Forne> list) {
  }

  @Override
  public Forne find(Integer codTransp) {
    Objects objects[] = new Objects[codTransp];
    List<Forne> fornes = getJdbcTemplate().query(ForneScript.getInstance().getSelect(), objects, new ForneRowMapper());
    return !fornes.isEmpty() ? fornes.get(0) : null;
  }

  @Override
  public List<Forne> findAll() {
    return null;
  }
}
package br.com.infarma.daos.impl;

import br.com.infarma.daos.EmpreDAO;
import br.com.infarma.daos.rowmappers.EmpreRowMapper;
import br.com.infarma.models.Empre;
import br.com.infarma.utils.scripts.EmpreScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository("jdbcEmpreDAO")
public class EmpreDAOImpl extends DAOImpl<Empre, String> implements EmpreDAO {

  private static final Logger LOGGER = Logger.getLogger(EmpreDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Empre entity) {
    Object[] objects = new Object[]{entity.getRazaoSocial(), entity.getFantasia(), entity.getEndereco(), entity.getNumero(),
        entity.getComplemento(), entity.getBairro(), entity.getCep(), entity.getCidade(), entity.getEstado(), entity.getCgc(),
        entity.getCgf(), entity.getFone(), entity.getFax(), entity.getEmail()};
    getJdbcTemplate().update(EmpreScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Empre entity) throws Exception {

  }

  @Override
  public void delete(Empre entity) throws Exception {

  }


  @Override
  public void createBatch(List<Empre> list) {
  }

  @Override
  public Empre find(String razao) {
    List<Empre> empres = getJdbcTemplate().query(EmpreScript.getInstance().getSelect(), new EmpreRowMapper());
    return !empres.isEmpty() ? empres.get(0) : null;
  }

  @Override
  public List<Empre> findAll() {
    return null;
  }
}
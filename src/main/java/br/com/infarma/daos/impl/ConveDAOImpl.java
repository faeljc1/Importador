package br.com.infarma.daos.impl;

import br.com.infarma.daos.ConveDAO;
import br.com.infarma.daos.rowmappers.ConveRowMapper;
import br.com.infarma.daos.rowmappers.LojasRowMapper;
import br.com.infarma.models.Conve;
import br.com.infarma.models.Lojas;
import br.com.infarma.utils.scripts.ConveScript;
import br.com.infarma.utils.scripts.LojasScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Repository("jdbcConveDAO")
public class ConveDAOImpl extends DAOImpl<Conve, Integer> implements ConveDAO {

  private static final Logger LOGGER = Logger.getLogger(ConveDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Conve entity) {
    Object[] objects = new Object[]{entity.getCodConven(), entity.getDesConven(), entity.getTipConven(), entity.getQtdDiaFec(),
        entity.getQtdDiaVct(), entity.getNumCgcCpf(), entity.getDesRazSoc(), entity.getDesEndere(), entity.getDesBairro(),
        entity.getDesCidade(), entity.getDesEstado(), entity.getNumCep(), entity.getNomContat(), entity.getCodAgeCob(),
        entity.getNumSeqFec(), entity.getQtdMaxPcl(), entity.getFlgBloque(), entity.getDiaFecha1()};
    getJdbcTemplate().update(ConveScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Conve entity) throws Exception {

  }

  @Override
  public void delete(Conve entity) throws Exception {

  }


  @Override
  public void createBatch(List<Conve> list) {
  }

  @Override
  public Conve find(Integer codConven) {
    Objects objects[] = new Objects[codConven];
    List<Conve> conves = getJdbcTemplate().query(ConveScript.getInstance().getSelect(), objects, new ConveRowMapper());
    return !conves.isEmpty() ? conves.get(0) : null;
  }

  @Override
  public List<Conve> findAll() {
    return null;
  }
}
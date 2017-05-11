package br.com.infarma.daos.impl;

import br.com.infarma.daos.ClienDAO;
import br.com.infarma.daos.ConveDAO;
import br.com.infarma.daos.rowmappers.ClienRowMapper;
import br.com.infarma.daos.rowmappers.ConveRowMapper;
import br.com.infarma.daos.rowmappers.LojasRowMapper;
import br.com.infarma.models.Clien;
import br.com.infarma.models.Conve;
import br.com.infarma.models.Lojas;
import br.com.infarma.utils.scripts.ClienScript;
import br.com.infarma.utils.scripts.ConveScript;
import br.com.infarma.utils.scripts.LojasScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Repository("jdbcClienDAO")
public class ClienDAOImpl extends DAOImpl<Clien, Integer> implements ClienDAO {

  private static final Logger LOGGER = Logger.getLogger(ClienDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Clien entity) {
    Object[] objects = new Object[]{entity.getCodClient(), entity.getNomClient(), entity.getDatCadast(), entity.getCodGrpCli(),
        entity.getSexClient(), entity.getNumCpfCgc(), entity.getNumRGCgf(), entity.getDiaNascim(), entity.getMesNascim(),
        entity.getAnoNascim(), entity.getNumFonCel(), entity.getCtrVencim(), entity.getDesObserv(), entity.getFlgBloque(),
        entity.getCodEndRes(), entity.getCodRegTri(), entity.getValLimCre(), entity.getDesEmail()};
    getJdbcTemplate().update(ClienScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Clien entity) throws Exception {

  }

  @Override
  public void delete(Clien entity) throws Exception {

  }


  @Override
  public void createBatch(List<Clien> list) {
  }

  @Override
  public Clien find(Integer codConven) {
    Objects objects[] = new Objects[codConven];
    List<Clien> conves = getJdbcTemplate().query(ClienScript.getInstance().getSelect(), objects, new ClienRowMapper());
    return !conves.isEmpty() ? conves.get(0) : null;
  }

  @Override
  public List<Clien> findAll() {
    return null;
  }
}
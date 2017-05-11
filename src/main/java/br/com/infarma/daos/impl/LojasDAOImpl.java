package br.com.infarma.daos.impl;

import br.com.infarma.daos.LojasDAO;
import br.com.infarma.daos.rowmappers.LojasRowMapper;
import br.com.infarma.models.Lojas;
import br.com.infarma.utils.scripts.LojasScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Repository("jdbcLojasDAO")
public class LojasDAOImpl extends DAOImpl<Lojas, Integer> implements LojasDAO {

  private static final Logger LOGGER = Logger.getLogger(LojasDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Lojas entity) {
    Object[] objects = new Object[]{entity.getCodLoja(), entity.getDesLoja(), entity.getDesRazSoc(), entity.getCodGrpLoj(),
        entity.getCodRegTri(), entity.getNumCnpj(), entity.getNumInscri(), entity.getDesEndere(), entity.getNumEndere(),
        entity.getDesBairro(), entity.getNumCep(), entity.getDesCidade(), entity.getDesEstado(), entity.getNumFone(),
        entity.getNomFarmac(), entity.getDatCadast(), entity.getPerAlqIcm(), entity.getCodMunici(), entity.getTipTriLuc(),
        entity.getCodIBGE(), entity.getParDatUltFecDia()};
    getJdbcTemplate().update(LojasScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Lojas entity) throws Exception {

  }

  @Override
  public void delete(Lojas entity) throws Exception {

  }


  @Override
  public void createBatch(List<Lojas> list) {
  }

  @Override
  public Lojas find(Integer codLoja) {
    Objects objects[] = new Objects[codLoja];
    List<Lojas> lojas = getJdbcTemplate().query(LojasScript.getInstance().getSelect(), objects, new LojasRowMapper());
    return !lojas.isEmpty() ? lojas.get(0) : null;
  }

  @Override
  public List<Lojas> findAll() {
    return null;
  }
}
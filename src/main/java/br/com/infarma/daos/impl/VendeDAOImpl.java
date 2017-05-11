package br.com.infarma.daos.impl;

import br.com.infarma.daos.VendeDAO;
import br.com.infarma.daos.rowmappers.TransRowMapper;
import br.com.infarma.daos.rowmappers.VendeRowMapper;
import br.com.infarma.models.Trans;
import br.com.infarma.models.Vende;
import br.com.infarma.utils.scripts.TransScript;
import br.com.infarma.utils.scripts.VendeScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Repository("jdbcVendeDAO")
public class VendeDAOImpl extends DAOImpl<Vende, Integer> implements VendeDAO {

  private static final Logger LOGGER = Logger.getLogger(VendeDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Vende entity) {
    Object[] objects = new Object[]{entity.getCodVended(), entity.getNomVended(), entity.getCodTabCom(), entity.getFlgBloque(),
        entity.getNumCpf()};
    getJdbcTemplate().update(VendeScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Vende entity) throws Exception {

  }

  @Override
  public void delete(Vende entity) throws Exception {

  }


  @Override
  public void createBatch(List<Vende> list) {
  }

  @Override
  public Vende find(Integer codTransp) {
    Objects objects[] = new Objects[codTransp];
    List<Vende> vendes = getJdbcTemplate().query(VendeScript.getInstance().getSelect(), objects, new VendeRowMapper());
    return !vendes.isEmpty() ? vendes.get(0) : null;
  }

  @Override
  public List<Vende> findAll() {
    return null;
  }
}
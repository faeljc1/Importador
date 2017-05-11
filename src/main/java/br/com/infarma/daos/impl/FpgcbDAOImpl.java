package br.com.infarma.daos.impl;

import br.com.infarma.daos.FpgcbDAO;
import br.com.infarma.daos.rowmappers.FpgcbRowMapper;
import br.com.infarma.models.Fpgcb;
import br.com.infarma.utils.scripts.FabriScript;
import br.com.infarma.utils.scripts.FpgcbScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Repository("jdbcFpgcbDAO")
public class FpgcbDAOImpl extends DAOImpl<Fpgcb, Integer> implements FpgcbDAO {

  private static final Logger LOGGER = Logger.getLogger(FpgcbDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Fpgcb entity) {
    Object[] objects = new Object[]{entity.getCodForPag(), entity.getDesForPag(), entity.getTipForPag(), entity.getCodFinali()};
    getJdbcTemplate().update(FabriScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Fpgcb entity) throws Exception {

  }

  @Override
  public void delete(Fpgcb entity) throws Exception {

  }


  @Override
  public void createBatch(List<Fpgcb> list) {
  }

  @Override
  public Fpgcb find(Integer codForPag) {
    Objects objects[] = new Objects[codForPag];
    List<Fpgcb> fpgcbs = getJdbcTemplate().query(FpgcbScript.getInstance().getSelect(), objects, new FpgcbRowMapper());
    return !fpgcbs.isEmpty() ? fpgcbs.get(0) : null;
  }

  @Override
  public List<Fpgcb> findAll() {
    return null;
  }
}
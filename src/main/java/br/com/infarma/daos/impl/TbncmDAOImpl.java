package br.com.infarma.daos.impl;

import br.com.infarma.daos.TbncmDAO;
import br.com.infarma.daos.rowmappers.TbncmRowMapper;
import br.com.infarma.models.Tbncm;
import br.com.infarma.utils.scripts.TbncmScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository("jdbcTbncmDAO")
public class TbncmDAOImpl extends DAOImpl<Tbncm, String> implements TbncmDAO {

  private static final Logger LOGGER = Logger.getLogger(TbncmDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Tbncm entity) {
    Object[] objects = new Object[]{entity.getCodNcm(), entity.getDesNcm(), entity.getCstPisEntTri(), entity.getCstPisSaiTri(),
        entity.getCstPisEntNaoTri(), entity.getCstPisSaiNaoTri(), entity.getCstCofEntTri(), entity.getCstCofSaiTri(),
        entity.getCstCofEntNaoTri(), entity.getCstCofSaiNaoTri(), entity.getCodSeqNat(), entity.getAlqIbptNac(),
        entity.getAlqIbptImp()};
    getJdbcTemplate().update(TbncmScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Tbncm entity) throws Exception {

  }

  @Override
  public void delete(Tbncm entity) throws Exception {

  }


  @Override
  public void createBatch(List<Tbncm> list) {
  }

  @Override
  public Tbncm find(String codNcm) {
    Object objects[] = new Object[]{codNcm};
    List<Tbncm> tbncms = getJdbcTemplate().query(TbncmScript.getInstance().getSelect(), objects, new TbncmRowMapper());
    return !tbncms.isEmpty() ? tbncms.get(0) : null;
  }

  @Override
  public List<Tbncm> findAll() {
    return null;
  }
}
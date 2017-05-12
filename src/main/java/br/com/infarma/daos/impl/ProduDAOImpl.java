package br.com.infarma.daos.impl;

import br.com.infarma.daos.ProduDAO;
import br.com.infarma.daos.rowmappers.ProduRowMapper;
import br.com.infarma.models.Produ;
import br.com.infarma.utils.scripts.ForneScript;
import br.com.infarma.utils.scripts.ProduScript;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository("jdbcProduDAO")
public class ProduDAOImpl extends DAOImpl<Produ, Integer> implements ProduDAO {
  private static final Logger LOGGER = Logger.getLogger(ProduDAOImpl.class.getName());


  @Override
  @Deprecated
  public void create(Produ entity) {
    Object[] objects = new Object[]{entity.getCodProdut(), entity.getDesProdut(), entity.getDesResumi(), entity.getDesComple(),
        entity.getDatImplan(), entity.getDesUniVen(), entity.getDesUniCom(), entity.getQtdFraVen(), entity.getCodFabric(),
        entity.getCodEAN(), entity.getCtrPreco(), entity.getCtrLista(), entity.getCtrVenda(), entity.getCtrOrigem(),
        entity.getCodClaTri(), entity.getCodClassi(), entity.getCodClaFis(), entity.getQtdEmbVen(),
        entity.getNumRegMS(), entity.getCodNcm(), entity.getCodTipIte(), entity.getCodSeccao(), entity.getCodGrpPrc(),
        entity.getCodSubBas(), entity.getCodCEST()};
    getJdbcTemplate().update(ForneScript.getInstance().getInsert(), objects);
  }

  @Override
  public void update(Produ entity) throws Exception {

  }

  @Override
  public void delete(Produ entity) throws Exception {

  }


  @Override
  public void createBatch(List<Produ> list) {
  }

  @Override
  public Produ find(Integer codProduto) {
    Object objects[] = new Object[]{codProduto};
    List<Produ> produs = getJdbcTemplate().query(ProduScript.getInstance().getSelect(), objects, new ProduRowMapper());
    return !produs.isEmpty() ? produs.get(0) : null;
  }

  @Override
  public List<Produ> findAll() {
    return null;
  }
}
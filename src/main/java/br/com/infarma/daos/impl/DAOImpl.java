package br.com.infarma.daos.impl;

import br.com.infarma.daos.DAO;
import br.com.infarma.geral.models.geral.AbstractModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class DAOImpl<T extends AbstractModel, ID> implements DAO<T, ID> {

  @Autowired(required = true)
  @Qualifier("jdbcTemplateSql")
  private JdbcTemplate db;
  @Autowired(required = true)
  @Qualifier("dataSourceSql")
  private DataSource dataSource;

  private Class<T> persistentClass;

  @SuppressWarnings("unchecked")
  public DAOImpl() {
    this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
  }

  public Class<T> getPersistentClass() {
    return persistentClass;
  }

  public abstract void create(T entity) throws Exception;

  public abstract T find(ID id);

  public abstract List<T> findAll();

  public void truncate(String tabela) {
    String sql = "TRUNCATE TABLE " + tabela;
    getJdbcTemplate().update(sql);
  }

  public DataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public JdbcTemplate getJdbcTemplate() {
    return db;
  }
}

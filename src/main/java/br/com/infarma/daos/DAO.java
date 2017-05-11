package br.com.infarma.daos;

import br.com.infarma.geral.models.geral.AbstractModel;

import java.util.List;

public interface DAO<T extends AbstractModel, ID> {

  void create(T entity) throws Exception;

  void update(T entity) throws Exception;

  void delete(T entity) throws Exception;

  T find(ID id);

  List<T> findAll();

  void createBatch(List<T> list);
}

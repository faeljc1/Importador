package br.com.infarma.utils;

import br.com.infarma.models.Configuracao;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.ConnectionPoolDataSource;
import java.beans.PropertyVetoException;
import java.sql.SQLException;

public class Conexao {
  private ComboPooledDataSource poolOrigem = null;
  private ComboPooledDataSource poolDestino = null;
  private static Conexao uniqueInstance = new Conexao();

  private Conexao() {
  }

  public static Conexao getInstance() {
    return uniqueInstance;
  }

  public ConnectionPoolDataSource connDestino(Configuracao configuracao) throws ClassNotFoundException, SQLException, PropertyVetoException {
    if (poolDestino == null) {
      poolDestino = new ComboPooledDataSource();
      poolDestino.setDriverClass("net.sourceforge.jtds.jdbc.Driver");
      poolDestino.setJdbcUrl("jdbc:jtds:sqlserver://" + configuracao.getServidorDestino() + ":" +
          configuracao.getPortaDestino() + "/" + configuracao.getBancoDestino() +
          (configuracao.getInstanciaDestino().isEmpty() ? "" : ";instance=" + configuracao.getInstanciaDestino()));
      poolDestino.setUser(configuracao.getUsuarioDestino());
      poolDestino.setPassword(configuracao.getSenhaDestino());
      poolDestino.setMinPoolSize(5);
      poolDestino.setAcquireIncrement(5);
      poolDestino.setMaxPoolSize(20);
    }
    return poolDestino.getConnectionPoolDataSource();
  }

  public ConnectionPoolDataSource connOrigem(Configuracao configuracao) throws ClassNotFoundException, SQLException, PropertyVetoException {
    if (poolOrigem == null) {
      poolOrigem = new ComboPooledDataSource();
      poolOrigem.setDriverClass("net.sourceforge.jtds.jdbc.Driver");
      poolOrigem.setJdbcUrl("jdbc:jtds:sqlserver://" + configuracao.getServidorOrigem() + ":" +
          configuracao.getPortaOrigem() + "/" + configuracao.getBancoOrigem() +
          (configuracao.getInstanciaOrigem().isEmpty() ? "" : ";instance=" + configuracao.getInstanciaOrigem()));
      poolOrigem.setUser(configuracao.getUsuarioOrigem());
      poolOrigem.setPassword(configuracao.getSenhaOrigem());
      poolOrigem.setMinPoolSize(5);
      poolOrigem.setAcquireIncrement(5);
      poolOrigem.setMaxPoolSize(20);
    }
    return poolOrigem.getConnectionPoolDataSource();
  }

  public void testaConnDestino(Configuracao configuracao) throws ClassNotFoundException, SQLException,
      PropertyVetoException {
    poolDestino = null;
    connDestino(configuracao).getPooledConnection().getConnection();
    poolDestino.setPreferredTestQuery("SELECT 1");
  }

  public void testaConnOrigem(Configuracao configuracao) throws ClassNotFoundException, SQLException,
      PropertyVetoException {
    poolOrigem = null;
    connOrigem(configuracao).getPooledConnection().getConnection();
    poolOrigem.setPreferredTestQuery("SELECT 1");
  }
}

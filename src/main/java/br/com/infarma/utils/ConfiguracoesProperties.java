package br.com.infarma.utils;

import br.com.infarma.models.Configuracao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConfiguracoesProperties {

  private Properties properties = new Properties();
  private static final ConfiguracoesProperties INSTANCE = new ConfiguracoesProperties();
  private String arquivo = "config.ini";
  private Configuracao configuracao;

  public static ConfiguracoesProperties getInstance() {
    return INSTANCE;
  }

  private ConfiguracoesProperties() {
  }

  public Configuracao getConfiguracao() {
    getConfiguracoes();

    String servidorOrigem = properties.getProperty("servidororigem");
    String instanciaOrigem = properties.getProperty("instanciaorigem");
    String bancoOrigem = properties.getProperty("bancoorigem");
    String portaOrigem = properties.getProperty("portaorigem");
    String usuarioOrigem = properties.getProperty("usuarioorigem");
    String senhaOrigem = properties.getProperty("senhaorigem");

    String servidorDestino = properties.getProperty("servidordestino");
    String bancoDestino = properties.getProperty("bancodestino");
    String instanciaDestino = properties
        .getProperty("instanciadestino");
    String portaDestino = properties.getProperty("portadestino");
    String usuarioDestino = properties.getProperty("usuariodestino");
    String senhaDestino = properties.getProperty("senhadestino");

    configuracao = new Configuracao(servidorOrigem, instanciaOrigem, bancoOrigem,
        portaOrigem, usuarioOrigem, senhaOrigem, servidorDestino,
        instanciaDestino, bancoDestino, portaDestino,
        usuarioDestino, senhaDestino);
    return configuracao;
  }

  public void setConfiguracao(Configuracao configuracao) {
    try {
      getConfiguracoes();
      FileOutputStream fos = new FileOutputStream(arquivo);

      properties.setProperty("servidororigem", configuracao.getServidorOrigem());
      properties.setProperty("instanciaorigem", configuracao.getInstanciaOrigem());
      properties.setProperty("bancoorigem", configuracao.getBancoOrigem());
      properties.setProperty("portaorigem", configuracao.getPortaOrigem());
      properties.setProperty("usuarioorigem", configuracao.getUsuarioOrigem());
      properties.setProperty("senhaorigem", configuracao.getSenhaOrigem());

      properties.setProperty("servidordestino", configuracao.getServidorDestino());
      properties.setProperty("instanciadestino", configuracao.getInstanciaDestino());
      properties.setProperty("bancodestino", configuracao.getBancoDestino());
      properties.setProperty("portadestino", configuracao.getPortaDestino());
      properties.setProperty("usuariodestino", configuracao.getUsuarioDestino());
      properties.setProperty("senhadestino", configuracao.getSenhaDestino());
      properties.store(fos, "");
      fos.close();

    } catch (IOException ex) {
      Logger.getLogger(ConfiguracoesProperties.class.getName()).log(Level.SEVERE, null,
          ex);
    }
  }

  private void getConfiguracoes() {
    try {
      properties.load(new FileInputStream(arquivo));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

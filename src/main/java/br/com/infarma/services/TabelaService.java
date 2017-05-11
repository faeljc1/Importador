package br.com.infarma.services;

import br.com.infarma.daos.DAO;
import br.com.infarma.models.dto.TelaDTO;
import br.com.infarma.models.pojo.RetornoPOJO;
import br.com.infarma.models.pojo.TabelaPOJO;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

@Component
public class TabelaService {

  private List<TabelaPOJO> listaTabela;
  private static RetornoPOJO retornoPOJO = new RetornoPOJO();
  private static TelaDTO dto = new TelaDTO();
  private boolean processando = false;

  private TabelaService() {
  }

  @Async
  @Scheduled(fixedRate = 1)
  public void processa() {
    try {
      if (dto != null && dto.getTipo().equalsIgnoreCase("Processa") && dto.getStatus().equalsIgnoreCase("Iniciando") && !processando) {
        int contador = 0;
        Integer numSeqBal = null;
        setStatus("Parou");
        processando = true;
        retornoPOJO.setTotalDeRegiistros2(getContador());
        listaTabela = dto.getTabelaPOJOs();
        for (int i = 0; i < listaTabela.size(); i++) {
          if (listaTabela.get(i).isChecked()) {
            DAO dao = listaTabela.get(i).getTabelasEnum().getDAO();
            numSeqBal = dao.importaDados(dto.getConfiguracao(), retornoPOJO);
            zerarBarra1();
            retornoPOJO.setProcessado2(++contador);
          }
        }
        retornoPOJO.setMensagem("Tabelas Importadas com Sucesso!!");
        if (numSeqBal != null) {
          retornoPOJO.setMensagem(retornoPOJO.getMensagem() + " Número do balanço gravado: " + numSeqBal);
        }
        processando = false;
      }
    } catch (PropertyVetoException e) {
      excecao(e);
    } catch (ClassNotFoundException e) {
      excecao(e);
    } catch (SQLException e) {
      excecao(e);
    } catch (ParseException e) {
      excecao(e);
    } catch (Exception e) {
      excecao(e);
    }
  }

  @Async
  @Scheduled(fixedRate = 1000)
  public void limpaDados() {
    try {
      if (dto != null && dto.getTipo().equalsIgnoreCase("LimpaDados") && dto.getStatus().equalsIgnoreCase("Iniciando") && !processando) {
        int contador = 0;
        setStatus("Parou");
        processando = true;
        retornoPOJO.setTotalDeRegiistros2(getContador());
        listaTabela = dto.getTabelaPOJOs();
        for (int i = listaTabela.size() - 1; i >= 0; i--) {
          if (listaTabela.get(i).isChecked()) {
            if (!listaTabela.get(i).getTabelasEnum().name().equals("SCRIPT")) {
              DAO dao = listaTabela.get(i).getTabelasEnum().getDAO();
              if (listaTabela.get(i).getTabelasEnum().getRelacionamentos().equalsIgnoreCase("")) {
                dao.limpaDados(dto.getConfiguracao(), listaTabela.get(i).getTabelasEnum().name());
                retornoPOJO.setProcessado2(++contador);
              } else {
                String[] relacionamentos = listaTabela.get(i).getTabelasEnum().getRelacionamentos().split(" ");
                for (int j = 0; j < relacionamentos.length; j++) {
                  dao.limpaDados(dto.getConfiguracao(), relacionamentos[j]);
                }
                dao.limpaDados(dto.getConfiguracao(), listaTabela.get(i).getTabelasEnum().name());
                retornoPOJO.setProcessado2(++contador);
              }
            } else {
              retornoPOJO.setProcessado2(++contador);
            }
          }
        }
        retornoPOJO.setMensagem("Limpeza de Tabelas Concluida!!");
        processando = false;
      }
    } catch (SQLException e) {
      excecao(e);
    } catch (PropertyVetoException e) {
      excecao(e);
    } catch (ClassNotFoundException e) {
      excecao(e);
    }
  }

  private void excecao(Exception e) {
    e.printStackTrace();
    retornoPOJO.setMensagem(e.getMessage());
    setDto(new TelaDTO());
    setStatus("Parou");
    processando = false;
  }

  private void setStatus(String status) {
    dto.setStatus(status);
    retornoPOJO.setStatus(status);
  }

  private int getContador() {
    int quantidade = 0;
    for (TabelaPOJO tabelaPojo : dto.getTabelaPOJOs()) {
      if (tabelaPojo.isChecked()) {
        quantidade++;
      }
    }
    return quantidade;
  }

  private void zerarBarra1() {
    retornoPOJO.setProcessado1(0);
  }

  public static RetornoPOJO getRetornoPOJO() {
    return retornoPOJO;
  }

  public static TelaDTO getDto() {
    return dto;
  }

  public static void setDto(TelaDTO dto) {
    TabelaService.dto = dto;
  }

  public static void setRetornoPOJO(RetornoPOJO retornoPOJO) {
    TabelaService.retornoPOJO = retornoPOJO;
  }
}

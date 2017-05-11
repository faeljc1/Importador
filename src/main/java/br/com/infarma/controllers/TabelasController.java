package br.com.infarma.controllers;

import br.com.infarma.utils.TabelasEnum;
import br.com.infarma.models.dto.TelaDTO;
import br.com.infarma.models.pojo.RetornoPOJO;
import br.com.infarma.models.pojo.TabelaPOJO;
import br.com.infarma.services.TabelaService;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class TabelasController {

  @ResponseBody
  @RequestMapping("/api/tabelas/")
  public Response tabelas() {
    List<TabelaPOJO> tabelaPOJOs = new ArrayList<>();
    for (TabelasEnum tabela : Arrays.asList(TabelasEnum.values())) {
      tabelaPOJOs.add(new TabelaPOJO(tabela.name(), tabela.getDescricao(), tabela, false));
    }
    return Response.ok(tabelaPOJOs).build();
  }

  @MessageMapping("/tabelas")
  @SendTo("/topic/limpa_dados_e_processa")
  public RetornoPOJO limpaDadosProcessa(TelaDTO dto) throws InterruptedException {
    TabelaService.setDto(dto);
    if (dto.getMensagemQueVeioDaRequest() != null && dto.getStatus().equalsIgnoreCase("Iniciando") &&
        dto.getMensagemQueVeioDaRequest().equalsIgnoreCase("")) {
      TabelaService.getRetornoPOJO().setMensagem("");
    }
    return TabelaService.getRetornoPOJO();
  }
}

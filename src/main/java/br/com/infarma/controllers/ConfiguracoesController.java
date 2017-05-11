package br.com.infarma.controllers;

import br.com.infarma.models.Configuracao;
import br.com.infarma.utils.Conexao;
import br.com.infarma.utils.ConfiguracoesProperties;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;

@RestController
@RequestMapping("/api/config")
public class ConfiguracoesController {

  @ResponseBody
  @RequestMapping("/bancos")
  public Response bancos() {
    return Response.ok(ConfiguracoesProperties.getInstance().getConfiguracao()).build();
  }

  @ResponseBody
  @RequestMapping(value = "/testar_salvar/{banco}", method = RequestMethod.POST)
  public Response testarSalvar(@RequestBody Configuracao configuracoes, @PathVariable String banco) {
    ConfiguracoesProperties.getInstance().setConfiguracao(configuracoes);

    try {
      if (banco.equalsIgnoreCase("ORIGEM")) {
        Conexao.getInstance().testaConnOrigem(configuracoes);
        return Response.ok("Teste de Conexão do Banco Origem Concluído com Sucesso!").build();
      } else {
        Conexao.getInstance().testaConnDestino(configuracoes);
        return Response.ok("Teste de Conexão do Banco Destino Concluído com Sucesso!").build();
      }
    } catch (Exception e) {
      return Response.status(Response.Status.NOT_MODIFIED).entity("Falha na conexão!!\n" + e.getMessage()).build();
    }
  }
}

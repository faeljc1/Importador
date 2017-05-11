var app = angular.module('infarma-app', ['ui.bootstrap', 'ngWebSocket', 'ngNotify']);

app.controller('infarmaCtrl', function ($scope, $http, LimpaProcessaService, ngNotify) {

    $scope.tela = {
        processado1: 0,
        totalDeRegiistros1: 100,
        processado2: 0,
        totalDeRegiistros2: 100,
        status: ""
    };

    /*$scope.onExit = function () {
        $http.get("/api/fechar").success(function (response) {
            $scope.config = response.entity;
        });
        return ('bye bye');
    };

    $window.onbeforeunload = $scope.onExit;*/

    $scope.progressBarRegistros = false;
    $scope.progressBarTabelas = false;

    /**
     * Configuracoes
     */
    $http.get("/api/config/bancos").success(function (response) {
        $scope.config = response.entity;
    });

    /**
     * Tabelas
     */
    $http.get("/api/tabelas/").success(function (response) {
        $scope.tabelas = response.entity;
    });

    $scope.seleciona = function (tabela) {
        for (var i = 0; i <= $scope.tabelas.length; i++) {
            var value = $scope.tabelas[i];
            if (angular.equals(tabela.codigo, value.codigo)) {
                value.checked = !tabela.checked;
                break;
            }
        }
    };

    $scope.isSelecionadoProcessa = function (tabelas) {
        return tabelas.some(function (tabela) {
            return tabela.checked;
        });
    };

    $scope.isSelecionadoLimpaDados = function (tabelas) {
        return tabelas.some(function (tabela) {
            return tabela.checked && tabela.codigo != "SCRIPT";
        });
    };

    /**
     * Testa e Salva
     * @param botao
     */
    $scope.testaSalva = function (botao) {
        $http.post("/api/config/testar_salvar/" + botao, $scope.config).success(function (response) {
            alert(response.entity);
        });
    };

    $scope.limpaDados = function () {
        $scope.progressBarRegistros = true;
        $scope.progressBarTabelas = true;
        $scope.tipo = "LimpaDados";
        $scope.tela.status = "Iniciando";
        $scope.mensagem = "";
        $scope.isProcessando = true;
        checaBackEnd();
    };

    $scope.processa = function () {
        $scope.progressBarRegistros = true;
        $scope.progressBarTabelas = true;
        $scope.tipo = "Processa";
        $scope.tela.status = "Iniciando";
        $scope.mensagem = "";
        $scope.isProcessando = true;
        checaBackEnd();
    };
    /**
     *
     */
    function checaBackEnd() {
        if ($scope.progressBarTabelas || $scope.progressBarRegistros) {
            LimpaProcessaService.send($scope.config, $scope.tabelas, $scope.tipo, $scope.tela.status, $scope.mensagem);
        }
    }

    LimpaProcessaService.receive().then(null, null, function (retorno) {
        montaRetorno(retorno);

        if (retorno.mensagem != null && retorno.mensagem != "") {
            $scope.mensagem = retorno.mensagem;
            $scope.isProcessando = false;
            ngNotify.set(retorno.mensagem, {
                position: 'top',
                sticky: true
            });
        } else {
            // Enquanto o backEnd nao mandar parar, rode o checaBackEnd
            checaBackEnd();
        }
    });

    function montaRetorno(retorno) {
        $scope.tela.processado1 = retorno.processado1;
        $scope.tela.totalDeRegiistros1 = retorno.totalDeRegiistros1;
        $scope.tela.processado2 = retorno.processado2;
        $scope.tela.totalDeRegiistros2 = retorno.totalDeRegiistros2;
        if (retorno.status != null) {
            $scope.tela.status = retorno.status;
        }
    }
});

/**
 *
 */
app.service("LimpaProcessaService", function ($q, $timeout) {

    var service = {}, listener = $q.defer(), socket = {
        client: null,
        stomp: null
    };

    service.RECONNECT_TIMEOUT = 30000;
    service.SOCKET_URL = "/tabelas";
    service.CHAT_TOPIC = "/topic/limpa_dados_e_processa";
    service.CHAT_BROKER = "/app/tabelas";

    service.receive = function () {
        return listener.promise;
    };

    service.send = function (configuracao, tabelas, tipo, status, mensagem) {
        socket.stomp.send(service.CHAT_BROKER, {
            priority: 9
        }, JSON.stringify({
            configuracao: configuracao,
            tabelaPOJOs: tabelas,
            tipo: tipo,
            status: status,
            mensagemQueVeioDaRequest: mensagem
        }));
    };

    var reconnect = function () {
        $timeout(function () {
            initialize();
        }, this.RECONNECT_TIMEOUT);
    };

    var getMessage = function (data) {
        return JSON.parse(data);
    };

    var startListener = function () {
        socket.stomp.subscribe(service.CHAT_TOPIC, function (data) {
            listener.notify(getMessage(data.body));
        });
    };

    var initialize = function () {
        socket.client = new SockJS(service.SOCKET_URL);
        socket.stomp = Stomp.over(socket.client);
        socket.stomp.connect({}, startListener);
        socket.stomp.onclose = reconnect;
    };

    initialize();
    return service;
});
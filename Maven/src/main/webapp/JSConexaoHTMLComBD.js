(function () {

    var aplicacao = angular.module("aplicacao", []);

    aplicacao.WebServerController("ControladorAlunos", ["$http", function ($http) {
            this.aluno = {};
            this.enviar = function () {
                //...$http.post()//como inserir usando o $
            };
        }]);
})();



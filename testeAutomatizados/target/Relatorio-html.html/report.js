$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CadastrarUsuario.feature");
formatter.feature({
  "name": "Cadastrar usuario",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@cadastrarUsuario"
    }
  ]
});
formatter.scenario({
  "name": "CT002 - Validar o erro de nome completo obrigatório ao clicar no campo nome completo e logo apos fora dele",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@cadastrarUsuario"
    },
    {
      "name": "@ST001_CT002_Erro_Nome_Completo_Obrigatorio"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario clique no botao de cadastre se",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroSteps.queOUsuarioCliqueNoBotaoDeCadastreSe()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no campo Nome Completo",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroSteps.clicarNoCampoNomeCompleto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar fora do campo Nome",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroSteps.clicarForaDoCampoNome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema do cadastro deve retornar um erro de nome completo obrigatorio",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastroSteps.oSistemaDoCadastroDeveRetornarUmErroDeNomeCompletoObrigatorio()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});
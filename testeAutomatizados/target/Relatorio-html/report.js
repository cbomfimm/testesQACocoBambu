$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Fazer Login",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@ST002_CT000_Login_Usuario"
    }
  ]
});
formatter.scenario({
  "name": "CT001 - Validar o erro de email obrigatorio ao clicar no campo email e logo apos fora dele",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ST002_CT000_Login_Usuario"
    },
    {
      "name": "@ST002_CT001_Erro_Email_Obrigatorio"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario estiver na tela de login do app",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.queOUsuarioEstiverNaTelaDeLoginDoApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no campo email na tela de login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoCampoEmailNaTelaDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar fora do campo na tela de login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarForaDoCampoNaTelaDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema do login deve apresentar o erro de email obrigatorio",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaDoLoginDeveApresentarOErroDeEmailObrigatorio()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "CT002 - Validar o erro de email invalido ao clicar no campo email e logo apos fora dele",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ST002_CT000_Login_Usuario"
    },
    {
      "name": "@ST002_CT002_Erro_Email_Invalido"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario estiver na tela de login do app",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.queOUsuarioEstiverNaTelaDeLoginDoApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o campo email sem arroba na tela de login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarOCampoEmailSemArrobaNaTelaDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema do login deve apresentar o erro de email invalido",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaDoLoginDeveApresentarOErroDeEmailInvalido()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "CT003 - Validar o erro de senha obrigatoria ao clicar no campo senha e logo apos fora dele",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ST002_CT000_Login_Usuario"
    },
    {
      "name": "@ST002_CT003_Erro_Senha_Obrigatoria"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario estiver na tela de login do app",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.queOUsuarioEstiverNaTelaDeLoginDoApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no campo senha na tela de login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoCampoSenhaNaTelaDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar fora do campo na tela de login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarForaDoCampoNaTelaDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema do login deve apresentar o erro de senha obrigatoria",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaDoLoginDeveApresentarOErroDeSenhaObrigatoria()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "CT004 - Validar o erro de senha deve conter ao menos seis caracteres ao clicar no campo senha e logo apos fora dele",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ST002_CT000_Login_Usuario"
    },
    {
      "name": "@ST002_CT004_Erro_Senha_Deve_Conter_Seis_Caracteres"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario estiver na tela de login do app",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.queOUsuarioEstiverNaTelaDeLoginDoApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o campo senha com menos de seis caracteres na tela de login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarOCampoSenhaComMenosDeSeisCaracteresNaTelaDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema do login deve apresentar o erro de senha deve conter ao menos seis caracteres",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaDoLoginDeveApresentarOErroDeSenhaDeveConterAoMenosSeisCaracteres()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "CT005 - Validar que o login seja concluido",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ST002_CT000_Login_Usuario"
    },
    {
      "name": "@ST002_CT005_Efetuar_Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario estiver na tela de login do app",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.queOUsuarioEstiverNaTelaDeLoginDoApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar um email ja cadastrado na tela de login do app",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarUmEmailJaCadastradoNaTelaDeLoginDoApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar uma senha ja cadastrada na tela de login do app",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarUmaSenhaJaCadastradaNaTelaDeLoginDoApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao entrar",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoBotaoEntrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario deve conseguir fazer login",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oUsuarioDeveConseguirFazerLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "CT006 - Validar a janela que aparece quando clica no botao de resetar senha",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ST002_CT000_Login_Usuario"
    },
    {
      "name": "@ST002_CT006_Validar_Janela_Recuperar_Senha"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario estiver na tela de login do app",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.queOUsuarioEstiverNaTelaDeLoginDoApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao de resetar senha na tela de login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoBotaoDeResetarSenhaNaTelaDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a janela de recuperar senha deve aparecer",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.aJanelaDeRecuperarSenhaDeveAparecer()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "CT007 - Validar o botao de recuperar a recuperacao de senha ao pressiona-lo",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ST002_CT000_Login_Usuario"
    },
    {
      "name": "@ST002_CT007_Validar_Botao_Recuperar_Janela_Recuperar_Senha"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario estiver na tela de recuperar senha",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.queOUsuarioEstiverNaTelaDeRecuperarSenha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir um email aleatorio na recuperacao de senha",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.inserirUmEmailAleatorioNaRecuperacaoDeSenha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao de recuperar na janela de recuperar senha",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoBotaoDeRecuperarNaJanelaDeRecuperarSenha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a janela contendo a informacao que o email foi enviado caso o email exista deve aparecer",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.aJanelaContendoAInformacaoQueOEmailFoiEnviadoCasoOEmailExistaDeveAparecer()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png", null);
formatter.after({
  "status": "passed"
});
});
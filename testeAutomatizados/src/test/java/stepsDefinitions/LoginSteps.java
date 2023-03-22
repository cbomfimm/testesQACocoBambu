package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import static utils.Utils.*;
import pageObjects.LoginPage;

public class LoginSteps {

	LoginPage login = new LoginPage(driver);

	@Dado("que o usuario estiver na tela de login do app")
	public void queOUsuarioEstiverNaTelaDeLoginDoApp() throws Exception {
		login.validarTelaLogin();
	}

	@Dado("clicar no campo email na tela de login")
	public void clicarNoCampoEmailNaTelaDeLogin() {
		login.clicarCampoEmailLogin();
	}

	@Dado("clicar fora do campo na tela de login")
	public void clicarForaDoCampoNaTelaDeLogin() {
		login.clicarForaDoCampo();
	}

	@Dado("informar o campo email sem arroba na tela de login")
	public void informarOCampoEmailSemArrobaNaTelaDeLogin() {
		login.inserirEmailInvalidoLogin();
	}

	@Dado("clicar no campo senha na tela de login")
	public void clicarNoCampoSenhaNaTelaDeLogin() {
		login.clicarCampoSenhaLogin();
	}

	@Dado("informar o campo senha com menos de seis caracteres na tela de login")
	public void informarOCampoSenhaComMenosDeSeisCaracteresNaTelaDeLogin() {
		login.inserirMenosDeSeisCaracteresSenhaLogin();
	}
	
	@Dado("informar um email ja cadastrado na tela de login do app")
	public void informarUmEmailJaCadastradoNaTelaDeLoginDoApp() {
	    login.inserirEmailJaCadastradoLogin();
	}

	@Dado("informar uma senha ja cadastrada na tela de login do app")
	public void informarUmaSenhaJaCadastradaNaTelaDeLoginDoApp() {
	    login.inserirSenhaJaCadastradaLogin();
	}

	@Dado("clicar no botao entrar")
	public void clicarNoBotaoEntrar() {
	    login.clicarBotaoEntrarLogin();
	}
	
	@Dado("clicar no botao de resetar senha na tela de login")
	public void clicarNoBotaoDeResetarSenhaNaTelaDeLogin() {
	    login.clicarBotaoResetarSenha();
	}
	
	@Dado("que o usuario estiver na tela de recuperar senha")
	public void queOUsuarioEstiverNaTelaDeRecuperarSenha() throws Exception {
		login.clicarBotaoResetarSenha();
		esperarPagina(1);
	    login.validarJanelaResetarSenhaAberta();
	}

	@Dado("clicar no botao de cancelar na janela de recuperar senha")
	public void clicarNoBotaoDeCancelarNaJanelaDeRecuperarSenha() {
	    login.clicarBotaoCancelarRecuperacaoDeSenha();
	}
	
	@Dado("inserir um email aleatorio na recuperacao de senha")
	public void inserirUmEmailAleatorioNaRecuperacaoDeSenha() {
	    login.inserirEmailRecuperarSenha();
	}

	@Dado("clicar no botao de recuperar na janela de recuperar senha")
	public void clicarNoBotaoDeRecuperarNaJanelaDeRecuperarSenha() {
	    login.clicarBotaoecuperarRecuperacaoDeSenha();
	}

	@Entao("a janela contendo a informacao que o email foi enviado caso o email exista deve aparecer")
	public void aJanelaContendoAInformacaoQueOEmailFoiEnviadoCasoOEmailExistaDeveAparecer() {
	    login.validarEmailRecuperacaoDeSenhaEnviado();
	}


	@Entao("a janela de recuperar senha deve ser fechada")
	public void aJanelaDeRecuperarSenhaDeveSerFechada() throws Exception {
	    login.validarJanelaResetarSenhaFechada();
	}


	@Entao("a janela de recuperar senha deve aparecer")
	public void aJanelaDeRecuperarSenhaDeveAparecer() {
	    login.validarJanelaResetarSenhaAberta();
	}

	@Entao("o usuario deve conseguir fazer login")
	public void oUsuarioDeveConseguirFazerLogin() {
	    login.validarLoginConcluido();
	}

	@Entao("o sistema do login deve apresentar o erro de senha deve conter ao menos seis caracteres")
	public void oSistemaDoLoginDeveApresentarOErroDeSenhaDeveConterAoMenosSeisCaracteres() {
		login.validarErroSenhaMenorQueSeisCaracteresLogin();
	}

	@Entao("o sistema do login deve apresentar o erro de senha obrigatoria")
	public void oSistemaDoLoginDeveApresentarOErroDeSenhaObrigatoria() throws Exception {
		login.validarErroSenhaObrigatoriaLogin();
	}

	@Entao("o sistema do login deve apresentar o erro de email invalido")
	public void oSistemaDoLoginDeveApresentarOErroDeEmailInvalido() throws Exception {
		login.validarErroEmailInvalidoLogin();
	}

	@Entao("o sistema do login deve apresentar o erro de email obrigatorio")
	public void oSistemaDoLoginDeveApresentarOErroDeEmailObrigatorio() throws Exception {
		login.validarErroEmailObrigatorioLogin();
	}

}

package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.CadastroPage;
import static utils.Utils.*;

public class CadastroSteps {

	CadastroPage cadastro = new CadastroPage(driver);

	@Dado("que o usuario clique no botao de cadastre se")
	public void queOUsuarioCliqueNoBotaoDeCadastreSe() throws Exception {
		cadastro.acionarBotaoCadastreSe();
	}

	@Dado("clicar no campo Nome Completo")
	public void clicarNoCampoNomeCompleto() throws Exception {
		cadastro.clicarCampoNomeCompleto();
	}

	@Dado("clicar fora do campo Nome")
	public void clicarForaDoCampoNome() {
		cadastro.clicarTituloCadastreSe();
	}
	
	@Dado("clicar fora do campo email")
	public void clicarForaDoCampoEmail() {
		cadastro.clicarTituloCadastreSe();
	}

	@Dado("inserir apenas um caractere no campo Nome Completo")
	public void inserirApenasUmCaractereNoCampoNomeCompleto() {
		cadastro.inputInserirCaractereCampoNomeCompleto();
	}
	
	@Dado("inserir apenas o primeiro nome no campo Nome Completo")
	public void inserirApenasOPrimeiroNomeNoCampoNomeCompleto() {
	    cadastro.inserirPrimeiroNomeCampoNomeCompleto();
	}
	
	@Dado("inserir apenas o primeiro nome seguido de um numero no campo Nome Completo")
	public void inserirApenasOPrimeiroNomeSeguidoDeUmNumeroNoCampoNomeCompleto() {
	    cadastro.inserirNomeSeguidoDeNumeroCampoNomeCompleto();
	}
	
	@Dado("clicar no campo email da tela de cadastro")
	public void clicarNoCampoEmailDaTelaDeCadastro() throws Exception {
	    cadastro.clicarNoCampoEmailCadastro();
	}
	
	@Dado("inserir algum valor sem arroba no campo email da tela de cadastro")
	public void inserirAlgumValorSemArrobaNoCampoEmailDaTelaDeCadastro() {
	    cadastro.inserirCampoEmailCadastralSemArroba();
	}
	
	@Dado("clicar no campo senha na tela de cadastro")
	public void clicarNoCampoSenhaNaTelaDeCadastro() throws Exception {
		cadastro.clicarCampoSenhaCadastro();
	}

	@Dado("clicar fora do campo Senha")
	public void clicarForaDoCampoSenha() {
		cadastro.clicarTituloCadastreSe();
	}
	
	@Dado("informar o campo senha com apenas um digito na tela de cadastro")
	public void informarOCampoSenhaComApenasUmDigitoNaTelaDeCadastro() {
	    cadastro.inserirUmCaractereSenhaCadastro();
	}
	
	@Dado("informar o campo senha com um caractere especial um numero e a copia do nome completo")
	public void informarOCampoSenhaComUmCaractereEspecialUmNumeroEACopiaDoNomeCompleto() throws Exception {
		cadastro.inserirCampoNomeCompletoNomeESobrenome();
	    cadastro.inserirCampoSenhaMuitoSimilarAosDadosPessoais();
	}
	
	@Dado("informar o campo senha com seis caracteres minusculos")
	public void informarOCampoSenhaComSeisCaracteresMinusculos() {
	    cadastro.inserirSeisCaracteresMinusculosSenhaCadastro();
	}
	
	@Dado("informar o campo senha com seis caracteres maiusculos")
	public void informarOCampoSenhaComSeisCaracteresMaiusculos() {
	    cadastro.inserirSeisCaracteresMaiusculosSenhaCadastro();
	}
	
	@Dado("informar o campo senha aleatória contendo mais de seis digitos maiusculos e minusculos e ao menos um numero")
	public void informarOCampoSenhaAleatóriaContendoMaisDeSeisDigitosMaiusculosEMinusculosEAoMenosUmNumero() {
	    cadastro.inserirSeisCaracteresComNumerosAleatoriosSenhaCadastro();
	}
	
	@Dado("informar o campo senha aleatória contendo mais de seis digitos maiusculos e minusculos e ao menos um caractere especial")
	public void informarOCampoSenhaAleatóriaContendoMaisDeSeisDigitosMaiusculosEMinusculosEAoMenosUmCaractereEspecial() {
	    cadastro.inserirSeisCaracteresComCaractereEspecialAleatoriosSenhaCadastro();
	}
	
	@Dado("clicar no campo confirmar senha na tela de cadastro")
	public void clicarNoCampoConfirmarSenhaNaTelaDeCadastro() {
	    cadastro.clicarCampoConfirmarSenhaCadastro();
	}

	@Dado("clicar fora do campo confirmar senha")
	public void clicarForaDoCampoConfirmarSenha() {
	    cadastro.clicarTituloCadastreSe();
	}
	
	@Dado("informar o campo senha com uma senha valida aleatoria")
	public void informarOCampoSenhaComUmaSenhaValidaAleatoria() {
	    cadastro.inserirSenhaCadastroValidaAleatoria();
	}

	@Dado("informar o campo confirmacao de senha com um valor diferente da senha")
	public void informarOCampoConfirmacaoDeSenhaComUmValorDiferenteDaSenha() {
	    cadastro.inserirConfirmacaoSenhaCadastroAleatoria();
	}
	
	@Dado("clicar no select de estados")
	public void clicarNoSelectDeEstados() throws Exception {
	    cadastro.clicarBotaoSelectEstadosCadastro();
	}

	@Dado("selecionar um estado aleatorio")
	public void selecionarUmEstadoAleatorio() throws Exception {
		cadastro.selecionarEstadosAleatorios();
	}
	
	@Dado("selecionar em cancelar na selecao de estados")
	public void selecionarEmCancelarNaSelecaoDeEstados() {
	    cadastro.clicarBotaoCancelarSelecaoEstados();
	}
	
	@Dado("informar o campo Nome Completo")
	public void informarOCampoNomeCompleto() {
	    cadastro.inserirCampoNomeCompletoNomeESobrenome();
	}

	@Dado("informar o campo email na tela de cadastro")
	public void informarOCampoEmailNaTelaDeCadastro() {
	    cadastro.inserirCampoEmailCadastral();
	}

	@Dado("informar a senha na tela de cadastro")
	public void informarASenhaNaTelaDeCadastro() {
	    cadastro.inserirSenhaCadastroValida();
	}

	@Dado("informar a confirmacao de senha na tela de cadastro")
	public void informarAConfirmacaoDeSenhaNaTelaDeCadastro() {
	    cadastro.inserirConfirmacaoSenhaCadastroValida();
	}

	@Dado("selecionar o estado de cadastro")
	public void selecionarOEstadoDeCadastro() throws Exception {
		cadastro.clicarBotaoSelectEstadosCadastro();
		esperarPagina(1);
	    cadastro.selecionarEstadosAleatorios();
	}

	@Dado("selecionar a caixa de notificacoes personalisadas")
	public void selecionarACaixaDeNotificacoesPersonalisadas() {
	    cadastro.clicarCheckboxNotificacoesPersonalizadas();
	}

	@Dado("selecionar a caixa de termos e condicoes de uso")
	public void selecionarACaixaDeTermosECondicoesDeUso() throws Exception {
	    cadastro.clicarCheckboxTermosECondicoesDeUso();
	    esperarPagina(1);
	    cadastro.clicarBotaoAceitarTermosECondicoesDeUso();	    
	}

	@Dado("clicar no botao cadastrar")
	public void clicarNoBotaoCadastrar() throws Exception {
		esperarPagina(1);
	    cadastro.clicarBotaoCadastrar();
	}

	@Entao("a tela de confirmacao de codigo de email deve ser apresentada")
	public void aTelaDeConfirmacaoDeCodigoDeEmailDeveSerApresentada() {
	    cadastro.validarTelaCodigoEnviadoCadastro();
	}


	@Entao("o sistema do cadastro deve retornar o erro de estado e obrigatorio")
	public void oSistemaDoCadastroDeveRetornarOErroDeEstadoEObrigatorio() throws Exception {
	    cadastro.validarErroEstadoObrigatorio();
	}

	@Entao("o estado aleatorio selecionado deve aparecer no campo")
	public void oEstadoAleatorioSelecionadoDeveAparecerNoCampo() throws Exception {
		cadastro.validarEstadoSelecionado();
	}

	@Entao("o sistema do cadastro deve retornar o erro de as senhas inseridas sao diferentes")
	public void oSistemaDoCadastroDeveRetornarOErroDeAsSenhasInseridasSaoDiferentes() throws Exception {
	    cadastro.validarErroSenhasInseridasDiferentes();
	}

	@Entao("o sistema do cadastro deve retornar o erro de confirmacao de senha obrigatoria")
	public void oSistemaDoCadastroDeveRetornarOErroDeConfirmacaoDeSenhaObrigatoria() throws Exception {
	    cadastro.validarErroConfirmacaoDeSenhaObrigatoria();
	}

	@Entao("o sistema do cadastro deve retornar o erro de senha deve conter um caractere numero")
	public void oSistemaDoCadastroDeveRetornarOErroDeSenhaDeveConterUmCaractereNumero() throws Exception {
	    cadastro.validarErroSenhaDeveConterNumero();
	}


	@Entao("o sistema do cadastro deve retornar o erro de senha deve conter um caractere especial")
	public void oSistemaDoCadastroDeveRetornarOErroDeSenhaDeveConterUmCaractereEspecial() throws Exception {
	    cadastro.validarErroSenhaDeveConterCaractereEspecial();
	}

	@Entao("o sistema do cadastro deve retornar o erro de senha deve conter um caractere minusculo")
	public void oSistemaDoCadastroDeveRetornarOErroDeSenhaDeveConterUmCaractereMinusculo() throws Exception {
	    cadastro.validarErroSenhaDeveConterCaractereMinusculo();
	}

	@Entao("o sistema do cadastro deve retornar o erro de senha deve conter um caractere maiusculo")
	public void oSistemaDoCadastroDeveRetornarOErroDeSenhaDeveConterUmCaractereMaiusculo() throws Exception {
	    cadastro.validarErroSenhaDeveConterCaractereMaiusculo();
	}

	@Entao("o sistema do cadastro deve retornar o erro de senha muito similar aos dados pessoais")
	public void oSistemaDoCadastroDeveRetornarOErroDeSenhaMuitoSimilarAosDadosPessoais() throws Exception {
	    cadastro.validarErroSenhaMuitoSimilarAosDados();
	}

	@Entao("o sistema do cadastro deve retornar o erro de senha deve conter ao menos seis caracteres")
	public void oSistemaDoCadastroDeveRetornarOErroDeSenhaDeveConterAoMenosSeisCaracteres() throws Exception {
	    cadastro.validarErroSenhaDeveConterSeisCaracteres();
	}


	@Entao("o sistema do cadastro deve retornar o erro de senha obrigatoria")
	public void oSistemaDoCadastroDeveRetornarOErroDeSenhaObrigatoria() throws Exception {
	    cadastro.validarErroSenhaObrigatoria();
	}

	@Entao("o sistema do cadastro deve retornar o erro de email invalido")
	public void oSistemaDoCadastroDeveRetornarOErroDeEmailInvalido() throws Exception {
	    cadastro.validarErroEmailCadastralInvalido();
	}

	@Entao("o sistema do cadastro deve retornar o erro de email obrigatorio")
	public void oSistemaDoCadastroDeveRetornarOErroDeEmailObrigatorio() throws Exception {
	    cadastro.validarErroEmailObrigatorio();
	}
	
	@Entao("o sistema do cadastro deve retornar o erro de nome possui caracteres invalidos")
	public void oSistemaDoCadastroDeveRetornarOErroDeNomePossuiCaracteresInvalidos() throws Exception {
	    cadastro.validarErroNomeCaracteresInvalidos();
	}

	@Entao("o sistema do cadastro deve retornar o erro de digite seu nome completo")
	public void oSistemaDoCadastroDeveRetornarOErroDeDigiteSeuNomeCompleto() throws Exception {
	    cadastro.validarErroDigiteNomeCompleto();
	}

	@Entao("o sistema do cadastro deve retornar o erro de nome deve conter mais de dois caracteres")
	public void oSistemaDoCadastroDeveRetornarOErroDeNomeDeveConterMaisDeDoisCaracteres() throws Exception {
		cadastro.validarErroNomeDeveConterMaisDe2Caracteres();
	}

	@Entao("o sistema do cadastro deve retornar um erro de nome completo obrigatorio")
	public void oSistemaDoCadastroDeveRetornarUmErroDeNomeCompletoObrigatorio() throws Exception {
		cadastro.validarErroNomeCompletoObrigatorio();
	}

	@Entao("a tela de cadastro deve ser apresentada")
	public void aTelaDeCadastroDeveSerApresentada() {
		cadastro.validarTelaCadastro();
	}

}

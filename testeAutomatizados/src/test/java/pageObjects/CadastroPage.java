package pageObjects;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CadastroPage {
	protected WebDriver driver;

	public CadastroPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//---------------------------------------------------OUTROS METODOS---------------------------------------------------\\
	
	String nome = gerarNomeAleatorio() + " " + gerarSobrenomeAleatorio();
	String senha = gerarCaractereEspecialAleatorio() + gerarSenhaDeCaracteresAleatoria() + gerarNumeroAleatorio();
	Integer numeroEstado = gerarEstadosAleatorios();
	WebElement selectEstadosCadastro;
	WebElement estadoSelecionado;

//---------------------------------------------------INPUT/CAMPOS---------------------------------------------------\\
	@FindBy(xpath = "//input[contains(@placeholder,'Nome completo')]")
	private WebElement inputNomeCompleto;

	@FindBy(xpath = "//div[contains(@class,'modal-overlay-container')]//input[contains(@placeholder,'E-mail')]")
	private WebElement inputEmailCadastro;

	@FindBy(xpath = "//div[contains(@class,'modal-overlay-container')]//input[contains(@placeholder,'Senha')]")
	private WebElement inputSenhaCadastro;

	@FindBy(xpath = "//input[contains(@name,'confirmPassword')]")
	private WebElement inputConfirmarSenhaCadastro;
//------------------------------------------------------BOTÕES------------------------------------------------------\\
	@FindBy(xpath = "//span[@class='link'][contains(.,'Cadastre-se')]")
	private WebElement btnCadastreSe;

	@FindBy(xpath = "//ion-select[@role='button']")
	private WebElement btnSelectEstadosCadastro;

	@FindBy(xpath = "//button[@type='button'][contains(.,'Cancel')]")
	private WebElement btnCancelarSelecaoEstados;
	
	@FindBy(xpath = "//ion-checkbox[contains(@formcontrolname,'customNotification')]")
	private WebElement checkboxNotificacoesPersonalizadas;

	@FindBy(xpath = "//ion-checkbox[contains(@formcontrolname,'termsAndConditions')]")
	private WebElement checkboxTermosECondicoesDeUso;
	
	@FindBy(xpath = "//button[@type='undefined'][contains(.,'ACEITAR')]")
	private WebElement btnAceitarTermosECondicoesDeUso;
	
	@FindBy(xpath = "//button[contains(.,'CADASTRAR')]")
	private WebElement btnCadastrar;

//-------------------------------------------------------ERROS-------------------------------------------------------\\

	@FindBy(xpath = "//span[@class='title ng-star-inserted'][contains(.,'Cadastre-se')]")
	private WebElement txtValidarTelaCadastro;

	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'Nome completo obrigatório.')]")
	private WebElement txtErroNomeCompletoObrigatorio;

	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'Nome completo deve conter mais de 2 caracteres.')]")
	private WebElement txtErroNomeDeveConterMaisDe2Caracteres;

	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'Digite seu nome completo.')]")
	private WebElement txtErroDigiteNomeCompleto;

	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'E-mail é obrigatório.')]")
	private WebElement txtErroEmailObrigatorio;

	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'Nome completo possui caracteres inválidos.')]")
	private WebElement txtErroNomeCaracteresInvalidos;

	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'E-mail inválido.')]")
	private WebElement txtErroEmailCadastralInvalido;

	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'Senha é obrigatória.')]")
	private WebElement txtErroSenhaObrigatoria;

	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'Senha deve conter no mínimo 6 caracteres.')]")
	private WebElement txtErroSenhaDeveConterSeisCaracteres;

	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'Sua senha é muito similar aos seus dados pessoais.')]")
	private WebElement txtErroSenhaMuitoSimilarAosDados;

	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'Sua senha deve conter no mínimo 1 caractere maiúsculo.')]")
	private WebElement txtErroSenhaDeveConterCaractereMaiusculo;

	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'Sua senha deve conter no mínimo 1 caractere minúsculo.')]")
	private WebElement txtErroSenhaDeveConterCaractereMinusculo;

	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'Sua senha deve conter no mínimo 1 caractere especial.')]")
	private WebElement txtErroSenhaDeveConterCaractereEspecial;

	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'Sua senha deve conter no mínimo 1 número.')]")
	private WebElement txtErroSenhaDeveConterNumero;

	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'Confirmação de senha é obrigatória.')]")
	private WebElement txtErroConfirmacaoDeSenhaObrigatoria;

	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'As senhas inseridas são diferentes.')]")
	private WebElement txtErroSenhasInseridasDiferentes;
	
	@FindBy(xpath = "//div[@class='error-message ng-star-inserted'][contains(.,'Estado é obrigatório.')]")
	private WebElement txtErroEstadoObrigatorio;
	
	@FindBy(xpath = "//h1[contains(.,'CÓDIGO ENVIADO')]")
	private WebElement txtValidarTelaCodigoEnviadoCadastro;

	// -------------------------------------------------------FUNÇÕES-------------------------------------------------------\\

	public void acionarBotaoCadastreSe() throws Exception {
		btnCadastreSe.click();
	}

	public void validarTelaCadastro() {
		assertTrue(txtValidarTelaCadastro.isDisplayed());
	}

	public void clicarCampoNomeCompleto() throws Exception {
		esperarPagina(1);
		inputNomeCompleto.click();
	}

	public void clicarTituloCadastreSe() {
		txtValidarTelaCadastro.click();
	}

	public void validarErroNomeCompletoObrigatorio() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroNomeCompletoObrigatorio.isDisplayed());
	}

	public void inputInserirCaractereCampoNomeCompleto() {
		inputNomeCompleto.sendKeys(gerarCaractereAleatorio());
	}

	public void validarErroNomeDeveConterMaisDe2Caracteres() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroNomeDeveConterMaisDe2Caracteres.isDisplayed());
	}

	public void validarErroDigiteNomeCompleto() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroDigiteNomeCompleto.isDisplayed());
	}

	public void inserirPrimeiroNomeCampoNomeCompleto() {
		inputNomeCompleto.sendKeys(gerarNomeAleatorio());
	}

	public void clicarNoCampoEmailCadastro() throws Exception {
		esperarPagina(1);
		inputEmailCadastro.click();
	}

	public void validarErroEmailObrigatorio() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroEmailObrigatorio.isDisplayed());
	}

	public void inserirNomeSeguidoDeNumeroCampoNomeCompleto() {
		inputNomeCompleto.sendKeys(gerarNomeEspacoNumeroAleatorio());
	}

	public void validarErroNomeCaracteresInvalidos() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroNomeCaracteresInvalidos.isDisplayed());
	}

	public void inserirCampoEmailCadastralSemArroba() {
		inputEmailCadastro.sendKeys(gerarNomeAleatorio());
	}

	public void validarErroEmailCadastralInvalido() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroEmailCadastralInvalido.isDisplayed());
	}

	public void clicarCampoSenhaCadastro() throws Exception {
		esperarPagina(1);
		inputSenhaCadastro.click();
	}

	public void validarErroSenhaObrigatoria() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroSenhaObrigatoria.isDisplayed());
	}

	public void inserirUmCaractereSenhaCadastro() {
		inputSenhaCadastro.sendKeys(gerarCaractereAleatorio());
	}

	public void validarErroSenhaDeveConterSeisCaracteres() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroSenhaDeveConterSeisCaracteres.isDisplayed());
	}

	public void inserirCampoNomeCompletoNomeESobrenome() {
		inputNomeCompleto.sendKeys(nome);
	}

	public void inserirCampoSenhaMuitoSimilarAosDadosPessoais() throws Exception {
		esperarPagina(1);
		inputSenhaCadastro.sendKeys(gerarCaractereEspecialAleatorio() + nome + gerarNumeroAleatorio());
	}

	public void validarErroSenhaMuitoSimilarAosDados() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroSenhaMuitoSimilarAosDados.isDisplayed());
	}

	public void inserirSeisCaracteresMinusculosSenhaCadastro() {
		inputSenhaCadastro.sendKeys(gerarSeisCaracteresMinusculosAleatorios());
	}

	public void validarErroSenhaDeveConterCaractereMaiusculo() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroSenhaDeveConterCaractereMaiusculo.isDisplayed());
	}

	public void inserirSeisCaracteresMaiusculosSenhaCadastro() {
		inputSenhaCadastro.sendKeys(gerarSeisCaracteresMaiusculosAleatorios());
	}

	public void validarErroSenhaDeveConterCaractereMinusculo() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroSenhaDeveConterCaractereMinusculo.isDisplayed());
	}

	public String senhaDeCaracteresComNumeroAleatoria() {
		String senhaAletoria = gerarSenhaDeCaracteresAleatoria() + gerarNumeroAleatorio();
		return senhaAletoria;
	}

	public void inserirSeisCaracteresComNumerosAleatoriosSenhaCadastro() {
		inputSenhaCadastro.sendKeys(senhaDeCaracteresComNumeroAleatoria());
	}

	public void validarErroSenhaDeveConterCaractereEspecial() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroSenhaDeveConterCaractereEspecial.isDisplayed());
	}

	public String senhaDeCaracteresComCaractereEspecialAleatoria() {
		String senhaAletoria = gerarCaractereEspecialAleatorio() + gerarSenhaDeCaracteresAleatoria();
		return senhaAletoria;
	}

	public void inserirSeisCaracteresComCaractereEspecialAleatoriosSenhaCadastro() {
		inputSenhaCadastro.sendKeys(senhaDeCaracteresComCaractereEspecialAleatoria());
	}

	public void validarErroSenhaDeveConterNumero() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroSenhaDeveConterNumero.isDisplayed());
	}

	public void clicarCampoConfirmarSenhaCadastro() {
		inputConfirmarSenhaCadastro.click();
	}

	public void validarErroConfirmacaoDeSenhaObrigatoria() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroConfirmacaoDeSenhaObrigatoria.isDisplayed());
	}

	public String senhaValidaAleatoria() {
		String senhaAletoria = gerarCaractereEspecialAleatorio() + gerarSenhaDeCaracteresAleatoria()
				+ gerarNumeroAleatorio();
		return senhaAletoria;
	}

	public void inserirSenhaCadastroValidaAleatoria() {
		inputSenhaCadastro.sendKeys(senhaValidaAleatoria());
	}

	public void inserirConfirmacaoSenhaCadastroAleatoria() {
		inputConfirmarSenhaCadastro.sendKeys(senhaValidaAleatoria());
	}

	public void validarErroSenhasInseridasDiferentes() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroSenhasInseridasDiferentes.isDisplayed());
	}

	public void clicarBotaoSelectEstadosCadastro() throws Exception {
		esperarPagina(1);
		btnSelectEstadosCadastro.click();
	}

	public void selecionarEstadosAleatorios() throws Exception {
		esperarPagina(2);
		selectEstadosCadastro = driver.findElement(By.xpath("//div[contains(@class,'action-sheet-group sc-ion-action-sheet-ios')]//button[" + numeroEstado + "]"));
		selectEstadosCadastro.click();
	}
	
	public void validarEstadoSelecionado() throws Exception {
		String text = selectEstadosCadastro.getText();
		estadoSelecionado = (driver.findElement(By.xpath("//ion-select[contains(@aria-label,'"+ text +"')]")));
		estadoSelecionado.isDisplayed();
	}
	
	public void clicarBotaoCancelarSelecaoEstados() {
		btnCancelarSelecaoEstados.click();
	}
	
	public void validarErroEstadoObrigatorio() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroEstadoObrigatorio.isDisplayed());
	}
	
	public void inserirCampoEmailCadastral() {
		inputEmailCadastro.sendKeys(gerarNomeAleatorio()+ "@outlook.com");
	}
	
	public void inserirSenhaCadastroValida() {
		inputSenhaCadastro.sendKeys(senha);

	}

	public void inserirConfirmacaoSenhaCadastroValida() {
		inputConfirmarSenhaCadastro.sendKeys(senha);
	}
	
	public void clicarCheckboxNotificacoesPersonalizadas() {
		checkboxNotificacoesPersonalizadas.click();
	}
	
	public void clicarCheckboxTermosECondicoesDeUso() {
		checkboxTermosECondicoesDeUso.click();
	}
	
	
	public void clicarBotaoAceitarTermosECondicoesDeUso() {
		btnAceitarTermosECondicoesDeUso.click();
	}
	
	public void clicarBotaoCadastrar() {
		btnCadastrar.click();
	}
	
	public void validarTelaCodigoEnviadoCadastro() {
		assertTrue(txtValidarTelaCodigoEnviadoCadastro.isDisplayed());
	}
	
	

}
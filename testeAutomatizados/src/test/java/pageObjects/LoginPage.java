package pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utils.Utils.*;

import java.util.NoSuchElementException;

public class LoginPage {
	protected WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//---------------------------------------------------OUTROS METODOS---------------------------------------------------\\

	String emailCadastrado = "cauatesteqa01@gmail.com";
	String senhaCadastrada = "!Teste01";

//---------------------------------------------------INPUT/CAMPOS---------------------------------------------------\\
	@FindBy(xpath = "//input[contains(@name,'username')]")
	private WebElement inputEmailLogin;

	@FindBy(xpath = "//input[contains(@name,'password')]")
	private WebElement inputSenhaLogin;
	
	@FindBy(xpath = "//input[contains(@type,'email')]")
	private WebElement inputEmailRecuperarSenha;

//------------------------------------------------------BOTÕES------------------------------------------------------\\
	@FindBy(xpath = "//span[contains(.,'ENTRAR')]")
	private WebElement btnEntrarLogin;
	
	@FindBy(xpath = "//span[contains(.,'Resetar senha')]")
	private WebElement btnResetarSenha;
	
	@FindBy(xpath = "//span[contains(.,'Cancelar')]")
	private WebElement btnCancelarRecuperacaoDeSenha;
	
	@FindBy(xpath = "//span[contains(.,'Recuperar')]")
	private WebElement btnRecuperarRecuperacaoDeSenha;

//-------------------------------------------------------ERROS/TITULOS-------------------------------------------------------\\
	@FindBy(xpath = "//p[contains(.,'Seja bem-vindo ao melhor restaurante do Brasil!')]")
	private WebElement txtTituloBemVindoLogin;

	@FindBy(xpath = "//div[contains(@class,'validation-errors')]//div[contains(.,'E-mail é obrigatório.')]")
	private WebElement txtErroEmailObrigatorioLogin;

	@FindBy(xpath = "//div[contains(@class,'validation-errors')]//div[contains(.,'E-mail inválido.')]")
	private WebElement txtErroEmailInvalidoLogin;

	@FindBy(xpath = "//div[contains(@class,'validation-errors')]//div[contains(.,'Senha é obrigatória.')]")
	private WebElement txtErroSenhaObrigatoriaLogin;

	@FindBy(xpath = "//div[contains(@class,'validation-errors')]//div[contains(.,'Senha deve conter no mínimo 6 caracteres.')]")
	private WebElement txtErroSenhaMenorQueSeisCaracteresLogin;
	
	@FindBy(xpath = "//h1[contains(.,'CÓDIGO ENVIADO')]")
	private WebElement txtValidarTelaCodigoEnviadoLogin;
	
	@FindBy(xpath = "//h2[contains(.,'Recuperar senha')]")
	private WebElement txtValidarTelaRecuperarSenha;
	
	@FindBy(xpath = "//body[contains(@class,'back')]")
	private WebElement txtValidarTelaRecuperarSenhaAberta;
	
	@FindBy(xpath = "//div[contains(.,'enviamos por e-mai')]")
	private WebElement txtValidarEmailRecuperacaoDeSenhaEnviado;

// -------------------------------------------------------FUNÇÕES-------------------------------------------------------\\
	public void validarTelaLogin() throws Exception {
		assertTrue(txtTituloBemVindoLogin.isDisplayed());
	}

	public void clicarCampoEmailLogin() {
		inputEmailLogin.click();
	}

	public void clicarForaDoCampo() {
		txtTituloBemVindoLogin.click();
	}

	public void validarErroEmailObrigatorioLogin() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroEmailObrigatorioLogin.isDisplayed());
	}

	public void inserirEmailInvalidoLogin() {
		inputEmailLogin.sendKeys(gerarNomeAleatorio());
	}

	public void validarErroEmailInvalidoLogin() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroEmailInvalidoLogin.isDisplayed());
	}

	public void clicarCampoSenhaLogin() {
		inputSenhaLogin.click();
	}

	public void validarErroSenhaObrigatoriaLogin() throws Exception {
		esperarPagina(1);
		assertTrue(txtErroSenhaObrigatoriaLogin.isDisplayed());
	}

	public void inserirMenosDeSeisCaracteresSenhaLogin() {
		inputSenhaLogin.sendKeys(gerarCaractereAleatorio());
	}

	public void validarErroSenhaMenorQueSeisCaracteresLogin() {
		assertTrue(txtErroSenhaMenorQueSeisCaracteresLogin.isDisplayed());
	}

	public void inserirEmailJaCadastradoLogin() {
		inputEmailLogin.sendKeys(emailCadastrado);
	}
	
	public void inserirSenhaJaCadastradaLogin() {
		inputSenhaLogin.sendKeys(senhaCadastrada);
	}
	
	public void clicarBotaoEntrarLogin() {
		btnEntrarLogin.click();
	}
	
	public void validarLoginConcluido() {
		assertTrue(txtValidarTelaCodigoEnviadoLogin.isDisplayed());
	}
	
	public void clicarBotaoResetarSenha() {
		btnResetarSenha.click();
	}
	
	public void validarJanelaResetarSenhaAberta() {
		assertTrue(txtValidarTelaRecuperarSenhaAberta.isDisplayed());
	}
	
	public boolean existe(){
	    try{
	        driver.findElement(By.xpath("//body[contains(@class,'back')]"));
	        return true;
	    }
	    catch(NoSuchElementException e){
	        return false;
	    }
	}
	
	public void validarJanelaResetarSenhaFechada() throws Exception {
		esperarPagina(1);
		if (existe()) {
			System.out.println("A janela está Aberta!");
		} else {
			System.out.println("A janela foi fechada!");
		}
		
	}
	
	public void clicarBotaoCancelarRecuperacaoDeSenha() {
		btnCancelarRecuperacaoDeSenha.click();
	}
	
	public void inserirEmailRecuperarSenha() {
		inputEmailRecuperarSenha.sendKeys(gerarNomeAleatorio() + "@email.com");
	}
	
	public void clicarBotaoecuperarRecuperacaoDeSenha() {
		btnRecuperarRecuperacaoDeSenha.click();
		
	}
	
	public void validarEmailRecuperacaoDeSenhaEnviado() {
		assertTrue(txtValidarEmailRecuperacaoDeSenhaEnviado.isDisplayed());
	}
	
	

}

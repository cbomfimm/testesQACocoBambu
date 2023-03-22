package stepsDefinitions;

import static utils.Utils.*;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUP() {
		acessarSistema();
	}

	@After
	public void tearDown(Scenario scenario) throws Exception {
		esperarPagina(2);
		capturarTela(scenario);
		System.out.println(
				"====================================" + scenario.getStatus() + "====================================");
		driver.close();
	}

	// Metodo que criei para tirar print da tela final do cenario e salvar na pasta target/reports no diretorio do projeto
	public static File capturarTela(Scenario scenario) throws InterruptedException {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
		File imagem = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imagem,
					(new File("./target/reports", scenario.getName() + " - " + scenario.getStatus() + ".png")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return imagem;
	}

}

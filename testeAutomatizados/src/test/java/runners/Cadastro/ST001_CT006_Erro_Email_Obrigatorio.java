package runners.Cadastro;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",
		"html:target/Relatorio-html"}, //Diretorio onde armazeno evidencias do ultimo cenario rodado, descrevendo todos os cenarios e contendo a imagem no resultado do teste
		features = "src/test/resources/features",
		glue = "stepsDefinitions",
		tags = "@ST001_CT006_Erro_Email_Obrigatorio",
		snippets = SnippetType.CAMELCASE,
		monochrome  = true,
		dryRun = false
		)


public class ST001_CT006_Erro_Email_Obrigatorio {
}

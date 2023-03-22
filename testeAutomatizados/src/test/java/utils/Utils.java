package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Utils {

	public static WebDriver driver;

	public static void acessarSistema() {
		System.setProperty("Webdrive.chrome.driver", "C:\\driver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://app.cocobambu.com/entrar");
	}

	public static void esperarPagina(int tempo) throws Exception {
		for (int i = 0; i < tempo; i++) {
			Thread.sleep(1000);
		}
	}

	public static String gerarCaractereEspecialAleatorio() {
		String[] a = { "!", "#", "$", "&" };
		List<String> listaCaracteresEspeciais = new ArrayList<String>();
		Random r = new Random();
		int i = r.nextInt(a.length);
		return a[i];
	}

	public static String gerarCaractereAleatorio() {
		String[] a = { "a", "b", "c", "d", "e", "f", "g" };
		List<String> listaCaracteres = new ArrayList<String>();
		Random r = new Random();
		int i = r.nextInt(a.length);
		return a[i];
	}

	public static String gerarNomeAleatorio() {
		String[] a = { "Caua", "Hugo", "Italo", "Reno", "Mercia", "Rafael", "Nathan", "Ana", "Beatriz", "Carlos", "Diego", "Eduarda", "Fernanda", "Gabriel", "Hugo", "Isabella", "João", "Kamila", "Leonardo", "Maria", "Natália", "Otávio", "Paulo", "Renata", "Samuel", "Talita", "Vinícius" };
		List<String> listaNomes = new ArrayList<String>();
		Random r = new Random();
		int i = r.nextInt(a.length);
		return a[i];
	}

	public static String gerarSobrenomeAleatorio() {
		String[] a = { "Martins", "Bomfim", "Silva", "Viana", "Souza", "Carvalho", "Trindade", "Alves", "Barbosa", "Cavalcante", "Dias", "Elias", "Ferreira", "Gonçalves", "Henrique", "Inácio", "Jesus", "Lima", "Melo", "Nunes", "Oliveira", "Pereira", "Queiroz", "Ramos", "Silva", "Teixeira", "Vieira" };
		List<String> listaSobrenomes = new ArrayList<String>();
		Random r = new Random();
		int i = r.nextInt(a.length);
		return a[i];
	}

	public static String gerarSenhaDeCaracteresAleatoria() {
		String[] a = { "gOmJhLkE", "dNiUfHtO", "qXrAsZpY", "aRtHjKlM", "cVxNfGhI", "bYnTmQsP", "eDfKlJiH", "zSxGpOwQ",
				"lMhYtRjU", "pQwEgNtB" };
		List<String> listaSenha = new ArrayList<String>();
		Random r = new Random();
		int i = r.nextInt(a.length);
		return a[i];
	}

	public static String gerarNomeEspacoNumeroAleatorio() {
		String[] a = { "Caua", "Hugo", "Italo", "Reno", "Mercia", "Rafael", "Nathan" };
		List<String> listaNumeros = new ArrayList<String>();
		Random r = new Random();
		int i = r.nextInt(a.length);
		for (int j = 0; j < 50; j++) {
			listaNumeros.add(Integer.toString(j));
		}
		int j = r.nextInt(listaNumeros.size());
		return a[i] + " " + j;

	}

	public static String gerarNumeroAleatorio() {
		String[] a = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		List<String> listaNumero = new ArrayList<String>();
		Random r = new Random();
		int i = r.nextInt(a.length);
		return a[i];
	}

	public static String gerarSeisCaracteresMinusculosAleatorios() {
		String[] a = { "aaaaaa", "bbbbbb", "cccccc", "dddddd", "eeeeee", "ffffff", "gggggg" };
		List<String> listaNomes = new ArrayList<String>();
		Random r = new Random();
		int i = r.nextInt(a.length);
		return a[i];
	}

	public static String gerarSeisCaracteresMaiusculosAleatorios() {
		String str = gerarSeisCaracteresMinusculosAleatorios();
		String strUpperCase = str.toUpperCase();
		return strUpperCase;
	}

	public static Integer gerarEstadosAleatorios() {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27 };
		List<String> listaNumeroDeEstados = new ArrayList<String>();
		Random r = new Random();
		int i = r.nextInt(a.length);
		return a[i];
	}
}

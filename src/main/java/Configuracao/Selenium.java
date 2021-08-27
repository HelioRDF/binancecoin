package Configuracao;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Tempo;

public class Selenium {

	public static WebDriver configWebDriver(String link) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(900, 900));
		driver.get(link);
		Tempo.aguardarEmSegundos(false, 10, null);
		return driver;
	}

	public static void fechar(WebDriver driver) {
		driver.close();
		driver.quit();
		Tempo.aguardarEmSegundos(false, 300, null);

	}

}

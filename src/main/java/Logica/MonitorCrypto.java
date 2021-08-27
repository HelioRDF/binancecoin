package Logica;

import java.math.BigDecimal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MonitorCrypto {

	public static String capturarValor(WebDriver driver) {
		WebElement valor = driver.findElement(By.className("showPrice"));
		return valor.getText();
	}

	public static BigDecimal respostaEmBigDecimal(WebDriver driver) {
		String texto = capturarValor(driver);
		return new BigDecimal(texto.replace(",", ""));
	}

}

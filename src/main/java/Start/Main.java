package start;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;

import configuracao.Selenium;
import controlador.AxsControle;
import controlador.BnbControle;
import controlador.BtcControle;
import controlador.EthControle;
import controlador.LtcControle;
import controlador.MboxControle;
import controlador.RvnControle;
import controlador.ShibControle;
import controlador.SlpControle;
import logica.MonitorCrypto;
import modelo.Axs;
import modelo.Bnb;
import modelo.Btc;
import modelo.Eth;
import modelo.Ltc;
import modelo.Mbox;
import modelo.Rvn;
import modelo.Shib;
import modelo.Slp;
import util.Tempo;

public class Main {/*
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				String link = "https://www.binance.com/pt-BR/trade/BTC_BRL?theme=dark&type=spot";

				boolean loop = true;

				while (loop) {
					WebDriver driver = Selenium.configWebDriver(link);
					Btc btc = new Btc();
					BtcControle btcControl = new BtcControle();
					BigDecimal valorAtual = MonitorCrypto.respostaEmBigDecimal(driver);
					btc = new Btc(valorAtual, LocalDateTime.now());
					btcControl.salvar(btc);
					Selenium.fechar(driver);

				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				String link = "https://www.binance.com/pt-BR/trade/ETH_BRL?theme=dark&type=spot";
				boolean loop = true;

				while (loop) {
					WebDriver driver = Selenium.configWebDriver(link);
					Eth eth = new Eth();
					EthControle ethControl = new EthControle();
					BigDecimal valorAtual = MonitorCrypto.respostaEmBigDecimal(driver);
					eth = new Eth(valorAtual, LocalDateTime.now());
					ethControl.salvar(eth);
					Selenium.fechar(driver);
				}

			}
		});

		Thread t3 = new Thread(new Runnable() {
			public void run() {
				String link = "https://www.binance.com/pt-BR/trade/AXS_BRL?theme=dark&type=spot";
				boolean loop = true;

				while (loop) {
					WebDriver driver = Selenium.configWebDriver(link);
					Axs axs = new Axs();
					AxsControle axsControl = new AxsControle();
					BigDecimal valorAtual = MonitorCrypto.respostaEmBigDecimal(driver);
					axs = new Axs(valorAtual, LocalDateTime.now());
					axsControl.salvar(axs);
					Selenium.fechar(driver);
				}
			}
		});

		Thread t4 = new Thread(new Runnable() {
			public void run() {
				String link = "https://www.binance.com/pt-BR/trade/ltc_BRL?theme=light&type=spot";
				boolean loop = true;

				while (loop) {
					WebDriver driver = Selenium.configWebDriver(link);
					Ltc ltc = new Ltc();
					LtcControle ltcControl = new LtcControle();
					BigDecimal valorAtual = MonitorCrypto.respostaEmBigDecimal(driver);
					ltc = new Ltc(valorAtual, LocalDateTime.now());
					ltcControl.salvar(ltc);
					Selenium.fechar(driver);
				}
			}
		});

		Thread t5 = new Thread(new Runnable() {
			public void run() {
				String link = "https://www.binance.com/pt-BR/trade/BNB_BRL?theme=light&type=spot";
				boolean loop = true;

				while (loop) {
					WebDriver driver = Selenium.configWebDriver(link);
					Bnb bnb = new Bnb();
					BnbControle bnbControl = new BnbControle();
					BigDecimal valorAtual = MonitorCrypto.respostaEmBigDecimal(driver);
					bnb = new Bnb(valorAtual, LocalDateTime.now());
					bnbControl.salvar(bnb);
					Selenium.fechar(driver);
				}
			}
		});

		Thread t6 = new Thread(new Runnable() {
			public void run() {
				String link = "https://www.binance.com/pt-BR/trade/SHIB_BRL?theme=light&type=spot";
				boolean loop = true;

				while (loop) {
					WebDriver driver = Selenium.configWebDriver(link);
					Shib shib = new Shib();
					ShibControle shibControl = new ShibControle();
					String valorAtual = MonitorCrypto.capturarValor(driver);
					shib = new Shib(valorAtual, LocalDateTime.now());
					shibControl.salvar(shib);
					Selenium.fechar(driver);
				}
			}
		});

		Thread t7 = new Thread(new Runnable() {
			public void run() {
				String link = "https://www.binance.com/pt-BR/trade/RVN_BTC?theme=light&type=spot";
				boolean loop = true;

				while (loop) {
					WebDriver driver = Selenium.configWebDriver(link);
					Rvn rvn = new Rvn();
					RvnControle rvnControl = new RvnControle();
					String valorAtual = MonitorCrypto.capturarValor(driver);
					rvn = new Rvn(valorAtual, LocalDateTime.now());
					rvnControl.salvar(rvn);
					Selenium.fechar(driver);
				}
			}
		});

		Thread t8 = new Thread(new Runnable() {
			public void run() {
				String link = "https://www.binance.com/pt-BR/trade/SLP_ETH?theme=light&type=spot";
				boolean loop = true;

				while (loop) {
					WebDriver driver = Selenium.configWebDriver(link);
					Slp slp = new Slp();
					SlpControle slpControl = new SlpControle();
					String valorAtual = MonitorCrypto.capturarValor(driver);
					slp = new Slp(valorAtual, LocalDateTime.now());
					slpControl.salvar(slp);
					Selenium.fechar(driver);
				}
			}
		});

		Thread t9 = new Thread(new Runnable() {
			public void run() {
				String link = "https://www.binance.com/pt-BR/trade/MBOX_BTC?theme=dark&type=spot";
				boolean loop = true;

				while (loop) {
					WebDriver driver = Selenium.configWebDriver(link);
					Mbox mbox = new Mbox();
					MboxControle mboxControl = new MboxControle();
					String valorAtual = MonitorCrypto.capturarValor(driver);
					mbox = new Mbox(valorAtual, LocalDateTime.now());
					mboxControl.salvar(mbox);
					Selenium.fechar(driver, 90);
				}
			}
		});

		t1.start();
		Tempo.aguardarEmSegundos(false, 15, null);
		t2.start();
		Tempo.aguardarEmSegundos(false, 15, null);
		t3.start();
		Tempo.aguardarEmSegundos(false, 15, null);
		t4.start();
		Tempo.aguardarEmSegundos(false, 15, null);
		t5.start();
		Tempo.aguardarEmSegundos(false, 15, null);
		t6.start();
		Tempo.aguardarEmSegundos(false, 15, null);
		t7.start();
		Tempo.aguardarEmSegundos(false, 15, null);
		t8.start();
		Tempo.aguardarEmSegundos(false, 15, null);
		t9.start();
	}*/
}

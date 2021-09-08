package start;

import api.Binance;
import controlador.CryptoControle;
import modelo_v2.Crypto;
import util.Tempo;

public class MainApi {

	public static void main(String[] args) {
		monitorar();

//        String variavelDeAmbiente = System.getenv("key");
//        System.out.println(variavelDeAmbiente);
	}

	public static void monitorar() {
		while (true) {
			String moedas[] = { "BTCBRL", "ETHBRL", "HBARBTC", "DOGEBRL", "MATICBRL", "XLMBTC", "DOTBRL", "LTCBRL",
					"SLPETH", "SOLBRL", "AXSBRL", "RVNBTC", "BNBBRL", "ADABRL", "SHIBBRL" };
			for (String obj : moedas) {

				Crypto moeda = Binance.infoCoin(obj);
				moeda.setHora(moeda.getHora());
				moeda.setData(moeda.getData());
				CryptoControle controle = new CryptoControle();
				controle.salvar(moeda);
				System.out.println(moeda.toString());
			}
			Tempo.aguardarEmSegundos(false, 60, null);
		}
	}
}

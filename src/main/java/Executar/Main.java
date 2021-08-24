package Executar;

import java.time.LocalDateTime;

import controlador.BtcControle;
import modelo.Btc;

public class Main {

	public static void main(String[] args) {

		Btc btc = new Btc(22222, LocalDateTime.now());
		BtcControle controle = new BtcControle();
		controle.salvar(btc);

		/*
		 * CoinControle controle= new CoinControle();
		 * List<Coin>lista=controle.listarTodos(); for (Coin coin : lista) {
		 * System.out.println(coin.getMoeda()); }
		 */

	}
}

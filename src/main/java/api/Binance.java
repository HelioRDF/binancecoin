package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import modelo_v2.Crypto;

public class Binance {

	public static Crypto infoCoin(String uri) {
		try {
			String url = "https://api.binance.com/api/v3/ticker/24hr?symbol=" + uri;
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				System.out.println("Erro " + conn.getResponseCode() + " ao obter dados da URL " + url);
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output = "";
			String line;
			while ((line = br.readLine()) != null) {
				output += line;
			}

			conn.disconnect();

			Gson gson = new Gson();
			Crypto dados = gson.fromJson(new String(output.getBytes()), Crypto.class);

			return dados;

		} catch (IOException ex) {
			System.out.println("Erro na classe binance");
			return null;
		}

	}

}

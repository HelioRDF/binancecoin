package modelo_v2;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Crypto")
public class Crypto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "tipo")
	private String symbol;

	@Column(name = "salto")
	private String priceChange;

	@Column(name = "porcetagem")
	private String priceChangePercent;

	@Column(name = "media")
	private String weightedAvgPrice;

	@Column(name = "valor")
	private String lastPrice;

	@Column(name = "alta")
	private String highPrice;

	@Column(name = "baixa")
	private String lowPrice;

	@Column
	LocalDate data;

	@Column
	LocalTime hora;

	/*
	 * Getter and Setter
	 * -----------------------------------------------------------------------------
	 */

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return the priceChange
	 */
	public String getPriceChange() {
		return priceChange;
	}

	/**
	 * @param priceChange the priceChange to set
	 */
	public void setPriceChange(String priceChange) {
		this.priceChange = priceChange;
	}

	/**
	 * @return the priceChangePercent
	 */
	public String getPriceChangePercent() {
		return priceChangePercent;
	}

	/**
	 * @param priceChangePercent the priceChangePercent to set
	 */
	public void setPriceChangePercent(String priceChangePercent) {
		this.priceChangePercent = priceChangePercent;
	}

	/**
	 * @return the weightedAvgPrice
	 */
	public String getWeightedAvgPrice() {
		return weightedAvgPrice;
	}

	/**
	 * @param weightedAvgPrice the weightedAvgPrice to set
	 */
	public void setWeightedAvgPrice(String weightedAvgPrice) {
		this.weightedAvgPrice = weightedAvgPrice;
	}

	/**
	 * @return the lastPrice
	 */
	public String getLastPrice() {
		return lastPrice;
	}

	/**
	 * @param lastPrice the lastPrice to set
	 */
	public void setLastPrice(String lastPrice) {
		this.lastPrice = lastPrice;
	}

	/**
	 * @return the highPrice
	 */
	public String getHighPrice() {
		return highPrice;
	}

	/**
	 * @param highPrice the highPrice to set
	 */
	public void setHighPrice(String highPrice) {
		this.highPrice = highPrice;
	}

	/**
	 * @return the lowPrice
	 */
	public String getLowPrice() {
		return lowPrice;
	}

	/**
	 * @param lowPrice the lowPrice to set
	 */
	public void setLowPrice(String lowPrice) {
		this.lowPrice = lowPrice;
	}

	/**
	 * @return the data
	 */
	public LocalDate getData() {
		data = LocalDate.now();
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(LocalDate data) {
		this.data = data;
	}

	/**
	 * @return the hora
	 */
	public LocalTime getHora() {
		hora = LocalTime.now();
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	/*
	 * toString
	 * -----------------------------------------------------------------------------
	 */

	@Override
	public String toString() {
		return "Crypto [id=" + id + ", symbol=" + symbol + ", priceChange=" + priceChange + ", priceChangePercent="
				+ priceChangePercent + ", weightedAvgPrice=" + weightedAvgPrice + ", lastPrice=" + lastPrice
				+ ", highPrice=" + highPrice + ", lowPrice=" + lowPrice + ", data=" + data + ", hora=" + hora + "]";
	}

}
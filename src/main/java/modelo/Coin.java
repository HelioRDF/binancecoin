package modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Coin {

	private int id;
	private BigDecimal valor;
	LocalDateTime registro;

	public Coin() {
	}

	public Coin(BigDecimal valor, LocalDateTime registro) {
		this.valor = valor;
		this.registro = registro;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	/**
	 * @return the registro
	 */
	public LocalDateTime getRegistro() {
		return registro;
	}

	/**
	 * @param registro the registro to set
	 */
	public void setRegistro(LocalDateTime registro) {
		this.registro = registro;
	}

}

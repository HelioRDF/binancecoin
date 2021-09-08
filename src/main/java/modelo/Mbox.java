package modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mbox")
public class Mbox extends Coin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String valorMboxBtc;

	@Column
	LocalDateTime registro;

	public Mbox() {
		super();
	}

	public Mbox(String valorMboxBtc, LocalDateTime registro) {
		super();
		this.valorMboxBtc = valorMboxBtc;
		this.registro = registro;
	}

	/**
	 * @return the valorMboxBtc
	 */
	public String getValorMboxBtc() {
		return valorMboxBtc;
	}

	/**
	 * @param valorMboxBtc the valorMboxBtc to set
	 */
	public void setValorMboxBtc(String valorMboxBtc) {
		this.valorMboxBtc = valorMboxBtc;
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

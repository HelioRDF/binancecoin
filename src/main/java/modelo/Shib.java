package modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Shiba_Inu")
public class Shib extends Coin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	String valorShibBrl;

	@Column
	LocalDateTime registro;

	public Shib() {
		super();
	}

	public Shib(String valorShibBrl, LocalDateTime registro) {
		super();
		this.valorShibBrl = valorShibBrl;
		this.registro = registro;
	}

	/**
	 * @return the valorShibBrl
	 */
	public String getValorShibBrl() {
		return valorShibBrl;
	}

	/**
	 * @param valorShibBrl the valorShibBrl to set
	 */
	public void setValorShibBrl(String valorShibBrl) {
		this.valorShibBrl = valorShibBrl;
	}



}

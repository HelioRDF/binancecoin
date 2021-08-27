package modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Raven_Coin")
public class Rvn extends Coin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String valorRvnBtc;

	@Column
	LocalDateTime registro;

	public Rvn() {
		super();
	}

	public Rvn(String valorRvnBtc, LocalDateTime registro) {
		super();
		this.valorRvnBtc = valorRvnBtc;
		this.registro = registro;
	}

	/**
	 * @return the valorRvnBtc
	 */
	public String getValorRvnBtc() {
		return valorRvnBtc;
	}

	/**
	 * @param valorRvnBtc the valorRvnBtc to set
	 */
	public void setValorRvnBtc(String valorRvnBtc) {
		this.valorRvnBtc = valorRvnBtc;
	}

}

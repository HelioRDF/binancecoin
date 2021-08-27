package modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = " Smooth_Love_Potion")
public class Slp extends Coin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String valorSlpEth;

	@Column
	LocalDateTime registro;

	public Slp() {
		super();
	}

	public Slp(String valorSlpEth, LocalDateTime registro) {
		super();
		this.valorSlpEth = valorSlpEth;
		this.registro = registro;
	}

	/**
	 * @return the valorSlpEth
	 */
	public String getValorSlpEth() {
		return valorSlpEth;
	}

	/**
	 * @param valorSlpEth the valorSlpEth to set
	 */
	public void setValorSlpEth(String valorSlpEth) {
		this.valorSlpEth = valorSlpEth;
	}

}

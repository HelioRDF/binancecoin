package modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BitCoin")
public class Btc extends Coin{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private BigDecimal valor;

	@Column
	LocalDateTime registro;

	public Btc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Btc(BigDecimal valor, LocalDateTime registro) {
		super();
		this.valor = valor;
		this.registro = registro;
	}
	

}

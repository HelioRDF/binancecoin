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
@Table(name = "Lite_Coin")
public class Ltc extends Coin{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private BigDecimal valor;

	@Column
	LocalDateTime registro;

	public Ltc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ltc(BigDecimal valor, LocalDateTime registro) {
		super();
		this.valor = valor;
		this.registro = registro;
	}

}

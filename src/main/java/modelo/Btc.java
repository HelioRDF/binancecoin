package modelo;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Btc")
public class Btc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private int valor;
	
	@Column
	LocalDateTime registro;
	
	
		
	public Btc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Btc(int valor, LocalDateTime registro) {
		super();
		this.valor = valor;
		this.registro = registro;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	

	
	
}

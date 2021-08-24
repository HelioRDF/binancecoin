package controlador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Coin;

public class CoinControle {

	EntityManagerFactory entityManagerFactory;
	EntityManager entityManager;

	public CoinControle() {
		entityManagerFactory = Persistence.createEntityManagerFactory("binancecoin");
		entityManager = entityManagerFactory.createEntityManager();
	}

	public void salvar(Coin _coin) {
		entityManager.getTransaction().begin();
		entityManager.merge(_coin);
		entityManager.getTransaction().commit();
		entityManagerFactory.close();

	}

	public void remover(Coin _coin) {
		entityManager.getTransaction().begin();
		entityManager.remove(_coin);
		entityManager.getTransaction().commit();
		entityManagerFactory.close();

	}

	public List<Coin> listarTodos() {
		entityManager.getTransaction().begin();
		Query consulta = entityManager.createQuery("Select coin from Coin coin");
		@SuppressWarnings("unchecked")
		List<Coin> resultList = consulta.getResultList();
		List<Coin> clientes = resultList;
		entityManager.getTransaction().commit();
		entityManagerFactory.close();
		return clientes;

	}
}

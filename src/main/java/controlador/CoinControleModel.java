package controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Coin;

public  class CoinControleModel {

	EntityManagerFactory entityManagerFactory;
	EntityManager entityManager;

	public CoinControleModel() {
		entityManagerFactory = Persistence.createEntityManagerFactory("binancecoin");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public void converteSalvar(Coin _coin1, Coin _coin2) {
		entityManager.getTransaction().begin();
		entityManager.merge(_coin2);
		entityManager.getTransaction().commit();
		entityManagerFactory.close();

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
	/*
	 * public List<Btc> listarTodos() { entityManager.getTransaction().begin();
	 * Query consulta = entityManager.createQuery("Select btc from Btc btc");
	 * 
	 * @SuppressWarnings("unchecked") List<Btc> resultList =
	 * consulta.getResultList(); List<Btc> valores = resultList;
	 * entityManager.getTransaction().commit(); entityManagerFactory.close(); return
	 * valores;
	 * 
	 * }
	 */
}

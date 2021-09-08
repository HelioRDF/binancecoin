package controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo_v2.Crypto;

public  class CryptoControle {

	EntityManagerFactory entityManagerFactory;
	EntityManager entityManager;

	public CryptoControle() {
		entityManagerFactory = Persistence.createEntityManagerFactory("binancecoin");
		entityManager = entityManagerFactory.createEntityManager();
	}


	public void salvar(Crypto _coin) {
		entityManager.getTransaction().begin();
		entityManager.merge(_coin);
		entityManager.getTransaction().commit();
		entityManagerFactory.close();

	}

	public void remover(Crypto _coin) {
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

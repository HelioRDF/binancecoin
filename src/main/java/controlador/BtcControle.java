package controlador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Btc;

public class BtcControle {

	EntityManagerFactory entityManagerFactory;
	EntityManager entityManager;

	public BtcControle() {
		entityManagerFactory = Persistence.createEntityManagerFactory("binancecoin");
		entityManager = entityManagerFactory.createEntityManager();
	}

	public void salvar(Btc _btc) {
		entityManager.getTransaction().begin();
		entityManager.merge(_btc);
		entityManager.getTransaction().commit();
		entityManagerFactory.close();

	}

	public void remover(Btc _btc) {
		entityManager.getTransaction().begin();
		entityManager.remove(_btc);
		entityManager.getTransaction().commit();
		entityManagerFactory.close();

	}

	public List<Btc> listarTodos() {
		entityManager.getTransaction().begin();
		Query consulta = entityManager.createQuery("Select btc from Btc btc");
		@SuppressWarnings("unchecked")
		List<Btc> resultList = consulta.getResultList();
		List<Btc> valores = resultList;
		entityManager.getTransaction().commit();
		entityManagerFactory.close();
		return valores;

	}
}

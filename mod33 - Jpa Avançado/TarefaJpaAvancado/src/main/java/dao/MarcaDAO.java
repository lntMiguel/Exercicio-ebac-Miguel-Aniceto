package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import models.Marca;

public class MarcaDAO implements IMarcaDAO {

	@Override
	public Marca cadastrar(Marca marca) {
		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory("TarefaJpaAvancado");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(marca);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		return marca;
	}

	@Override
	public void excluir(Marca marca) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("TarefaJpaAvancado");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		marca = entityManager.merge(marca);
		entityManager.remove(marca);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();

	}

	@Override
	public Marca atualizar(Marca marca) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("TarefaJpaAvancado");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		marca = entityManager.merge(marca);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		return marca;
	}

	@Override
	public Marca busca(int id) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("TarefaJpaAvancado");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		Marca marca = entityManager.find(Marca.class, id);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		return marca;
	}

	@Override
	public List<Marca> buscarTodos() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("TarefaJpaAvancado");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		List<Marca> list = 
				entityManager.createQuery("SELECT m FROM Marca m", Marca.class).getResultList();      
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		return list;
	}

}

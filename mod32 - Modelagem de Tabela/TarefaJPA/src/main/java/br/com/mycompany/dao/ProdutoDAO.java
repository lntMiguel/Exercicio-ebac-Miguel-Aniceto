package br.com.mycompany.dao;

import java.util.List;

import br.com.mycompany.models.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class ProdutoDAO implements IProdutoDao {

	@Override
	public Produto cadastrar(Produto produto) {
		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory("TarefaJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(produto);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		return produto;
	}

	@Override
	public void excluir(Produto produto) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("TarefaJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		produto = entityManager.merge(produto);
		entityManager.remove(produto);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
	}

	@Override
	public Produto atualizar(Produto produto) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("TarefaJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		produto = entityManager.merge(produto);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		return produto;
	}

	@Override
	public Produto busca(int id) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("TarefaJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		Produto produto = entityManager.find(Produto.class, id);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		return produto;
	}

	@Override
	public List<Produto> buscarTodos() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("TarefaJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		List<Produto> list = 
				entityManager.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();      
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		return list;
	}

}

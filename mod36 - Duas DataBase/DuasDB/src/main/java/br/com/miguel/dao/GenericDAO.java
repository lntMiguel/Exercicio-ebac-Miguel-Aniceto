package br.com.miguel.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import br.com.miguel.models.Persistente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GenericDAO <T extends Persistente, E extends Serializable> implements IGenericDAO<T, E> {

	private static final String PERSISTENCE_UNIT_NAME = "Postgre";
	
	protected EntityManagerFactory entityManagerFactory;
	
	protected EntityManager entityManager;
	
	private Class<T> persistenteClass;
	
	private String persistenceUnitName;
	
	public GenericDAO(Class<T> persistenteClass, String persistenceUnitName) {
		this.persistenteClass = persistenteClass;
		this.persistenceUnitName = persistenceUnitName;
	}
	
	@Override
	public T cadastrar(T entity) {
		openConnection();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		closeConnection();
		return entity;
	}

	@Override
	public void excluir(T entity) {
		openConnection();
		entity = entityManager.merge(entity);
		entityManager.remove(entity);
		entityManager.getTransaction().commit();
		closeConnection();
	}

	@Override
	public T alterar(T entity)  {
		openConnection();
		entity = entityManager.merge(entity);
		entityManager.getTransaction().commit();
		closeConnection();
		return entity;
	}

	@Override
	public T consultar(E valor)  {
		openConnection();
		T entity = entityManager.find(this.persistenteClass, valor);
		entityManager.getTransaction().commit();
		closeConnection();
		return entity;
	}

	@Override
	public Collection<T> buscarTodos()  {
		openConnection();
		List<T> list = 
				entityManager.createQuery(getSelectSql(), this.persistenteClass).getResultList();
		closeConnection();
		return list;
	}
	
	protected void openConnection() {
		entityManagerFactory = 
				Persistence.createEntityManagerFactory(getPersistenceUnitName());
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
	}
	
	protected void closeConnection() {
		entityManager.close();
		entityManagerFactory.close();
	}
	
	private String getSelectSql() {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT obj FROM ");
		sb.append(this.persistenteClass.getSimpleName());
		sb.append(" obj");
		return sb.toString();
	}
	
	private String getPersistenceUnitName() {
		if (persistenceUnitName != null 
				&& !"".equals(persistenceUnitName)) {
			return persistenceUnitName;
		} else {
			return PERSISTENCE_UNIT_NAME;
		}
	}
}

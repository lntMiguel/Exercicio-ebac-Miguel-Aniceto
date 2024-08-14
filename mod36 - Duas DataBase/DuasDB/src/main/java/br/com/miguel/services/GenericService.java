package br.com.miguel.services;

import java.io.Serializable;
import java.util.Collection;

import br.com.miguel.dao.IGenericDAO;
import br.com.miguel.models.Persistente;



public class GenericService <T extends Persistente, E extends Serializable> implements IGenericService <T, E>  {

	protected IGenericDAO<T, E> dao;
		
		public GenericService(IGenericDAO<T, E> dao) {
			this.dao = dao;
		}
		
		public T cadastrar(T entity) {
			return this.dao.cadastrar(entity);
		}
	
		public void excluir(T entity)  {
			this.dao.excluir(entity);
		}
	
		
		public T alterar(T entity)  {
			return this.dao.alterar(entity);
		}
	
		
		public T consultar(E valor)   {
			return this.dao.consultar(valor);
		}
	
		
		public Collection<T> buscarTodos()  {
			return this.dao.buscarTodos();
		}
}

package br.com.miguel.dao;

import java.io.Serializable;
import java.util.Collection;

import br.com.miguel.models.Persistente;

public interface IGenericDAO<T extends Persistente, E extends Serializable> {

	public T cadastrar(T entity);

	public void excluir(T entity);

	public T alterar(T entity);

	public T consultar(E id);

	public Collection<T> buscarTodos();
}

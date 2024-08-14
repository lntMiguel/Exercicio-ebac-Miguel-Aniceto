package br.com.miguel.services;

import java.io.Serializable;
import java.util.Collection;

import br.com.miguel.models.Persistente;




public interface IGenericService<T extends Persistente, E extends Serializable> {

	public T cadastrar(T entity);

	public void excluir(T entity);

	public T alterar(T entity);

	public T consultar(E valor);

	public Collection<T> buscarTodos();
}

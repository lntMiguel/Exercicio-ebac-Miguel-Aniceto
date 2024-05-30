package br.com.mycompany.dao;

import br.com.mycompany.generic.models.ICarroPersistente;

public interface IGenericDAO <T extends ICarroPersistente> {
	
	public Boolean cadastrar(T entity);
	
 }

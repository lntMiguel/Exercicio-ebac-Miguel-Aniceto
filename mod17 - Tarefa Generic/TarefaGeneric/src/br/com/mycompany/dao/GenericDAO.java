package br.com.mycompany.dao;

import java.util.HashMap;
import java.util.Map;


import br.com.mycompany.generic.models.ICarroPersistente;

public abstract class GenericDAO<T extends ICarroPersistente> implements IGenericDAO<T>{
	
	protected Map<Class, Map<String, T>>mapaCarro;

	public GenericDAO() {
		
		this.mapaCarro = new HashMap<>();
		Map<String, T> mapaInterno = this.mapaCarro.get(getTipoCarro());
		if(mapaInterno == null) {
			mapaInterno = new HashMap<>();
			this.mapaCarro.put(getTipoCarro(), mapaInterno);
		}
	}

	public abstract Class<T> getTipoCarro();
	
	@Override
	public Boolean cadastrar(T entity) {
		Map<String, T> mapaInterno = this.mapaCarro.get(getTipoCarro());
		if(mapaInterno.containsKey(entity.buscarPlaca())) {
			return false;
		}
		mapaInterno.put(entity.buscarPlaca(), entity);
		return true;
	}


}

package br.com.miguel.dao;

import br.com.miguel.models.Persistente;

public interface IClienteDAO <T extends Persistente> extends IGenericDAO<T, Long>{

}

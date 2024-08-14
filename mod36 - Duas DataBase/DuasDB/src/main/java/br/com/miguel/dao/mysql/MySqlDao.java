package br.com.miguel.dao.mysql;

import java.io.Serializable;

import br.com.miguel.dao.GenericDAO;
import br.com.miguel.models.Persistente;

public class MySqlDao <T extends Persistente, E extends Serializable> extends GenericDAO<T, E> {

	public MySqlDao(Class<T> persistenteClass) {
		super(persistenteClass, "MySql");
	}
	
	

}

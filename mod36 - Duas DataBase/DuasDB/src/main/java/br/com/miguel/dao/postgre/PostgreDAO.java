package br.com.miguel.dao.postgre;

import java.io.Serializable;

import br.com.miguel.dao.GenericDAO;
import br.com.miguel.models.Persistente;

public class PostgreDAO <T extends Persistente, E extends Serializable> extends GenericDAO<T, E>  {

	public PostgreDAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre");
	}
}

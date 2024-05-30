package br.com.mycompany.dao;

import java.util.Collection;



import br.com.mycompany.generic.models.Ferrari;

public class FerrariMapDAO extends GenericDAO<Ferrari> implements IFerrariDAO {

	public FerrariMapDAO() {
		super();
		
	}

	@Override
	public Class<Ferrari> getTipoCarro() {
		// TODO Auto-generated method stub
		return Ferrari.class;
	}


	
}

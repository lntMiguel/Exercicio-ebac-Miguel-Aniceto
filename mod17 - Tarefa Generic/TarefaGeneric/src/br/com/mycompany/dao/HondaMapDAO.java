package br.com.mycompany.dao;


import br.com.mycompany.generic.models.Honda;

public class HondaMapDAO extends GenericDAO<Honda> implements IHondaDAO {

	public HondaMapDAO() {
		super();
	}

	@Override
	public Class<Honda> getTipoCarro() {
		// TODO Auto-generated method stub
		return Honda.class;
	}



}

package br.com.miguel.dao.mysql;

import br.com.miguel.dao.IClienteDAO;
import br.com.miguel.models.ClienteMySql;

public class ClienteMySqlDAO extends MySqlDao<ClienteMySql, Long> implements IClienteDAO<ClienteMySql>{

	public ClienteMySqlDAO() {
		super(ClienteMySql.class);
	}

	
}

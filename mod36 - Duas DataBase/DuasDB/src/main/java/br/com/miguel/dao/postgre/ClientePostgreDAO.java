package br.com.miguel.dao.postgre;

import br.com.miguel.dao.IClienteDAO;
import br.com.miguel.models.ClientePostgre;

public class ClientePostgreDAO  extends PostgreDAO<ClientePostgre, Long> implements IClienteDAO<ClientePostgre> {

	public ClientePostgreDAO() {
		super(ClientePostgre.class);
	}

	
}

package dao;

import dao.generic.GenericDAO;
import models.Cliente;

public class ClienteDAO  extends GenericDAO<Cliente, Long> implements IClienteDAO{

	public ClienteDAO() {
		super(Cliente.class);
	}
	
}

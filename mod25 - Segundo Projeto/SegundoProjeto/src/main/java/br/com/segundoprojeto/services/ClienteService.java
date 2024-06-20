package br.com.segundoprojeto.services;

import br.com.segundoprojeto.dao.IClienteDAO;
import br.com.segundoprojeto.domain.Cliente;
import br.com.segundoprojeto.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
		
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}

}
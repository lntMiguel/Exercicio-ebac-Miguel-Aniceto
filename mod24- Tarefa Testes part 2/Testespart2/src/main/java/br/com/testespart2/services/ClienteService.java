package br.com.testespart2.services;

import br.com.testespart2.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

	public ClienteService(IClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}

	public boolean salvar() {
        return clienteDao.salvar();
	}
	
	public boolean excluir() {
        return clienteDao.excluir();
	}
	
	public boolean buscar() {
        return clienteDao.buscar();
	}
	
	public boolean atualizar() {
        return clienteDao.atualizar();
	}

}

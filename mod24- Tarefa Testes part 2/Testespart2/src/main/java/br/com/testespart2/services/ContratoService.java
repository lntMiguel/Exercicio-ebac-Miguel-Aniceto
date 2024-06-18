package br.com.testespart2.services;

import br.com.testespart2.dao.IContratoDao;

public class ContratoService {

	private IContratoDao contratoDao;

	public ContratoService(IContratoDao contratoDao) {
		this.contratoDao = contratoDao;
	}

	public boolean salvar() {
        return contratoDao.salvar();
	}
	
	public boolean excluir() {
        return contratoDao.excluir();
	}
	
	public boolean buscar() {
        return contratoDao.buscar();
	}
	
	public boolean atualizar() {
        return contratoDao.atualizar();
	}
}

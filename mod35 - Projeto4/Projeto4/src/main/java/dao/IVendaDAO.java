package dao;

import dao.generic.IGenericDAO;
import exceptions.DAOException;
import exceptions.TipoChaveNaoEncontradaException;
import models.Venda;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {

public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public Venda consultarComCollection(Long id);
}

package services;

import domain.Cliente;
import exceptions.DAOException;
import services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, String> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(String cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
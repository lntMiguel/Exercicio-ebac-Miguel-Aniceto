package dao;

import java.util.List;

import models.Cliente;

public interface IClienteDAO {
	public Integer cadastrar(Cliente cliente) throws Exception;
	
	public Integer exlcuir(String codigo) throws Exception;
	
	public Integer atualizar(Cliente cliente) throws Exception;
	
	public Cliente consultar(String codigo) throws Exception;
	
	public List<Cliente> buscarTodos() throws Exception;
}

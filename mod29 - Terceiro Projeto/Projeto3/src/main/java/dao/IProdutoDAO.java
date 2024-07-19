package dao;

import java.util.List;

import models.Produto;

public interface IProdutoDAO {
	
	public Integer cadastrar(Produto produto) throws Exception;
	
	public Integer exlcuir(String codigo) throws Exception;
	
	public Integer atualizar(Produto produto) throws Exception;
	
	public Produto consultar(String codigo) throws Exception;
	
	public List<Produto> buscarTodos() throws Exception;

}

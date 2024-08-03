package br.com.mycompany.dao;


import java.util.List;

import br.com.mycompany.models.Produto;

public interface IProdutoDao {
	
	public Produto cadastrar(Produto produto);
	public void excluir(Produto produto);
	public Produto atualizar(Produto produto);
	public Produto busca(int id);
	public List<Produto> buscarTodos();

}

package dao;

import java.util.List;

import models.Carro;



public interface ICarroDAO {

	public Carro cadastrar(Carro carro);
	public void excluir(Carro carro);
	public Carro atualizar(Carro carro);
	public Carro busca(int id);
	public List<Carro> buscarTodos();
	
}

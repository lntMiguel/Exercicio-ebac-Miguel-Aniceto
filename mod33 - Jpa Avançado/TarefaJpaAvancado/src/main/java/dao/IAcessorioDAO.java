package dao;

import java.util.List;

import models.Acessorio;



public interface IAcessorioDAO {

	public Acessorio cadastrar(Acessorio acessorio);
	public void excluir(Acessorio acessorio);
	public Acessorio atualizar(Acessorio acessorio);
	public Acessorio busca(int id);
	public List<Acessorio> buscarTodos();
}

package dao;

import java.util.List;


import models.Marca;

public interface IMarcaDAO {


	public Marca cadastrar(Marca marca);
	public void excluir(Marca marca);
	public Marca atualizar(Marca marca);
	public Marca busca(int id);
	public List<Marca> buscarTodos();
	
}

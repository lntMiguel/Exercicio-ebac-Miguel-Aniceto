package dao;

import dao.generic.GenericDAO;
import models.Produto;

public class ProdutoDAO extends GenericDAO<Produto, Long> implements IProdutoDAO {

	public ProdutoDAO() {
		super(Produto.class);
	}

	
}

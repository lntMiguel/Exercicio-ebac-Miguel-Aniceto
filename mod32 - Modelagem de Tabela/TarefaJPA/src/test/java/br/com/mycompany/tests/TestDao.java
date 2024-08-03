package br.com.mycompany.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.After;

import org.junit.Test;

import br.com.mycompany.dao.IProdutoDao;
import br.com.mycompany.dao.ProdutoDAO;
import br.com.mycompany.models.Produto;

public class TestDao {

	private IProdutoDao produtoDao;
	
	
	public TestDao() {
		
		produtoDao = new ProdutoDAO();
	}

	public Produto criarProduto() {
		Produto produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(10d);
		return produto;
	}

	@After
	public void excluir() {
		List<Produto> list = produtoDao.buscarTodos();
		
		list.forEach(pro -> {

			produtoDao.excluir(pro);

		});
	}

	@Test
	public void cadastrarTest() {

		Produto produto = criarProduto();

		produto = produtoDao.cadastrar(produto);

		assertNotNull(produto);
		assertNotNull(produto.getId());

	}
	
	@Test
	public void buscaTest() {
		Produto produto = criarProduto();

		produto = produtoDao.cadastrar(produto);
		assertNotNull(produto);
		assertNotNull(produto.getId());
		
		Produto retorno = produtoDao.busca(produto.getId());
		assertEquals(produto.getCodigo(), retorno.getCodigo());
		
	}
	
	@Test
	public void atualizarTest() {
		Produto produto = criarProduto();

		produto = produtoDao.cadastrar(produto);
		assertNotNull(produto);
		assertNotNull(produto.getId());

		produto.setNome("Arroz");
		Produto retorno = produtoDao.atualizar(produto);
		assertEquals(produto.getCodigo(), retorno.getCodigo());
		assertEquals("Arroz", retorno.getNome());
		
	}

}

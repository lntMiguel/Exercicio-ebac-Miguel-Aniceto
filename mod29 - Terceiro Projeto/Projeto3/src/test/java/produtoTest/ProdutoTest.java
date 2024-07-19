package produtoTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import dao.IProdutoDAO;
import dao.ProdutoDAO;
import models.Produto;



public class ProdutoTest {

	@Test
	public void cadastroTest() throws Exception {
		
		IProdutoDAO dao = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setNome("Feijao");
		produto.setCodigo("01");
		produto.setValor(5.90f);
		
		Integer retorno = dao.cadastrar(produto);
		assertTrue(retorno == 1);
		
		Produto produtoBD = dao.consultar(produto.getCodigo());
		
		assertNotNull(produtoBD);
		assertNotNull(produtoBD.getId());
		assertEquals(produtoBD.getCodigo(), produto.getCodigo());
		assertEquals(produtoBD.getNome(), produto.getNome());
		
		Integer qtdDel = dao.exlcuir(produto.getCodigo());
		
		assertTrue(qtdDel == 1);
	
	}

	@Test
	public void updateTest() throws Exception {
		IProdutoDAO dao = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setNome("Feijao");
		produto.setCodigo("01");
		produto.setValor(5.90f);
		
		Integer retorno = dao.cadastrar(produto);
		assertTrue(retorno == 1);
		
		produto.setNome("Chocolate");
		Integer retornoUpdate = dao.atualizar(produto);
		assertTrue(retornoUpdate== 1);
		
		Integer qtdDel = dao.exlcuir(produto.getCodigo());
		
		assertTrue(qtdDel == 1);
	
	}
	
	@Test
	public void buscarTodosTest() throws Exception {
		IProdutoDAO dao = new ProdutoDAO();
		
		Produto produto1 = new Produto();
		produto1.setNome("Feijao");
		produto1.setCodigo("01");
		produto1.setValor(5.90f);
		
		Integer retorno1 = dao.cadastrar(produto1);
		assertTrue(retorno1 == 1);
		
		Produto produto2 = new Produto();
		produto2.setNome("Arroz");
		produto2.setCodigo("02");
		produto2.setValor(9.90f);
		
		Integer retorno2 = dao.cadastrar(produto2);
		assertTrue(retorno2 == 1);
		
		List<Produto> lista = dao.buscarTodos();
		assertTrue(lista.size() == 2);
		
		int countDel = 0;
		
		for(Produto pro : lista) {
			dao.exlcuir(pro.getCodigo());
			countDel++;
		}
		
		assertTrue(countDel == 2);
		
		lista = dao.buscarTodos();
		assertTrue(lista.size() == 0);
	}
}

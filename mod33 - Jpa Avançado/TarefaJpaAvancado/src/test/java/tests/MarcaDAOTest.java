package tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import dao.IMarcaDAO;
import dao.MarcaDAO;
import models.Marca;



public class MarcaDAOTest {
private IMarcaDAO marcaDao;
	
	
	public MarcaDAOTest() {
		
		marcaDao = new MarcaDAO();
	}

	public Marca criarMarca() {
		Marca marca = new Marca();
		marca.setNome("Marca1");
		
		return marca;
	}

	@After
	public void excluir() {
		List<Marca> list = marcaDao.buscarTodos();
		
		list.forEach(mar -> {

			marcaDao.excluir(mar);

		});
	}

	@Test
	public void cadastrarTest() {

		Marca marca = criarMarca();

		marca = marcaDao.cadastrar(marca);

		assertNotNull(marca);
		assertNotNull(marca.getId());

	}
	
	@Test
	public void buscaTest() {
		Marca marca = criarMarca();

		marca = marcaDao.cadastrar(marca);
		assertNotNull(marca);
		assertNotNull(marca.getId());
		
		Marca retorno = marcaDao.busca(marca.getId());
		assertEquals(marca.getId(), retorno.getId());
		
	}
	
	@Test
	public void atualizarTest() {
		Marca marca = criarMarca();

		marca = marcaDao.cadastrar(marca);
		assertNotNull(marca);
		assertNotNull(marca.getId());

		marca.setNome("Ferrari");
		Marca retorno = marcaDao.atualizar(marca);
		assertEquals(marca.getId(), retorno.getId());
		assertEquals("Ferrari", retorno.getNome());
		
	}

}

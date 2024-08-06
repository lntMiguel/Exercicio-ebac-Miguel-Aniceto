package tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import dao.AcessorioDAO;
import dao.IAcessorioDAO;
import dao.IMarcaDAO;
import dao.MarcaDAO;
import models.Acessorio;
import models.Marca;

public class AcessorioDAOTest {
	private IAcessorioDAO acessorioDao;
	private IMarcaDAO marcaDao;

	public AcessorioDAOTest() {

		acessorioDao = new AcessorioDAO();
		marcaDao = new MarcaDAO();
	}

	public Acessorio criarAcessorio() {
		Acessorio acessorio = new Acessorio();
		acessorio.setNome("Acessorio1");
		acessorio.setDescricao("Acessorio");
		acessorio.setMarca(null);
		return acessorio;
	}

	public Marca criarMarca() {
		Marca marca = new Marca();
		marca.setNome("Marca1");

		return marca;
	}

	@After
	public void excluir() {
		List<Acessorio> list = acessorioDao.buscarTodos();

		list.forEach(ace -> {

			acessorioDao.excluir(ace);

		});

		List<Marca> list1 = marcaDao.buscarTodos();

		list1.forEach(mar -> {

			marcaDao.excluir(mar);

		});
	}

	@Test
	public void cadastrarTest() {
		Marca marca = criarMarca();
		Acessorio acessorio = criarAcessorio();

		marca = marcaDao.cadastrar(marca);
		acessorio.setMarca(marca);
		acessorio = acessorioDao.cadastrar(acessorio);
		assertNotNull(acessorio);
		assertNotNull(acessorio.getId());

	}

	@Test
	public void buscaTest() {
		Marca marca = criarMarca();
		Acessorio acessorio = criarAcessorio();

		marca = marcaDao.cadastrar(marca);
		acessorio.setMarca(marca);
		acessorio = acessorioDao.cadastrar(acessorio);
		assertNotNull(acessorio);
		assertNotNull(acessorio.getId());

		Acessorio retorno = acessorioDao.busca(acessorio.getId());
		assertNotNull(retorno);

	}

	@Test
	public void atualizarTest() {
		Marca marca = criarMarca();
		Acessorio acessorio = criarAcessorio();

		marca = marcaDao.cadastrar(marca);
		acessorio.setMarca(marca);
		acessorio = acessorioDao.cadastrar(acessorio);
		assertNotNull(acessorio);
		assertNotNull(acessorio.getId());

		acessorio.setNome("Rádio");
		Acessorio retorno = acessorioDao.atualizar(acessorio);
		assertEquals(acessorio.getId(), retorno.getId());
		assertEquals("Rádio", retorno.getNome());

	}
}

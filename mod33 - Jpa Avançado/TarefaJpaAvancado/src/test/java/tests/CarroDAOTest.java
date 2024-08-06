package tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import dao.CarroDAO;
import dao.ICarroDAO;
import dao.IMarcaDAO;
import dao.MarcaDAO;
import models.Carro;
import models.Marca;

public class CarroDAOTest {
	private ICarroDAO carroDao;
	private IMarcaDAO marcaDao;

	public CarroDAOTest() {

		carroDao = new CarroDAO();
		marcaDao = new MarcaDAO();
	}

	public Carro criarCarro() {
		Carro carro = new Carro();
		carro.setNome("Fox");
		carro.setCambio("Manual");
		carro.setPotencia(104d);
		carro.setTipo("Combustão");
		carro.setMarca(null);
		return carro;
	}

	public Marca criarMarca() {
		Marca marca = new Marca();
		marca.setNome("Marca1");

		return marca;
	}

	@After
	public void excluir() {
		List<Carro> list = carroDao.buscarTodos();

		list.forEach(car -> {

			carroDao.excluir(car);

		});

		List<Marca> list1 = marcaDao.buscarTodos();

		list1.forEach(mar -> {

			marcaDao.excluir(mar);

		});
	}

	@Test
	public void cadastrarTest() {
		Marca marca = criarMarca();
		Carro carro = criarCarro();

		marca = marcaDao.cadastrar(marca);
		carro.setMarca(marca);
		carro = carroDao.cadastrar(carro);
		assertNotNull(carro);
		assertNotNull(carro.getId());

	}

	@Test
	public void buscaTest() {
		Marca marca = criarMarca();
		Carro carro = criarCarro();

		marca = marcaDao.cadastrar(marca);
		carro.setMarca(marca);
		carro = carroDao.cadastrar(carro);
		assertNotNull(carro);
		assertNotNull(carro.getId());

		Carro retorno = carroDao.busca(carro.getId());
		assertNotNull(retorno);

	}

	@Test
	public void atualizarTest() {
		Marca marca = criarMarca();
		Carro carro = criarCarro();

		marca = marcaDao.cadastrar(marca);
		carro.setMarca(marca);
		carro = carroDao.cadastrar(carro);
		assertNotNull(carro);
		assertNotNull(carro.getId());

		carro.setNome("Porshe");
		Carro retorno = carroDao.atualizar(carro);
		assertEquals(carro.getId(), retorno.getId());
		assertEquals("Porshe", retorno.getNome());

	}
}



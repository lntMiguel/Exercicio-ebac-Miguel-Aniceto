package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import dao.AcessorioDAO;
import dao.CarroDAO;
import dao.IAcessorioDAO;
import dao.ICarroDAO;
import dao.IMarcaDAO;
import dao.MarcaDAO;
import models.Acessorio;
import models.Carro;
import models.Marca;

public class ForeingKeysTest {
	
	private IAcessorioDAO acessorioDao;
	private IMarcaDAO marcaDao;
	private ICarroDAO carroDao;
	
	public ForeingKeysTest() {
		
		carroDao = new CarroDAO();
		marcaDao = new MarcaDAO();
		acessorioDao = new AcessorioDAO();
	
	}
	
	public Marca criarMarca() {
		Marca marca = new Marca();
		marca.setNome("Marca1");

		return marca;
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
	
	public Acessorio criarAcessorio() {
		Acessorio acessorio = new Acessorio();
		acessorio.setNome("Acessorio1");
		acessorio.setDescricao("Acessorio");
		acessorio.setMarca(null);
		return acessorio;
	}
	
	@Test
	public void testarRelacao() {
		
		Marca marca = criarMarca();
		Acessorio acessorio = criarAcessorio();
		Carro carro = criarCarro();
		
		marca = marcaDao.cadastrar(marca);
		
		acessorio.setMarca(marca);
		carro.setMarca(marca);
		
		acessorio = acessorioDao.cadastrar(acessorio);
		carro = carroDao.cadastrar(carro);
		
		marca.addAcessorio(acessorio);
		marca.addCarro(carro);
		
		acessorio.add(carro);
		carro.add(acessorio);
		acessorio.add(carro);
		
		marcaDao.atualizar(marca);
		acessorioDao.atualizar(acessorio);
		carroDao.atualizar(carro);
		
		Acessorio marcaAcessorio = marca.getAcessorios().get(0);
		assertEquals(marcaAcessorio.getId(), acessorio.getId());
		
		Acessorio carroAcessorio = carro.getAcessorios().get(0);
		assertEquals(carroAcessorio.getId(), acessorio.getId());
		
		Carro carroMarca = marca.getCarros().get(0);
		assertEquals(carroMarca.getId(), carro.getId());
		
		
	}
	
	@After
	public void excluir() {
		List<Carro> list = carroDao.buscarTodos();

		list.forEach(car -> {

			carroDao.excluir(car);

		});
		
		List<Acessorio> list1 = acessorioDao.buscarTodos();

		list1.forEach(ace -> {

			acessorioDao.excluir(ace);

		});

		List<Marca> list2 = marcaDao.buscarTodos();

		list2.forEach(mar -> {

			marcaDao.excluir(mar);

		});
	}
	

}

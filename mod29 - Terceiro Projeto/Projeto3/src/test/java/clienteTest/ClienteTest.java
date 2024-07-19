package clienteTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import dao.ClienteDAO;
import dao.IClienteDAO;
import models.Cliente;

public class ClienteTest {
	
	@Test
	public void cadastroTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Miguel");
		cliente.setCodigo("01");
		
		Integer retorno = dao.cadastrar(cliente);
		assertTrue(retorno == 1);
		
		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(clienteBD.getCodigo(), cliente.getCodigo());
		assertEquals(clienteBD.getNome(), cliente.getNome());
		
		Integer qtdDel = dao.exlcuir(cliente.getCodigo());
		
		assertTrue(qtdDel == 1);
	
	}

	@Test
	public void updateTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Miguel");
		cliente.setCodigo("01");
		
		Integer retorno = dao.cadastrar(cliente);
		assertTrue(retorno == 1);
		
		cliente.setNome("Leugim");
		Integer retornoUpdate = dao.atualizar(cliente);
		assertTrue(retornoUpdate== 1);
		
		Integer qtdDel = dao.exlcuir(cliente.getCodigo());
		
		assertTrue(qtdDel == 1);
	
	}
	
	@Test
	public void buscarTodosTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Miguel");
		cliente1.setCodigo("01");
		
		Integer retorno1 = dao.cadastrar(cliente1);
		assertTrue(retorno1 == 1);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Ana");
		cliente2.setCodigo("02");
		
		Integer retorno2 = dao.cadastrar(cliente2);
		assertTrue(retorno2 == 1);
		
		List<Cliente> lista = dao.buscarTodos();
		assertTrue(lista.size() == 2);
		
		int countDel = 0;
		
		for(Cliente cli : lista) {
			dao.exlcuir(cli.getCodigo());
			countDel++;
		}
		
		assertTrue(countDel == 2);
		
		lista = dao.buscarTodos();
		assertTrue(lista.size() == 0);
	}
}

package br.com.segundoprojeto.tests;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.segundoprojeto.dao.ClienteDao;
import br.com.segundoprojeto.dao.IClienteDAO;
import br.com.segundoprojeto.domain.Cliente;
import br.com.segundoprojeto.exception.TipoChaveNaoEncontradaException;

public class ClienteDaoTest {
	
	private IClienteDAO clienteDao;

	private Cliente cliente;
	
	public ClienteDaoTest() {
		clienteDao = new ClienteDao();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		cliente = new Cliente();
		cliente.setCpf(12345678901L);
		cliente.setNome("Miguel");
		cliente.setCidade("São Paulo");
		cliente.setEndereco("Endereco");
		cliente.setEstado("SP");
		cliente.setNumero(13);
		cliente.setTelefone(11123456789L);
		clienteDao.cadastrar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setCpf(56565656565L);
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Miguel");
		clienteDao.alterar(cliente);
		Assert.assertEquals("Miguel", cliente.getNome());
	}
	
	@Test
	public void buscarTodos() {
		Collection<Cliente> list = clienteDao.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 2);
	}
}
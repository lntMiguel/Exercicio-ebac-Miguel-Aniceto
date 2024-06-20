package br.com.segundoprojeto.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.segundoprojeto.dao.IClienteDAO;
import br.com.segundoprojeto.daomock.ClienteDaoMock;
import br.com.segundoprojeto.domain.Cliente;
import br.com.segundoprojeto.exception.TipoChaveNaoEncontradaException;
import br.com.segundoprojeto.services.ClienteService;
import br.com.segundoprojeto.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12345678901L);
		cliente.setNome("Miguel");
		cliente.setCidade("São Paulo");
		cliente.setEndereco("Endereco");
		cliente.setEstado("SP");
		cliente.setNumero(13);
		cliente.setTelefone(11123456789L);
		
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Miguel");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Miguel", cliente.getNome());
	}
}
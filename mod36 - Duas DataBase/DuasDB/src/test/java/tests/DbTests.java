package tests;

import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import br.com.miguel.dao.IClienteDAO;
import br.com.miguel.dao.mysql.ClienteMySqlDAO;
import br.com.miguel.dao.postgre.ClientePostgreDAO;
import br.com.miguel.models.ClienteMySql;
import br.com.miguel.models.ClientePostgre;

public class DbTests {

	private IClienteDAO<ClientePostgre> clientePostgreDAO;
	private IClienteDAO<ClienteMySql> clienteMySqlDAO;
	
	public DbTests() {
		
		this.clientePostgreDAO = new ClientePostgreDAO();
		this.clienteMySqlDAO = new ClienteMySqlDAO();
	}

	@After
	public void end() {
		
		Collection<ClientePostgre> list1 = clientePostgreDAO.buscarTodos();
		excluir(list1, clientePostgreDAO);
		
		Collection<ClienteMySql> list2 = clienteMySqlDAO.buscarTodos();
		excluir2(list2, clienteMySqlDAO);	
	}
	
	private void excluir(Collection<ClientePostgre> list, IClienteDAO<ClientePostgre> clienteDao) {
		list.forEach(cli -> {
			try {
				clienteDao.excluir(cli);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	
	private void excluir2(Collection<ClienteMySql> list, IClienteDAO<ClienteMySql> clienteDao) {
		list.forEach(cli -> {
			try {
				clienteDao.excluir(cli);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

	@Test
	public void pesquisar() {
		
		ClientePostgre cliente = criarClientePostgre();
		clientePostgreDAO.cadastrar(cliente);
		
		ClientePostgre clienteConsultado = clientePostgreDAO.consultar(cliente.getId());
		Assert.assertNotNull(clienteConsultado);
		
		//#######	Cliente MySql	############
		
		ClienteMySql cliente2 = criarClienteMySql();
		clienteMySqlDAO.cadastrar(cliente2);
		
		ClienteMySql clienteConsultado2 = clienteMySqlDAO.consultar(cliente2.getId());
		Assert.assertNotNull(clienteConsultado2);
		
	}
	
	@Test
	public void atualizar() {
			
		ClientePostgre cliente = criarClientePostgre();
		ClientePostgre retorno = clientePostgreDAO.cadastrar(cliente);
		Assert.assertNotNull(retorno);
		
		ClientePostgre clienteConsultado = clientePostgreDAO.consultar(cliente.getId());
		Assert.assertNotNull(clienteConsultado);
		
		clienteConsultado.setNome("Miguel Aniceto");
		clientePostgreDAO.alterar(clienteConsultado);
		
		ClientePostgre clienteAlterado = clientePostgreDAO.consultar(clienteConsultado.getId());
		Assert.assertNotNull(clienteAlterado);
		Assert.assertEquals("Miguel Aniceto", clienteAlterado.getNome());
		
		//#######	Cliente MySql	############
		
		ClienteMySql cliente2 = criarClienteMySql();
		ClienteMySql retorno2 = clienteMySqlDAO.cadastrar(cliente2);
		Assert.assertNotNull(retorno2);
		
		ClienteMySql clienteConsultado2 = clienteMySqlDAO.consultar(cliente2.getId());
		Assert.assertNotNull(clienteConsultado2);
		
		clienteConsultado2.setNome("Miguel Aniceto");
		clienteMySqlDAO.alterar(clienteConsultado2);
		
		ClienteMySql clienteAlterado2 = clienteMySqlDAO.consultar(clienteConsultado2.getId());
		Assert.assertNotNull(clienteAlterado2);
		Assert.assertEquals("Miguel Aniceto", clienteAlterado2.getNome());
		
	}
	
	private ClientePostgre criarClientePostgre() {
		ClientePostgre cliente = new ClientePostgre();
		cliente.setCpf("99999999999");
		cliente.setNome("Miguel");
		cliente.setCidade("São Paulo");
		cliente.setEndereco("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel("11999999999");
		cliente.setSexo("M");
		return cliente;
	}
	
	private ClienteMySql criarClienteMySql() {
		ClienteMySql cliente = new ClienteMySql();
		cliente.setCpf("99999999999");
		cliente.setNome("Miguel");
		cliente.setCidade("São Paulo");
		cliente.setEndereco("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel("11999999999");
		cliente.setSexo("M");
		return cliente;
	}
}

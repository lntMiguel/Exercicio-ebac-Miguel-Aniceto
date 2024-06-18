package br.com.testespart2.servicestest;

import org.junit.Assert;
import org.junit.Test;

import br.com.testespart2.dao.ClienteDao;
import br.com.testespart2.dao.ClienteDaoMock;
import br.com.testespart2.dao.IClienteDao;
import br.com.testespart2.services.ClienteService;

public class ClienteServiceTest {

	@Test
    public void salvarTest() {
       
        IClienteDao dao = new ClienteDao();
        ClienteService service = new ClienteService(dao);
        boolean retorno = service.salvar();
        Assert.assertTrue(retorno);
    }
	
	@Test
	public void excluirTest() {
	       
        IClienteDao dao = new ClienteDao();
        ClienteService service = new ClienteService(dao);
        boolean retorno = service.excluir();
        Assert.assertTrue(retorno);
    }
	
	@Test
	public void atualizarTest() {
	       
        IClienteDao dao = new ClienteDao();
        ClienteService service = new ClienteService(dao);
        boolean retorno = service.atualizar();
        Assert.assertTrue(retorno);
    }
	
	@Test
	public void buscarTest() {
	       
        IClienteDao dao = new ClienteDao();
        ClienteService service = new ClienteService(dao);
        boolean retorno = service.buscar();
        Assert.assertTrue(retorno);
    }

    
	//**************Esperando erros*****************
	
	@Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
    	
    	IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        //boolean retorno = service.salvar();
        Assert.assertTrue(service.salvar());
    
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirTest() {
    	
    	IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        //boolean retorno = service.salvar();
        Assert.assertTrue(service.excluir());
    
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarTest() {
    	
    	IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        //boolean retorno = service.salvar();
        Assert.assertTrue(service.buscar());
    
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarTest() {
    	
    	IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        //boolean retorno = service.salvar();
        Assert.assertTrue(service.atualizar());
    
    }

}

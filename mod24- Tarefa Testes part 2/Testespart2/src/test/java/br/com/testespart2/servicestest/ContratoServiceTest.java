package br.com.testespart2.servicestest;

import org.junit.Assert;
import org.junit.Test;

import br.com.testespart2.dao.ContratoDao;
import br.com.testespart2.dao.ContratoDaoMock;
import br.com.testespart2.dao.IContratoDao;
import br.com.testespart2.services.ContratoService;

public class ContratoServiceTest {

	@Test
    public void salvarTest() {
       
        IContratoDao dao = new ContratoDao();
        ContratoService service = new ContratoService(dao);
        boolean retorno = service.salvar();
        Assert.assertTrue(retorno);
    }
	
	@Test
	public void excluirTest() {
	       
        IContratoDao dao = new ContratoDao();
        ContratoService service = new ContratoService(dao);
        boolean retorno = service.excluir();
        Assert.assertTrue(retorno);
    }
	
	@Test
	public void atualizarTest() {
	       
        IContratoDao dao = new ContratoDao();
        ContratoService service = new ContratoService(dao);
        boolean retorno = service.atualizar();
        Assert.assertTrue(retorno);
    }
	
	@Test
	public void buscarTest() {
	       
        IContratoDao dao = new ContratoDao();
        ContratoService service = new ContratoService(dao);
        boolean retorno = service.buscar();
        Assert.assertTrue(retorno);
    }

    
	//**************Esperando erros*****************
	
	@Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
    	
    	IContratoDao mockDao = new ContratoDaoMock();
        ContratoService service = new ContratoService(mockDao);
        //boolean retorno = service.salvar();
        Assert.assertTrue(service.salvar());
    
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirTest() {
    	
    	IContratoDao mockDao = new ContratoDaoMock();
        ContratoService service = new ContratoService(mockDao);
        //boolean retorno = service.salvar();
        Assert.assertTrue(service.excluir());
    
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarTest() {
    	
    	IContratoDao mockDao = new ContratoDaoMock();
        ContratoService service = new ContratoService(mockDao);
        //boolean retorno = service.salvar();
        Assert.assertTrue(service.buscar());
    
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarTest() {
    	
    	IContratoDao mockDao = new ContratoDaoMock();
        ContratoService service = new ContratoService(mockDao);
        //boolean retorno = service.salvar();
        Assert.assertTrue(service.atualizar());
    
    }
}

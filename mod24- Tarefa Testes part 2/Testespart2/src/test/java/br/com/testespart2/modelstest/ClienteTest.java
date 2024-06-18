package br.com.testespart2.modelstest;

import org.junit.Assert;
import org.junit.Test;

import br.com.testespart2.models.Cliente;

public class ClienteTest {
	
	@Test
	public void testSetarNome() {
		Cliente cliente = new Cliente();
		cliente.adicionarNome("Miguel");
		Assert.assertEquals("Miguel", cliente.getNome());	
	}

	
}

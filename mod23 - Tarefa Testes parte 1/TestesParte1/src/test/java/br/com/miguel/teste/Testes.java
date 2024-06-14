package br.com.miguel.teste;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.miguel.main.ListaFeminina;



public class Testes {
	@Test
	public void testListaFem() {
		
		//intanciando classe 
		ListaFeminina listaFem  = new ListaFeminina();
		
		//setando variavel que simula entrada de dados
		listaFem.setExemploEntrada("Miguel-M,Ana-F,Laura-F,Jorge-M,Pedro-M,Lais-F");
		
		//testando método get
		Assert.assertEquals("Miguel-M,Ana-F,Laura-F,Jorge-M,Pedro-M,Lais-F", listaFem.getExemploEntrada());
		
		//craindo vetor que se espera ao utilizar o  método separarNomes();
		String[] vetorEsperado = {"Miguel-M","Ana-F","Laura-F","Jorge-M","Pedro-M","Lais-F"};
		
		//testando método separarNomes para ver se retorna o que se espera(um vetor contendo nomes e sexo de pessoas)
		Assert.assertArrayEquals(vetorEsperado, listaFem.separarNomes(listaFem.getExemploEntrada()));
		
		//preenchendo a lista com o vetor esperado
		listaFem.preencherLista(vetorEsperado);
		
		List<String> listaEsperada = new ArrayList<String>();
		listaEsperada.add("Miguel-M");
		listaEsperada.add("Ana-F");
		listaEsperada.add("Laura-F");
		listaEsperada.add("Jorge-M");
		listaEsperada.add("Pedro-M");
		listaEsperada.add("Lais-F");
		
		//verificando se a lista foi preenchida corretamente 
		Assert.assertArrayEquals(listaEsperada.toArray(), listaFem.getListaPessoas().toArray());
		
		//lista com o retorno esperado do método listar mulheres 
		List<String> listaFemEsperada = new ArrayList<String>();
		listaFemEsperada.add("Ana-F");
		listaFemEsperada.add("Laura-F");
		listaFemEsperada.add("Lais-F");

		//setando a lista de pessoas da classe como uma lista contendo apenas as mulheres
		listaFem.setListaPessoas(listaFem.listarMulheres(listaFem.getListaPessoas()));
		
		//verificando se a lista esperada confere com a lista da classe
		Assert.assertArrayEquals(listaFemEsperada.toArray(), listaFem.getListaPessoas().toArray() );
		
		
	}
	
}

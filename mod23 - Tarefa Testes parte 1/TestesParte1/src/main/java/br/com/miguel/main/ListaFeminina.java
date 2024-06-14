package br.com.miguel.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaFeminina {
		
		//exemplo de entrada de dados esperada
		private String exemploEntrada;
		
		//lista de pessoas a ser preenchida pelo método preencherLista 
		private List<String> listaPessoas = new ArrayList<String>();
		
		//getters e setters
		public String getExemploEntrada() {
			return exemploEntrada;
		}

		public void setExemploEntrada(String exemploEntrada) {
			this.exemploEntrada = exemploEntrada;
		}

		public List<String> getListaPessoas() {
			return listaPessoas;
		}

		public void setListaPessoas(List<String> listaPessoas) {
			this.listaPessoas = listaPessoas;
		}

		
		//método que separa os  nomes recebidos na entrada de dados
		public String[] separarNomes(String exemploEntrada) {
			
			String[] nomeSeparado = exemploEntrada.split(",");
			return nomeSeparado;
		}
			
		//método que preenche a lista vazia com os nomes recebidos na entrada de dados
		public void preencherLista(String[] nomeSeparado) {
			for(int i = 0; i < nomeSeparado.length; i++) 
				this.listaPessoas.add(nomeSeparado[i]);
		}
		
		//método que realiza uma stream e retorna uma lista  apenas com mulheres 
		public List<String> listarMulheres(List<String> listaPessoas){
			
			return listaPessoas.stream()
			.filter(pessoa->pessoa.contains("-F"))
			.collect(Collectors.toList());
		
		}
		
		
	
	
}

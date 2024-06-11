package br.com.tarefastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TarefaStreams {

	public static void main(String[] args) {
		//criação de scanner
		Scanner ler = new Scanner(System.in);
		
		//lista de pessoas
		List<String> listaPessoas= new ArrayList<String>();
		
		//string para receber entrada de dados
		String entrada;
		
		//entrada de dados
		System.out.println("Digite nomes e sexo e separe-os por virgula (exemplo: Miguel-M,Laura-F): ");
		entrada = ler.next();
		ler.close();
		
		//separando as pessoas e populando um array
		String[] nomeSeparado = entrada.split(",");
				
		//populando a lista de pessoas 
		for(int i = 0; i < nomeSeparado.length; i++) 
			listaPessoas.add(nomeSeparado[i]);
		
		
		//Stream onde verifica se cada pessoa está registrada com -F, ou seja, se são do sexo feminino, e exibindo no console
		listaPessoas.stream()
				.filter(pessoa->pessoa.contains("-F"))
				.collect(Collectors.toList())
				.forEach(System.out::println);
	
	}

}

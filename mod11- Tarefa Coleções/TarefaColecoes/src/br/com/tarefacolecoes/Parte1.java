package br.com.tarefacolecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Parte1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		List<String> nome = new ArrayList<String>();
		String entrada;
		
		System.out.println("Digite nomes e separe-os por virgula: ");
		entrada = ler.next();
		ler.close();
		
		String[] nomeSeparado = entrada.split(",");
		
		for(String i: nomeSeparado) {
			nome.add(i);
		}
		
		Collections.sort(nome);
		
		System.out.println(nome);
		

		
		
	}

}

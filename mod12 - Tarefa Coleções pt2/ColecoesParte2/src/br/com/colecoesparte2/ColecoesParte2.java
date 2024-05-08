package br.com.colecoesparte2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ColecoesParte2 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		List<String> masculino = new ArrayList<String>();
		List<String> feminino = new ArrayList<String>();
		
		String entrada;
		
		System.out.println("Digite nomes e sexo e separe-os por virgula (exemplo: Miguel-M, Laura-F): ");
		entrada = ler.next();
		ler.close();
		
		String[] nomeSeparado = entrada.split(",");
				
		for(int i = 0; i < nomeSeparado.length; i++) {
			int index = nomeSeparado[i].indexOf("-");
			
			char sexo = nomeSeparado[i].charAt(index + 1);
		
			if(sexo == 'M' || sexo== 'm') 
				masculino.add(nomeSeparado[i]);
			
			
			else
				feminino.add(nomeSeparado[i]);
			
			
		}
		
		Collections.sort(masculino);
		Collections.sort(feminino);
		
		System.out.println("Lista Masculina: " + masculino);
		System.out.println("\nLista Feminina: " + feminino);

	}

}

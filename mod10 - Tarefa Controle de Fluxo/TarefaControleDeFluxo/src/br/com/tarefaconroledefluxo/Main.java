package br.com.tarefaconroledefluxo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double vetor[] = new double[4];
		
		for(int i = 0; i < 4; i++ ) {
			System.out.print("\nDigite uma nota: ");
			vetor[i] = ler.nextFloat();
		}
		
		ler.close();
		
		double media = (vetor[0] + vetor[1] + vetor[2] + vetor[3]) / 4;
		
		if(media >= 7)
			System.out.println("sua media é " + media + " você está aprovado");
		
		else if(media >= 5)
			System.out.println("sua media é " + media + " você está de recuperação");
		
		else
			System.out.println("sua media é " + media + " você está reprovado");
		
		
	}


}



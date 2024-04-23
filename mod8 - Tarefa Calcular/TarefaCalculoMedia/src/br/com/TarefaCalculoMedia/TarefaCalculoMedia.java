package br.com.TarefaCalculoMedia;

import java.util.Scanner;

public class TarefaCalculoMedia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double vetor[] = new double[4];
		
		for(int i = 0; i < 4; i++ ) {
			System.out.print("\nDigite uma nota: ");
			vetor[i] = ler.nextFloat();
		}
		
		double media = (vetor[0] + vetor[1] + vetor[2] + vetor[3]) / 4;
		System.out.printf("O valor da media é: %.2f", media);
		

	}

}

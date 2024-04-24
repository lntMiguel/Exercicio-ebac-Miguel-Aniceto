package br.com.tarefawrapper;

import java.util.Scanner;

public class Casting {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um numero inteiro: ");
		num = ler.nextInt();
		
		Integer casting = num;
		
		System.out.printf("O número %d agora está em tipo Wrapper", casting);
		
		ler.close();
	}

}

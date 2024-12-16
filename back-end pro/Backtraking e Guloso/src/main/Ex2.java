package main;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		
		int[] moedas = {5,2,1};		
		Arrays.sort(moedas);
		
		int quantia = 18;
		
		int contador = 0;
		
		int qtdMoedas = 0;
		
		int indiceMoeda = moedas.length - 1;
		
		while(contador != quantia) {
			
			if(contador + moedas[indiceMoeda] > quantia) {
				indiceMoeda--;
			}
			
			else{
				contador += moedas[indiceMoeda];
				qtdMoedas++;
			}
		}
		
		System.out.println(qtdMoedas);
	}

}

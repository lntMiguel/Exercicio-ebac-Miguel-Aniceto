package main;
import models.Pilha;
public class UsaPilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);
		
		System.out.println("tamanho= " + pilha.size());		
		System.out.println("########################");
		
		pilha.imprimir();
		System.out.println("########################");
		
		pilha.pop();
		pilha.imprimir();
		System.out.println("########################");
		
		pilha.pop();
		pilha.imprimir();
		System.out.println("########################");
		
		pilha.push(5);
		pilha.imprimir();
		System.out.println("########################");
		
		System.out.println("topo=" + pilha.top());
	}

}

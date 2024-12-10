package main;

import models.Fila;


public class UsaFila {
	public static void main(String[] args) {
	Fila fila = new Fila();
	
	fila.enqueue(1);
	fila.enqueue(2);
	fila.enqueue(3);
	fila.enqueue(4);
	
	System.out.println("tamanho= " + fila.size());
	System.out.println("########################");
	
	fila.imprimir();
	System.out.println("########################");
	
	fila.dequeue();
	fila.imprimir();
	System.out.println("########################");
	
	fila.dequeue();
	fila.imprimir();
	System.out.println("########################");
	
	fila.enqueue(5);
	fila.imprimir();
	System.out.println("########################");
	
	System.out.println("frente=" + fila.front());
	System.out.println("ultimo=" + fila.rear());
	
	}
}

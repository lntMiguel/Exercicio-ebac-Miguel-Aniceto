package main;

import models.Lista;

public class UsaLista {

	public static void main(String[] args) {
		Lista lista = new Lista();

		lista.push(1);
		lista.push(2);
		lista.push(3);
		lista.push(4);
		
		lista.printList();
		
		System.out.println("#################");
		
		System.out.println(lista.elementAt(2));
		
		System.out.println("#################");
		
		lista.insert(3, 6);
		lista.printList();

		System.out.println("#################");
		
		lista.remove(3);
		lista.printList();

		System.out.println("#################");
		
		System.out.println("tamanho = "+ lista.size());
		
		System.out.println("#################");
		
		lista.pop();
		lista.printList();

	}

}

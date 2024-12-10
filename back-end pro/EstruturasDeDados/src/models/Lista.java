package models;

import models.No;

public class Lista {
	private No atual, aux, inicio;
	private static int size = 0;

	private boolean isEmpty() {
		return inicio == null;
	}

	public void push(int n) {
		if (isEmpty()) {
			inicio = new No(null, null, n);
			aux = inicio;
			size++;

		} else {
			atual = new No(null, aux, n);
			aux.setProx(atual);
			aux = atual;
			size++;
		}
	}

	public void printList() {
		No e = inicio;
		while (e != null) {
			System.out.println(e.getN());
			e = e.getProx();
		}
	}

	public int elementAt(int id) {
		if (id > size) {
			return -1;
		}

		// Pesquisar o ID
		No pesquisa = inicio;

		for (int i = 1; i <= size; i++) {
			if (i == id) {
				return pesquisa.getN();
			}
			pesquisa = pesquisa.getProx();

		}
		return -1;

	}
	
	public boolean insert(int id, int n) {
		if (id > size) {
			return false;
		}
		
		No no = inicio;

		for (int i = 1; i <= id; i++) {

			if (id == i) {
				break;
			}

			no = no.getProx();
		}
		
		no.setN(n);
		
		return true;
		
	}
	
	public boolean remove(int id) {
		if (id > size) {
			return false;
		}

		No rem = inicio;

		for (int i = 1; i <= id; i++) {

			if (id == i) {
				break;
			}

			rem = rem.getProx();
		}

		if (rem == inicio) {
			inicio = rem.getProx();
			rem.setProx(null);
			inicio.setAnt(null);
		} else if (rem == atual) {
			atual = rem.getAnt();
			aux = atual;
			rem.setAnt(null);
			atual.setProx(null);
		} else {
			rem.getAnt().setProx(rem.getProx());
			rem.getProx().setAnt(rem.getAnt());
		}
		size--;
		return true;

	}

	public boolean pop() {
		No rem = atual;
		atual = rem.getAnt();
		aux = atual;
		rem.setAnt(null);
		atual.setProx(null);
		size--;

		return true;

	}
	
	public int size() {
		return size;
	}
	
}

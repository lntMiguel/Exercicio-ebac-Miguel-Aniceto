package models;

public class Fila {
	private No first;
	private No last;

	
	public void enqueue(int n) {
		if(isEmpty()) {
			first = new No(null,null, n);
			last = first;
		}
		
		else {
			No no = new No(null, last, n);
			last.setProx(no);
			last = no;
			
		}
		
	}
	
	public void dequeue() {
		if(!isEmpty()) {
			first = first.getProx();
		}
		
		
	}
	
	public int rear() {
		return last.getN();
	}
	
	public int front() {
		return first.getN();
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		No no = first;
		int i = 0;
		while(no != null) {
			i++;
			no = no.getProx();
		}
		
		return i;
	}
	
	public void imprimir() {
		No no = first;
		while(no != null) {
			System.out.println(no);
			no = no.getProx();
		}
	}
}

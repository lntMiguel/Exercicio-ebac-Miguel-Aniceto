package models;
public class Pilha {
	
	private No top;
	private No bottom;

	
	public void push(int n) {
		if(isEmpty()) {
			top = new No(null,null, n);
			bottom = top;
		}
		
		else {
			No no = new No(null, bottom, n);
			bottom.setProx(no);
			bottom = no;
			
		}
		
	}
	
	public void pop() {
		if(!isEmpty()) {
			
			bottom = bottom.getAnt();
			bottom.setProx(null);
		}
		
		
	}
	
	public int top() {
		return top.getN();
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int size() {
		No no = top;
		int i = 0;
		while(no != null) {
			i++;
			no = no.getProx();
		}
		
		return i;
	}
	
	public void imprimir() {
		No no = top;
		while(no != null) {
			System.out.println(no);
			no = no.getProx();
		}
	}
    
	
	
}

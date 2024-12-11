package main;

public class Ex1 {
	public static final int resultados[] = new int[100];
	
	public static final long fatorial(int n) {
		
		if(n == 2) {
			return n;
		}
		
		return n * fatorial(n-1);
	}


	public static void main(String[] args) {
		System.out.println(fatorial(5));
	}

}

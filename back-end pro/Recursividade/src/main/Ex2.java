package main;

public class Ex2 {

	private static final int[] resultados = new int[100];

	public static final long fatorial(int n) {
		
		if (resultados[n] == -1) {
			
			if (n == 2) {
				resultados[n] = n;
			} 
			
			else {
				return n * fatorial(n - 1);
			}
		}

		return resultados[n];
	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			resultados[i] = -1;
		}
		System.out.println(fatorial(5));
	}

}

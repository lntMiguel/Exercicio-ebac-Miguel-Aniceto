package main;

public class Ex1 {

    public static void gerarSubconjunto(int[] conjunto, int n) {
        int[] subconjunto = new int[n]; 
        backtrack(conjunto, n, 0, 0, subconjunto); 
    }

    private static void backtrack(int[] conjunto, int n, int inicio, int profundidade, int[] subconjunto) {
       
        if (profundidade == n) {
            imprimir(subconjunto); 
            return;
        }

        
        for (int i = inicio; i < conjunto.length; i++) {
            subconjunto[profundidade] = conjunto[i]; 
            backtrack(conjunto, n, i + 1, profundidade + 1, subconjunto); 
        }
    }

    private static void imprimir(int[] subconjunto) {
        System.out.print("[");
        for (int i = 0; i < subconjunto.length; i++) {
            System.out.print(subconjunto[i]);
            if (i < subconjunto.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        
        int[] conjunto = {1, 2, 3,4}; 
        int n = 2; // 

        
        gerarSubconjunto(conjunto, n);
    }
}

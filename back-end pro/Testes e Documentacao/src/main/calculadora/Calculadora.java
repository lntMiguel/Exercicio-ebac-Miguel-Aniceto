package main.calculadora;

/**
 * Classe que faz os 4 métodos principais da matematica, soma, subtração, multiplicação e divisão. A classe recebe apenas 2 números.
 */
public class Calculadora {

    public static int soma(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtracao(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplicacao(int n1, int n2) {
        return n1 * n2;
    }

    /**
     * Calcula a divisão entre dois números. Caso tente fazer uma divisão por 0, vai dar ArithmeticException.
     * @param n1 dividendo
     * @param n2 divisor
     * @return resultado
     */
    public static int divisao(int n1, int n2) {
        return n1 / n2;
    }
}
package calculadora.java;

import main.calculadora.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
   public void testSoma_HappyPath() {
       int resultado = Calculadora.soma(10, 10);
       assertEquals(20, resultado);

   }

   @Test
    public void testSubtracao_HappyPath() {
        int resultado = Calculadora.subtracao(10, 5);
        assertEquals(5, resultado);

   }

   @Test
    public void testMultiplicacao_HappyPath() {
        int resultado = Calculadora.multiplicacao(15, 2);
        assertEquals(30, resultado);

   }

   @Test
    public void testDivisao_HappyPath() {
        int resultado = Calculadora.divisao(10, 2);
        assertEquals(5, resultado);
   }

   @Test
    public void testDivisao_DivisaoPorZero() {
       assertThrows(ArithmeticException.class, () -> Calculadora.divisao(10, 0));
   }
}


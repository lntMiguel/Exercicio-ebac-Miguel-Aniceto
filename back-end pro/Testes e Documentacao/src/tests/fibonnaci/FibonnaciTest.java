import main.fibonacci.Fibonnaci;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonnaciTest {
    @Test
    public void testFibonnaci_HapyPath(){
        int resultado = Fibonnaci.fibonacci(6);
        assertEquals(8, resultado);

    }

    @Test
    public void testFibonnaci_Numero0(){
        int resultado = Fibonnaci.fibonacci(0);
        assertEquals(0, resultado);

    }

    @Test
    public void testFibonnaci_Numero1(){
        int resultado = Fibonnaci.fibonacci(1);
        assertEquals(1, resultado);

    }

}
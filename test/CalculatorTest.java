import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testSuma(){
        int resultado = Calculator.suma(2, 5);
        int esperado = 7;
        assertEquals(esperado, resultado);

    }

    @Test
    public void testSuma2(){
        int resultado = Calculator.suma(7, 5);
        int esperado = 12;
        assertEquals(esperado, resultado);

    }

    @Test
    public void testResta(){
        int resultado = Calculator.resta(15, 5);
        int esperado = 10;
        assertEquals(esperado, resultado);

    }

    @Test
    public void testResta2(){
        int resultado = Calculator.resta(15, 35);
        int esperado = -20;
        assertEquals(esperado, resultado);

    }

    @Test
    public void testMultiplicacion(){
        int resultado = Calculator.multiplicacion(5, 6);
        int esperado = 30;
    }

    @Test
    public void testMultiplicacion2(){
        int resultado = Calculator.multiplicacion(57, 6);
        int esperado = 342;
    }

    @Test
    public void testDivision(){
        float resultado = Calculator.division(57, 6);
        float esperado = 9.5f;
    }

    @Test
    public void testDivision2(){
        float resultado = Calculator.division(3, 3);
        float esperado = 1.0f;
    }



}
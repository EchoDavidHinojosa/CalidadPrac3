package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculadora();
    }

    @Test
    public void testSuma() {
        assertEquals(5, calc.suma(2, 3));
        assertEquals(-1, calc.suma(-2, 1));
    }

    @Test
    public void testResta() {
        assertEquals(2, calc.resta(5, 3));
        assertEquals(-3, calc.resta(-2, 1));
    }

    @Test
    public void testMultiplica() {
        assertEquals(6, calc.multiplica(2, 3));
        assertEquals(-2, calc.multiplica(-2, 1));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(6, 3));
        assertEquals(-2, calc.divide(-4, 2));
        assertEquals(-1, calc.divide(5, 0)); // caso b = 0
    }
}

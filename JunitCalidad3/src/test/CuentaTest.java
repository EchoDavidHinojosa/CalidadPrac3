package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {

    private static Cuenta cuenta,cuenta2; // compartida entre todos los tests

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println(">>> INICIANDO TESTS DE CUENTA");
        cuenta = new Cuenta(12345, 50);
        cuenta2 =new Cuenta(6789,0);
        System.out.println("Saldo inicial: " + cuenta.getSaldo() + "€");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println(">>> FINALIZANDO TESTS DE CUENTA");
        System.out.println("Saldo final de la cuenta: " + cuenta.getSaldo() + "€");
    }

    @Test
    void cuenta1() {
        System.out.println("\n[Test] reintegro de 200");
        cuenta.reintegrar(200);
        System.out.println("Saldo actual: " + cuenta.getSaldo() + "€");
        cuenta.ingresar(100);
        cuenta.reintegrar(200);
        assertEquals(-250, cuenta.getSaldo(), "El saldo debe ser -250 después del proceso");
    }
    @Test
    void cuenta2() {
        
        cuenta2.reintegrar(350);
        System.out.println("Saldo cuenta2 actual: " + cuenta2.getSaldo() + "€");
        cuenta2.reintegrar(200);
        System.out.println("Saldo cuenta2 actual: " + cuenta2.getSaldo() + "€");
        cuenta2.reintegrar(150);
        System.out.println("Saldo cuenta2 actual: " + cuenta2.getSaldo() + "€");
        cuenta2.ingresar(50);
        cuenta2.reintegrar(100);
        System.out.println("Saldo cuenta2 actual: " + cuenta2.getSaldo() + "€");
        
        assertEquals(-450, cuenta2.getSaldo(), "El saldo debe ser cuenta2 -450 después del proceso");
    }
    
}

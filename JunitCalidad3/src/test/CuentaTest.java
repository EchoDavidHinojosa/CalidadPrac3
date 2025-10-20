package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {

    private static Cuenta cuenta; // compartida entre todos los tests

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println(">>> INICIANDO TESTS DE CUENTA");
        cuenta = new Cuenta(12345, 50);
        System.out.println("Saldo inicial: " + cuenta.getSaldo() + "€");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println(">>> FINALIZANDO TESTS DE CUENTA");
        System.out.println("Saldo final de la cuenta: " + cuenta.getSaldo() + "€");
    }

    @Test
    void reintegro() {
        System.out.println("\n[Test] reintegro de 200");
        cuenta.reintegrar(200);
        System.out.println("Saldo actual: " + cuenta.getSaldo() + "€");
        cuenta.ingresar(100);
        cuenta.reintegrar(200);
        assertEquals(-250, cuenta.getSaldo(), "El saldo debe ser -250 después del proceso");
    }

}

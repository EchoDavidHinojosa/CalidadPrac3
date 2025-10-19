package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pkg.Cuenta;

class CuentaTest {
	
	Cuenta cuenta;
	
	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta(0); 
	}

	@AfterEach
	void tearDown() throws Exception {
		cuenta = null; 
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(500);
		assertEquals(500, cuenta.getsaldo());
	}

	@Test
	void testRetirar() {
		cuenta.retirar(500);
		assertEquals(-500, cuenta.getsaldo());
	}
}

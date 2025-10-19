package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import pkg.Empleado;
import pkg.Empleado.TipoEmpleado;

class TestEmpleado {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	void testcalculoNominaBruta1() {
	    float valorEsperado = 2000;
	    float valorReal = Empleado.calculaNominaBruto(TipoEmpleado.Vendedor, 500f, 0f);
	    assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testcalculoNominaBruta2() {
	    float valorEsperado = 2100;
	    float valorReal = Empleado.calculaNominaBruto(TipoEmpleado.Vendedor, 1000f, 0f);
	    assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testcalculoNominaBruta3() {
	    float valorEsperado = 2200;
	    float valorReal = Empleado.calculaNominaBruto(TipoEmpleado.Vendedor, 1500f, 0f);
	    assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testcalculoNominaBruta4() {
	    float valorEsperado = 2500;
	    float valorReal = Empleado.calculaNominaBruto(TipoEmpleado.Encargado, 500f, 0f);
	    assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testcalculoNominaBruta5() {
	    float valorEsperado = 2600;
	    float valorReal = Empleado.calculaNominaBruto(TipoEmpleado.Encargado, 1000f, 0f);
	    assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testcalculoNominaBruta6() {
	    float valorEsperado = 2700;
	    float valorReal = Empleado.calculaNominaBruto(TipoEmpleado.Encargado, 1500f, 0f);
	    assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testcalculoNominaBruta7() {
	    float valorEsperado = 2060;
	    float valorReal = Empleado.calculaNominaBruto(TipoEmpleado.Vendedor, 500f, 2f);
	    assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	void testcalculoNominaNeta1() {
	    float valorEsperado = 2000f;
	    float valorReal = Empleado.calculaNominaNeta(2000f);
	    assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testcalculoNominaNeta2() {
	    float valorEsperado = 2100f * 0.85f;
	    float valorReal = Empleado.calculaNominaNeta(2100f);
	    assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testcalculoNominaNeta3() {
	    float valorEsperado = 2400f * 0.85f;
	    float valorReal = Empleado.calculaNominaNeta(2400f);
	    assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testcalculoNominaNeta4() {
	    float valorEsperado = 2500f * 0.82f;
	    float valorReal = Empleado.calculaNominaNeta(2500f);
	    assertEquals(valorEsperado, valorReal);
	}

	@Test
	void testcalculoNominaNeta5() {
	    float valorEsperado = 3000f * 0.82f;
	    float valorReal = Empleado.calculaNominaNeta(3000f);
	    assertEquals(valorEsperado, valorReal);
	}

}

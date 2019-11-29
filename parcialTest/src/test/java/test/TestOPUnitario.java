package test;

import static org.junit.Assert.*;

import org.junit.Test;

import uan.edu.parcial.Calculadora;

public class TestOPUnitario {

	static Calculadora calc;
	
	@Test
	public void testSuma() {
		calc = new Calculadora();
		Double valorReal = calc.sumar(6.0, 3.0);
		Double valorEsperado = 9.0;
		
		/**
		 * El valor que espera, el valor que se está ejecutando (6+3) 
		 */
		assertEquals(valorEsperado, valorReal);
		
	}
	
	@Test
	public void testResta() {
		calc = new Calculadora();
		Double valorReal = calc.restar(6.0, 3.0);
		Double valorEsperado = 3.0;
		assertEquals(valorEsperado, valorReal);
		
	}
	
	@Test
	public void testMultiplicar() {
		calc = new Calculadora();
		Double valorReal = calc.multiplicar(6.0, 3.0);
		Double valorEsperado = 18.0;
		assertEquals(valorEsperado, valorReal);
		
	}
	
	@Test
	public void testDividir() {
		calc = new Calculadora();
		Double valorReal = calc.dividir(6.0, 3.0);
		Double valorEsperado = 2.0;
		assertEquals(valorEsperado, valorReal);
		
	}

}

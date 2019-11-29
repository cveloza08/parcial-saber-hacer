package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import uan.edu.parcial.Calculadora;

@RunWith(Suite.class) //Me indica que es una suite ( y se ejecutará a la par con los modulos
@SuiteClasses({ TestOPUnitario.class }) //indica que la clase debe ejecutarse con los tests añadidos a la clase mencionada
public class Componente {
	
	static Calculadora calc;
	
	/**
	 * El componente calculadora debe estar creado ANTES de la ejecución para acceder a 
	 * sus modulos unitarios, si no, se testeara como error
	 */
	@Before
	public void testComponente() {
		calc = new Calculadora(6.0, 3.0);
		
	}
	
	/**
	 * Se prueba 6*3 elevado a (6/2) -> 6*3=18 -> 18**2 = 324
	 */
	@Test
	public void modulosUnitarios() {
		Double valorReal = calc.potencia();
		Double valorEsperado = 324.0;
		assertEquals(valorEsperado, valorReal);
		
	}

}

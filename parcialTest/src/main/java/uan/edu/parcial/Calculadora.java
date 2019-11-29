package uan.edu.parcial;

public class Calculadora implements Operaciones<Double> {

	private Double valorA;
	private Double valorB;

	public Calculadora() {
	}

	public Calculadora(Double valorA, Double valorB) {
		this.valorA = valorA;
		this.valorB = valorB;
	}

	public Double sumar(Double a, Double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public Double restar(Double a, Double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	public Double multiplicar(Double a, Double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	public Double dividir(Double a, Double b) {
		// TODO Auto-generated method stub
		return (a / b) + (a % b);
	}
	
	public Double potencia() {
		Double base = multiplicar(valorA, valorB);
		Double exponente = multiplicar(valorA, valorB);
		return Math.pow(base, exponente);
	}

}

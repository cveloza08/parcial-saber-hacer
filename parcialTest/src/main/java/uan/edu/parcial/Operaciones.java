package uan.edu.parcial;

public interface Operaciones<T> {

	T sumar(T a, T b);
	T restar(T a, T b);
	T multiplicar(T a, T b);
	T dividir(T a, T b);
	
	// el src/test/java se ejecuta cada clase a probar como jUnit
	
}

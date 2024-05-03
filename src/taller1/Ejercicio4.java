package taller1;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*
		 * 4. Realice un programa que permita calcular el sueldo final de un empleado, tenga en cuenta que
		 * el sueldo depende de un incremento del 30%, haga el algoritmo definiendo el porcentaje como una
		 * constante y asignando el sueldo directamente a la variable.
		 */
		
		final double INCREMENTO = 0.3; // Incremento del 30%
		int sueldoNormal = 1500000;
		double sueldoFinal = sueldoNormal + (sueldoNormal * INCREMENTO);
		System.out.println("Su sueldo es de = " + sueldoFinal);
		
	}

}

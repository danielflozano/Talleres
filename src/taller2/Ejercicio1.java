package taller2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*
		 * 1.	Modifique el  programa que permita calcular el sueldo final de un empleado, tenga en cuenta
		 * que el sueldo depende de un incremento del 30%, haga el algoritmo definiendo el porcentaje como
		 * una constante pero solicite los datos de entrada mediante cada una de las técnicas vistas en esta guía.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		final double INCREMENTO = 0.3; // Incremento del 30%
		System.out.print("Ingrese el nombre del empleado ");
		String nombre = entrada.nextLine();
		System.out.print("Ingrese el sueldo de " + nombre + " ");
		int sueldoNormal = entrada.nextInt();
		double sueldoFinal = sueldoNormal + (sueldoNormal * INCREMENTO);
		System.out.println("El sueldo de " + nombre +  " es de = " + sueldoFinal);
		
		entrada.close();
		
	}

}

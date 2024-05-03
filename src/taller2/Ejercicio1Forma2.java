package taller2;

import javax.swing.JOptionPane;

public class Ejercicio1Forma2 {
	public static void main(String[] args) {
		
		/*
		 * 1.	Modifique el  programa que permita calcular el sueldo final de un empleado, tenga en cuenta
		 * que el sueldo depende de un incremento del 30%, haga el algoritmo definiendo el porcentaje como
		 * una constante pero solicite los datos de entrada mediante cada una de las técnicas vistas en esta guía.
		 */
		
		final double INCREMENTO = 0.3; // Incremento del 30%
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
		String entradaSueldo = JOptionPane.showInputDialog("Ingrese el sueldo de " + nombre);
		double sueldoNormal = Double.parseDouble(entradaSueldo);
		double sueldoFinal = sueldoNormal + (sueldoNormal * INCREMENTO);
		
		JOptionPane.showMessageDialog(null, "El sueldo de " + nombre +  " es de = " + sueldoFinal);
		
	}

}

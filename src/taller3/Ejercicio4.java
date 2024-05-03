package taller3;

/*
 * Ej: algoritmo que determina cuando una persona es mayor o menor de edad, teniendo como mayor de edad
 * las personas con edades iguales o superiores a 18 años.
 * Ejercicio: modifique el algoritmo anterior para solicitar los datos de entrada al usuario, aplique alguna
 * de las técnicas vistas con anterioridad.
 */

import javax.swing.JOptionPane;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Ingrese la edad");
		int edad = Integer.parseInt(entrada);
		
		if(edad>=18) {
			JOptionPane.showMessageDialog(null, "La persona es mayor de edad.");
		}else {
			JOptionPane.showMessageDialog(null, "La persona no es mayor de edad.");
		}

	}

}

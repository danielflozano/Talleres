package taller3;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	
	/*
	 * Crear un algoritmo que lea un número entero y si el número es negativo, lo convierta a un número positivo y Luego lo imprima.
	 * Actividad: Analice el algoritmo anterior, verifique si la condición se cumple y porque, modifique el algoritmo para validar
	 * el ingreso de nuevos datos, utilice las técnicas vistas con anterioridad para solicitar el ingreso de datos al usuario.
	 * */
	
	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Ingrese un valor");
		int a = Integer.parseInt(entrada);
		
		if(a<0) {
			a = a * -1;
		}
		
		JOptionPane.showMessageDialog(null, "El numero es " + a);
		
	}

}

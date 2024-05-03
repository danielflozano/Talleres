package taller3;

import javax.swing.JOptionPane;

/*
 * algoritmo para determinar cuándo un número es mayor, menor o igual a cero.
 * Actividad: analice el ejercicio anterior, modifíquelo para que el usuario pueda ingresar el valor
 * que quiera validar, posteriormente haga una prueba de escritorio para evaluar su comportamiento.
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog(null, "Ingrese el número");
		double valor = Double.parseDouble(entrada);
		
		if(valor>0) {
			JOptionPane.showMessageDialog(null, "El número es mayor que cero.");
		} else {
			if(valor<0) {
				JOptionPane.showMessageDialog(null, "El número es menor que cero.");
			} else {
				JOptionPane.showMessageDialog(null, "El número es igual que cero."); 
			}
		}		

	}

}

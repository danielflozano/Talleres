package taller3;

import javax.swing.JOptionPane;

/*
 *Ejercicio: Cree un algoritmo en java que, basado en la siguiente tabla, lea un número entero e imprima el nombre de la estación correspondiente.
 *Código	 Estación
 *  1	     Invierno
 *  2	     Verano
 *  3	     Otoño
 *  4	     Primavera
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Ingrese un número");
		int numero = Integer.parseInt(entrada);
		
		switch (numero) {
		case 1:
			System.out.println("La estación es Invierno.");			
			break;
		case 2:
			System.out.println("La estación es Verano.");			
			break;
		case 3:
			System.out.println("La estación es Otoño.");			
			break;
		case 4:
			System.out.println("La estación es Primavera.");		
			break;
		default:
			if (numero < 1 || numero >4) {
				System.out.println("El valor ingresado no es valido");
			break;
			}
		
		}
		
	}

}

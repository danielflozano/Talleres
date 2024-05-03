package taller3;

import java.util.Scanner;

public class Ejercicio2 {
	
	/*
	 * Haga un algoritmo que permita calcular el precio de una compra, donde, por compras superiores a $50.000
	 * se hace un descuento del 10% sobre el valor inicial.*
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el valor de la venta ");
		double valor = entrada.nextDouble();
		
		if(valor>50000) {
			valor = valor - (valor*0.1);
		}
		
		System.out.println("El precio total es: " + valor);
		
		entrada.close();
		
	}

}

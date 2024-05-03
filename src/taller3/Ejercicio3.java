package taller3;

import java.util.Scanner;

public class Ejercicio3 {
	
	/*
	 * Haga un algoritmo que imprima cual es el mayor de 2 números.
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el primer número ");
		int num1 = entrada.nextInt();
		
		System.out.print("Ingrese el segundo número ");
		int num2 = entrada.nextInt();
		
		if(num1<num2) {
			num1 = num2;
		}
		
		System.out.println("El número mayor es: " + num1);
		
		entrada.close();
	}

}

package taller2;

import java.util.Scanner;

public class Ejercicio2 {
	
	/*
	 * 2.	Haga un algoritmo que permita imprimir el resultado del ejemplo propuesto sobre la precedencia
	 * de operadores de la guía anterior, pero deberá solicitar los valores aplicando cada una de las técnicas
	 * vistas en esta guía.
	 * 10/5+6-2+3*8*1-12/2+9-7*4 = a / b + c - d + e * f * g - h / d + i - j * k;
	 * */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el primer valor ");
		int a = entrada.nextInt();
		
		System.out.print("Ingrese el segundo valor ");
		int b = entrada.nextInt();		
		
		System.out.print("Ingrese el tercer valor ");
		int c = entrada.nextInt();		
		
		System.out.print("Ingrese el cuarto valor ");
		int d = entrada.nextInt();		
		
		System.out.print("Ingrese el quinto valor ");
		int e = entrada.nextInt();		
		
		System.out.print("Ingrese el sexto valor ");
		int f = entrada.nextInt();		
		
		System.out.print("Ingrese el septimo valor ");
		int g = entrada.nextInt();
				
		System.out.print("Ingrese el octavo valor ");
		int h = entrada.nextInt();		
		
		System.out.print("Ingrese el noveno valor ");
		int i = entrada.nextInt();		
		
		System.out.print("Ingrese el decimo valor ");
		int j = entrada.nextInt();		
		
		System.out.print("Ingrese el ultimo valor ");
		int k = entrada.nextInt();
		
		int precedenciaOperadores = a / b + c - d + e * f * g - h / d + i - j * k;
		
		System.out.println("El resultado del ejemplo es = " + precedenciaOperadores);
		
		entrada.close();
		
	}

}

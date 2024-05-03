package taller2;

import javax.swing.JOptionPane;

public class Ejercicio2Forma2 {
	
	/*
	 * 2.	Haga un algoritmo que permita imprimir el resultado del ejemplo propuesto sobre la precedencia
	 * de operadores de la guía anterior, pero deberá solicitar los valores aplicando cada una de las técnicas
	 * vistas en esta guía.
	 * 10/5+6-2+3*8*1-12/2+9-7*4 = a / b + c - d + e * f * g - h / d + i - j * k;
	 * */
	
	public static void main(String[] args) {
		
		String entrada1 = JOptionPane.showInputDialog("Ingrese el primer valor");
		int a = Integer.parseInt(entrada1);
		
		String entrada2 = JOptionPane.showInputDialog("Ingrese el segundo valor");
		int b = Integer.parseInt(entrada2);

		String entrada3 = JOptionPane.showInputDialog("Ingrese el tercero valor");
		int c = Integer.parseInt(entrada3);
		
		String entrada4 = JOptionPane.showInputDialog("Ingrese el cuarto valor");
		int d = Integer.parseInt(entrada4);
		
		String entrada5 = JOptionPane.showInputDialog("Ingrese el quinto valor");
		int e = Integer.parseInt(entrada5);
		
		String entrada6 = JOptionPane.showInputDialog("Ingrese el sexto valor");
		int f = Integer.parseInt(entrada6);
		
		String entrada7 = JOptionPane.showInputDialog("Ingrese el septimo valor");
		int g = Integer.parseInt(entrada7);
		
		String entrada8 = JOptionPane.showInputDialog("Ingrese el octavo valor");
		int h = Integer.parseInt(entrada8);
		
		String entrada9 = JOptionPane.showInputDialog("Ingrese el noveno valor");
		int i = Integer.parseInt(entrada9);
		
		String entrada10 = JOptionPane.showInputDialog("Ingrese el decimo valor");
		int j = Integer.parseInt(entrada10);
		
		String entrada11 = JOptionPane.showInputDialog("Ingrese el ultimo valor");
		int k = Integer.parseInt(entrada11);
		
		int precedenciaOperadores = a / b + c - d + e * f * g - h / d + i - j * k;
		
		JOptionPane.showMessageDialog(null, "El resultado del ejemplo es = " + precedenciaOperadores);
		
	}

}

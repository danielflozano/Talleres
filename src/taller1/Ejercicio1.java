package taller1;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. Evalúe cuál de la siguientes expresiones es verdadera y cuál es falsa (true o false)
		 */
		
		int x = 8;
		int y = 5; 
		
		boolean operacion1 = (x <= y);
		System.out.println("8 <= 5 " + operacion1);
		
		x = 3;
		y = 6;
		
		boolean operacion2 = (x > y);
		System.out.println("3 > 6 = " + operacion2);
		
		x = 4;
		y = 7;
		
		boolean operacion3 = ( x != y);
		System.out.println("4 != 7 " + operacion3);
		
		int b = 5;
		boolean operacion4 = (b == b + 1);
		System.out.println("b == b + 1 = " + operacion4);
		
		int c = 3;
		boolean operacion5 = (c++ != c++);
		System.out.println("c++ != c++ = " + operacion5);
		
		boolean operacion6 = (19 == 19);
		System.out.println("19 == 19 = " + operacion6);
		
	}

}

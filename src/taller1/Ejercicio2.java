package taller1;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*
		 * 2. Determine porque el resultado del siguiente enunciado es falso (false)
		 * (7 > 10 || 10 > 2 && 3 == 4)
		 */
		
		boolean operacion7 = (7 > 10 || 10 > 2 && 3 == 4);
		System.out.println("La operación es " + operacion7 + " ya que 3 no es igual a 4 y al "
				+ "tener el operador && esta condicion se debe cumplir obligatoriamente.");
		
	}
}

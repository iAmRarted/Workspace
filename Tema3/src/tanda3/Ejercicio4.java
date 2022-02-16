package tanda3;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Programa que pide un número y lo visualiza al revés
		
		int n, num, numFinal = 0;
		
		System.out.print("Introduce un número: ");
		n = Consola.leeInt();
		
		num = n;
		
		
		while (num > 0)
		{
			numFinal = numFinal * 10 + (num % 10);
			num /= 10;
		}
		System.out.println("El número al revés es: " + numFinal);
	}
}

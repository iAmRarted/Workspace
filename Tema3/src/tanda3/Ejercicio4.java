package tanda3;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Programa que pide un n�mero y lo visualiza al rev�s
		
		int n, num, numFinal = 0;
		
		System.out.print("Introduce un n�mero: ");
		n = Consola.leeInt();
		
		num = n;
		
		
		while (num > 0)
		{
			numFinal = numFinal * 10 + (num % 10);
			num /= 10;
		}
		System.out.println("El n�mero al rev�s es: " + numFinal);
	}
}

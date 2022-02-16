package tanda3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Programa que pide dos números y visualiza su mcd

		
		int a, b, num, resto1, resto2, mcd;
		
		System.out.println("Introduzca el primer número:");
		a = Consola.leeInt();
		
		System.out.println("Introduzca el segundo número");
		b = Consola.leeInt();
		
		
		resto1 = a % b;
		
		num = b;

		while(resto1 != 0)
		{
			
			resto2 = num % resto1;
			num = resto1;
			resto1 = resto2;
		}
		
		mcd = num;
		
		System.out.println("El mcd de " + a + " y " + b + " es " + mcd);
	}
}

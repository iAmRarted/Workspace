package tanda2;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Programa que pide un número y visualiza los números amigos inferiores.
		
		
		int num, cont, div, num1;
		
		num1 = 1;
		div = 0;
		
		System.out.print("Introduce un número: ");
		num = Consola.leeInt();
		while (num1 < num)
		{
			cont = 1;
			div = 0;
			while (cont < num1)
			{
				if(num1 % cont == 0)
				{
					div += cont;
				}
				cont++;
			}
			if(div == num)
			{
				break;
			}
			num1++;
		}
		if (div == num)
		{
			System.out.println(num + " y " + num1 + " son amigos.");
		}
		else
		{
			System.out.println(num + " no tiene amigos.");
		}
	}
}

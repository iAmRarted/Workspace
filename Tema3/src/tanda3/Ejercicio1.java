package tanda3;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Programa que muestra n números primos a partir de num

		
		int n, num, num1, cont, sumaPrimos;
		float mediaPrimos;
		boolean esPrimo;
		
		
		cont = 1;
		sumaPrimos = 0;
		mediaPrimos = 0;
		
		System.out.println("Introduce cuantos números primos quieres visualizar:");
		n = Consola.leeInt();
		
		System.out.println("Introduce a partir de qué número quieres visualizarlos:");
		num = Consola.leeInt();
		
		num1 = num;
		while (cont <= n)
		{
			esPrimo = true;
			for (int pd = 2; pd <= (num1/2) && (esPrimo == true); pd++)
			{
				if (num1 % pd == 0)
					esPrimo = false;
			}
			
			if (esPrimo == true)
			{
				System.out.println(num1);
				cont++;
				sumaPrimos += num1;
			}
			
			num1++;
		}
		
		if (n > 0)
		{
			mediaPrimos = sumaPrimos / (float)n;
			System.out.println("Y la media es: " + mediaPrimos);
		}
	}
}

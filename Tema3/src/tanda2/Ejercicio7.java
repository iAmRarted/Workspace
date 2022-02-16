package tanda2;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Programa que pide un número entero positivo y escribe en la pantalla su factorización

		
		long n, num, cont = 2;
		int flag = 0;
		
		System.out.println("Introduce un número entero positivo:");
		n = Consola.leeLong();
		
		
		num = n;
		
		System.out.print(n + " = ");
		while (cont <= num)
		{
			if ((num % cont) == 0)
			{
				if (flag == 0)
				{
					System.out.print(cont);
					flag = 1;
				}
				else
				{
					System.out.print(" * " + cont);
				}
				
				num /= cont;
			}
			else
			{
				cont++;
			}
		}
	}
}

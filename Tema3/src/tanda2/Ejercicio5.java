package tanda2;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Programa que pide un número en binario, lo valida y lo pasa a decimal.
		

		long n, num, pot = 1, result = 0;
		int cont = 0, i = 1;
		boolean binario;

		
		
		
		binario = true;
		System.out.println("Introduce un número en binario");
		n = Consola.leeLong();
		
		num = n;
		
		while ((num > 0) && (binario == true))
		{
			if ((num % 10) == 1)
			{
				while (i <= cont)
				{
					pot *= 2;
					i++;
				}
				
				result += pot;
			}
			else
			{
				if ((num % 10) != 0)
				{
					binario = false;
				}
			}
			
			num /= 10;
			cont++;
		}
		
		
		
		if (binario == true)
		{
			System.out.println("El número binario sería " + result + " en decimal.");
		}
		else
		{
			System.out.println("Error. No se puede interpretar como binario.");
		}
	}
}

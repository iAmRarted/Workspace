package tanda2;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Programa que visualiza una piramide de letras.
		
		
		int n;
		char letra;
		
		
		do
		{
			System.out.println("Introduce la dimensión (1-27):");
			n = Consola.leeInt();
		}	
		while ((n < 1) || (n > 27));
		
		
		for (int contf = 1; contf <= n; contf++)
		{
			letra = 'A';
			for (int contEsp1 = (n - contf); contEsp1 > 0; contEsp1--)
			{
				System.out.print("  ");
			}
			
			
			for (int contLetra = 1; contLetra <= ((2 * contf) -1); contLetra++)
			{
				System.out.print(letra + " ");
				if (contLetra < contf)
				{
					letra++;
				}
				else
				{
					letra--;
				}
			}
			System.out.println();
		}
	}
}

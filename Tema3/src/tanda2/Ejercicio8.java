package tanda2;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Programa que lee una dimensión y visualiza una escalera invertida de asteriscos.
		
		
		int n;
		
		System.out.println("Introduce la dimensión:");
		n = Consola.leeInt();
		
		for (int contf = 0; contf < n; contf++)
		{
			for (int contEspacios = 0; contEspacios < contf; contEspacios++)
			{
				System.out.print(" ");
			}
			
			
			for (int contAsteriscos = (n - contf); contAsteriscos >= 1; contAsteriscos--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}

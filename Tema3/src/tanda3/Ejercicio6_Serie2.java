package tanda3;

public class Ejercicio6_Serie2 {

	public static void main(String[] args) {
		// Pedir la dimensión de la serie, validando que sea impar el número introducido
		
		int n, espacios;
		
		
		do
		{
			System.out.print("Introduce la dimensión que quieres que tenga la serie (debe ser impar): ");
			n = Consola.leeInt();
			
		}
		while (n % 2 == 0);
		
		espacios = n - 2;
		
		
		// Bucle para hacer la mitad de arriba de la serie
		
		for (int contFila = 1; contFila <= n / 2; contFila++)
		{
			
			
			for (int espacioInicio = n; espacioInicio > n - (contFila - 1); espacioInicio--)
			{
				System.out.print(" \t");
			}
			
			System.out.print("X\t");
			
			
			
					
			for (int espacioMedio = 1; espacioMedio <= espacios; espacioMedio++)
			{
				System.out.print(" \t");
			}
			System.out.println('X');
			
			espacios -= 2;
		}
		
		
		// Bucle para X del medio
		
		for (int espacioInicio = 1; espacioInicio <= n / 2; espacioInicio++)
		{
			System.out.print(" \t");
		}
		System.out.println('X');
		
		espacios += 2;
		// Bucle para hacer la mitad de abajao de la serie
		
		for (int contFila = 1; contFila <= n / 2; contFila++)
		{
			
			
			for (int espacioInicio = 1; espacioInicio < (n / 2) - (contFila - 1); espacioInicio++)
			{
				System.out.print(" \t");
			}
			
			System.out.print("X\t");
			
			
			
					
			for (int espacioMedio = 1; espacioMedio <= espacios; espacioMedio++)
			{
				System.out.print(" \t");
			}
			System.out.println('X');
			
			espacios += 2;
		}
	}

}

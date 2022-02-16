package tanda3;

public class Ejercicio6_Serie3 {

	public static void main(String[] args) {
		
		// Pedir nº al usuario filas y validar impar
		
		
		int n, sw = 1;
		char caracter = 'Y';
		
		do
		{
			System.out.print("Introduce la dimensión para la serie: ");
			n = Consola.leeInt();
		}
		while (n % 2 == 0);
		
		
		// Parte de arriba de la serie
		
		for (int contFila = 1; contFila <= (n / 2) + 1; contFila++)
		{
			for (int espacios = 1; espacios <= ((n / 2) + 1) - contFila; espacios++)
			{
				System.out.print("  ");
			}
			
			
			
			for (int contColumna = 1; contColumna <= contFila * 2 - 1; contColumna++)
			{
				System.out.print(caracter + " ");
				if (sw == 1)
					caracter = 'X';
				else
					caracter = 'Y';
				sw *= -1;
			}
			System.out.println();
			
		}
		
		
		// Parte de abajo de la serie
		
		for (int contFila = 1; contFila <= n / 2; contFila++)
		{
			for (int espacios = 1; espacios <= contFila; espacios++)
			{
				System.out.print("  ");
			}
			
			
			for (int contColumna = 1; contColumna <= n - contFila * 2; contColumna++)
			{
				System.out.print(caracter + " ");
				if (sw == 1)
					caracter = 'X';
				else
					caracter = 'Y';
				sw *= -1;
			}
			System.out.println();
		}
	}
}

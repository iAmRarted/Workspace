package tanda3;

public class Ejercicio6_Serie1 {

	public static void main(String[] args) {
		
		// Pedir número de filas de la serie al usuario
		
		int n, sw = 1, contCaracteres = 1;
		char caracter;
		
		
		System.out.print("Introduce la cantidad de filas que quieres mostrar de la serie: ");
		n = Consola.leeInt();
		System.out.println();
		
		for (int contFila = 0; contFila < n; contFila++)
		{
			if (sw == 1)
				caracter = 'X';
			else
				caracter = 'Y';
			
			
			for (int espacios = 1; espacios < n - contFila; espacios++)
			{
				System.out.print(" \t");
			}
			
			for (int contColumna = 1; contColumna <= contCaracteres; contColumna++)
			{
				System.out.print(caracter + "\t");
			}
			System.out.println();
			
			contCaracteres += 2;
			sw *= -1;
		}

	}

}

package tanda3;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Visualiza la siguiente serie con el número de filas que desee el usuario
		
		int n, num, numInicio = 1, sw = 1, suma;
		
		
		System.out.print("Introduce la cantidad de filas que desea visualizar de la serie: ");
		n = Consola.leeInt();
		
		
		for (int contFila = 1; contFila <= n; contFila++)
		{
			
			num = numInicio;
			suma = contFila;
			
			for (int espacios = 1; espacios + 1 <= contFila; espacios++)
			{
				System.out.print(" \t");
			}
			
			for (int contColumna = 1; contColumna <= contFila + 2; contColumna++)
			{
				System.out.print(num + "\t");
				num += suma;
				suma++;
			}
			System.out.println();
			
			if (sw == 1)
				numInicio += 1;
			else
				numInicio *= 3;
			sw *= -1;
			}
		}
	}
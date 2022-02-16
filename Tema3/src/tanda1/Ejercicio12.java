package tanda1;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		//Programa que visualiza un triángulo de una serie.
		
		
		int n, num, numInicio;
		
		//Se pide la dimensión del triángulo.
		System.out.println("Introduce la dimensión: ");
		n = Consola.leeInt();
		
		//Inicia el número de inicio de fila.
		numInicio = n * 10;
		
		//Se calcula y el siguiente término y se visualiza.
		for (int contf = 1; contf <= n; contf++)
		{
			num = numInicio;
			for (int contc = 1; contc <= contf; contc++)
			{
				System.out.print(num + "\t");
				num -= n - (contf - 1);
			}
			
			System.out.println();
			numInicio -= 10;
		}
	}

}

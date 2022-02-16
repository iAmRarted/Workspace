package tanda3;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// El programa pide un nº y se visualiza la serie dada la dimensión
		
		int n, numInicio = 1, num, suma;
		
		System.out.print("Introduce la dimensión para la serie: ");
		n = Consola.leeInt();
		
		for (int contFila = 1; contFila <= n; contFila++)
		{
			numInicio *= contFila;
			num = numInicio;
			suma = contFila;
			for (int espacios = 1; espacios <= n - contFila; espacios++)
			{
				System.out.print(" \t");
			}
			for (int contColumna = 1; contColumna <= contFila * 2 - 1; contColumna++)
			{
				System.out.print(num + "\t");
				if ((contFila * 2 - 1) / 2 > contColumna)
				{
					num += suma;
					suma++;
				}
				else
				{
					if ((contFila * 2 - 1) / 2 < contColumna)
					{
						num -= suma;
						suma--;
					}
					else
					{
						num += suma;
					}
				}
			}
			System.out.println();
		}
	}
}

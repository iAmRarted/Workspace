package tanda2;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Programa que muestra un menú con diferentes opciones y la "E" para salir. Cada opción pide un número entero, hace una
		 * operación y visualiza el resultado.
		 */
		
		char opcion;
		int num, seg, min, hora, suma, contB, sumatorioC, factorialD;
		
		
		do
		{
			System.out.println("Elige una opción:");
			System.out.println("A-  Desglosar segundos");
			System.out.println("B-  Número triangular");
			System.out.println("C-  Sumatorio");
			System.out.println("D-  Factorial");
			System.out.println("E-  Salir");
			
			opcion = Consola.leeChar();
			
			
			switch (opcion)
			{
			case 'A':
				min = 0;
				hora = 0;
				System.out.println("Introduce los segundos para desglosarlos en horas, minutos y segundos:");
				num = Consola.leeInt();
				
				seg = num;
				
				if (seg >= 60)
				{
					min = seg / 60;
					seg -= (min * 60);
				}
				
				if (min >= 60)
				{
					hora = min / 60;
					min -= (hora * 60);
				}
				
				System.out.println(num + " segundos son " + hora + " horas, " + min + " minutos y " + seg + " segundos");
				break;
				
			case 'B':
				System.out.println("Introduce un número para ver si es triangular:");
				num = Consola.leeInt();
				
				suma = 0;
				contB = 1;
				
				while (suma < num)
				{
					suma += contB;
					contB++;
				}
				contB--;
				
				if (suma == num)
				{
					System.out.println("El número es triangular.");
				}
				break;
				
			case 'C':
					System.out.println("Introduce un número para visualizar su sumatorio:");
					num = Consola.leeInt();
					
					sumatorioC = 0;
					
					for (int contC = 1; contC <= num; contC++)
					{
						sumatorioC += contC;
					}
					
					System.out.println("El sumatorio del número introducido es: " + sumatorioC);
					break;
					
			case 'D':
				System.out.println("Introduce un número para sacar su factorial: ");
				num = Consola.leeInt();
				
				while (num >= 20)
				{
					System.out.println("Introduce un número menor a 20");
					num = Consola.leeInt();
				}
				
				factorialD = 1;
				
				for (int contD = 1; contD <= num; contD++)
				{
					factorialD *= contD;
				} 
				System.out.println("El factorial del número introducido es: " + factorialD);
				break;
				
			case 'E':
				System.out.println("Has elegido salir del programa. Saliendo...");
				break;
				
			default:
				System.out.println("Por favor una letra en el rango A-E.");
			}
		}
		
		while (opcion != 'E');
	}
}

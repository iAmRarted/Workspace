package tanda1;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		// Programa que visualiza los d�gitos de un n�mero los suma y visualiza el resultado y la cantidad de d�gitos.
		
		
		int num, n1, cont = 0, suma = 0;
		
		//Se pide el n�mero.
		System.out.println("Introduce un n�mero:");
		n1 = Consola.leeInt();
		num = n1;
		
		/*
		 * Se consigue el resto del n�mero entre 10 y se guarda en una variable que va sum�ndose, se divide el n�mero entre 10 para conseguir el siguiente d�gito y se aumenta el contador que
		 * contiene la cantidad de d�gitos.
		*/
		while (num > 0)
		{
			
			suma += num % 10;
			num /= 10;
			cont++;
		}
		
		
		System.out.println("La suma de los d�gitos es: " + suma + " y la cantidad de d�gitos es: " + cont);
		
	}

}

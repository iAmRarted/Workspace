package tanda1;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		// Programa que visualiza los dígitos de un número los suma y visualiza el resultado y la cantidad de dígitos.
		
		
		int num, n1, cont = 0, suma = 0;
		
		//Se pide el número.
		System.out.println("Introduce un número:");
		n1 = Consola.leeInt();
		num = n1;
		
		/*
		 * Se consigue el resto del número entre 10 y se guarda en una variable que va sumándose, se divide el número entre 10 para conseguir el siguiente dígito y se aumenta el contador que
		 * contiene la cantidad de dígitos.
		*/
		while (num > 0)
		{
			
			suma += num % 10;
			num /= 10;
			cont++;
		}
		
		
		System.out.println("La suma de los dígitos es: " + suma + " y la cantidad de dígitos es: " + cont);
		
	}

}

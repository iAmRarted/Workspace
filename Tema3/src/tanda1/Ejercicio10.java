package tanda1;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Programa que muestra los números menores de 10000 de la serie 1 2 5 26...
		 
		
		int n;
		
		n = 1;
				
		
		while (n < 10000)
		{
			System.out.print(n + " ");
			n = ((n*n)+1);
		}

	}

}

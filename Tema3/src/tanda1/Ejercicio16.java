package tanda1;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		// Programa que lee 10 números e indica su orden.
		
		
		int num1, num2;
		boolean creciente = false, decreciente = false;
		
		
		//Se pide el primer número.
		System.out.println("Introduce un número: ");
		num1 = Consola.leeInt();
		
		/*
		 *Como ya hemos pedido el primer número repetimos el ciclo de pedir número 9 veces en vez de 10.
		 *Ya que le damos el valor del primer número al segundo, volvemos a pedir el valor del primer número y comparamos su orden.
		*/
		for (int i = 1; i <= 9; i++)
		{
			num2 = num1;
			System.out.println("Introduce un número: ");
			num1 = Consola.leeInt();
			
			//Comprobamos el tipo de orden que tienen los dos números introducidos.
			if(num1 < num2)
			{
				decreciente = true;
			}
			else
			{
				if(num1 > num2)
				{
					creciente = true;
				}
			}
			//No se tiene en cuenta que se introduzca un número igual porque no alteraría el orden.
		}
		
		//Si ha habido de los dos tipos de orden en los 10 números es que están desordenados, sino, solo habrá un tipo de orden que devuelva true.
		if ((decreciente == true) && (creciente == true))
		{
			System.out.println("Están desordenados.");
		}
		else
		{
			if (decreciente == true)
			{
				System.out.println("Están en orden decreciente.");
			}
			else
			{
				System.out.println("Están en orden creciente.");
			}
		}
	}
}

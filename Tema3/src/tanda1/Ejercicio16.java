package tanda1;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		// Programa que lee 10 n�meros e indica su orden.
		
		
		int num1, num2;
		boolean creciente = false, decreciente = false;
		
		
		//Se pide el primer n�mero.
		System.out.println("Introduce un n�mero: ");
		num1 = Consola.leeInt();
		
		/*
		 *Como ya hemos pedido el primer n�mero repetimos el ciclo de pedir n�mero 9 veces en vez de 10.
		 *Ya que le damos el valor del primer n�mero al segundo, volvemos a pedir el valor del primer n�mero y comparamos su orden.
		*/
		for (int i = 1; i <= 9; i++)
		{
			num2 = num1;
			System.out.println("Introduce un n�mero: ");
			num1 = Consola.leeInt();
			
			//Comprobamos el tipo de orden que tienen los dos n�meros introducidos.
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
			//No se tiene en cuenta que se introduzca un n�mero igual porque no alterar�a el orden.
		}
		
		//Si ha habido de los dos tipos de orden en los 10 n�meros es que est�n desordenados, sino, solo habr� un tipo de orden que devuelva true.
		if ((decreciente == true) && (creciente == true))
		{
			System.out.println("Est�n desordenados.");
		}
		else
		{
			if (decreciente == true)
			{
				System.out.println("Est�n en orden decreciente.");
			}
			else
			{
				System.out.println("Est�n en orden creciente.");
			}
		}
	}
}

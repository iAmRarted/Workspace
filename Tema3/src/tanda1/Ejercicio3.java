package tanda1;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Programa que pide 2 n�meros y un operando y saca el resultado.
		
		
		float num1, num2, resultado;
		char operator;
		
		resultado = 0;
		
		
		//El programa pide los n�meros y el operando.
		System.out.println("Introduce el primer n�mero: ");
		num1 = Consola.leeFloat();
		
		
		System.out.println("Introduce el segundo n�mero: ");
		num2 = Consola.leeFloat();
		
		
		System.out.println("Introduce el operando (+, -, x, :): ");
		operator = Consola.leeChar();
		
		
		//Dependiendo del operando visualiza un resultado.
		while ((operator != '+') && (operator != '-') && (operator != 'x') && (operator != ':')) 
		{
			System.out.println("Operando err�neo, introd�zcalo de nuevo (+, -, x, :): ");
			operator = Consola.leeChar();
		}
		
		
		if (operator == '+') 
		{
			resultado = num1 + num2;
		}
		else 
		{
			if (operator == '-') {
				resultado = num1 - num2;
			}
			else 
			{
				if (operator == 'x') {
					resultado = num1 * num2;
				}
				else
				{
					if (num2 != 0) 
					{
						resultado = num1 / num2;
					}
				}
			}	
		}
			
		
		//El �nico caso en el que no visualizar� resultado es cuando se trate de dividir entre 0. 
		if ((num2 == 0) && (operator == ':')) 
		{
			System.out.println("No se puede dividir entre 0");
		}
		//Se visualiza el resultado.
		else
		{
			System.out.println("El resultado es: " + resultado);
		}
	}
}

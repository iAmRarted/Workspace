package tanda1;

public class Ejercicio13 {
	public static void main(String[] args) {
		
		//Programa que divide sin usar "/".
		 
		
		int n1, n2, resultado, num1;
		
		
		//Se pide el dividendo y el divisor.
		System.out.println("Introduce el dividendo:");
		n1 = Consola.leeInt();
		
		System.out.println("Introduce el divisor:");
		n2 = Consola.leeInt();
		
		//Para no perder el valor del dividendo se mete en otra variable. También se inicia el contador resultado, porque al final una división es la cantidad de restas de un número menos otro.
		num1 = n1;
		resultado = 0;
		while (num1 >= n2)
		{
			num1 -= n2;
			resultado++;
		}
		
		//Visualiza el resultado.
		System.out.println("El resultado es: " + resultado);
	}
}

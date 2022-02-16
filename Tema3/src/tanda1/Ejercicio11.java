package tanda1;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//Programa que calcula el valor de los siguientes n términos de la expresión que pone en el enunciado.
		
		int n, sw = 1, denom = 1;
		float resultado = 0;
		
		
		//Pide el número de términos.
		
		System.out.println("¿Cuántos términos quieres?");
		n = Consola.leeInt();
		
		//Calcula el resultado de la operación de n términos.
		
		for (int cont = 1; cont <= n; cont++)
		{
			resultado += sw * (1f/denom);
			denom += 2;
			sw *= (-1);
		}
		
		System.out.println("El resultado es: " + resultado);
		
	}
}

package tanda1;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//Programa que calcula el valor de los siguientes n t�rminos de la expresi�n que pone en el enunciado.
		
		int n, sw = 1, denom = 1;
		float resultado = 0;
		
		
		//Pide el n�mero de t�rminos.
		
		System.out.println("�Cu�ntos t�rminos quieres?");
		n = Consola.leeInt();
		
		//Calcula el resultado de la operaci�n de n t�rminos.
		
		for (int cont = 1; cont <= n; cont++)
		{
			resultado += sw * (1f/denom);
			denom += 2;
			sw *= (-1);
		}
		
		System.out.println("El resultado es: " + resultado);
		
	}
}

package tanda1;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Programa que pide un car�ctrer (R o C) y luego pide la medida de los lados, calcula y visualiza el �rea de un rect�ngulo o un cubo.
		 
		
		char objeto;
		float lado1, lado2, arista, area;
		
		
		//Se pide el car�cter que definir� el objeto del cual calcularemos y visualizaremos su �rea.
		System.out.println("Introduce de que objeto quieres calcular el �rea (R para rect�ngulo y C para cubo):");
		objeto = Consola.leeChar();
		
		
		//Dependiendo del car�cter introducido se pedir�n 2 lados o 1 arista y se calcular� su �rea.
		if (objeto == 'R')
		{
			System.out.println("Introduce la medida de la primera arista:");
			lado1 = Consola.leeFloat();
			
			System.out.println("Introduce la medida de la segunda arista:");
			lado2 = Consola.leeFloat();
			
			
			area = (lado1 * lado2);
		}
		else
		{
			System.out.println("Introduce la medida de la arista:");
			arista = Consola.leeFloat();
			
			area = 6 * (arista * arista);
		}
		
		//Visualiza el �rea.
		System.out.println("El �rea es: " + area + " cm�");
	}

}

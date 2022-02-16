package tanda1;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Programa que pide un caráctrer (R o C) y luego pide la medida de los lados, calcula y visualiza el área de un rectángulo o un cubo.
		 
		
		char objeto;
		float lado1, lado2, arista, area;
		
		
		//Se pide el carácter que definirá el objeto del cual calcularemos y visualizaremos su área.
		System.out.println("Introduce de que objeto quieres calcular el área (R para rectángulo y C para cubo):");
		objeto = Consola.leeChar();
		
		
		//Dependiendo del carácter introducido se pedirán 2 lados o 1 arista y se calculará su área.
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
		
		//Visualiza el área.
		System.out.println("El área es: " + area + " cm²");
	}

}

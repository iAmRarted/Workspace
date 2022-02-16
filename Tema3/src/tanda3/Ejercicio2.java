package tanda3;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Programa que calcula el pago mensual de una hipoteca 

		
		int c, n;
		float r, cuota, total, pot;
		
		
		pot = 1;
		
		System.out.println("Introduce la cantidad de dinero que desea financiar:");
		c = Consola.leeInt();
		
		System.out.println("Introduce el interés anual (0-100):");
		r = Consola.leeInt();
		
		System.out.println("Introduce el número de años a pagar:");
		n = Consola.leeInt();

		n *= 12;
		r /= 100;
		
		
		for (int cont = 1; cont <= n; cont++)
		{
			pot *= (1/(1 + r));
		}
		
		cuota = ((c * r) / (1 - pot));
		
		total = cuota * n;
		
		System.out.print("La cuota mensual es de: ");
		System.out.printf("%.2f",cuota);
		System.out.println("€.");
		
		System.out.print("El total a pagar es: ");
		System.out.printf("%.2f",total);
		System.out.print("€.");
	}

}

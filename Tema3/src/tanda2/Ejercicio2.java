package tanda2;

public class Ejercicio2 {
	public static void main(String[] args) {
	
		//Programa que pide datos para N comercios, calcula la tasa a pagar y la visualiza.
		
		final int N = 14;
		int cont = 1, numEmpleados;
		float ingresos, descuento, tasa;
		
		while (cont <= N)
		{
			System.out.println("Introduce el número de empleados:");
			numEmpleados = Consola.leeInt();
			
			
			System.out.println("Introduce los ingresos:");
			ingresos = Consola.leeFloat();
			
			switch (numEmpleados)
			{
			case 1,2:
				tasa = ingresos * 0.1f;
				System.out.println("La tasa a pagar es de: " + tasa);
				break;
				
			case 3-5:
				tasa = ingresos * 0.1f;
				
				descuento = numEmpleados * 0.05f;
				
				tasa -= (tasa * descuento);
				System.out.println("La tasa a pagar es de: " + tasa);
				break;
				
			default:
				if (numEmpleados > 0)
				{
					tasa = ingresos * 0.1f;
					
					if (numEmpleados < 10)
					{
						descuento = numEmpleados * 0.1f;
					}
					else
					{
						descuento = 1;
					}
					
					tasa -= (tasa * descuento);
					System.out.println("La tasa a pagar es de: " + tasa);
					break;
				}
			}
			
			cont++;
		}
	}
}

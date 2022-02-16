package tanda1;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Juego de acertar la hipotenusa de un triángulo en un número de intentos determinado.
		 
		
		// Estos  valores de variables son valores aleatorios entre 1 y 100 y son constantes.
		final float cateto1 = (int)Math.floor(Math.random()*(100) + 1);
		final float cateto2 = (int)Math.floor(Math.random()*(100) + 1);
		// Ya que me aburría, también he hecho el número de intentos aleatorio
		final int intento = (int)(Math.random()*(9) + 1);
		
		double hipotenusa, result; 
		int cont;
		boolean correcto = false;
		
		hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
		
		
		// El programa te da la pista de cuanto mide cada cateto.
		
		System.out.println("El cateto 1 mide " + cateto1 + "cm");
		System.out.println("El cateto 2 mide " + cateto2 + "cm");
		
		
		// El programa lee la respuesta y te dice si es correcta o no con un margen de error de ±0.2.
		
		System.out.println("¿Cuál es la medida de la hipotenusa (en cm)?");
		result = Consola.leeDouble();
		
		
		// Se inicia el contador de intentos.
		
		cont = 1;
		
		
		while ((correcto == false) && (cont < intento))
		{
			if ((result <= hipotenusa+0.2) && (result >= hipotenusa - 0.2))
			{
				System.out.println("Respuesta correcta.");
				correcto = true;
			}
			else
			{
				System.out.println("Respuesta incorrecta.");
				
				cont++;
				
				//El programa lee la respuesta y te dice si es correcta o no con un margen de error de ±0.2.
				System.out.println("¿Cuál es la medida de la hipotenusa (en cm)?");
				result = Consola.leeDouble();
			}
		}
		if ((cont == intento))
		{
			if (intento == 1)
				System.out.println("Has gastado tu intento.");
			else
				System.out.println("Has gastado tus " + intento + " intentos.");
		}
	}
}

package tanda1;
import java.math.*;

@SuppressWarnings("unused")
public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Juego acertar la hipotenusa de un triángulo.
		 
		
		// Que el programa siempre tenga los mismos valores es aburrido así que con estas dos líneas consigues un valor aleatorio entre 1 y 100.
		float cateto1 = (int)Math.floor(Math.random()*(100-1+1) + 1);
		float cateto2 = (int)Math.floor(Math.random()*(100-1+1) + 1);
		
		double hipotenusa, resp;
		
		hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));

		//El programa te da la pista de cuanto mide cada cateto.
		System.out.println("El cateto 1 mide " + cateto1 + "cm");

		System.out.println("El cateto 2 mide " + cateto2 + "cm");
		
		
		//El programa lee la respuesta y te dice si es correcta o no con un margen de error de ±0.2.
		System.out.println("¿Cuál es la medida de la hipotenusa (en cm)?");
		resp = Consola.leeDouble();
		
		
		if ((resp <= hipotenusa+0.2) && (resp >= hipotenusa - 0.2))
		{
			System.out.println("Respuesta correcta.");
		}
		else
		{
			System.out.println("Respuesta incorrecta.");
		}
	}

}

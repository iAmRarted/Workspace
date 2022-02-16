package tanda1;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		//Programa que pide notas de un alumno hasta que metan "N" y luego muestra unos datos.
		
		int sumaNota = 0, contNota = 0;
		float  nota, notaMedia = 0, notaMax = 0;
		char resp = 'S';
		
		int contMax = 0;
		
		boolean aprobado = true;
		int contSuspenso = 0;
		
		
		//Se pide la nota.
		while (resp != 'N')
		{
			System.out.println("Introduzca la nota:");
			nota = Consola.leeInt();
			
			//Se valida la nota.
			if ((nota < 0) || (nota > 10))
			{
				System.out.println("La nota introducida es errónea.");
			}
			else
			{
				//Se guarda la nota en un total y se cuenta cuantas notas se han introducido para luego calcular la media.
				sumaNota += nota;
				contNota++;
				
				//Se guarda su nota máxima
				if (nota > notaMax)
				{
					notaMax = nota;
					contMax = 0;
				}
				
				//Si ha sacado más de una vez la nota máxima entonces se guarda cuantas veces.
				if (nota == notaMax)
				{
					contMax++;
				}
				
				//Se comprueba si puede ser aprobado.
				if (nota < 3)
				{
					aprobado = false;
				}
				
				if ((aprobado == true) && (nota < 5))
				{
					contSuspenso++;
				}
			}

			
			//Se pide si se quiere introducir más notas.
			System.out.println("¿Desea introducir otra nota? (S/N)");
			resp = Consola.leeChar();
		}
		
		
		//Para que no explote el programa si se da la ocasión en la que no introduzcan ninguna nota.
		if (contNota > 0)
		{
			notaMedia = sumaNota / (float)contNota;
		}
		
		
		//Se visualiza la nota media, la máxima y cuantas veces aparece esta.
		System.out.println("La nota media del alumno es: " + notaMedia);
		System.out.println("La nota más alta del alumno es: " + notaMax + ". Y se aparece " + contMax + " vez/ces.");
		
		//Se comprueba y visualiza si el alumno está aprobado.
		if ((aprobado == true) &&  (((float)contSuspenso/contNota) <= ((float)contNota * 0.2)))
		{
			System.out.println("El alumno ha aprobado");
		}
		else
		{
			System.out.println("El alumno ha suspendido");
		}
		
		
	}
}

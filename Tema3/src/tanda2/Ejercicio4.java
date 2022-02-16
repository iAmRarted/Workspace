package tanda2;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/*
		 * Programa que pide el n�mero de subastas. Luego de cada una pide el bien subastado, el precio de partida, la duraci�n
		 * y el n�mero de pujas. Por cada puja el ofertante y el valor.
		 * Luego visualiza el precio de partida medio de las subastas con m�s de 10 pujas, 
		 * Valor m�ximo pujado en cada subasta de duraci�n menor a 3 d�as,
		 * Ofertante que ha hecho la puja m�s alta de cada subasta,
		 * Cu�ntas subastas, tienen al menos un 60% de sus pujas con un valor que duplique el precio de partida,
		 * Nombre de los bienes con al menos 5 pujas inferiores a 100� y ninguna superior a 1000�.
		 */
		
		int n, contn = 1, duracion, nPujas, contPujas, contSubasta10 = 0, contPuja60, contSubasta60 = 0, contPuja100;
		float precioPartida, valor, precioPartidaTotal = 0, precioPartidaMedio, valorMax3 = 0, valorMax = 0;
		char bien, ofertante, ofertanteMax = ' ', bien100 = ' ';
		
		System.out.println("Introduce el n�mero de subastas:");
		n = Consola.leeInt();
		
		while (contn <= n)
		{
			System.out.println("Introduce el bien subastado (una letra may�scula)");
			bien = Consola.leeChar();
			
			while ((bien < 'A') || (bien > 'Z'))
			{
				System.out.println("Una letra may�scula");
				bien = Consola.leeChar();
			}
			
			System.out.println("Introduce el precio de partida:");
			precioPartida = Consola.leeFloat();
			
			System.out.println("Introduce la duraci�n (en d�as):");
			duracion = Consola.leeInt();
			
			System.out.println("Introduce el n�mero de pujas:");
			nPujas = Consola.leeInt();
			
			contPujas = 1;
			contPuja60 = 0;
			contPuja100 = 0;
			
			while (contPujas <= nPujas)
			{
				System.out.println("Introduce el ofertante (Una letra):");
				ofertante = Consola.leeChar();
				
				System.out.println("Introduce el valor en euros: ");
				valor = Consola.leeFloat();
				
				if ((duracion < 3) && (valor > valorMax3))
				{
					valorMax3 = valor;
				}
				
				if (valor > valorMax)
				{
					valorMax = valor;
					ofertanteMax = ofertante;
				}
				
				
				if (valor >= (2 * precioPartida))
				{
					contPuja60++;
				}
				
				
				if (valor < 100)
				{
					contPuja100++;
				}
				
				
				contPujas++;
			}
			
			
			if (nPujas > 10)
			{
				precioPartidaTotal += precioPartida;
				contSubasta10++;
			}
			
			
			if (((contPuja60 * 100)/nPujas) >= 60)
			{
				contSubasta60++;
			}
			
			
			if ((contPuja100 >= 5) && (valorMax < 1000))
			{
				bien100 = bien;
			}
			
			
			contn++;
			
			
			if (duracion < 3)
			{
				System.out.println("El valor m�ximo pujado para esta subasta con duraci�n menor a 3 d�as es de: " + valorMax3 + "�.");
			}
			
			
			System.out.println("El ofertante que ha hecho la puja m�s alta en esta subasta ha sido: " + ofertanteMax + ".");
			
			
			if (bien100 != ' ')
			{
				System.out.println(bien100 + " no ha tenido ninguna puja superior a 1000� y ha tenido al menos 5 inferiores a 100�.");
			}
			
		}
		
		
		if (contSubasta10 > 0) 
		{
			precioPartidaMedio = precioPartidaTotal / contSubasta10;
			System.out.println("El precio de partida medio para las subastas con al menos 10 pujas es: " + precioPartidaMedio + "�.");
		}
		else
		{
			System.out.println("No ha habido subastas con m�s de 10 pujas.");
		}
		
		
		if (contSubasta60 > 0)
		{
			System.out.println("Ha habido " + contSubasta60 + " subastas con al menos un 60% de sus pujas con un valor que al menos duplique el valor del precio de partida.");
		}
		else
		{
			System.out.println("No ha habido subastas con al menos un 60% de sus pujas con un valor que al menos duplique el valor del precio de partida.");
		}

	}

}

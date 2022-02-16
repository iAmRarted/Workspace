package tanda2;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*
		* Programa que pide datos de personas europeas y africanas, visualiza si est� por encima o debajo de la media adem�s de la
		* estatura m�xima de los hombres africanos de 20-30 a�osy la estatura media de las mujeres europeas
		*/
		
		
		char resp, sexo, continente;
		int edad, estatura, estaturaMax = 0, contME = 0;
		float estaturaMEMedia = 0, estaturaMETotal = 0;
		
		
		do
		{
			System.out.print("Introduce el sexo: ");
			sexo = Consola.leeChar();
			
			System.out.print("Introduce la edad: ");
			edad = Consola.leeInt();
			
			System.out.print("Introduce el continente: ");
			continente = Consola.leeChar();
			
			System.out.print("Introduce la estatura: ");
			estatura = Consola.leeInt();
			
			while ((estatura < 30) || (estatura > 250))
			{
				System.out.print("Estatura err�nea, introd�cela de nuevo: ");
				estatura = Consola.leeInt();
			}
			
			if (sexo == 'H')
			{
				if (continente == 'E')
				{
					if (estatura < 179)
					{
						System.out.println("Est� por debajo de la media europea entre hombres.");
					}
					else
					{
						if (estatura > 179)
						{
							System.out.println("Est� por encima de la media europea entre hombres.");
						}
						else
						{
							System.out.println("Est� por en de la media europea entre hombres.");
						}
					}
				}
				else
				{
					if (estatura < 180)
					{
						System.out.println("Est� por debajo de la media africana entre hombres.");
					}
					else
					{
						if (estatura > 180)
						{
							System.out.println("Est� por encima de la media africana entre hombres.");
						}
						else
						{
							System.out.println("Est� por en de la media africana entre hombres.");
						}
					}
				}
			}
			else
			{
				if (continente == 'E')
				{
					if (estatura < 167)
					{
						System.out.println("Est� por debajo de la media europea entre mujeres.");
					}
					else
					{
						if (estatura > 167)
						{
							System.out.println("Est� por encima de la media europea entre mujeres.");
						}
						else
						{
							System.out.println("Est� por en de la media europea entre mujeres.");
						}
					}
				}
				else
				{
					if (estatura < 165)
					{
						System.out.println("Est� por debajo de la media africana entre mujeres.");
					}
					else
					{
						if (estatura > 165)
						{
							System.out.println("Est� por encima de la media africana entre mujeres.");
						}
						else
						{
							System.out.println("Est� por en de la media africana entre mujeres.");
						}
					}
				}
			}
			
			
			if ((estatura > estaturaMax) && (sexo == 'H') && (continente == 'A') && ((edad >= 20) && (edad <= 30)))
			{
				estaturaMax = estatura;
			}
			
			
			if ((sexo == 'M') && (continente == 'E'))
			{
				estaturaMETotal += estatura;
				contME ++;
			}
			
			
			System.out.println("�Desea introducir otra persona? (S/N)");
			resp = Consola.leeChar();
		}
		while (resp == 'S');
		
		if (contME > 0)
		{
			estaturaMEMedia = estaturaMETotal/contME;
		}
		
		System.out.println("Esta es la estatura m�xima de los hombres africanos de entre 20 y 30 a�os: " + estaturaMax);
		
		System.out.println("Esta es la media de la estatura de las mujeres europeas: " + estaturaMEMedia);
	}

}

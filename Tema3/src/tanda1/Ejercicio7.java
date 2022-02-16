package tanda1;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Programa que visualiza los d�as que faltan hasta fin de a�o a partir de una fecha introducida.
		
		
		int dia, mes, ano, contValor,contMes;
		boolean esBisiesto;
		
		esBisiesto = false;
		
		
		//Se piden los datos.
		System.out.println("Introduce el d�a: ");
		dia = Consola.leeInt();
		
		System.out.println("Introduce el mes: ");
		mes = Consola.leeInt();
		
		System.out.println("Introduce el a�o: ");
		ano = Consola.leeInt();


		//Se comprueba si el a�o introducido es bisiesto.
		if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0))
		{
			esBisiesto = true;
			contValor = 366;
		}
		else
		{
			contValor = 365;
		}
		
		contValor -= dia;
		contMes = mes;
		
		while (contMes > 1)
		{
			switch (contMes)
			{
			case 1,3,5,7,8,10,12:
				contValor -= 31;
				break;
				
			case 4,6,9,11:
				contValor -= 30;
				break;
				
			case 2:
				if (esBisiesto == true)
				{
					contValor -= 29;
				}
				else
				{
					contValor -= 28;
				}
				break;
			}
			
			contMes--;
		}
		
		System.out.println("Quedan " + contValor + " d�as para que acabe el a�o.");
	}
}

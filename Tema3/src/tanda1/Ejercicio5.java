package tanda1;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		 //Programa que pide 3 números (dd/mm/aaaa) y escribe la fecha.
		
		
		int dia, mes, ano;
		boolean esBisiesto;
		
		
		esBisiesto = false;
		
		
		//El programa pide los 3 números.
		System.out.println("Introduce el día: ");
		dia = Consola.leeInt();
		
		System.out.println("Introduce el mes: ");
		mes = Consola.leeInt();
		
		System.out.println("Introduce el año: ");
		ano = Consola.leeInt();
		
		
		//Se comprueba si el año es bisiesto.
		if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0))
		{
			esBisiesto = true;	
		}
		
		
		//Se comprueba la fecha.
		if (((dia < 1) || (mes < 1) || (mes > 12) || (ano < 0) || 
				((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) && (dia > 31)) || 
				((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11) && (dia > 30)) || 
				((mes == 2) && ((dia > 28) && (esBisiesto == false) || ((esBisiesto == true) && (dia > 29))))) 
			{
				System.out.println("Fecha errónea");
			}
		else
			{
			//Dependiendo del mes visualiza la fecha.
			switch (mes) 
			{
				case 1:
					System.out.println(dia + " de enero de " + ano);
					break;
			
				case 2:
					System.out.println(dia + " de febrero de " + ano);
					break;
				
				case 3:
					System.out.println(dia + " de marzo de " + ano);
					break;
				
				case 4:
					System.out.println(dia + " de abril de " + ano);
					break;
				
				case 5:
					System.out.println(dia + " de mayo de " + ano);
					break;
				
				case 6:
					System.out.println(dia + " de junio de " + ano);
					break;
				
				case 7:
					System.out.println(dia + " de julio de " + ano);
					break;
				
				case 8:
					System.out.println(dia + " de agosto de " + ano);
					break;
				
				case 9:
					System.out.println(dia + " de septiembre de " + ano);
					break;
				
				case 10:
					System.out.println(dia + " de octubre de " + ano);
					break;
					
				case 11:
					System.out.println(dia + " de noviembre de " + ano);
					break;
					
				case 12:
					System.out.println(dia + " de diciembre de " + ano);
					break;
				
			}
		}
	}
}

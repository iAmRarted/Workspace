package tanda2;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// C A L E N D A R I O (TPOSE)
		
		
		int dia, mes, diaMax = 0, diaSemana;
		
		do
		{
			
			System.out.print("Introduzca el mes: ");
			mes = Consola.leeInt();
		
		}
		while (mes < 1 || mes > 12);
		
		do
		{

			System.out.print("Introduzca el día de la semana: ");
			dia = Consola.leeInt();
			
		}
		while (dia < 1 || dia > 7);
		
		System.out.println("----------------------------------------");
		diaSemana = dia;
		
		switch (mes)
		{
		case 1:
			System.out.println("Enero");
			diaMax = 31;
			break;
			
		case 2:
			System.out.println("Febrero");
			diaMax = 28;
			break;
			
		case 3:
			System.out.println("Marzo");
			diaMax = 31;
			break;
			
		case 4:
			System.out.println("Abril");
			diaMax = 30;
			break;
			
		case 5:
			System.out.println("Mayo");
			diaMax = 31;
			break;
			
		case 6:
			System.out.println("Junio");
			diaMax = 30;
			break;
			
		case 7:
			System.out.println("Julio");
			diaMax = 31;
			break;
			
		case 8:
			System.out.println("Agosto");
			diaMax = 31;
			break;
			
		case 9:
			System.out.println("Septiembre");
			diaMax = 30;
			break;
			
		case 10:
			System.out.println("Octubre");
			diaMax = 31;
			break;
			
		case 11:
			System.out.println("Noviembre");
			diaMax = 30;
			break;
			
		case 12:
			System.out.println("Diciembre");
			diaMax = 31;
			break;
		}
		System.out.println();
		
		//SOP para mostrar cada día de la semana por letras
		System.out.println("L\tM\tX\tJ\tV\tS\tD");
		
		
		for (int espacios = dia; espacios > 1; espacios--)
		{
			System.out.print(" \t");
		}
		
		for (int diaMes = 1; diaMes <= diaMax; diaMes++)
		{
			
			System.out.print(diaMes + "\t");
			
			diaSemana++;
			
			if (diaSemana > 7)
			{
				System.out.println();
				diaSemana = 1;
			}
		}
	}
}

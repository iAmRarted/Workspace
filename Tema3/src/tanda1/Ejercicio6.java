package tanda1;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Programa que pide 2 años, los ordena y visualiza sus bisiestos.
		
		
		int ano1, ano2, aux;
		
		
		//El programa pide 2 años
		System.out.println("Introduce el primer año: ");
		ano1 = Consola.leeInt();
		
		System.out.println("Introduce el segundo año: ");
		ano2 = Consola.leeInt();
		
		
		//Se ordenan los 2 años introducidos y se le da al contador el valor del año más bajo.
		if (ano1 < ano2)
		{
			aux = ano1;
			ano1 = ano2;
			ano2 = aux;
		}
	
		int cont = ano1;
		
		
		//Comprueba si es bisiesto, si lo es lo visualiza y comprueba el siguiente, sino, comprueba el siguiente.
		while (cont <= ano2) 
		{
			if ((cont % 4 == 0) && (cont % 100 != 0) || (cont % 400 == 0))
			{
				System.out.println(cont);
			}
			cont++;
		}
	}
}

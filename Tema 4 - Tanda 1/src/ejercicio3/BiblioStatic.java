package ejercicio3;


public class BiblioStatic {
	
	
	static void verMultiplos5 (int n1, int n2) {
		for (int cont = n1; cont <= n2; cont++)
		{
			if (((cont % 5) == 0))
				System.out.println(cont + " es múltiplode 5.");
		}
	}
	
	
	static int tipoCaracter (char caracter) {
		if ((caracter >= 'a') && (caracter <= 'z'))
			return 1;
		
		if ((caracter >= 'A') && (caracter <= 'Z'))
			return 2;
		
		return -1;
	}
	
	
	static double calculaPotencia (float x, int n) {
		long fact = 1;
		for (int cont = 1; cont <= n; cont++) {
			fact *= x;
		}
		
		return fact;
	}
	
	
	static int sumatorio (int n) {
		int sumatorio = 0;
		
		for (int cont = 1; cont <= n; cont++)
		{
			sumatorio += cont;
		}
		
		return sumatorio;
	}
	
	
	static void verTabla (int num) {
		for (int cont = 1; cont <= 10; cont++)
		{
			System.out.println(num + " x " + cont + " = " + (num * cont));
		}
	}
	
	
	static void verTablaRestringida (int num) {
		final int LIMITESUP = 20;
		final int LIMITEINF = 1;
		
		if ((num <= LIMITESUP) && (num >= LIMITEINF))
		{
			for (int cont = 1; cont <= 10; cont++)
			{
				System.out.println(num + " x " + cont + " = " + (num * cont));
			}
		}
		else
		{
			System.out.println("No se pudo visualizar la tabla porque es inferior a 1 o excede el número 20.");
		}
	}
	
	
	public static void main(String[] args) {
		final int NUMCHAR = 5;
		int n1;
		int n2;
		int contCar = 1;
		int contPot = 1;
		int numPot;
		int x;
		int num;
		int num1;
		float serie = 0;
		char caracter;
		
		
		do
		{
			System.out.println("Introduce el primer número:");
			n1 = Consola.leeInt();
			
			System.out.println("Introduce el segundo número:");
			n2 = Consola.leeInt();
			
			BiblioStatic.verMultiplos5(n1, n2);
		}
		while((n1 != 0) && (n2 != 0));
		
		
		while (contCar <= NUMCHAR)
		{
			System.out.println("Introduce un carácter:");
			caracter = Consola.leeChar();
			
			switch (BiblioStatic.tipoCaracter(caracter))
			{
				case -1:
					System.out.println("El carácter no es una letra.");
					break;
					
					
				case 1:
					System.out.println("El carácter es una letra minuscula.");
					break;
					
					
				case 2:
					System.out.println("El carácter es una letra mayuscula.");
					break;
					
				default:

				
			}
			
			contCar++;
		}
		
		
		System.out.println("Introduce cuantas potencias de 7 quieres ver:");
		numPot = Consola.leeInt();
		
		while (contPot <= numPot) {
			System.out.println("7 elevado a " + contPot + " es igual a " + BiblioStatic.calculaPotencia(7f, contPot));
			
			contPot++;
		}
		
		
		System.out.println("Introduce el valor de x para la serie:");
		x = Consola.leeInt();
		
		for (int contTermino = 1; contTermino <= 8; contTermino++)
		{
			if (BiblioStatic.sumatorio(contTermino) > 0)
				serie += (BiblioStatic.calculaPotencia(x, contTermino) / (BiblioStatic.sumatorio(contTermino)));
		}
		
		System.out.println("El resultado es = " + serie);
		
		
		System.out.println("Introduce el número (1-10) para ver su tabla de multiplicar:");
		num = Consola.leeInt();
		
		while ((num < 1) || (num > 10)) 
		{
			System.out.println("Número introducido erróneo.");
			System.out.println("Introduce el número (1-10) para ver su tabla de multiplicar:");
			num = Consola.leeInt();
		}
		
		BiblioStatic.verTabla(num);


		do 
		{
			System.out.println("Introduce el número para ver su tabla (si es posible)");
			num1 = Consola.leeInt();

			BiblioStatic.verTablaRestringida(num1);
		}
		while(num1 != 0);
	}
}

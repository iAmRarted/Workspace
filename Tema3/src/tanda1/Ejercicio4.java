package tanda1;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		//Programa que lee 3 números distintos, los compara y visualiza el de en medio.
		
		
		int a, b, c;
		
		//Lee y compara que no sean iguales.
		do
		{
			System.out.println("Introduce 3 números que sean distintos:");
			a = Consola.leeInt();
			b = Consola.leeInt();
			c = Consola.leeInt();
		} while (a == b || a == c || b == c);
		
		//Verificamos si b es el de en medio.
	    if (((a < b) && (b < c)) || ((c < b) && (b < a)))
	        System.out.println(b);
	    else
	    {
	    	//Verificamos si c es el de en medio.
		    if (((b < a) && (a < c)) || ((c < a) && (a < b)))
		        System.out.println(a);
		    
		    //Si no es ni b ni c es a.
		    else
		    {
		    	System.out.println(c);
		    }
	    }
	}
}

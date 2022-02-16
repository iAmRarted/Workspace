package ejercicio1;

public class BiblioString {

	//Metodo concatenarinverso
	public static String concatenarinverso() {
		String str;
		String strInv="";
		int ccadenas=1;
		System.out.println("Introduzca una cadena de caracteres (máximo de 10, fin para parar)");
		str=Consola.leeString();
		while(!str.equals("fin") && ccadenas<=10) {
			strInv=str+strInv;
			System.out.println("Introduzca la siguiente cadena de caracteres (le quedan como máximo de "+(10-ccadenas)+" caracteres a parte de este, fin para parar)");
			str=Consola.leeString();
			ccadenas++;
		}
		System.out.println(strInv);
		return strInv;
	}
	//Metodo sustituir
	public static void sustituir(String str, char carac1, char carac2) {
		int csustituciones=0;
		String strSus=str;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==carac1) {
				csustituciones++;
			}
			strSus=str.replace(carac1, carac2);
		}
		System.out.println(strSus+" --> "+csustituciones+" sustituciones.");
	}
	//Metodo eliminarCar
	public static String eliminarCar(String str, char carac) {
		String str2=str;
		for(int i=0; i<=str2.length()-1; i++) {
			if(str2.charAt(i)==carac) {
				str2=str2.substring(0,i)+str2.substring(i+1);
			}
		}
		System.out.println(str2);
		return str2;
	}
}

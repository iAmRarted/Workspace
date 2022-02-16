public class BiblioString {
    static String concatenarInverso() {
        String cadena, str;
        int contador = 1;
        cadena="";
        str = Consola.leeString();
        while(!str.equalsIgnoreCase("fin") && contador <= 10) {
            cadena = str + cadena;
            str = Consola.leeString();
            contador++;
         }
        return cadena;
    }

    static int sustituir(String str, char c1, char c2) {
        int contador = 0, longitud;
        String str1 = "";
        longitud = str.length();
        for(int posicion = 0; posicion < longitud; posicion++) {
            
            if(str.charAt(posicion) == c1) {
                str1 += c2;
                contador++;
            } else {
                str1 += str.charAt(posicion);
            }
        }

        System.out.println(str1);
        return contador;
    }

    static String eliminarCar(String str, char c1) {
        String str1 = "";
        int longitud = str.length();

        for(int posicion = 0; posicion < longitud; posicion++) {
            if(str.charAt(posicion) != c1) {
                str1 += str.charAt(posicion);
            }
        }

        return str1;
    }

    static String completar$(String str, int longitud) {
        if(longitud > str.length()) {
            int extra = longitud - str.length();
            String str1 = str;
            for(int contador = 1; contador <= extra; contador++) {
                str1 += '$';
            }
            return str1;
        }
        return str;
    }

    static int palabras(String str) {
        String str1 = str;
        int contador = 0, longitud = str.length();
        boolean esPalabra = false;

        for(int posicion = 0; posicion < longitud; posicion++) {
            if(str1.charAt(posicion) == ' ') {
                esPalabra = false;
            } else {
                if(!esPalabra && str1.charAt(posicion) != ' ') {
                    esPalabra = true;
                    contador++;
                }
            }
        }

        return contador;
    }

    public static void verPalabrasAlReves(String str) {
		while(str.lastIndexOf(' ')!=-1) {
			System.out.println(str.toLowerCase().substring(str.lastIndexOf(' ')).trim());
			str=str.substring(0,str.lastIndexOf(' ')).trim();
		}
		System.out.println(str.substring(0).toLowerCase());
	}
}

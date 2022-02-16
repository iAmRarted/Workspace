public class Ejercicio2 {
    static int contarPalabras(String str) {
        String trim = str.trim();
        if (trim.isEmpty())
            return 0;
        return trim.split("\\s+").length;
    }

    static void ver(String [] str, int utiles) {
    	System.out.print("{ ");
        for(int i = 0; i < utiles; i++) {
            System.out.print(str[i]);
            if(i != utiles - 1) {
            	System.out.print(", ");
            } else {
            	System.out.print(" ");
            }
        }
        System.out.println("}");
    }
    
    public static String[] insertarAlreves(String[] arr, int utiles) {
    	String[] otroArr = new String[utiles];
    	int cont = 0;
    	
    	for(int i = utiles - 1; i >= 0; i--) {
    		otroArr[i] = arr[cont];
    		cont++;
    	}
    	
    	return otroArr;
    }
    
    public static void palabrasMayusculas(String[] arr, int utiles) {
    	
    	for(int i = 0; i < utiles; i++) {
	    	String strTemporal = "";
	        String str1 = arr[i];
	        
	        
	        if(arr[i].indexOf(' ') != -1 && arr[i].length() < 0) {
	        	arr[i] = arr[i].toUpperCase();
	        }
	        
	        int cantPalabras = contarPalabras(arr[i]);
	        for(int j = 0; j <= cantPalabras; j++) {
	            if(str1.indexOf(' ') != -1) {
	                strTemporal += str1.toUpperCase().substring(0, 1) + str1.substring(1, str1.indexOf(' ')) + " ";
	                str1 = str1.substring(str1.indexOf(' ') + 1);
	            }
	        }
	        strTemporal += str1.toUpperCase().substring(0, 1) + str1.substring(1);
	
	
	        arr[i] = strTemporal;
    	}
    	
    }

    public static void main(String[] args) {
        final int N = 4;
        String[] arr = new String[N];
        String resp;
        int utiles = 0;

        int cont = 0;

        resp = Consola.leeString().toLowerCase().trim();

        while(cont < arr.length && !resp.equals("quit") && !resp.equals("QUIT")){
        	
        	arr[cont] = resp;
            
        	cont++;

            if(cont < arr.length) {
                resp = Consola.leeString().toLowerCase().trim();
            }
        }
        utiles = cont;
        
        palabrasMayusculas(arr, utiles);
        
        String[] inverso = insertarAlreves(arr, utiles);
        
        ver(inverso, utiles);
    }
}

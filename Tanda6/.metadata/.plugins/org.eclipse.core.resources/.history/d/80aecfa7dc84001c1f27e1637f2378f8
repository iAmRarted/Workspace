public class Ejercicio2 {
    static int contarPalabras(String str) {
        String trim = str.trim();
        if (trim.isEmpty())
            return 0;
        return trim.split("\\s+").length;
    }

    static void ver(String [] str) {
        for(int i = 0; i < str.length; i++) {
            System.out.print(str[i] + ", ");
        }
    }

    public static void main(String[] args) {
        final int N = 99;
        String[] arr = new String[N];
        String resp;
        String strTemporal;
        String str1;

        int cont = 0;

        

        do{

            resp = Consola.leeString().toLowerCase().trim();
            strTemporal = "";
            str1 = resp;


            // pasar la respuesta a "Mayuscula Al Principio De Palabra"
            if(resp.indexOf(' ') != -1 && resp.length() < 0) {
                resp = resp.toUpperCase();
            }
            
            int cantPalabras = contarPalabras(resp);
            for(int i = 1; i <= cantPalabras; i++) {
                if(str1.indexOf(' ') != -1) {
                    strTemporal += str1.toUpperCase().substring(0, 1) + str1.substring(1, str1.indexOf(' ')) + " ";
                    str1 = str1.substring(str1.indexOf(' ') + 1);
                }
            }
            strTemporal += str1.toUpperCase().substring(0, 1) + str1.substring(1);


            arr[cont] = strTemporal;
            cont++;

        } while(cont < arr.length && !resp.equals("quit") && !resp.equals("QUIT"));
        ver(arr);
    }
}

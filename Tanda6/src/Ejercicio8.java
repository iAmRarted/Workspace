public class Ejercicio8 {

    public static void cargarArray(char[] cadena) {
        char resp = 'S', ch;
        int cont = 0;

        while(resp != 'N' && cont < cadena.length) {
            System.out.println("Introduce un carácter:");
            ch = Consola.leeChar();
            cadena[cont] = ch;

            if(cont != cadena.length - 1) {
                System.out.println("¿Desea introducir otro carácter (S/N)?)");
                resp = Consola.leeChar();
            }
            cont++;
        }
    }

    public static void verArray(char[] cadena) {
        System.out.print("{ ");
        for(int i = 0; i < cadena.length; i++) {
            System.out.print(cadena[i] + " ");
        }
        System.out.println("}");
    }

    public static void insertarCar(char[] cadena, char ch, int pos) {
        if(pos >= cadena.length) {
            System.out.println("La posición introducida no es válida.");
        } else {
            for(int i = cadena.length - 1; i >= pos; i--) {
                cadena[i] = cadena[i - 1];
            }
            cadena[pos - 1] = ch;
        }
    }

    public static void main(String[] args) {
        final int N = 4;
        char[] cadena = new char[N];

        cargarArray(cadena);

        verArray(cadena);

        insertarCar(cadena, 'S', 1);

        verArray(cadena);

    }
}

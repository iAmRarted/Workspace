public class Ejercicio6 {
    public static void main(String[] args) {
        float[] arr = new float[10];
        int cont = 1;
        float resp = Consola.leeFloat();

        arr[0] = resp;

        while(cont < arr.length) {
            resp = Consola.leeFloat();
            if(arr[cont - 1] >= resp) {
                arr[cont] = resp;
                cont++;
            } else {
                System.out.println("Introduce un número válido");
            }
        }
        
    }
}

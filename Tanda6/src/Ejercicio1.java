public class Ejercicio1 {

    static float media(float[] notas) {
        float sumaNotas = 0;
        for(int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i];
        }

        return sumaNotas / notas.length;
    }

    static void verArray(float[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        final int N = 10;
        float resp;

        float[] notas = new float[N];

        for(int i = 0; i < N; i++) {
            do{
                System.out.println("Introduce un valor para la celda " + i);
                resp = Consola.leeFloat();
            }while(resp > 10 || resp < 0);
            notas[i] = resp;
        }

        int contSuperaMedia = 0;
        float media = media(notas);
        System.out.println(media);

        for(int i = 0; i < notas.length; i++) {
            if(notas[i] > media) {
                contSuperaMedia++;
            }
        }

        System.out.println(contSuperaMedia / (float)notas.length * 100 + "% superan la media");

        float notaMax = Float.MIN_VALUE;
        int contMax = 0;

        for(int i = 0; i < notas.length; i++) {
            if(notas[i] > notaMax) {
                notaMax = notas[i];
                contMax = 1;
            } else {
                if(notas[i] == notaMax) {
                    contMax++;
                }
            }
        }

        System.out.println("La nota máxima es " + notaMax + " y aparece " + contMax + " veces.");

        verArray(notas);


    }
}

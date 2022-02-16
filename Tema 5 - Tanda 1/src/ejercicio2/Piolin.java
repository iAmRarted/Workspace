package ejercicio2;

public class Piolin extends Canario{
    int numPeliculas;

    Piolin(char sexo, int edad, float tamanio, int numPeliculas) {
        super(sexo, edad, tamanio);
        this.numPeliculas = numPeliculas;
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Piolin y otro de la clase Loro.
        Piolin p1 = new Piolin('H', 10, 10, 10);
        Loro l1 = new Loro('H', 10, 'E', "Negro");

        // Llamar al método quienSoy de las dos instancias
        p1.quienSoy();
        l1.quienSoy();

        // Llamar al método altura con la instancia del Piolín
        p1.altura();

        // Invocar al método deDondeEres con la instancia del Loro
        l1.deDondeEres();

        // Modificar el tamaño del Piolín y volver a invocar al método altura
        p1.tamanio = 30;
        p1.altura();

        // Modificar la región del Loro
        l1.region = 'o';

        // Mostrar el número de Aves creadas
        System.out.println(Ave.cantAves);
    }
}

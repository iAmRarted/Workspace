package ejercicio3;

public class Piolin extends Canario{
    private int numPeliculas;

    Piolin(char sexo, int edad, float tamanio, int numPeliculas, DatosPersonales nombre) {
        super(sexo, edad, nombre, tamanio);
        this.numPeliculas = numPeliculas;
        setTipoAve("Piolín");
    }

    public static void main(String[] args) {
        // Crear 3 Piolines y se inicializarán todos sus datos
        Piolin p1 = new Piolin('H', 12, 5, 6, new DatosPersonales("Pedro", "Juan"));
        Piolin p2 = new Piolin('M', 23, 61, 33, new DatosPersonales("María", "José"));
        Piolin p3 = new Piolin('H', 4, 25, 5, new DatosPersonales("Mario", "Alberto"));

        // Asignar un nuevo nombre de animal al 1º piolín creado
        p1.getNombres().setNombreAve("Juan pequeño");;

        // Asignar un nuevo nombre de dueño al 2º piolín creado
        p2.getNombres().setNombreDuenio("José Jr.");;

        // Crear una instancia de la clase Loro
        Loro l1 = new Loro('H', 5, 'o', "Rojo", new DatosPersonales("Dario", "Pol"));

        // Hacer cantar al loro y a los tres Piolines
        p1.cantar();
        p2.cantar();
        p3.cantar();
        l1.cantar();

        // Sacar por pantalla el nombre del animal y del dueño del primer Piolín creado
        System.out.println("Nombre del piolín: " + p1.getNombres().getNombreAve() + ", nombre del dueño: " + p1.getNombres().getNombreDuenio());
    }
}

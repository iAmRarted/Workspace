package paqueteVaca;

public class Vaca {
    private String pelo;
    private int edad;
    protected String nombre;

    // Variable para contar la cantidad de vacas instanciadas
    private int contVacas;

    // Constructores
    public Vaca(){
        // Mostrar en pantalla y sumarle la cantidad de vacas instanciadas
        contVacas++;
        System.out.println("Se ha creado la vaca " + contVacas);
    }
    public Vaca(String pelo, int edad, String nombre) {
        this.pelo = pelo;
        this.edad= edad;
        this.nombre = nombre;        
        // Mostrar en pantalla y sumarle la cantidad de vacas instanciadas
        contVacas++;
        System.out.println("Se ha creado la vaca " + contVacas);
    }
    public Vaca(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.pelo = "Negro";
        // Mostrar en pantalla y sumarle la cantidad de vacas instanciadas
        contVacas++;
        System.out.println("Se ha creado la vaca " + contVacas);
    }

    // Métodos
    public void muu() {
        System.out.println("Muuu... mi nombre es " + nombre + " y mi color de pelo es " + pelo + ".");
    }// Cambiada de private a public para poder acceder desde otro paquete

    public void compararEdad(Vaca otra) {
        if (this.edad < otra.edad) {
            System.out.println("La vaca " + otra.nombre + " es más vieja que la vaca " + this.nombre + ".");
        } else {
            if (this.edad > otra.edad) {
                System.out.println("La vaca " + this.nombre + " es más vieja que la vaca " + otra.nombre + ".");
            } else {
                System.out.println(this.nombre + " y " + otra.nombre + " tienen la misma edad.");
            }
        }
    }

    // método get para el nombre de la vaca
    public String getNombre() {
        return nombre;
    }

    // método para sumarle un número a la edad
    public void sumarEdad(int cantidad) {
        edad += cantidad;
    }
}

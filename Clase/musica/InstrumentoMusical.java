package musica;

public abstract class InstrumentoMusical {
    private String nombre;
    private int registro;


    public InstrumentoMusical(String nombre, int registro) {
        this.nombre = nombre;
        this.registro = registro;
    }
    
    public String toString() {
        return "Nombre: " + nombre + ", registro: " + registro;
    }

    abstract void sonar();
}
package musica;

public class InstrumentoCuerda extends InstrumentoMusical{
    private int numCuerdas;


    public InstrumentoCuerda(String nombre, int registro, int numCuerdas) {
        super(nombre, registro);
        this.numCuerdas = numCuerdas;
    }

    public String toString() {
        return super.toString() + ", cuerdas: " + numCuerdas;
    }

    void sonar() {
        System.out.println("ninini...");
    }
}

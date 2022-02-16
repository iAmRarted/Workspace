package empresa;

public class Trabajador extends Persona {
    private int dinero;
    private TelefonoMovil tlf;

    Trabajador(String nombre, String dni, int altura, int peso, int dinero, TelefonoMovil tlf) {
        super(nombre, dni, altura, peso);
        this.dinero = dinero;
        this.tlf = tlf;
    }    

    void ganarDinero(int ganado) {
        dinero += ganado;
    }    

    void gastarDinero(int gastado) {
        dinero -= gastado;
    }

    public String toString() {
        return getNombre() + " tiene un peso de " + getPeso() + "kg y un saldo de " + dinero + " euros. Tiene una batería con " + tlf.getBateria() + "mAh.";
    }

    void trabajar() {
        dinero += 10;
        tlf.usar();
    }
}

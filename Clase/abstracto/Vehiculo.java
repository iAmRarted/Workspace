package abstracto;

public abstract class Vehiculo {
    protected int numRuedas;
    private String marca;

    public Vehiculo (String marca) {
        this.marca = marca;
    }

    public void arrancar() {
        System.out.println("Arrancando...");
    }

    public void parar() {
        System.out.println("Parando...");
    }

    public String toString() {
        return "Ruedas: " + numRuedas + ", marca: " + marca;
    }

    public abstract void repostar();

    public String getMarca() {
        return marca;
    }
}

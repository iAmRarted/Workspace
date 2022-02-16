package abstracto;

public class Coche extends Vehiculo{
private int motor;

    Coche(String marca, int motor) {
        super(marca);
        this.motor = motor;
        this.numRuedas = 4;
    }

    public void repostar() {
        System.out.println("Coche repostando...");
    }

    public String toString() {
        return super.toString() + ", motor: " + motor;
    }
}

package abstracto;

public class TrenVapor extends Tren {
    public TrenVapor(String marca, int vagones) {
        super(marca, vagones);
    }

    public void repostar() {
        System.out.println("Repostando con agua...");
    }

    @Override
    public String toString() {
        return "Tren de vapor, " + super.toString();
    }
}

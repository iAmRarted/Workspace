package empresa;

public class TelefonoMovil {
    private String numero;
    private int bateria;

    public TelefonoMovil(String numero, int bateria) {
        this.numero = numero;
        this.bateria = bateria;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getBateria() {
        return this.bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    void usar() {
        bateria--;
    }
}

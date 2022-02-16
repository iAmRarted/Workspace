package animales;

public class Animal {
    private String nombre;
    private char continente;
    private int peso;

    protected Animal(String n, char c, int p) {
        nombre = n;
        continente = c;
        peso = p;
    }

    @Override
    public String toString() {
        return nombre + ", cont: " + continente + ", pesa " + peso + "kg.";
    }

    void engordar (int engorda) {
        peso += engorda;
    }

    public String getNombre() {
        return nombre;
    }
}
package empresa;

public class Persona {
    private String nombre;
    private String dni;
    private int altura;
    private int peso;

    Persona(String dni) {
        this.dni = dni;
        nombre = "";
    }

    Persona(String nombre, String dni, int altura, int peso) {
        this.nombre = nombre;
        this.dni = dni;
        this.altura = altura;
        this.peso = peso;
    }

    public String toString() {
        return nombre + " tiene un peso de " + peso + "kg.";
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}

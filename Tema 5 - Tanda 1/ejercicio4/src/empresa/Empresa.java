package empresa;

public class Empresa {
    private String nombre;
    private int beneficio;
    private Trabajador duenio;
    private Trabajador gerente;



    public Empresa(String nombre, int beneficio, Trabajador duenio) {
        this.nombre = nombre;
        this.beneficio = beneficio;
        this.duenio = duenio;
    }

    void contratarGerente(Trabajador gerente) {
        this.gerente = gerente;
    }

    void trabajar() {
        if(gerente != null) {
            gerente.trabajar();
        }
        duenio.trabajar();
        beneficio += 100;
    }

    public String toString() {
        if(gerente != null) {
            return "Nombre empresa: " + nombre + " con beneficio de: " + beneficio + ", gerente: " + gerente.toString() + ", dueño: " +  duenio.toString();
        } else {
            return "Nombre empresa: " + nombre + " con beneficio de: " + beneficio + " no hay gerente aún. " + duenio.toString();
        }
    }

}

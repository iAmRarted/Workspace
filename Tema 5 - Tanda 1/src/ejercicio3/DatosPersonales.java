package ejercicio3;

public class DatosPersonales {
    private String nombreAve;
    private String nombreDuenio;

    DatosPersonales(String nA, String nD) {
        nombreAve = nA;
        nombreDuenio = nD;
    }

    void setNombreAve(String nombreAve) {
        this.nombreAve = nombreAve;
    }

    void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    String getNombreAve() {
        return nombreAve;
    }

    String getNombreDuenio() {
        return nombreDuenio;
    }
}

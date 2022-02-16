package ejercicio3;

public class Ave {
    private char sexo;
    private int edad;
    private static int cantAves;
    private DatosPersonales nombres;
    private String tipoAve;
    
    Ave(char sexo, int edad, DatosPersonales nombres) {
        this.sexo = sexo;
        this.edad = edad;
        this.nombres = nombres;
        cantAves++;
    }

    int avesCreadas() {
        return cantAves;
    }

    void quienSoy() {
        System.out.println("Mi sexo es " + sexo + " y tengo " + edad + " años.");
    }

    static int getCantAves() {
        return cantAves;
    }

    String getTipoAve() {
        return tipoAve;
    }

    void setTipoAve(String tipoAve) {
        this.tipoAve = tipoAve;
    }

    protected void cantar() {
        String mensaje;
        if(tipoAve == "Loro"){
            mensaje = "loro bonito";
        } else {
            mensaje = "Piolín";
        }

        System.out.println("Mi nombre es " + nombres.getNombreAve() + ", pio-pio soy un " + mensaje);
    }

    DatosPersonales getNombres() {
        return nombres;
    }

    void setNombres(DatosPersonales nombres) {
        this.nombres = nombres;
    }
}

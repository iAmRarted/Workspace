package ejercicio3;

public class Loro extends Ave{
    private char region;
    private String color;

    Loro(char sexo, int edad, char region, String color, DatosPersonales nombre) {
        super(sexo, edad, nombre);
        this.region = region;
        this.color = color;
        setTipoAve("Loro");
    }

    void deDondeEres() {
        switch(region) {
        
            case 'N': System.out.println("Norte."); break;
            case 'E': System.out.println("Este."); break;
            case 'S': System.out.println("Sur."); break;
            case 'O': System.out.println("Oeste."); break;
            default: System.out.println("Valor no válido.");
        }
    }

    void setRegion(char nuevaRegion) {
        region = nuevaRegion;
    }
}

package ejercicio3;

public class Canario extends Ave{
    private float tamanio;
    
    Canario(char sexo, int edad, DatosPersonales nombre) {
        super(sexo, edad, nombre);
        setTipoAve("Canario");
    }

    Canario(char sexo, int edad, DatosPersonales nombre, float tamanio) {
        super(sexo, edad, nombre);
        this.tamanio = tamanio;
        setTipoAve("Canario");
    }

    void altura() {
        if(tamanio > 30){
            System.out.println("Alto");
        } else {
            if(tamanio < 15) {
                System.out.println("Bajo");
            } else {
                System.out.println("Mediano");
            }
        }
    }

    void setTamanio(int nuevoTamanio) {
        tamanio = nuevoTamanio;
    }
}

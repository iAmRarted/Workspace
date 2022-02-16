package ejercicio2;

public class Canario extends Ave{
    float tamanio;
    
    Canario(char sexo, int edad) {
        super(sexo, edad);
    }

    Canario(char sexo, int edad, float tamanio) {
        super(sexo, edad);
        this.tamanio = tamanio;
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
}

package ejercicio2;

public class Ave {
    char sexo;
    int edad;
    static int cantAves;
    
    Ave(char sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
        cantAves++;
    }

    int avesCreadas() {
        return cantAves;
    }

    void quienSoy() {
        System.out.println("Mi sexo es " + sexo + " y tengo " + edad + " años.");
    }
}

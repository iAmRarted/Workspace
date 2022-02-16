package paquetePruebas;

import paqueteVaca.Vaca;

public class Principal {
    public static void main(String[] args) {
        // Crear 3 vacas
        Vaca miVaca1 = new Vaca();
        Vaca miVaca2 = new Vaca("Pedro");
        Vaca miVaca3 = new Vaca("Marrón", 2, "Juan");
        
        // Hacer que las 3 vacas mujan
        miVaca1.muu();
        miVaca2.muu();
        miVaca3.muu();

        // Comparar edad de vaca 1 con vaca 2
        miVaca1.compararEdad(miVaca2);

        // Visualizar el nombre de la vaca 1
        System.out.println("El nombre de la vaca 1 es: " + miVaca1.getNombre());

        // Sumar 1 a la edad de miVaca1
        miVaca1.sumarEdad(1);
    }
}

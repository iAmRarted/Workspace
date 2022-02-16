package abstracto;

public class Prueba {
    public static void main(String[] args) {
        /* Vehiculo es abstracto

        Vehiculo v1 = new Vehiculo("Ford Fiesta");

        v1.arrancar();
        v1.parar();
        System.out.println(v1.toString());
        */

        Coche c1 = new Coche("Ford Fiesta", 180);
        c1.arrancar();
        c1.parar();
        System.out.println(c1.toString());

        TrenVapor tv1 = new TrenVapor("Renfe", 20);
        tv1.arrancar();
        tv1.parar();
        tv1.repostar();
        System.out.println(tv1.toString());
    }
}

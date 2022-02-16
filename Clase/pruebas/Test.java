package pruebas;

import animales.Gusano;

public class Test {
    public static void main(String[] args) {
        Gusano g1 = new Gusano("Pedro", 'a', 20, 30, false);

        System.out.println(g1.comePlantas());
        System.out.println(g1.toString());
    }
}
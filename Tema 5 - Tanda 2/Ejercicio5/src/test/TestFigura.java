package test;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Figura;
import figuras.Rectangulo;

public class TestFigura {
    public static void main(String[] args) {
        // 1
        Circulo circulo1 = new Circulo(2);
        System.out.println(circulo1.getArea());
        Cuadrado cuadrado1 = new Cuadrado(3);
        System.out.println(cuadrado1.getArea());
        Rectangulo rectangulo1 = new Rectangulo(4, 5);
        System.out.println(rectangulo1.getArea());
        Figura.getAreaTotal();

        // 2
        Circulo circulo2 = new Circulo(3);
        Circulo circulo3 = new Circulo(1);
        Circulo.getAreaTotal();
    }
}

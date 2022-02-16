package ejercicio6;

import ejercicio1.Consola;

public class PruebasPunto {
	public static void main(String[] args) {
		double x1, y1;
		System.out.println("Introduce la cordenada x del punto que quieras crear:");
		x1=Consola.leeDouble();
		System.out.println("Introduce la cordenada y del punto que quieras crear:");
		y1=Consola.leeDouble();
		Punto p1 = new Punto(x1,y1);
		System.out.println(p1.toString());
		System.out.println(p1.distaniaOrigen());
		System.out.println(p1.getY());
		System.out.println(p1.calularCuadrate());
		Punto p2 = new Punto(5,3);
		Punto p3 = new Punto(10,10);
		Punto p4 = new Punto(-3,2);
		System.out.println(p1.calcularDistanciaA(p2));
		System.out.println(p1.calcularDistanciaA(p3));
		System.out.println(p1.calcularDistanciaA(p4));
		System.out.println(p1.calcularMasCercano(p2, p3, p4));
	}
}

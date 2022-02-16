package ejercicio6;

public class PruebaCuadrado {
	public static void main(String[] args) {
		//Cuadrado diagonla vertical
		Punto p1 = new Punto(1,2);
		Punto p2 = new Punto(1,8);
		Cuadrado c1 = new Cuadrado("Cuadrado1", p1, p2);
		System.out.println(c1.toString());
		System.out.println(c1.calcularArea());
		//Cuadrado diagonla horizontal
		Punto p3 = new Punto(-2,2);
		Punto p4 = new Punto(7,2);
		Cuadrado c2 = new Cuadrado("Cuadrado2", p3, p4);
		System.out.println(c2.toString());
		System.out.println(c2.calcularArea());
		//Cuadrado diagonla oblicua
		Punto p5 = new Punto(1,2);
		Punto p6 = new Punto(2,1);
		Cuadrado c3 = new Cuadrado("Cuadrado3", p5, p6);
		System.out.println(c3.toString());
		System.out.println(c3.calcularArea());
	}
}

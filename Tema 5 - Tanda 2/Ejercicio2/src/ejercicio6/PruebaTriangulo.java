package ejercicio6;

public class PruebaTriangulo {
	public static void main(String[] args) {
		Punto p1 = new Punto(-2,3);
		Punto p2 = new Punto(2.8,6);
		Punto p3 = new Punto(10,0);
		Triangulo t1 = new Triangulo("Triangulo1", p1, p2, p3);
		System.out.println(t1.toString());
		System.out.println(t1.calcularArea());
		//Para probar si funciona esRegular
		Punto p4 = new Punto(2,2);
		Punto p5 = new Punto(2,2);
		Punto p6 = new Punto(2,2);
		Triangulo t2 = new Triangulo("Triangulo2", p4, p5, p6);
		System.out.println(t2.toString());
	}
}

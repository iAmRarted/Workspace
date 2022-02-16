public class PruebasPunto {
	public static void main(String[] args) {
		Punto p1 = new Punto(0,0);
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

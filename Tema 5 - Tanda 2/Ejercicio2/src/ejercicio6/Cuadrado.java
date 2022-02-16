package ejercicio6;

public class Cuadrado extends Figura{
	private Punto vertice1;
	private Punto vertice2;
	private Punto vertice3;
	private Punto vertice4;
	
	public Cuadrado(String nombreFigura, Punto diagonalVertice1, Punto diagonalVertice3) {
		super(nombreFigura);
		this.vertice1 = diagonalVertice1;
		this.vertice3 = diagonalVertice3;
		calculaOtraDiagonal(diagonalVertice1, diagonalVertice3);
	}
	private void calculaOtraDiagonal(Punto vertice1, Punto vertice3) {
		Punto vertice2 = new Punto(0,0);
		Punto vertice4 = new Punto(0,0);
		if(vertice1.getX()==vertice3.getX()) {
			vertice2.setY(vertice1.getY()-vertice3.getY()/2);
			vertice4.setY(vertice2.getY());
			vertice2.setX(vertice1.getX()+vertice2.getY());
			vertice4.setX(vertice1.getX()-vertice2.getY());
		}
		else {
			if(vertice1.getY()==vertice3.getY()) {
				vertice2.setX(vertice3.getX()-vertice1.getX()/2);
				vertice4.setX(vertice2.getX());
				vertice2.setY(vertice1.getY()+vertice2.getX());
				vertice4.setY(vertice1.getY()-vertice2.getX());
			}
			else {
				vertice2.setX(vertice1.getY());
				vertice2.setY(vertice2.getX());
				vertice4.setX(vertice1.getX());
				vertice4.setY(vertice2.getY());
			}
		}
		this.vertice2=vertice2;
		this.vertice4=vertice4;
	}
	public double calcularArea() {
		return vertice1.calcularDistanciaA(vertice2)*vertice2.calcularDistanciaA(vertice3);
	}
	public boolean esRegular() {
		if(vertice1.calcularDistanciaA(vertice2)==vertice2.calcularDistanciaA(vertice3)&&vertice3.calcularDistanciaA(vertice4)==vertice4.calcularDistanciaA(vertice1))
			return true;
		return false;
	}
	public String toString() {
		return "[NOMBRE="+getNombreFigura()+"]: VERTICES "+vertice1.toString()+","+vertice2.toString()+","+vertice3.toString()+","+vertice4.toString();
	}
}

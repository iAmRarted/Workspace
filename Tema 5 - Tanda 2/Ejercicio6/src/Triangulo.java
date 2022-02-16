public class Triangulo extends Figura{
	private Punto vertice1;
	private Punto vertice2;
	private Punto vertice3;
	
	public Triangulo(String nombreFigura, Punto vertice1, Punto vertice2, Punto vertice3) {
		super(nombreFigura);
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
	}
	public double calcularArea() {
		return Math.abs((vertice1.getX()*(vertice2.getY()-vertice3.getY())+vertice2.getX()*(vertice3.getY()-vertice1.getY())+vertice3.getX()*(vertice1.getY()-vertice2.getY()))/2);
	}
	public boolean esRegular() {
		if(vertice1.calcularDistanciaA(vertice2)==vertice1.calcularDistanciaA(vertice3) && vertice2.calcularDistanciaA(vertice3)==vertice1.calcularDistanciaA(vertice2))
			return true;
		return false;
	}
	public String toString() {
		String str1=esRegular()?"REGULAR":"NO REGULAR";
		return "[NOMBRE="+getNombreFigura()+"]["+str1+"]: VERTICES"+vertice1.toString()+","+vertice2.toString()+","+vertice3.toString();
	}
}
public class Punto {
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	//Metodo distanciaOrigen
	public double distaniaOrigen() {
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
	//Metodo calcularDistanciaA
	public double calcularDistanciaA(Punto p2) {
		return Math.sqrt(Math.pow(this.x-p2.x, 2)+Math.pow(this.y-p2.y, 2));
	}
	//Metodo calularCuadrate
	public int calularCuadrate() {
		if(x==0 || y==0)
			return 0;
		if(x>0) {
			if(y>0)
				return 1;
			else
				return 4;
		}
		else {
			if(y>0)
				return 2;
		}
		return 3;	
	}
	//Metodo calcularMasCercano
	public Punto calcularMasCercano(Punto p1, Punto p2, Punto p3) {
		Punto p = new Punto(this.x, this.y);
		if(p.calcularDistanciaA(p1)<=p.calcularDistanciaA(p2)) {
			if(p.calcularDistanciaA(p1)<p.calcularDistanciaA(p3))
				return p1;
			else 
				return p3;
		}
		if(p.calcularDistanciaA(p2)<=p.calcularDistanciaA(p1)) {
			if(p.calcularDistanciaA(p2)<p.calcularDistanciaA(p3))
				return p2;
			else 
				return p3;
		}
		return null;
	}
	public double getY() {
		return y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
}

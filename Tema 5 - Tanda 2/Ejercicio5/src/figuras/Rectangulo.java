package figuras;

public class Rectangulo extends Figura {
    private double lado1;
	private double lado2;
	private static double areaTotal=0;
	
	public Rectangulo(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		setArea(lado1*lado2);
		setPerimetro(lado1*2+lado2*2);
		Rectangulo.areaTotal+=getArea();
		Figura.setAreaTotal(Figura.getAreaTotal()+getArea());
	}
	
	public static double getAreaTotal() {
		return areaTotal;
	}
	public static void setAreaTotal(double aT) {
		areaTotal = aT;
	}
}

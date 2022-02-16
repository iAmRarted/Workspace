package figuras;

public class Cuadrado extends Figura {
    private double lado;
	private static double areaTotal=0;
	
	public Cuadrado(double lado) {
		this.lado = lado;
		setPerimetro(lado*4);
		setArea(lado*2);
		Cuadrado.areaTotal+=getArea();
		Figura.setAreaTotal(Figura.getAreaTotal()+getArea());
	}
	public static double getAreaTotal() {
	    return areaTotal;
	}
	public static void setAreaTotal(double aT) {
		areaTotal = aT;
	}
}

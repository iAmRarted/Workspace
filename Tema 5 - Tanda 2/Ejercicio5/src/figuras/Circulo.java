package figuras;

public class Circulo extends Figura {
    private double radio;
	private static double areaTotal=0;
	
	public Circulo(double radio) {
		this.radio = radio;
		setArea(Math.PI*radio*radio);
		setPerimetro(2*Math.PI*radio);
		Circulo.areaTotal+=getArea();
		Figura.setAreaTotal(Figura.getAreaTotal()+getArea());	
	}
	public static double getAreaTotal() {
		return areaTotal;
	}
	public static void setAreaTotal(double aT) {
		areaTotal = aT;
	}
}

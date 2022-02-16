package figuras;
public abstract class Figura {
    private double area;
	private double perimetro;
	private static double areaTotal=0;
	
	public static double getAreaTotal() {
		return areaTotal;
	}
	public static void setAreaTotal(double areaTotal) {
		areaTotal = areaTotal;
	}

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}

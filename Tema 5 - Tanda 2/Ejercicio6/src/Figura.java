public abstract class Figura {
	private String nombreFigura;

	public Figura(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}
	//Metodo calcularArea
	public abstract double calcularArea();
	//Metodo esRegular
	public abstract boolean esRegular();
	public String getNombreFigura() {
		return nombreFigura;
	}
}

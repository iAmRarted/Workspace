package pizarra;

public abstract class Vehiculo {
	protected int numRuedas;
	private String marca;
	
	public Vehiculo( String marca) {
		this.marca=marca;
	}
	public void arrancar() {
		System.out.println("Arrancando...");
	}
	public void parar() {
		System.out.println("Parrando...");
	}
	public String toString() {
		return "Ruedas: "+numRuedas+", marca: "+marca;
	}
	public abstract void reportar();
	public String getMarca() {
		return marca;
	}
}

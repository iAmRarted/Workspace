package pizarra;

public class TrenVapor extends Tren {
	public TrenVapor(String marca, int vagones) {
		super(marca, vagones);
	}
	public void reportar() {
		System.out.println("Reportar Tren Vapor...");
	}
}

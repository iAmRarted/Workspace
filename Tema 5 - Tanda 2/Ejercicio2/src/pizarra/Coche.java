package pizarra;

public class Coche extends Vehiculo {
	private int motor;
	Coche(String marca, int motor){
		super(marca);
		super.numRuedas=4;
		this.motor=motor;
	}
	public void reportar() {
		System.out.println("Coche repostando....");
	}
	@Override
	public String toString() {
		return super.toString()+", motor: "+motor+"c3";
	}
}

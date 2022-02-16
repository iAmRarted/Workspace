package musica;

public class InstrumentoDeCuerda extends InstrumentoMusical {
	
	private int numCuerdas;

	public InstrumentoDeCuerda(String nombre, int registro, int numCuerdas) {
		super(nombre, registro);
		this.numCuerdas = numCuerdas;
	}
	@Override
	public String toString() {
		return super.toString()+", cuerdas: "+numCuerdas;
	}
	public void sonar() {
		System.out.println("nininni....");
	}
	public static void main(String[] args) {
//		InstrumentoCuerda ic1= new InstrumentoDeCuerda("violin", 100, 4);
	}
}

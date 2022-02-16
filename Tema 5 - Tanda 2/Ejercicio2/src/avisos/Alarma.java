package avisos;

import ejercicio1.Consola;
import interfaces.Programable;
import interfaces.Ruidoso;

public abstract class Alarma implements Ruidoso, Programable{
	private boolean esDigital;

	public Alarma(boolean esDigital) {
		this.esDigital = esDigital;
	}
	public void sonar() {
		int db=Consola.leeInt();
		if(db>TOPE_AUDIBLE)
			System.out.println("No se oye...");
		else
			System.out.println("ring... sonando");
	}
	public void molestar() {
		System.out.println("gggggr....molestando");
	}
	public void programar(int hora) {
		if(esDigital)
			System.out.println("Programando digital a las "+hora);
		else
			System.out.println("Programando manualmente a las "+hora);
	}
	public String toString() {
		String str=(esDigital)?"digital":"manual";
		return "Alarma "+str;
	}
}

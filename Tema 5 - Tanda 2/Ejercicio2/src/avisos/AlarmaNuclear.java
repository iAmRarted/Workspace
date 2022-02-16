package avisos;

public class AlarmaNuclear extends Alarma {

	public AlarmaNuclear() {
		super(true);
	}
	public void parar() {
		System.out.println("Activando alarma de seguridad");
	}
}

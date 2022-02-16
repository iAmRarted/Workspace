package avisos;

public class AlarmaNuclear extends Alarma{

    AlarmaNuclear(boolean esDigital) {
        super(esDigital);
    }

    public void parar() {
        System.out.println("Activando sistema para parar la alarma nuclear...");
    }
    
}

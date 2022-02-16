package avisos;

import interfaces.Programable;
import interfaces.Ruidoso;

public abstract class Alarma implements Ruidoso, Programable {
    private boolean esDigital;

    public Alarma(boolean esDigital) {
        this.esDigital = esDigital;
    }

    public void sonar() {
        System.out.println("riiiinnnnggg... sonando");
    }

    @Override
    public void programar(int h) {
        if(esDigital) {
            System.out.println("Programando alarma digital a las " + h);
        } else {
            System.out.println("Programando manualmente a las " + h);
        }
    }

    public void molestar() {
        System.out.println("GGGGGGGGGRRRRRRR... MOLESTANDO");
    }
}

package interfaces;

public class Dracula implements Vampiro{
    private int sangre;

    void chuparSangre(int sangre) {
        this.sangre += sangre;
        if(this.sangre > Vampiro.MAX_SANGRE) {
            System.out.println("No puedo chupar toda la sangre, sobran: " + (this.sangre - 200) + " litros.");
            this.sangre = Vampiro.MAX_SANGRE;
        }
    }

    void chuparSangre() {
        if(this.sangre < Vampiro.MAX_SANGRE) {
            this.sangre++;
        } else {
            System.out.println("No puedo más sangre, estoy lleno.");
        }
    }

    public void matar() {
        System.out.println("Dracula matando...");
    }

    public void destruir() {
        System.out.println("Dracula destruyendo...");
    }

    public void amenazar() {
        System.out.println("Dracula amenazando...");
    }

    public String toString() {
        return "Sangre: " + sangre;
    }
}

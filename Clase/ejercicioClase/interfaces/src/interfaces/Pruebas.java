package interfaces;

public class Pruebas {
    public static void main(String[] args) {
        Dracula d1 = new Dracula();
        DragonZillaMalo dzm1 = new DragonZillaMalo();
        // DragonZilla dz1 = DragonZilla(); Error si intentas crear un DragonZilla, ya que es abstracta

        // Pruebas con Dracula
        d1.amenazar();
        d1.destruir();
        d1.matar();
        d1.chuparSangre();
        System.out.println(d1.toString());
        d1.chuparSangre(150);
        d1.chuparSangre(70);
        System.out.println(d1.toString());

        // Pruebas con DragonZillaMalo
        dzm1.amenazar();
        dzm1.destruir();
    }
}

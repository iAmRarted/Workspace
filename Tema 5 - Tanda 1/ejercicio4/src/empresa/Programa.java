package empresa;

public class Programa {
    public static void main(String[] args) {
        TelefonoMovil tlf1 = new TelefonoMovil("123456789", 5000);
        Trabajador trabajador1 = new Trabajador("Pedro", "12345678M", 180, 70, 1000, tlf1);
        
        System.out.println(trabajador1.toString());
        trabajador1.trabajar();
        trabajador1.trabajar();
        System.out.println(trabajador1.toString());
    }
}

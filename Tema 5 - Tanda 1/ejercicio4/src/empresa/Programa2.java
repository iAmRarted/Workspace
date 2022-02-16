package empresa;

public class Programa2 {
    public static void main(String[] args) {
        Empresa e1 = new Empresa("Empresa1", 200, new Trabajador("Juan", "12345678M", 180, 70, 100, new TelefonoMovil("123456789", 100)));

        e1.contratarGerente(new Trabajador("Pedro", "321654987E", 190, 80, 300, new TelefonoMovil("213654879", 10)));
        System.out.println(e1.toString());
        e1.trabajar();
        e1.trabajar();
        System.out.println(e1.toString());

        Empresa e2 = new Empresa("Empresa2", 200, new Trabajador("Alberto", "25413685T", 175, 75, 0, new TelefonoMovil("211453698", 500)));
        System.out.println(e2.toString());
        e2.trabajar();
        System.out.println(e2.toString());
    }
}

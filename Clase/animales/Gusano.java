package animales;

public class Gusano extends Animal {
    private int tamanio;
    private boolean comePLantas;
    
    public Gusano(String n, char c, int p, int t, boolean cP) {
        super(n, c, p);
        tamanio = t;
        comePLantas = cP;
    }

    // Todos los gusanos son de Europa y comen plantas si su tamaño es mayor a 20

    public Gusano (String n, int p, int t) {
        super(n, 'E', p);
        tamanio = t;
        if (tamanio > 20)
            comePLantas = true;
        else
            comePLantas = false;
    }

    public String comePlantas() {
        if(comePLantas)
            return getNombre() + " tiene un tamaño de " + tamanio + " y come plantas.";
        else
            return getNombre() + " tiene un tamaño de " + tamanio + " y no come plantas.";
    }
}

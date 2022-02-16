package ejercicio_extra;

public class Cajero {
    int n20, n10, n5, n2, n1;
    int cambios;

    Cajero(int n20, int n10, int n5, int n2, int n1) {
        this.n20 = n20;
        this.n10 = n10;
        this.n5 = n5;
        this.n2 = n2;
        this.n1 = n1;
    }

    int saldo() {
        return n20 * 20 + n10 * 10 + n5 * 5 + n2 * 2 + n1;
    }

    void darCambio(int cambio) {
        if (cambio > saldo()) {
            System.out.println("No hay cambio disponible.");
        } else {
            if (n20 > 0) {
                
            }
        }
    }
}

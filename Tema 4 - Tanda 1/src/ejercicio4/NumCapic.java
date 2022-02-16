package ejercicio4;

public class NumCapic {
    long num;
    boolean esCapicua;

    NumCapic(){}

    NumCapic (long num) {
        this.num = num;

        esCapicua = this.capicua();
    }

    boolean capicua () {
        long num1 = this.num;
        int cantDigitos = cantDigitos();
        for (int cont = 1; cont <= cantDigitos / 2; cont++) {
            if (digitoPosicionN(cont) != num1 % 10)
                return false;
            num1 /= 10;
        }
        return true;
    }


    int cantDigitos () {
        long num1 = this.num;
        int cont = 0;

        while (num1 > 0) {
            cont++;
            num1 = num1 / 10;
        }
        return cont;
    }


    int digitoPosicionN (long n) {
        long num1 = this.num;
        int pot = 1;
        for (int contPot = 1; contPot <= n; contPot++){
            pot *= 10;
        }
        while(num1 > pot){
            num1 /= 10;
        }
        return (int)num1 % 10;
    }

    // Main para hacer pruebas de los m�todos
    public static void main(String[] args) {
        long n;

        System.out.println("Introduce primer n�mero:");
        n = Consola.leeLong();
        NumCapic nc1 = new NumCapic(n);

        if (nc1.capicua())
            System.out.println("El n�mero introducido es capic�a.");
        else
            System.out.println("El n�mero introducido no es capic�a.");

        System.out.println("Introduce segundo n�mero:");
        n = Consola.leeLong();
        NumCapic nc2 = new NumCapic(n);

        if (nc2.capicua())
            System.out.println("El n�mero introducido es capic�a.");
        else
            System.out.println("El n�mero introducido no es capic�a.");

        System.out.println("Introduce tercer n�mero:");
        n = Consola.leeLong();
        NumCapic nc3 = new NumCapic(n);

        if (nc3.capicua())
            System.out.println("El n�mero introducido es capic�a.");
        else
            System.out.println("El n�mero introducido no es capic�a.");

        System.out.println("Introduce cuarto n�mero:");
        n = Consola.leeLong();
        NumCapic nc4 = new NumCapic(n);

        if (nc4.capicua())
            System.out.println("El n�mero introducido es capic�a.");
        else
            System.out.println("El n�mero introducido no es capic�a.");

        System.out.println("Introduce quinto n�mero:");
        n = Consola.leeLong();
        NumCapic nc5 = new NumCapic(n);

        if (nc5.capicua())
            System.out.println("El n�mero introducido es capic�a.");
        else
            System.out.println("El n�mero introducido no es capic�a.");
    } 
}
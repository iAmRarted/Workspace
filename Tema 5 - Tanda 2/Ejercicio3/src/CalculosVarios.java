import java.lang.Math;

public class CalculosVarios {

    // 11
    static int dado() {
        return (int)(Math.random() * (6 - 1 + 1)) + 1;
    }
    public static void main(String[] args) {
        // 1
        String str_int1 = "12", str_int2 = "34";

        System.out.println(str_int1  + str_int2);

        System.out.println(Integer.parseInt(str_int1) + Integer.parseInt(str_int2));

        // 2
        String str_f1 = "15.5", str_f2 = "4.5f";

        System.out.println(str_f1 + str_f2);

        System.out.println(Float.parseFloat(str_f1) + Float.parseFloat(str_f2));

        // 3
        Integer n1 = 20, n2 = Integer.parseInt("30");
        int multiplicacionN1N2 = n1 * n2;
        System.out.println(multiplicacionN1N2);

        // 4
        System.out.println(Math.ceil(2.3));

        // 5
        System.out.println(Math.round(2*Math.PI));

        // 6
        System.out.println(Math.abs(Math.sin(Math.toRadians(-2))));

        // 7
        Math.min(Math.sin(Math.toRadians(180)), Math.toRadians(270));

        // 8
        for(int pot = 1; pot <= 10; pot++) {
            System.out.println(Math.pow(3, pot));
        }

        // 9
        System.out.println((int)(Math.random() * (10 - 0 + 1) + 0));

        // 10
        System.out.println((int)(Math.random() * (20 - 10 + 1)) + 10);

        // 11
        for(int cont = 1; cont <= 5; cont++) {
            System.out.println((int)(Math.random() * (20 - 10)) + 10);
        }

        // 12
        int n;
        n = Consola.leeInt();

        for(int contador = 1; contador <= n; contador++) {
            System.out.println(CalculosVarios.dado());
        }

        // 13
        System.out.println((int)(Math.random() * (10 - (-20) + 1)) + (-20));

        // 14
        System.out.println((char)(Math.random() * ('Z' - 'A' + 1) + 'A'));
    }
}

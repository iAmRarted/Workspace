import java.lang.Math;

public class FuncionMatem {
    private double x;

    public FuncionMatem(double x) {
        this.x = x;
    }

    public void evaluar() {
        System.out.println(Math.sqrt(Math.sin(x*x*x + (2*x) / (9)) + Math.cos(6 * Math.PI + Math.tan(Math.pow(Math.E, Math.pow(x, 3))))));
    }

    static public void evaluarX(double x) {
        System.out.println(Math.sqrt(Math.sin(x*x*x + (2*x) / (9)) + Math.cos(6 * Math.PI + Math.tan(Math.pow(Math.E, Math.pow(x, 3))))));
    }

    public static void main(String[] args) {
        FuncionMatem fm1 = new FuncionMatem(0);

        fm1.evaluar();

        FuncionMatem.evaluarX(1);
    }


    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

}

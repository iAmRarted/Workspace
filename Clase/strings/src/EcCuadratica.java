public class EcCuadratica {
    private Integer a, b, c;

    public EcCuadratica(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public EcCuadratica(String a, String b, String c) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        this.c = Integer.parseInt(c);
    }

    String resolver1() {
        float raiz = b*b-4*a*c;
        if(raiz < 0) {
            return "Las soluciones son 2 números complejos conjugados.";
        } else {
            double sol1, sol2;
            sol1 = (-b + Math.sqrt(raiz)) / (2*a);
            sol2 = (-b - Math.sqrt(raiz)) / (2*a);
            return "La solución 1 es: " + sol1 + " y la solución 2 es: " + sol2;
        }
    }

    SolCuadratica resolver2() {
        float raiz = b*b-4*a*c;
        SolCuadratica sc1 = new SolCuadratica();
        if(raiz < 0) {
            // Devuelve -1 en ambos si son 2 números complejos conjugados
            sc1.setSolucion1((float)-1);
            sc1.setSolucion2((float)-1);
            return sc1;
        } else {
            sc1.setSolucion1((float) ((-b + Math.sqrt(raiz)) / (2*a)));
            sc1.setSolucion2((float) ((-b - Math.sqrt(raiz)) / (2*a)));
            return sc1;
        }
    }

    // Getters y setters

    public Integer getA() {
        return this.a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return this.b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return this.c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

}

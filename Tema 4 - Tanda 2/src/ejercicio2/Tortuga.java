package ejercicio2;

public class Tortuga {
    float x;
    float y;
    float angulo;
    float distanciaTotal;
    static int tortugasAtleticas = 0;
    boolean tortugaAtletica;

    Tortuga(){}

    Tortuga(float x, float y, float angulo){
        this.x = x;
        this.y = y;
        this.angulo = angulo % 360;
        distanciaTotal = 0;
        tortugaAtletica = false;
    }

    Tortuga(float x, float y){
        this.x = x;
        this.y = y;
        this.angulo = 0;
        distanciaTotal = 0;
        tortugaAtletica = false;
    }

    Tortuga(float angulo){
        this.angulo = angulo % 360;
        this.x = 0;
        this.y = 0;
        distanciaTotal = 0;
    }

    void mirarDerecha(){
        this.angulo = 0;
    }

    void mirarArriba(){
        this.angulo = 90;
    }

    void mirarIzquierda(){
        this.angulo = 180;
    }

    void mirarAbajo(){
        this.angulo = 270;
    }

    void girarIzquierda(float anguloGiro){
        this.angulo = (this.angulo + anguloGiro) % 360;
    }

    void girarDerecha(float anguloGiro){
        this.angulo -= anguloGiro;
        while (this.angulo < 0){
            this.angulo += 360;
        }
    }

    void avanzar(float distancia){
        x += distancia * Math.cos(angulo*3.14/180);
        y += distancia * Math.sin(angulo*3.14/180);
        distanciaTotal += distancia;
        if (distanciaTotal > 300 && !tortugaAtletica){
            tortugasAtleticas++;
            tortugaAtletica = true;
        }
    }

    void retroceder(float distancia){
        x -= distancia * Math.cos(angulo*3.14/180);
        y -= distancia * Math.sin(angulo*3.14/180);
        distanciaTotal += distancia;
        if (distanciaTotal > 300 && !tortugaAtletica){
            tortugasAtleticas++;
            tortugaAtletica = true;
        }
    }

    // Main para probar los métodos
    public static void main(String[] args) {
        Tortuga t1 = new Tortuga(0);

        // Pruebas atlética
        t1.avanzar(300);
        if (t1.tortugaAtletica)
            System.out.println("La tortuga es atlética");
        System.out.println("La tortuga está en (" + t1.x + ", " + t1.y + ")");

        System.out.println("Hay " + Tortuga.tortugasAtleticas + " tortuga/s atléticas.");

        t1.avanzar(100);
        if (t1.tortugaAtletica)
            System.out.println("La tortuga es atlética");

        System.out.println("La tortuga está en (" + t1.x + ", " + t1.y + ")");
        System.out.println("Hay " + Tortuga.tortugasAtleticas + " tortuga/s atléticas.");

        // Pruebas giro
        t1.girarIzquierda(90);
        System.out.println(t1.angulo);
        t1.girarDerecha(700);
        System.out.println(t1.angulo);
        t1.mirarDerecha();
        t1.girarIzquierda(920);
        System.out.println(t1.angulo);

        // Pruebas mirar
        t1.mirarArriba();
        System.out.println(t1.angulo);

        t1.mirarIzquierda();
        System.out.println(t1.angulo);


        // Pruebas mover
        t1.retroceder(300);
        System.out.println("La tortuga está en (" + t1.x + ", " + t1.y + ")");

        t1.avanzar(100);
        if (t1.tortugaAtletica)
            System.out.println("La tortuga es atlética");

        System.out.println("La tortuga está en (" + t1.x + ", " + t1.y + ")");
        System.out.println("Hay " + Tortuga.tortugasAtleticas + " tortuga/s atléticas.");
    }
}
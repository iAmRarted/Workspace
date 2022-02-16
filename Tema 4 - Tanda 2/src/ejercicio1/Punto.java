package ejercicio1;

public class Punto {
    float x;
    float y;

    Punto(){}

    Punto(float x, float y){
        this.x = x;
        this.y = y;
    }

    void ver(){
        System.out.print("(" + this.x + ", " + this.y + ")");
    }
}

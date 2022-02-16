package ejercicio1;

public class Rectangulo {
    Punto p1;
    float ancho;
    float alto;

    Rectangulo(){}

    Rectangulo(Punto p1, float ancho, float alto){
        this.p1 = p1;
        this.ancho = ancho;
        this.alto = alto;
    }

    Rectangulo(float ancho, float alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    Rectangulo(float x, float y, float ancho, float alto){
        Punto punto1 = new Punto(x, y);
        
        this.ancho = ancho;
        this.alto = alto;
        this.p1 = punto1;
    }

    float area(){
        return this.ancho * this.alto;
    }

    boolean esCuadrado(){
        return this.ancho == this.alto;
    }

    void visualizar(){
        this.p1.ver();
        System.out.println(" con anchura de " + this.ancho + " y una altura de " + this.alto);
    }
}
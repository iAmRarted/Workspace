public class Rectangulo {
    private float lado1, lado2;

    public Rectangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }


    public Rectangulo() {
        lado1 = (float)Math.random() * 88 + 2;
        lado1 = (float)Math.random() * 88 + 2;
    }

    public float getArea() {
        return lado1 * lado2;
    }

    public String toString() {
        return "Lado 1: " + lado1 + ", lado 2: " + lado2;
    }

    public boolean esCuadrado() {
        if(lado1 == lado2) {
            return true;
        }
        return false;
    }

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }


}

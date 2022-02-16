package ejercicio3;

public class Fraccion {
    int numerador;
    int denominador;

    Fraccion(){}

    Fraccion(int num, int denom){
        numerador = num;
        denominador = denom;
    }

    float resultado(){
        return (float)numerador / denominador;
    }

    void simplificar(){
        int divisor = 2;
        if(this.numerador != 0 && this.denominador != 0){
            while(divisor <= this.numerador){
                if((this.numerador % divisor == 0) && (this.denominador % divisor == 0)){
                    this.numerador /= divisor;
                    this.denominador /= divisor;
                    divisor = 2;
                } else {
                    divisor++;
                }
            }
        }
    }

    void sumale(Fraccion otra){
        int aux;
        Fraccion copiaOtra = new Fraccion(otra.numerador, otra.denominador);

        if ((this.denominador == copiaOtra.denominador))
            this.numerador += copiaOtra.numerador;
        else{
            this.numerador *= copiaOtra.denominador;
            copiaOtra.numerador *= this.denominador;
            aux = this.denominador;
            this.denominador *= copiaOtra.denominador;
            copiaOtra.denominador *= aux;
            this.numerador += copiaOtra.numerador;
        }
        this.simplificar();
    }

    void restale(Fraccion otra){
        int aux;
        Fraccion copiaOtra = new Fraccion(otra.numerador, otra.denominador);

        if ((this.denominador == copiaOtra.denominador))
            this.numerador -= copiaOtra.numerador;
        else{
            this.numerador *= copiaOtra.denominador;
            copiaOtra.numerador *= this.denominador;
            aux = this.denominador;
            this.denominador *= copiaOtra.denominador;
            copiaOtra.denominador *= aux;
            this.numerador -= copiaOtra.numerador;
        }
        this.simplificar();
    }

    void multiplica_por(Fraccion otra){
        this.numerador *= otra.numerador;
        this.denominador *= otra.denominador;
        this.simplificar();
    }

    void divide_entre(Fraccion otra){
        this.numerador *= otra.denominador;
        this.denominador *= otra.numerador;
        this.simplificar();
    }

    // Main para probar los métodos
    // public static void main(String[] args) {
    //     Fraccion f1 = new Fraccion(10, 25);
    //     Fraccion f2 = new Fraccion(30, 40);

    //     f1.simplificar();
    //     f2.simplificar();
    //     System.out.println(f1.numerador + " " + f1.denominador);
    //     System.out.println(f2.numerador + " " + f2.denominador);

    //     f1.sumale(f2);
    //     System.out.println(f1.numerador + " " + f1.denominador);
    //     System.out.println(f2.numerador + " " + f2.denominador);

    //     f1.restale(f2);
    //     System.out.println(f1.numerador + " " + f1.denominador);
    //     System.out.println(f2.numerador + " " + f2.denominador);

    //     f1.multiplica_por(f2);
    //     System.out.println(f1.numerador + " " + f1.denominador);
    //     System.out.println(f2.numerador + " " + f2.denominador);

    //     f1(f2);
    //     System.out.println(f1.numerador + " " + f1.denominador);
    //     System.out.println(f2.numerador + " " + f2.denominador);
    // }
}

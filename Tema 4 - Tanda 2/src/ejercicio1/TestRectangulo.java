package ejercicio1;


public class TestRectangulo {
    public static void main(String[] args) {
        
        // Pruebas con el primer constructor
        Punto p1 = new Punto(14, 20);

        Rectangulo r1 = new Rectangulo(p1, 14, 1414);

        System.out.println("El primer rectángulo tiene un área de: " + r1.area());
        if (r1.esCuadrado())
            System.out.println("El primer rectángulo es cuadrado.");
        else    
            System.out.println("El primer rectángulo NO es cuadrado.");

        r1.visualizar();

        // Pruebas con el segundo constructor
        Rectangulo r2 = new Rectangulo(14, 1.4f);

        System.out.println("El segundo rectángulo tiene un área de: " + r2.area());
        if (r2.esCuadrado())
            System.out.println("El segundo rectángulo es cuadrado.");
        else    
            System.out.println("El segundo rectángulo NO es cuadrado.");

        r2.visualizar();
        
        // Pruebas con el tercer constructor
        Rectangulo r3 = new Rectangulo(10, 14, 14, 1.4f);

        System.out.println("El tercer rectángulo tiene un área de: " + r3.area());
        if (r3.esCuadrado())
            System.out.println("El tercer rectángulo es cuadrado.");
        else    
            System.out.println("El tercer rectángulo NO es cuadrado.");

        
           r3.visualizar();
        
        
    }
}

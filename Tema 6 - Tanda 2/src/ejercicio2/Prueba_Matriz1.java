package ejercicio2;

public class Prueba_Matriz1 {
    public static void main(String[] args) {
        Matriz1 m1 = new Matriz1();
        int f1, f2;

        Matriz1.verOtr(m1.getArray());
        System.out.println("Introduce la fila que quieres cambiar:");
        f1 = Consola.leeInt();

        System.out.println("Introduce la fila por la que quieres cambiar la anterior:");
        f2 = Consola.leeInt();

        if(m1.intercambiarFilas(f1, f2)){
            Matriz1.verOtr(m1.getArray());
        }else{
            System.out.println("No se han podido intercambiar las filas seleccionadas.");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        if(m1.intercambiarColumnas(1, 4)){
            Matriz1.verOtr(m1.getArray());
        }

        Matriz1[] arrMatrices = new Matriz1[4];
        int nf, nc;
        for(int i = 0; i<arrMatrices.length; i++){
            System.out.println("Introduce el número de filas de la matriz número " + (i+1));
            nf = Consola.leeInt();
            System.out.println("Introduce el número de columnas de la matriz número " + (i+1));
            nc = Consola.leeInt();
            arrMatrices[i] = new Matriz1(nf, nc);
        }

        for(int i = 0; i<arrMatrices.length; i++){
            Matriz1.verOtr(arrMatrices[i].getArray());
            System.out.println();
            Matriz1.verOtr(arrMatrices[i].transpuesta());
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}

public class GestorBorradoArray {
    private final int N = 4;
    private Integer[] arr;

    GestorBorradoArray() {
        arr = new Integer[N];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = 100 + i;
        }
    }

    public void ver() {
        System.out.print("{ ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
    }

    public void borrarPosicion(int pos) {
        if(pos < 1 || pos > arr.length) {
            System.out.println("Error de rango.");
        } else {
            for(int i = pos - 1; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }
    }

}

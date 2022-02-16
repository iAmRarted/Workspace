public class Ejercicio7 {

    public static void cargarAscendente(int[] arr) {
        int resp, cont = 0;
        if(arr.length > 0) {
            resp = Consola.leeInt();
            arr[cont] = resp;
            cont++;
        }
        

        while(cont < arr.length) {
            resp = Consola.leeInt();
            if(arr[cont - 1] < resp) {
                arr[cont] = resp;
                cont++;
            } else {
                System.out.println("Introduce un número válido");
            }
        }
    }

    public static void verArray(int[] arr) {
        System.out.print("{ ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
    }
    
    public static int[] mezclarArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int contArr1 = 0, contArr2 = 0;


        for(int i = 0; i < arr3.length; i++) {
            if(contArr1 < arr1.length) {
                if(contArr2 < arr2.length) {
                    if(arr1[contArr1] < arr2[contArr2]) {
                        arr3[i] = arr1[contArr1];
                        contArr1++;
                    } else {
                        arr3[i] = arr2[contArr2];
                        contArr2++;
                    }
                } else {
                    arr3[i] = arr1[contArr1];
                    contArr1++;
                }
            } else {
                if(contArr2 < arr2.length) {
                    arr3[i] = arr2[contArr2];
                    contArr2++;
                }
            }
        }

        return arr3;
    }
    public static void main(String[] args) {
    	if(args.length == 2) {
	    	int[] arr1 = new int[Integer.parseInt(args[0])];
	        int[] arr2 = new int[Integer.parseInt(args[1])];
	
	        System.out.println("Introduce valores para el array 1:");
	        cargarAscendente(arr1);
	
	        System.out.println("Introduce valores para el array 2:");
	        cargarAscendente(arr2);
	
	        verArray(arr1);
	        verArray(arr2);
	
	        int[] arr3 = mezclarArrays(arr1, arr2);
	
	        verArray(arr3);
    	} else {
    		System.out.println("Error, argumentos inválidos");
    	}
        


    }
}

package ejercicio1;

public class Ejercicio1 {
	public static void cargar(float[][] arr) {
		for(int j = 0; j < arr[0].length; j++) {
			for(int i = 0; i < arr.length; i++) {
				System.out.println("Introduce nota del alumno: " + (i + 1) + ", en la asignatura: " + (j + 1));
				arr[i][j] = Consola.leeFloat();
			}
		}
	}
	
	public static void ver(float[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
				if(j != arr[0].length - 1) {
					System.out.print("|");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int n = Consola.leeInt();
		int m = Consola.leeInt();
		float[][] notas = new float[n][m];
		
		cargar(notas);
		
		ver(notas);

		System.out.println("Izan maricón sisoy");
		System.out.println("Que no coño");
	}
}

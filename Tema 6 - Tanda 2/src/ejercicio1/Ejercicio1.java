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
//	Metodo ver con arrays multidimensionales
	public static void ver(float[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				if(j != arr[i].length - 1) {
					System.out.print("|");
				}
			}
			System.out.println();
		}
	}
//	Metodo ver con arrays unidimensionales
	public static void ver(float[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length - 1) {
				System.out.print("|");
			}
		}
		System.out.println();
	}
	
	public static int mediaMax(float[][] arr) {
		float sumaNota = 0;
		float mediaMax = Float.MIN_VALUE;
		int numAsignatura = -1;
		
		for(int j = 0; j < arr[0].length; j++) {
			sumaNota = 0;
			for(int i = 0; i < arr.length; i++) {
				sumaNota += arr[i][j];
			}
			
			if(sumaNota / arr.length > mediaMax) {
				mediaMax = sumaNota / arr.length;
				numAsignatura = j;
			}
		}
		return numAsignatura;
	}
	
	public static float[] porcentajeSuspensos(float[][] arr) {
		float[] suspensos = new float[arr.length];
		float sumaSuspensos;
		
		for(int i = 0; i < arr.length; i++) {
			sumaSuspensos = 0;
			
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < 5) {
					sumaSuspensos++;
				}
			}
			
			suspensos[i] = sumaSuspensos / arr[i].length * 100;
		}
		
		return suspensos;
	}
//	Método que cree y devuelva otra matriz con tantas filas como alumnos y 4 columnas, que refleje el número
//	de suspensos , aprobados, notables y sobresalientes de cada alumno
	public static float[][] notas(float[][] arr) {
		float[][] resul = new float[arr.length][4];
		int suspenso, aprobado, notable, sobresaliente;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < 5) {
					resul[i][0]++;
				} else {
					if(arr[i][j] < 7) {
						resul[i][1]++;
					} else {
						if(arr[i][j] < 9) {
							resul[i][2]++;
						} else {
							resul[i][3]++;
						}
					}
				}
			}
		}
		
		
		return resul;
	}
	
	public static void main(String[] args) {
//		int n = Consola.leeInt();
//		int m = Consola.leeInt();
//		float[][] notas = new float[n][m];
		
//		cargar(notas);

		float[][] notas = {
			{10, 8, 6, 4},
			{4, 5, 4, 3},
			{3, 8, 6, 10},
			{2, 6, 7, 10}
		};
				
		ver(notas);
		
		System.out.println("La asignatura con la media más alta es: " + mediaMax(notas));
		
		System.out.println("El porcentaje de suspensos por cada alumno es:");
		ver(porcentajeSuspensos(notas));
		
		ver(notas(notas));
	}
}

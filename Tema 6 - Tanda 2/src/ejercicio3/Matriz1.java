package ejercicio3;

public class Matriz1 {

	private int [][] arr;
	private static final int NF=10;
	private static final int NC=7;
	
//	Constructor vacío
	public Matriz1() {
		this.arr= new int[NF][NC];
		if(instanceof MatrizCuadrada1) {
			
		}
		cargarPorFilas(this.arr);
	}
	
//	Constructor con valores
	public Matriz1(int nf, int nc) {
		if(nf > NF) {
			nf = NF;
		}
		
		if(nc > NC) {
			nc = NC;
		}
		
		this.arr = new int[nf][nc];
		cargarPorFilas(this.arr);
	}
	
	private static void cargarPorFilas(int[][] arr) {
		int pr = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=(int)(pr + Math.random() * 10);
			}
			pr += 10;
		}
	}
	
	public void ver() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(this.arr[i][j] + "\t");
			}
			
			System.out.println();
		}
	}
	
	public static void verOtr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void invertirFilas() {
		for (int i = 0; i < arr.length; i++) {
			int otr = arr[i].length-1;
			
			for (int j = 0; j < arr[i].length / 2; j++) {
				int aux = arr[i][j];
				arr[i][j] = arr[i][otr];
				arr[i][otr] = aux;
				otr--;
			}
		}
	}
	
	public boolean intercambiarFilas(int f1, int f2) {
		f1--;
		f2--;
		
		if((f1 > arr.length) || (f2 > arr.length)) {
			return false;
		}
		
		int[] aux = arr[f1];
		arr[f1] = arr[f2];
		arr[f2] = aux;
		return true;
	}
	
	public boolean intercambiarColumnas(int c1, int c2) {
		c1--;
		c2--;
		if((c1 > arr[0].length) || (c2 > arr[0].length)) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			int aux = arr[i][c1];
			arr[i][c1] = arr[i][c2];
			arr[i][c2] = aux;
		}
		return true;
	}
	
	public int[][] transpuesta() {
		int[][] transpuesta = new int[this.arr[0].length][this.arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				transpuesta[j][i] = arr[i][j];
			}
		}
		return transpuesta;
	}

	public void setArrayIJ(int i, int j, int n) {
		this.arr[i][j] = n;
	}
	
	public void setArr(int[][] arr) {
		this.arr = arr;
	}
	
	public int[][] getArr() {
		return arr;
		
	}
	
}













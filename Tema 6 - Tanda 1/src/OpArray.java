public class OpArray {
	private Integer[] arr;
	private final static int N = 4;
	private final static Integer[] PROHIBIDOS = { 1, 10, 100, 1000 };
	private int utiles = 0;

	public OpArray() {
		this.arr = new Integer[this.N];
	}

	public OpArray(int n) {
		this.arr = new Integer[n];
	}

	public static boolean esProhibido(int num) {
		for (int i = 0; i < PROHIBIDOS.length; i++) {
			if (PROHIBIDOS[i] == num)
				return true;
		}
		return false;
	}

	public void cargarArray() {
		int resp = 1;

		for (int i = 0; i < arr.length && resp != 0; i++) {
			do {
				resp = Consola.leeInt();
				utiles++;
			} while (esProhibido(resp));
			arr[i] = resp;
		}
	}

	public void ver() {
		for (int i = 0; i < utiles; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < utiles; i++) {
			str += String.valueOf(arr[i]);
		}
		return str;
	}

	public static boolean esPrimo(int num) {

		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public int indicePrimo() {
		int indice = -1;

		for (int i = 0; i < utiles; i++) {
			if (esPrimo(arr[i])) {
				return i;
			}
		}

		return indice;
	}

	public void rotar(int rotaciones) {
		int n = rotaciones % arr.length;
		int aux;

		for (int i = 1; i <= n; i++) {
			// guarda número de la última celda
			aux = arr[arr.length - 1];
			// mueve todo a la derecha
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			// asigna a la primera celda el valor anterior de la última
			arr[0] = aux;
		}

	}

	public static void main(String[] args) {
		OpArray arr = new OpArray();
		arr.cargarArray();
		System.out.println(arr.toString());

		System.out.println(arr.indicePrimo());

		arr.ver();

		arr.rotar(9);

		arr.ver();
	}
}
package ejercicio3;

public class MatrizCuadrada1 extends Matriz1 {

	public MatrizCuadrada1() {
		super();
	}
	
	public MatrizCuadrada1(int n) {
		super(n,n);
	}
	
	public void cargaridentidad() {
		for (int i = 0; i < this.getArr().length; i++) {
			for (int j = 0; j < this.getArr()[i].length; j++) {
				if(i != j) {
					this.setArrayIJ(i, j, 0);
				} else {
					this.setArrayIJ(i, j, 1);
				}
			}
		}
	}
	
	public boolean esMagico() {
		int real = 0;
		
//		Suma la diagonal
		for (int i = 0; i < super.getArr().length; i++) {
			real += super.getArr()[i][i];
		}
		
		int suma;
		
		for (int i = 0; i < super.getArr().length; i++) {
			suma = 0;
			
			for (int k = 0; k < super.getArr()[i].length; k++) {
				suma += super.getArr()[i][k];
			}
			if(suma != real) {
				return false;
			}
		}
		
		for (int k = 0; k < super.getArr().length; k++) {
			suma = 0;
			
			for (int i = 0; i < super.getArr().length; i++) {
				suma += super.getArr()[i][k];
			}
			if(suma != real) {
				return false;
			}
		}
		return true;
	}
	
	public boolean esSimetrica() {
		/*int[][] transpuesta=super.transpuesta();
		if(super.getArray().length!=transpuesta.length)
			return false;
		if(super.getArray()[0].length!=transpuesta[0].length)
			return false;
		for (int i = 0; i < transpuesta.length; i++) 
		{
			for (int j = 0; j < transpuesta.length; j++)
			{
				if(transpuesta[i][j]!=super.getArray()[i][j])
					return false;
			}
		}
		return true;*/
		
		/*Una matriz es simetrica si es igual a su transpuesta*/
		if(super.getArr()==super.transpuesta()) {
			return true;
		}
		return false;
	}
	
	public boolean iguales(MatrizCuadrada1 otra) {
		if(otra.getArr().length != this.getArr().length) {
			return false;
		}
		
		/*mismo contenido*/
		for (int i = 0; i < this.getArr().length; i++) {
			for (int j = 0; j < this.getArr()[i].length; j++) {
				if(this.getArr()[i][j] != otra.getArr()[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public void cargarMagico() {
		cargar0();
		
		this.setArrayIJ(0, this.getArr()[0].length / 2, 1);
		
		int i = this.getArr().length - 1;
		int j = this.getArr()[0].length / 2 + 1;
		int numeros = this.getArr().length * this.getArr()[0].length;
		for (int n = 2; n <= numeros; n++) {
			this.setArrayIJ(i, j, n);
			ver();
			
			if(this.getArr()[i+1][j+1]==0) {
				i=i+1;
				j=j+1;
			} else {
				if(((i+1)>=this.getArr().length)&&((j+1)>=this.getArr()[0].length)) 	{
					i=i-1;
				}
				else
				{
					if((i+1)>=this.getArr().length)
					{
						j=j+1;
						i=this.getArr().length-1;
					}
					else
					{
						if((j+1)>=this.getArr()[0].length)
						{
							i=i+1;
							j=0;
						}
					}
				}
			}
		}
	}
	
	
	
	private void cargar0()
	{
		for (int i = 0; i < this.getArr().length; i++) 
		{
			for (int j = 0; j < this.getArr()[i].length; j++) 
			{
				this.setArrayIJ(i, j, 0);
			}
		}
	}
	public static void main(String[] args)
	{
		
		MatrizCuadrada1 mc1=new MatrizCuadrada1();
		MatrizCuadrada1 mc2=new MatrizCuadrada1(5);
		
		mc1.ver();
		System.out.println();
		mc2.ver();
		System.out.println();
		
		MatrizCuadrada1 identidad=new MatrizCuadrada1(5);
		identidad.cargaridentidad();
		identidad.ver();
		
		if(mc2.esMagico())
			System.out.println("Es magico");
		else
			System.out.println("No es magico");
		
		if(mc2.esSimetrica())
			System.out.println("Es simetrica");
		else
			System.out.println("No es simetrica");
		if(mc1.iguales(mc2))
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");
		
		mc2.cargarMagico();
		mc2.ver();
		
	}
}











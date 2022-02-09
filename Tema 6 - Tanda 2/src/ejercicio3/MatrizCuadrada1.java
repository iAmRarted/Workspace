package ejercicio3;

public class MatrizCuadrada1 extends Matriz1
{

	public MatrizCuadrada1()
	{
		super();
	}
	
	public MatrizCuadrada1(int n)
	{
		super(n,n);
	}
	
	public void cargaridentidad()
	{
		for (int i = 0; i < this.getArray().length; i++) 
		{
			for (int j = 0; j < this.getArray()[i].length; j++) 
			{
				this.setArrayIJ(i, j, 0);
			}
		}
		int j=0;/*Aqui lo que puedo hacer es cargarlo entero a 0 y luego cargar la diagonal en uno si consigo hacerlo claro*/
		for (int i = 0; i < this.getArray().length; i++) 
		{
			this.setArrayIJ(i, j, 1);
			j++;
		}
	}
	
	public boolean esMagico()
	{
		int real=0;
		for (int i = 0; i < super.getArray().length; i++) /*Saca la suma de la diagonal*/
		{
			real+=super.getArray()[i][i];
		}
		
		int suma=0;
		for (int i = 0; i < super.getArray().length; i++) 
		{
			suma=0;
			for (int k = 0; k < super.getArray()[i].length; k++) 
			{
				suma+=super.getArray()[i][k];
			}
			if(suma!=real)
			{
				return false;
			}
		}
		
		for (int k = 0; k < super.getArray().length; k++)
		{
			suma=0;
			for (int i = 0; i < super.getArray().length; i++) 
			{
				suma+=super.getArray()[i][k];
			}
			if(suma!=real)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean esSimetrica()
	{
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
		if(super.getArray()==super.transpuesta())/*Una matriz es simetrica si es igual a su transpuesta*/
			return true;
		return false;
	}
	
	public boolean iguales(MatrizCuadrada1 otra)
	{
		if(otra.getArray().length!=this.getArray().length)
			return false;
		/*if(otra.getArray()!=this.getArray())
			return false;*/
		for (int i = 0; i < this.getArray().length; i++) /*mismo contenido*/
		{
			for (int j = 0; j < this.getArray()[i].length; j++) 
			{
				if(this.getArray()[i][j]!=otra.getArray()[i][j])
					return false;
			}
		}
		return true;
	}
	
	public void cargarMagicoo()
	{
		cargar0();
		this.setArrayIJ(0, this.getArray()[0].length/2, 1);
		int i=this.getArray().length-1;
		int j=this.getArray()[0].length/2+1;
		int numeros=this.getArray().length*this.getArray()[0].length;
		for (int n = 2; n <= numeros; n++) 
		{
			this.setArrayIJ(i, j, n);
			ver();
			if(this.getArray()[i+1][j+1]==0)
			{
				i=i+1;
				j=j+1;
			}
			else
			{
				if(((i+1)>=this.getArray().length)&&((j+1)>=this.getArray()[0].length))
				{
					i=i-1;
				}
				else
				{
					if((i+1)>=this.getArray().length)
					{
						j=j+1;
						i=this.getArray().length-1;
					}
					else
					{
						if((j+1)>=this.getArray()[0].length)
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
		for (int i = 0; i < this.getArray().length; i++) 
		{
			for (int j = 0; j < this.getArray()[i].length; j++) 
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
		
		mc2.cargarMagicoo();
		mc2.ver();
		
	}
}











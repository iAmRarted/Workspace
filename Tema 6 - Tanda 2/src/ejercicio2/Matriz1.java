package ejercicio2;

public class Matriz1
{

	private int [][] array;
	private static final int NF=10;
	private static final int NC=7;
	
	public Matriz1()
	{
		this.array= new int[10][7];
		cargarPorFilas(this.array);
	}
	
	public Matriz1(int nf, int nc)
	{
		if(nf>NF)
		{
			nf=NF;
		}
		
		if(nc>NC)
		{
			nc=NC;
		}
		
		this.array=new int[nf][nc];
		cargarPorFilas(this.array);
	}
	
	private static void cargarPorFilas(int[][] array)
	{
		int pr=1;
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array[i].length; j++) 
			{
				array[i][j]=(int)(pr+Math.random()*10);
			}
			pr+=10;
		}
	}
	
	public void ver()
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println();
			for (int j = 0; j < array[i].length; j++)
			{
				System.out.print(this.array[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void verOtr(int[][] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println();
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void invertirFilas()
	{
		for (int i = 0; i < array.length; i++)
		{
			int otr=array[i].length-1;
			for (int j = 0; j < array[i].length/2; j++) 
			{
				int aux=array[i][j];
				array[i][j]=array[i][otr];
				array[i][otr]=aux;
				otr--;
			}
		}
	}
	
	public boolean intercambiarFilas(int f1, int f2)//Numero de fila
	{
		f1--;//Numero de indice
		f2--;
		if((f1>array.length)||(f2>array.length))
		{
			return false;
		}
		int[] aux=array[f1];
		array[f1]=array[f2];
		array[f2]=aux;
		return true;
	}
	
	public boolean intercambiarColumnas(int c1, int c2)
	{
		c1--;
		c2--;
		if((c1>array[0].length)||c2>array[0].length)
		{
			return false;
		}
		for (int i = 0; i < array.length; i++) 
		{
			int aux=array[i][c1];
			array[i][c1]=array[i][c2];
			array[i][c2]=aux;
		}
		return true;
	}
	
	public int[][] transpuesta()
	{
		int[][] transpuesta=new int[this.array[0].length][this.array.length];
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array[i].length; j++) 
			{
				transpuesta[j][i]=array[i][j];
			}
		}
		return transpuesta;
	}

	public void setArrayIJ(int i, int j, int n)
	{
		this.array[i][j]=n;
	}
	
	public int[][] getArray() 
	{
		return array;
		
	}
	
}













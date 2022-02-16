package pruebas_class;

public class PruebasCirculo {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		c1.color = "Rojo";
		c1.radio = 60f;
		
		c1.ver();
		System.out.println(c1.area());
		if (c1.esGrande())
			System.out.println("Es grande");
		else
			System.out.println("No es grande");
		
		
		Circulo c2 = new Circulo(60, "Azul");
		c2.radio++;
		
		c2.ver();
		System.out.println(c2.area());
		if (c2.esGrande())
			System.out.println("Es grande");
		else
			System.out.println("No es grande");
		
		
		Circulo c3 = new Circulo(60, "Rojo");
		
		c3.ver();
		System.out.println(c3.area());
		if (c3.esGrande())
			System.out.println("Es grande");
		else
			System.out.println("No es grande");
		
		
		if (c1.esIgual(c3))
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println("No son iguales");
		}
	}
	
}

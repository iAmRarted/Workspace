package pruebas_class;

public class Pruebas {
	
	public static void main(String[] args) {
		
		
		Punto p1 = new Punto();
		p1.x = 10;
		p1.y = 10;
		
		Punto p2 = new Punto(14f, -14.14f);
		
		Punto p3 = new Punto(50, 50);
		
		p1.ver();
		p2.ver();
		p3.ver();
		
		p1.x = 0;
		p1.y = -24.14f;

		System.out.println(p1.cuadrante());

		System.out.println(p2.cuadrante());

		System.out.println(p3.cuadrante());
		
		
		p1.subir(10f);
		
		p1.ver();
		p2.ver();
		p3.ver();
		
		Recta r1 = new Recta(3, p1, p2);
		
		Recta r2 = new Recta(10, 0f, 0f, 5f, 5f);
		
		r1.ver();
		r2.ver();
		
		if (r1.esHorizontal())
			System.out.println("r1 Es horizontal.");
		else
			System.out.println("r1 No es horizontal.");
		
		
		if (r2.esVertical())
			System.out.println("r2 Es vertical.");
		else
			System.out.println("r2 No es vertical.");
		
		r2.pFin.x = 0; 
		
		if (r2.esVertical())
			System.out.println("r2 Es vertical.");
		else
			System.out.println("r2 No es vertical.");
		
		

		System.out.println("La longitud de r1 es de " + r1.longitud() + "uds.");

		System.out.println("La longitud de r2 es de " + r2.longitud() + "uds.");
		
	} 

}

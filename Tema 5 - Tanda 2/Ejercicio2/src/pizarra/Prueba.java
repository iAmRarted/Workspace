package pizarra;

public class Prueba {
	public static void main(String[] args) {
		/*
		Vehiculo v1=new Vehiculo ("Ford Fiesta");
		v1.arrancar();
		v1.parar();
		System.out.println(v1.toString());
		*/
		Coche c1= new Coche("Ford Fiesta", 180);
		c1.arrancar();
		c1.parar();
		System.out.println(c1.toString());
		
		//Tren aun no implementa repostar ---> abstract
		//Tren t1= new Tren("RX200", 15);
		
		TrenVapor tv1= new TrenVapor("RX200", 15);
		tv1.arrancar();
		tv1.parar();
		System.out.println(tv1.toString());
	}
}

package pruebas_class;

public class Circulo {
	
	float radio;
	String color;
	
	
	// Constructor sin pasarle nada.
	Circulo (){
		
	}
	
	
	// Constructor pasandole radio y color.
	Circulo (float radio1, String color1){
		
		radio = radio1;
		color = color1;
	}
	
	
	void ver() {
		System.out.print("Círculo de color " + this.color + " y radio " + this.radio);
		if (this.radio > 30)
			System.out.println(", círculo grande");
		else
			System.out.println(", círculo pequeño");
	}
	
	
	float area() {
		float area;
		
		area = 3.141592f * this.radio * this.radio;
		return area;
	}
	
	
	void verperimetro () {
		float perimetro;
		perimetro = 2 * 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679f * this.radio;
		System.out.println("El perímetro es: " + perimetro);
	}
	
	
	boolean esGrande () {
		if (this.radio > 10)
			return true;
		
		return false;	
		
	}
	
	boolean esIgual (Circulo cOtro) {
		if ((this.radio == cOtro.radio) && (this.color == cOtro.color))
			return true;
			
		return false;
	}
}

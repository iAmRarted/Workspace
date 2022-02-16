package casa1;

public class Casa {
	String direccion;
	float superficie;
	char tipo;
	
	void ver() {
		if ((this.tipo == 'p') || (this.tipo == 'P'))
			System.out.println("Piso en" + this.direccion + ", Superficie: " + this.superficie);
		else
			System.out.println("Unifamiliar en " + this.direccion + ", Superficie: " + this.superficie);
	}
	
	float dameImpuesto () {
		if (this.superficie < 60)
			return 0;
		
		if (this.superficie < 80)
			return (4.5f*this.superficie);
		
		return (5.5f*this.superficie); 
	}
	
	
	boolean esVendible () {
		if (((this.tipo == 'u') || this.tipo == 'U') || (this.superficie > 100))
			return true;
		
		return false;
	}
	
	boolean esSimilar (Casa otra) {
		float diff;
		
		diff = this.superficie - otra.superficie;
		
		if (diff < 0)
			diff *= -1;
		
		if ((this.tipo == otra.tipo) && (diff < 10))
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		Casa casa1 = new Casa();
		Casa casa2 = new Casa();
		Casa casa3 = new Casa();
		
		
		
		
		casa1.direccion = "C/Rioja, 18m";
		casa1.superficie = 65;
		casa1.tipo = 'p';
		
		casa2.direccion = "C/Álava, 5";
		casa2.superficie = 150;
		casa2.tipo = 'u';
		
		casa3.direccion = "C/Gorbea, 23";
		casa3.superficie = 105.5f;
		casa3.tipo = 'p';
		
		
		
		casa1.ver();
		casa2.ver();
		casa3.ver();
		
		
		casa2.superficie -= 5;
		
		
		casa1.ver();
		casa2.ver();
		casa3.ver();
		

		System.out.println("La casa1 tiene que pagar: " + casa1.dameImpuesto() + "€.");
		System.out.println("La casa2 tiene que pagar: " + casa2.dameImpuesto() + "€.");
		System.out.println("La casa3 tiene que pagar: " + casa3.dameImpuesto() + "€.");
		

		if (casa1.esVendible())
			System.out.println("La casa1 es vendible");
		
		if (casa2.esVendible())
			System.out.println("La casa2 es vendible");

		if (casa3.esVendible())
			System.out.println("La casa3 es vendible");
		

		if (casa2.esSimilar(casa3))
			System.out.println("Casa2 es similar a casa3.");
		else
			System.out.println("Casa2 no es similar a casa3");
		
		
		if (casa1.esSimilar(casa3))
			System.out.println("Casa1 es similar a casa3.");
		else
			System.out.println("Casa1 no es similar a casa3");
		
		
		casa1.superficie += 35;
		

		if (casa1.esSimilar(casa3))
			System.out.println("Casa1 es similar a casa3.");
		else
			System.out.println("Casa1 no es similar a casa3");
	}

}

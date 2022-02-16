package pruebas_class;

public class Punto {
	
	// Atributos
	float x, y;
	
	
	Punto () {
		
	}
	
	// Typical spanish constructor dado x e y
	Punto (float x1, float y1) {
		x = x1;
		y = y1;
		
	}
	
	void ver() {
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
	
	int cuadrante () {
		if ((this.x > 0) && (this.y > 0))
			return 1;
		
		if ((this.x < 0) && (this.y > 0))
			return 2;
		
		if ((this.x < 0) && (this.y < 0))
			return 3;
		
		if ((this.x > 0) && (this.y < 0))
			return 4;
		
		return 0;
	}
	
	
	void subir (float subida) {
		this.y += subida;
	}
}

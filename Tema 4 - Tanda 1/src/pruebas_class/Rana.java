package pruebas_class;

public class Rana {
	
	String nombre;
	int edad;
	int calorias;
	final static int CAL_G = 5;
	final static int CAL_I = 3;
	static int ranasJoven = 0;


	Rana ()
	{
		nombre = "Desconocida";
		edad = 0;
		calorias = 0;
		ranasJoven++;
	}
	
	Rana (String nombre, int edad, int calorias)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.calorias = calorias;
		
		if (this.edad < 18)
			ranasJoven++;
	}
	
	
	void ver ()
	{
		System.out.println(nombre + ", " + edad + " años, " + calorias + " calorías.");
	}
	
	// Suma 1 año a la rana
	void cumpleAno() {
		this.edad++;
		System.out.println("Felicidades, ya tienes " + edad + " años. Cada vez más cerca de morir.");
		
		if (this.edad == 18)
			ranasJoven--;
	}
	
	
	void alimentar (char tipo, int cantidad) {
		int calTot = 0;
		
		switch (tipo)
		{
			case 'g', 'G':
				calTot = cantidad * CAL_G;
				break;
				
			case 'i', 'I':
				calTot = cantidad * CAL_I;
				break;
				
			default:
				System.out.println("Alimento introducido incorrecto");
		}
		
		this.calorias += calTot;	
	}
	
	
	boolean esObesa () {
		final int CAL_OBESA_JOVEN = 300;
		final int CAL_OBESA_ADULTA = 500;
		
		if ((edad < 18) && (calorias > CAL_OBESA_JOVEN))
			return true;
					
		if ((edad >= 18) && (calorias > CAL_OBESA_ADULTA))
			return true;
		
		return false;
	}
	
	
	boolean puedeBailarCon (Rana otra) {
		int calDiff = this.calorias - otra.calorias;
		
		if (calDiff < 0)
			calDiff *= -1;
		
		if ((this.edad == otra.edad) && (calDiff < 50))
			return true;
		
		return false;
	}
	
	void danzaDelSexo(int horas) {
		int contH = 1;
		
		
		while ((contH <= horas) && (this.calorias >= 100))
		{
			System.out.println("Baliando (gangsta shit) " + contH + " horas.");
			this.calorias -= 100;
			contH++;
		}
		
		if (this.calorias < 100)
			System.out.println("La rana " + this.nombre + " no puede bailar más");
	}
	
	
	static void ranaJovenQuestionMark() {
		if (ranasJoven > 0)
			System.out.println("Yessssssssssss");
		else
			System.out.println("Nononononononon. Sacre bleu.Omelette.Baguette.Crêpe.Croissant");
	} 
	
	
	static void verSiSonQuintas(Rana otra1, Rana otra2) {
		if (otra1.edad == otra2.edad)
			System.out.println("SisonSison");
		else
			System.out.println("QUE NO!.");
	}
	
	
	public static void main(String[] args) {
		Rana r1 = new Rana();
		Rana r2 = new Rana("Marisa", 3, 200);
		Rana r3 = new Rana("AlejandroElcapirote", 4, 250);
		
		
		r1.ver();
		r2.ver();
		
		r2.cumpleAno();
		
		r2.ver();
		
		r2.alimentar('i', 18);
		r2.ver();
		

		if (r2.puedeBailarCon(r3))
			System.out.println("Ay sisisisis señora vaca");
		else
			System.out.println("Aléjate sucio jugador del LoL");
		
		
		r2.danzaDelSexo(1);
		r2.ver();
		
		r2.danzaDelSexo(5);
		r2.ver();
		Rana.ranaJovenQuestionMark();
		
		Rana.verSiSonQuintas(r2, r3);
		
		r2.cumpleAno();
		Rana.verSiSonQuintas(r2, r3);
		
		r2.edad--;
		}
}

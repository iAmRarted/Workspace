package abstracciones;

public class Pruebas {
	public static void main(String[] args) {
		//DragonZilla dz1 = new DragonZilla();
		//No deja porque no esta intanciao el metodo amenazar que hereda de la interFace Monstruo
		DragonZillaMalo dzm1 = new DragonZillaMalo();
		dzm1.amenazar();
		dzm1.destruir();
		System.out.println(dzm1.toString());
		Dracula d1 = new Dracula();
		d1.setSangre(70);
		System.out.println(d1.getSangre());
		d1.amenazar();
		d1.destruir();
		d1.matar();
		d1.chuparSangre(29);
		System.out.println(d1.getSangre());
		d1.chuparSangre();
	}
}

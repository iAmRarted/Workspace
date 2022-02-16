package abstracciones;

public abstract class DragonZilla implements MonstruoPeligroso{
	public void destruir() {
		System.out.println("DragonZilla detruyendo...");
	}
	public String toString() {
		return "Hola soy un DragonZilla";
	}
}

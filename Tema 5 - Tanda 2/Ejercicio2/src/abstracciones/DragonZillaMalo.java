package abstracciones;

public class DragonZillaMalo extends DragonZilla {
	public void amenazar() {
		System.out.println("DragonZillaMalo amenazando...");
	}
	@Override
	public void destruir() {
		System.out.println("DragonZillaMalo detruyendo...");
	}
	@Override
	public String toString() {
		return super.toString()+"Malo";
	}
}

package abstracciones;

public class Dracula implements Vampiro {
	private int sangre;
	public void chuparSangre(int litros) {
		if(this.sangre+litros>=MAX_SANGRE)
			System.out.println("Dracula esta lleno, no puede chupar más sangre");
		else
			this.sangre+=litros;
	}
	public void chuparSangre() {
		if(this.sangre+1>=MAX_SANGRE)
			System.out.println("Dracula esta lleno, no puede chupar más sangre");
		else
			this.sangre++;
	}
	@Override
	public void matar() {
		System.out.println("Te voy a matar");
	}
	@Override
	public void destruir() {
		System.out.println("Dracula destruyendo...");
	}
	@Override
	public void amenazar() {
		System.out.println("Dracula amenazando...");
	}
	public String toString() {
		return "Hola soy un Dracula";
	}
	public int getSangre() {
		return sangre;
	}
	public void setSangre(int sangre) {
		this.sangre = sangre;
	}
}

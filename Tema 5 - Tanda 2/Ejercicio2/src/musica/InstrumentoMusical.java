package musica;

import interfaces.Sonoro;

public abstract class InstrumentoMusical implements Sonoro{
	
	private String nombre;
	private int registro;
	
	public InstrumentoMusical(String nombre, int registro) {
		this.nombre = nombre;
		this.registro = registro;
	}
	public String toString() {
		return nombre+", con registro "+registro;
	}
}

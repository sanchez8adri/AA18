package POJOs;

public class Continente {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Continente(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Continente [nombre=" + nombre + "]";
	}
	
	

}
